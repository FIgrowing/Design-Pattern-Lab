/**
 * Description:    // 类说明
 *
 * @ClassName: CarBuilder    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/6 23:00   // 时间
 * @Version: 1.0     // 版本
 */
public abstract class CarBuilder {

    Car car = new Car();

    public abstract void buildTyre();
    public abstract void buildBody();
    public abstract void buildEngine();

    public Car getCar()
    {
        return car;
    }

}

    
    
