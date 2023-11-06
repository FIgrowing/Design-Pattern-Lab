/**
 * Description:    // 类说明
 *
 * @ClassName: builderDerictor    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/6 23:07   // 时间
 * @Version: 1.0     // 版本
 */
public class builderDerictor {

    CarBuilder carBuilder = null;

    public builderDerictor(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car constructCar(){
        carBuilder.buildTyre();
        carBuilder.buildBody();
        carBuilder.buildEngine();
        return carBuilder.getCar();
    }

}

    
    
