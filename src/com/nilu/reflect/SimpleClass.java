package com.nilu.reflect;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Company{
    private String name;
    private Date createdate;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", createdate=" + createdate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatdate() {
        return createdate;
    }

    public void setCreatdate(Date creatdate) {
        this.createdate = creatdate;
    }
}
class Dept{
    private String dname;
    private String loc;
    private Company company;

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", company=" + company +
                '}';
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
class Emp{
    private String ename;
    private String job;
    private Double salary;
    private Integer age;
    private Date hiredate;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", hiredate=" + hiredate +
                ", dept=" + dept +
                '}';
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
class StringUtil{
    //首字母大写操作
    public static String initcap(String str)
    {
        if(str==null||"".equals(str))
        {
            return null;
        }
        else if(str.length()==1)
        {
            return str.toUpperCase();
        }
        else
        {
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
    }
}

class BeanUtils{
    private BeanUtils(){}

    /**
     * 实现指定对象的属性设置
     * @param obj 要进行反射操作的实例化对象
     * @param value 包含指定内容的字符串 格式为：“属性：内容|属性：内容|”
     */
    public static void setvalue(Object obj, String value)  {
        String results[]=value.split("\\|");
        for(int x=0;x<results.length;x++)
        {
            //attral[0]保存的是属性名称 attral[1]保存的是属性内容
            String attral[]=results[x].split(":");
            if(attral[0].contains("\\."))
            {
                String temp[]=attral[0].split("\\.");
                Object currentobj=obj;
                //最后一项为指定类中的属性名称 不在考虑范围之内
                for(int y=0;y<temp.length-1;y++)
                {
                    //调用类中的getter方法，若返回null，则证明还未被实例化
                    Method getMethod= null;
                    try {
                        getMethod = currentobj.getClass().getDeclaredMethod("get"+ StringUtil.initcap(temp[y]));
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                    try {
                        Object tempObj=getMethod.invoke(currentobj);
                        if(tempObj==null)
                        {
                            Field field=currentobj.getClass().getDeclaredField(temp[y]);
                            Method method=currentobj.getClass().getDeclaredMethod("set"+StringUtil.initcap(temp[y]),field.getType());
                            Object newObj=field.getType().getDeclaredConstructor().newInstance();
                            method.invoke(currentobj,newObj);
                            currentobj=newObj;
                        }
                        else{
                            currentobj=tempObj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        Field field=currentobj.getClass().getDeclaredField(temp[temp.length-1]);
                        Method setMethod=currentobj.getClass().getDeclaredMethod("set"+StringUtil.initcap(temp[temp.length-1]),field.getType());
                        Object convertobj=BeanUtils.convertAttributeValue(field.getType().getName(),attral[1]);
                        setMethod.invoke(currentobj,convertobj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }else{
                try {
                    Field field=obj.getClass().getDeclaredField(attral[0]);
                    Method method=obj.getClass().getDeclaredMethod("set"+StringUtil.initcap(attral[0]),field.getType());
                    Object convertValue=BeanUtils.convertAttributeValue(field.getType().getName(),attral[1]);
                    method.invoke(obj,convertValue);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }
    public static Object convertAttributeValue(String type, String value)
    {
        if("long".equals(type)||"java.lang.Long".equals(type))
        {
            return Long.parseLong(value);
        } else if("int".equals(type)||"java.lang.Integer".equals(type))
        {
            return Integer.parseInt(value);
        }else if("double".equals(type)||"java.lang.Double".equals(type))
        {
            return Double.parseDouble(value);
        }else if("java.util.Date".equals(type))
        {
            SimpleDateFormat sdf=null;
            if(value.matches("\\d{4}-\\d{2}-\\d{2}"))
            {
                sdf=new SimpleDateFormat("yyyy-MM-dd");
            }
            else if(value.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"))
            {
                sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }else{
                return new Date();
            }
            try{
                return sdf.parse(value);
            }catch(ParseException e)
            {
                return new Date();
            }

        }else{
            return value;
        }
    }

}
class ClassINstanceFactory{
    private ClassINstanceFactory(){}
    public static<T> T create(Class<?> clazz, String value)
    {
        Object obj= null;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.setvalue(obj,value);
            return (T)obj;
        } catch (Exception e)
        {
            return null;
        }

    }
}
public class SimpleClass {
    public static void main(String[] args) {
        String value="ename:Smith|job:clerk|salary:8960.00|age:30|hiredate:2003-10-15|dept.dname:财务部|dept.loc:北京|dept.company.name:上海应用技术大学|dept.company.createdate:2002-11-12";
        Emp emp=ClassINstanceFactory.create(Emp.class,value);
        System.out.println(emp);
        System.out.println(emp.getDept());
        System.out.println(emp.getDept().getCompany());
    }
}
