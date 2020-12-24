package com.nilu.binaryTree;

import java.util.Arrays;

class BinaryTree<T extends Comparable<T>>{
    private class Node{
        private Comparable<T> data;
        private Node parent;
        private Node Lchild;
        private Node Rchild;

        public Node(Comparable<T> data) {
            this.data = data;
        }
        public void addNode(Node newNode){
            if(newNode.data.compareTo((T)this.data)<0)
            {
                if(this.Lchild==null)
                {
                    this.Lchild=newNode;
                }
                else
                {
                    this.Lchild.addNode(newNode);
                }

            }
            else
            {
                if(this.Rchild==null)
                {
                    this.Rchild=newNode;
                }
                else
                {
                    this.Rchild.addNode(newNode);
                }
            }
        }
        public void toArrayNode(){
            if(this.Lchild!=null)
            {
                this.Lchild.toArrayNode();
            }
            BinaryTree.this.returnData[BinaryTree.this.foot++]=this.data;
            if(this.Rchild!=null)
            {
                this.Rchild.toArrayNode();
            }
        }
        public boolean containsNode(Comparable<T> data)
        {
            if(data.compareTo((T)this.data)==0)
            {
                return true;
            }
            else if(data.compareTo((T)this.data)<0)
            {
                if(this.Lchild==null)
                {
                    return false;
                }
                else{
                 return this.Lchild.containsNode(data);
                }
            }
            else
            {
                if(this.Rchild==null)
                {
                    return false;
                }
                else{
                   return this.Rchild.containsNode(data);
                }
            }
        }
        public Node getRemoveNode(Comparable<T> data)
        {
            if(data.compareTo((T)this.data)==0)
            {
                return this;
            }
            else if(data.compareTo((T)this.data)<0)
            {
                if(this.Lchild==null)
                {
                    return null;
                }
                else
                {
                   return this.Lchild.getRemoveNode(data);
                }
            }
            else
            {
                if(this.Rchild==null)
                {
                    return null;
                }
                else
                {
                    return this.Rchild.getRemoveNode(data);
                }
            }
        }
    }
    private Node root;
    private int count;
    private Object [] returnData;
    private int foot=0;

    public void add(Comparable<T> data)
    {
        if(data==null)
        {
            throw new NullPointerException("保存的数据不能为空！");
        }
        Node newNode=new Node(data);
        if(this.root==null)
        {
            this.root=newNode;
        }
        else
        {
            this.root.addNode(newNode);
        }
        this.count++;
    }
    public Object[] toArray(){
        if(this.count==0)
        {
            return null;
        }
        this.returnData=new Object[this.count];
        this.foot=0;
        this.root.toArrayNode();
        return this.returnData;
    }
    public boolean contains(Comparable<T> data)
    {
        if(this.count==0)
        {
            return false;
        }
        return this.root.containsNode(data);
    }
    public void remove(Comparable<T> data)
    {
        if(this.root==null) {
            return;
        }
        if(this.contains(data))
        {
            this.count--;
            if(this.root.data.compareTo((T)data)==0)
            {
                if(this.root.Rchild==null&&this.root.Rchild==null)
                {
                    this.root=null;
                }
                else if(this.root.Rchild==null&&this.root.Lchild!=null)
                {
                    this.root=this.root.Lchild;
                }
                else if(this.root.Rchild!=null&&this.root.Lchild==null)
                {
                    this.root=this.root.Rchild;
                }
                else
                {
                    Node MoveNode=this.root.Rchild;
                    while(MoveNode.Lchild!=null)
                    {
                        MoveNode=MoveNode.Lchild;
                    }
                    MoveNode.parent.Lchild=null;
                    MoveNode.Lchild=this.root.Lchild;
                    MoveNode.Rchild=this.root.Rchild;
                    MoveNode.parent=null;
                    this.root=MoveNode;
                }
            }
            else
            {
                Node MoveNode=this.root.getRemoveNode(data);
                if(MoveNode.Lchild==null&&MoveNode.Rchild==null)
                {
                    //下面这里书上的有点问题，不继续往下写了，见书上390页
                }
            }
        }
    }
}
class Menber implements Comparable<Menber>{
    private String Name;
    private int Age;

    public Menber() {
    }

    public Menber(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public int compareTo(Menber o) {
        return this.Age-o.Age;
    }

    @Override
    public String toString() {
        return "Menber{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

}
public class MyBinaryTree {
    public static void main(String[] args) {
       Menber menber[]=new Menber[]{
               new Menber("倪路",18),
               new Menber("杨宝胜",20),
               new Menber("李慧",19),
               new Menber("李慧2",29),
               new Menber("李慧3",24),
               new Menber("李慧4",26),
               new Menber("李慧5",8)
        };
        BinaryTree BTree=new BinaryTree();
        for (int i = 0; i < menber.length; i++) {
            BTree.add(menber[i]);
        }
        System.out.println(Arrays.toString(BTree.toArray()));
        System.out.println(BTree.contains(new Menber()));
        System.out.println(BTree.contains(menber[5]));
    }
}
