package Lazy;

import java.util.Stack;

/**
 * Description:    // 类说明
 *
 * @ClassName: Single04    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/3 9:29   // 时间
 * @Version: 1.0     // 版本
 */


/**
 * 双重检查
 *
 * 优缺点说明：
 *
 * 1) Double-Check概念是多线程开发中常使用到的，如代码中所示
 * 我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。
  2) 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，
  直接return实例化对象，也避免的反复进行方法同步.
 *3) 线程安全；延迟加载；效率较高
 4) 结论：在实际开发中，推荐使用这种单例设计模式
 */
public class Single04 {

    private static volatile Single04 instance;

    private Single04(){}

    public static Single04 getInstance()
    {
        if (instance==null)
        {
            synchronized (Single04.class)
            {
                if (instance==null)
                {
                    instance = new Single04();
                }
            }
        }
        return instance;
    }

}

    
    
