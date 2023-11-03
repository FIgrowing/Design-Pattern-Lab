package Static_inner_class;

/**
 * Description:    // 类说明
 *
 * @ClassName: SIngle01    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/3 9:44   // 时间
 * @Version: 1.0     // 版本
 */

/**
 * 静态内部类
 * 优缺点说明：

 1) 这种方式采用了类装载的机制来保证初始化实例时只有一个线程
 2) 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化
 时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
  3) 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们
 保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
  4) 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 5) 结论：推荐使用
 */
public class SIngle01 {

    private SIngle01(){}

    //写一个静态内部类，该类中有个一个静态属性
    private static class Singleton{
        private static final SIngle01 INSTANCE=new SIngle01();
    }

    public static  SIngle01 getInstance()
    {
        return Singleton.INSTANCE;
    }

}

    
    
