package Shallow_copy;

/**
 * Description:    // 类说明
 *
 * @ClassName: client    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/5 12:09   // 时间
 * @Version: 1.0     // 版本
 */
public class client {

   public static void main(String[] args) {
      System.out.println("使用原型模式的浅拷贝完成对象的创建");

      Sheep sheep=new Sheep("肖恩","白色",2);

      Sheep sheep1 = (Sheep) sheep.clone();
      Sheep sheep2 = (Sheep) sheep.clone();
      Sheep sheep3 = (Sheep) sheep.clone();
      Sheep sheep4 = (Sheep) sheep.clone();

      System.out.println("sheep1 " + sheep1 + "sheep1.hashCode() " + sheep1.hashCode());
      System.out.println("sheep2 " + sheep2 + "sheep2.hashCode() " + sheep2.hashCode());
      System.out.println("sheep3 " + sheep3 + "sheep3.hashCode() " + sheep3.hashCode());
      System.out.println("sheep4 " + sheep4 + "sheep4.hashCode() " + sheep4.hashCode());
   }


}

    
    
