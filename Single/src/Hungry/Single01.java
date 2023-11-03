package Hungry;

/**
 * 饿汉式(静态变量)
 * 优点：在类装载的时候就实例化，避免了线程同步问题
 * 缺点，在类装载的时候就实例化，没有达到懒加载的效果，如果从始至终都没有用到这个实例，就会造成内存的浪费
 */

class Single01{
    //构造器私有化
    private Single01(){};

    private final static Single01 instance = new Single01();

    public static Single01 getInstance()
    {
        return instance;
    }
}