package Lazy;

/**
 * Description:    // 类说明
 *
 * @ClassName: Single02    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/3 9:16   // 时间
 * @Version: 1.0     // 版本
 */

/**
 * 优缺点说明：
 * 1)
 * 解决了线程安全问题
 * 效率太低了，每个线程在想获得类的实例时候，执行getInstance(0方法都要进行同步。而其实这个方法只执行
 * 2)
 * 一次实例化代码就够了，后面的想获得该类实例，直接run就行了。方法进行同步效率太低
 * 3)结论：在实际开发中，不推荐使用这种方式
 */
public class Single02 {

    private static Single02 instance ;
    private Single02(){}
    private static synchronized Single02 getInstance()
    {
        if(instance==null)
        {
            instance = new Single02();
        }

        return instance;
    }
}


