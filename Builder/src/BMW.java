/**
 * Description:    // 类说明
 *
 * @ClassName: BMW    // 类名，会自动填充
 * @Author: 周天赐        // 创建者
 * @Email: m18879004515@163.com
 * @Date: 2023/11/6 23:04   // 时间
 * @Version: 1.0     // 版本
 */
public class BMW extends CarBuilder {
    @Override
    public void buildTyre() {
        System.out.println("完成宝马汽车轮胎建造");
    }

    @Override
    public void buildBody() {
        System.out.println("完成宝马汽车车身建造");
    }

    @Override
    public void buildEngine() {
        System.out.println("完成宝马汽车发动机建造");
    }
}

    
    
