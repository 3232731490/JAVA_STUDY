package com.nilu.ioProject.file;

import java.io.*;
class FileUtil{
    private File srcFile;
    private File tarFile;
    public FileUtil(String src,String tar)
    {
        this(new File(src),new File(tar));
    }
    public FileUtil(File srcFile, File tarFile) {
        this.srcFile = srcFile;
        this.tarFile = tarFile;
    }
    private void copyImpl(File file) throws Exception{
        if(file.isDirectory())
        {
            File results[]=file.listFiles();
            if(results!=null)
            {
                for (int i = 0; i < results.length; i++) {
                    copyImpl(results[i]);
                }
            }
                    }
        else
        {
            if(file.isFile())
            {
                String newFilePath=file.getPath().replace(this.srcFile.getPath()+File.separator,"");
                File newFIle=new File(this.tarFile,newFilePath);
                this.copyFileImpl(file,newFIle);
            }
        }
    }
    private boolean copyFileImpl (File srcFile,File tarFile) throws IOException{
        if(!this.tarFile.getParentFile().exists())
        {
            this.tarFile.getParentFile().mkdirs();
        }
        InputStream input=null;
        OutputStream output=null;
        try{
            input=new FileInputStream(srcFile);
            output=new FileOutputStream(tarFile);
            input.transferTo(output);
            return true;
        }catch(IOException e) {
            throw e;
        }finally {
            if(input!=null)
            {
                input.close();
            }
            if(output!=null)
            {
                output.close();
            }
        }
    }

    public boolean copy() throws Exception{
        if(!this.srcFile.exists())
        {
            System.out.println("源文件不存在");
            return false;
        }
        try{
            this.copyImpl(this.srcFile);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
public class CharByte {
    public static void main(String[] args) throws Exception {
        //转换流
        //transfer();

        //文件复制
        copyFile();
    }
    public static void transfer() throws IOException {
        File file=new File("D:"+ File.separator+"nilu.txt");
        OutputStream output=new FileOutputStream(file);
        Writer writer=new OutputStreamWriter(output);
        writer.write("倪路");
        writer.close();
        output.close();
    }

    //文件复制
    public static void copyFile() throws Exception {
        File srcFile=new File("D:"+ File.separator+"IOOperate");
        File tarFile=new File("D:"+File.separator+"NILU");
        FileUtil fileUtil=new FileUtil(srcFile,tarFile);
        fileUtil.copy();
    }
}
