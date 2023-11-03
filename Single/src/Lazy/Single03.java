package Lazy;

/**
 * Description:    // 类说明
 *
 * @ClassName: Single03    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/3 9:23   // 时间
 * @Version: 1.0     // 版本
 */

/**
 * 同步代码块
 * 虽然解决了效率问题，但是连线程安全都保证不了，不能使用
 * 优缺点说明：
 1) 这种方式，本意是想对Single02实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的的代码块
  2) 但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一
  致，假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，
  另一个线程也通过了这个判断语句，这时便会产生多个实例
 3) 结论：在实际开发中，不能使用这种方式
 */
public class Single03 {

    private static Single03 instance ;
    private Single03(){}
    private static  Single03 getInstance()
    {
        if(instance==null)
        synchronized (Single03.class)
        {
            instance = new Single03();
        }

        return instance;
    }

}

    
    
