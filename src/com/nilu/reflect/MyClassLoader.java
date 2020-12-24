package com.nilu.reflect;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class Menber{
    public void send()
    {
        System.out.println("nl");
    }
}
class DefaultClassLoader extends ClassLoader {
    //自定义一个加载器
    //定义要加载类文件的完整名称
    public final static String TEST_02= "D:"+ File.separator+"test01.class";

    /**
     * 进行指定类的加载操作
     * @param className 类的完整名称“包.类”
     * @return 返回一个指定类的class对象
     * @throws Exception 如果类文件不存在抛出异常
     */
    public Class<?> loadData(String className) throws Exception{
        byte[]data =this.loadClassData();
        if(data!=null)
        {
            return super.defineClass(className,data,0,data.length);
        }
        return null;
    }
    private byte[] loadClassData() throws Exception{
        InputStream inout=null;
        ByteArrayOutputStream bos=null;
        byte data[]=null;
        try{
            bos=new ByteArrayOutputStream();
            inout=new FileInputStream(new File(TEST_02));
            inout.transferTo(bos);
            data=bos.toByteArray();
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            if(inout!=null)
            {
                inout.close();
            }
            if(bos!=null)
            {
                bos.close();
            }
            return data;
        }

    }
}
public class MyClassLoader {
    public static void main(String[] args) {
        Menber menber=new Menber();
        /**
         * 第三次输出为null是因为Bootstrap跟加载器不是由Java编写，所以返回null
         */
        System.out.println(menber.getClass().getClassLoader());
        System.out.println(menber.getClass().getClassLoader().getParent());
        System.out.println(menber.getClass().getClassLoader().getParent().getParent());

        //使用自定义加载器加载类
        DefaultClassLoader defaultClassLoader=new DefaultClassLoader();
        try {
            Class<?> clazz=defaultClassLoader.loadData("com.nilu.reflect.test02");
            System.out.println(clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
