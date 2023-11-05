package Deep_copy;

import java.io.*;

/**
 * Description:    // 类说明
 *
 * @ClassName: Shallow_copy.Sheep    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/5 12:03   // 时间
 * @Version: 1.0     // 版本
 */
public class Sheep implements Cloneable, Serializable {


    private String name;
    private String color;
    private int age;

    public Sheep friend;

    public Sheep(String name, String color, int age, Sheep friend) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sheep getFriend() {
        return friend;
    }

    /**
     * 实现深拷贝方法一:重写clone()方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        //此处先完成对基本数据类型的克隆
        sheep = (Sheep) super.clone();
        //对应用数据类型的属性进行单独克隆
        if (sheep.friend!=null)
        sheep.friend = (Sheep) friend.clone();

        return sheep;
    }


    /**
     * 实现深拷贝方法二:序列化
     * @return
     */
    public Object deepClone(){
        /**
         * TODO:
         * 这段代码的作用是实现对象的深拷贝。具体步骤如下：
         *
         * 创建一个ByteArrayOutputStream对象bos，用于存储序列化后的数据。
         * 创建一个ObjectOutputStream对象oos，并将bos作为参数传入，用于将当前对象（this）以对象流的方式输出到bos中。
         * bos作为参数传入oos中是为了指定序列化后的数据存储的位置。通过将bos传递给oos，
           我们可以告诉oos将序列化后的数据写入到bos所指向的输出流中。
           这样，我们就可以使用bos来获取序列化后的数据，以便进行后续的处理或传输。
         * 调用oos.writeObject(this)方法，将当前对象序列化并写入到bos中。
         * 创建一个ByteArrayInputStream对象bis，并将bos.toByteArray()作为参数传入，用于从bos中读取序列化后的数据。
         * 创建一个ObjectInputStream对象ois，并将bis作为参数传入，用于从bis中读取对象流。
         * 调用ois.readObject()方法，从ois中读取对象流，并将其强制转换为Sheep类型，赋值给copySheep。
         * 返回copySheep，即实现了当前对象的深拷贝。
         */
        //创建流对象
        ByteArrayOutputStream bos =null;
        ObjectOutputStream oos =null;
        ByteArrayInputStream bis =null;
        ObjectInputStream ois= null;

        Sheep copySheep = null;
        try {
            //序列化
            bos =new ByteArrayOutputStream();
            oos =new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出


            // 反序列化
            bis= new ByteArrayInputStream(bos.toByteArray());
            ois =new ObjectInputStream(bis);
            copySheep = (Sheep) ois.readObject();
            return copySheep;

        }  catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


        }
    }





}

    
    
