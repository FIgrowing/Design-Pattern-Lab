package Lazy;

/**
 * Description:    // 类说明
 *
 * @ClassName: Single01    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/3 9:08   // 时间
 * @Version: 1.0     // 版本
 */

/**
 * 饿汉式(线程不安全)
 * 优点：具有懒加载的效果，需要时再创建实例，避免内存浪费
 * 缺点：存在线程不安全的潜在隐患
 * 原因：
 *  if(instance==null)，当有多个线程进入时，假如A线程判断instance=null，进入方法并创建实例，但此时在创建过程中
 *  (实例还未创建完毕)B线程判断instace=null，也进来创建实例，导致创建了多个实例，违反了单例模式的原则
 */
public class Single01 {

    private static Single01 instance ;
    private Single01(){}
    private static Single01 getInstance()
    {
        if(instance==null)
        {
            instance = new Single01();
        }

        return instance;
    }


}

    
    
