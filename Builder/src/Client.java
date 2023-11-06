/**
 * Description:    // 类说明
 *
 * @ClassName: Client    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/6 23:11   // 时间
 * @Version: 1.0     // 版本
 */
public class Client {

    public static void main(String[] args) {
        //创建奥迪车
        Audi audi = new Audi();
        //创建造车的指挥者
        builderDerictor builderDerictor = new builderDerictor(audi);
        //完成造车，返回产品
        Car car = builderDerictor.constructCar();

        System.out.println("----------------------------------------------------------");

        //重置指挥者，改造宝马车
        builderDerictor.setCarBuilder(new BMW());

        Car car1 = builderDerictor.constructCar();

        StringBuilder aa = new StringBuilder("aa");

    }

}

    
    
