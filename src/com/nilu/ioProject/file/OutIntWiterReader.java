package com.nilu.ioProject.file;

import java.io.*;

public class OutIntWiterReader {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator+"IOOperate");
        //文件列表展示
        //presentFileList(file);

        //文件批量更名
        //reName(file);

        //OutPutStream
        //outstream(file);

        //InPutStream
        //inputstream(file);

        //Writer
        //writer(file);

        //Reader
        reader(file);
    }
        //文件列表展示
     public static void presentFileList(File file)
     {
         if(file.isDirectory())
         {
             File [] result=file.listFiles();
             for(int i=0;i<result.length;i++)
             {
                 presentFileList(result[i]);
             }
         }
         else
         {
             System.out.println(file);
         }
     }

     //文件批量更名
    public static void reName(File file)
    {
        if(file.isDirectory())
        {
            File [] result=file.listFiles();
            for(int i=0;i<result.length;i++)
            {
                reName(result[i]);
            }
        }
        else
        {
            if(file.isFile())
            {
                String fileName=file.getName();
                    if(fileName.endsWith(".dat"))
                {
                    fileName=fileName.substring(0,fileName.lastIndexOf("."))+".txt";
                    File newfile=new File(file.getParent(),fileName);
                    file.renameTo(newfile);
                }

            }
        }
    }

    //OutPutStream
    public static void outstream(File file) throws IOException {
        if(file.isDirectory())
        {
            File [] result=file.listFiles();
            for(int i=0;i<result.length;i++)
            {
                outstream(result[i]);
            }
        }
        if(file.isFile()){
        String data="倪路";
        OutputStream output=new FileOutputStream(file);
        output.write(data.getBytes());
        output.close();
    }
    }

    //InPutStream
    public static void inputstream(File file) throws IOException {
        if(file.isDirectory())
        {
            File [] result=file.listFiles();
            for(int i=0;i<result.length;i++)
            {
                inputstream(result[i]);
            }
        }
        if(file.isFile())
        {
           byte []data=new byte[1024];
           InputStream input=new FileInputStream(file);
           int len = input.read(data);
            System.out.println(new String(data,0,len));
            input.close();
        }
    }

    //Writer
    public static void writer(File file) throws IOException {
        if(file.isDirectory())
        {
            File [] result=file.listFiles();
            for(int i=0;i<result.length;i++)
            {
                writer(result[i]);
            }
        }
        if(file.isFile())
        {
            Writer writer=new FileWriter(file,true);
            String data="李慧";
            writer.write("\t"+data);
            writer.close();
        }
    }

    //Reader
    public static void reader(File file) throws IOException {
        if(!file.getParentFile().exists())
        {
            file.getParentFile().mkdirs();
        }
        if(file.isDirectory())
        {
            File [] result=file.listFiles();
            for(int i=0;i<result.length;i++)
            {
                reader(result[i]);
            }
        }
        if(file.isFile()){
        Reader reader=new FileReader(file);
        char data[]=new char[1024];
        int len=reader.read(data);
        System.out.println(new String(data,0,len));
        reader.close();
    }
    }
}
