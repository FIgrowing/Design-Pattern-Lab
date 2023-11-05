package Deep_copy;

/**
 * Description:    // 类说明
 *
 * @ClassName: client    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/5 12:18   // 时间
 * @Version: 1.0     // 版本
 */
public class client {

    public static void main(String[] args) {

        System.out.println("使用原型模式的深拷贝来创建对象");

        Sheep sheep = new Sheep("肖恩","白色",2, new Sheep("佩奇","黑色",3,null));

        try {
            Sheep sheep1 = (Sheep) sheep.clone();
            System.out.println("sheep: " + sheep + "sheep.friend: " + sheep.friend + "sheep.hashCode: " + sheep.hashCode());
            System.out.println("sheep1: " + sheep1 + "sheep1.friend: " + sheep1.friend + "sheep1.hashCode: " + sheep1.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        Sheep sheep2 = (Sheep) sheep.deepClone();
        System.out.println("sheep2: " + sheep + "sheep2.friend: " + sheep.friend + "sheep2.hashCode: " + sheep2.hashCode());


    }

}

    
    
