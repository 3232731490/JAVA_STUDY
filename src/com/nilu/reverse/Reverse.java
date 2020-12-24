package com.nilu.reverse;

import java.sql.SQLOutput;

class power{
    private long pId;
    private String pname;
    private user users[];
    public power(){}
    public power(long Id, String name)
    {
        pId=Id;
        pname=name;
    }

    public void setId(long Id)
    {
        pId=Id;
    }
    public void setname(String name)
    {
        pname=name;
    }
    public long getId()
    {
        return pId;
    }

    public String getName()
    {
        return pname;
    }

    public String getInfo()
    {
        return "[权限信息] 权限ID= "+pId +", 权限名称= "+ pname;
    }
    public void setUsers(user users[])
    {
        this.users=users;
    }
    public user[] getUsers()
    {
        return this.users;
    }
}

class figure{
    private long fId;
    private String fname;
    private power powers[];
    private user users[];
    public figure(){}
    public figure(long Id, String name)
    {
        fId=Id;
        fname=name;
    }
    public void setId(long Id)
    {
        fId=Id;
    }
    public void setname(String name)
    {
        fname=name;
    }
    public long getId()
    {
        return fId;
    }

    public String getName()
    {
        return fname;
    }

    public String getInfo()
    {
        return "[角色信息] 角色ID= "+fId +", 角色名称= "+ fname;
    }
    public void setPowers(power powers[])
    {
        this.powers=powers;
    }
    public power[] getPowers()
    {
        return this.powers;
    }
    public void setUsers(user users[])
    {
        this.users=users;
    }
    public user[] getUsers()
    {
        return this.users;
    }
}

class user{
    private long uId;
    private String uname;
    private figure figures[];
    public user(){}
    public user(long Id, String name)
    {
        uId=Id;
        uname=name;
    }
    public void setId(long Id)
    {
        uId=Id;
    }
    public void setname(String name)
    {
        uname=name;
    }
    public long getId()
    {
        return uId;
    }

    public String getName()
    {
        return uname;
    }

    public String getInfo()
    {
        return "[用户信息] 用户ID= "+uId +", 用户名称= "+ uname;
    }

    public void setFigures(figure figures[])
    {
        this.figures=figures;
    }
    public figure[] getFigures()
    {
        return this.figures;
    }
}
public class Reverse {
    public static void main(String[] args) {
        user userA = new user(1L, "nilu");
        user userB = new user(2L, "lihui");
        user userC = new user(3L, "yang");

        figure figureA = new figure(1L, "薛之谦");
        figure figureB = new figure(2L, "彭于晏");
        figure figureC = new figure(3L, "吴彦祖");
        figure figureD = new figure(4L, "公孙离");
        figure figureE = new figure(5L, "夏侯惇");
        figure figureF = new figure(6L, "蔡文姬");

        power power1=new power(1L,"打开");
        power power2=new power(2L,"关闭");
        power power3=new power(3L,"更新");

        userA.setFigures(new figure[]{figureA,figureB});
        userB.setFigures(new figure[]{figureC,figureD});
        userC.setFigures(new figure[]{figureE,figureF});

        figureA.setPowers(new power[]{power1});
        figureA.setUsers(new user[]{userA});
        figureB.setPowers(new power[]{power1,power2});
        figureB.setUsers(new user[]{userA});
        figureC.setPowers(new power[]{power1,power3});
        figureC.setUsers(new user[]{userB});
        figureD.setPowers(new power[]{power2});
        figureD.setUsers(new user[]{userB});
        figureE.setPowers(new power[]{power3});
        figureE.setUsers(new user[]{userC});
        figureF.setPowers(new power[]{power2,power3});
        figureF.setUsers(new user[]{userC});

        power1.setUsers(new user[]{userA,userB});
        power2.setUsers(new user[]{userA,userB,userC});
        power3.setUsers(new user[]{userB,userC});


        System.out.println("--------根据用户找到用户对应的所有角色以及每一个角色的全部权限信息-------------");
        System.out.println(userA.getInfo());
        for(figure temp:userA.getFigures())
        {
            System.out.println("\t-| "+temp.getInfo());
            for(power temp2:temp.getPowers())
            {
                System.out.println("\t\t-| "+temp2.getInfo());
            }
        }

        System.out.println("---------根据角色找到该角色的所有权限和拥有此角色的全部用户信息-----------");
        System.out.println(figureC.getInfo());
        for(power temp:figureC.getPowers())
        {
            System.out.println("\t-|"+temp.getInfo());
        }
        for(user temp:figureC.getUsers())
        {
            System.out.println("\t-|"+temp.getInfo());
        }

        System.out.println("----------根据一个权限找到具有此权限的所有用户信息-----------------");
        System.out.println(power1.getInfo());
        for(user temp:power1.getUsers())
        {
            System.out.println("\t-|"+temp.getInfo());
        }
    }
}