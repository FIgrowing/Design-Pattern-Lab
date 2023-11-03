package Hungry;

class Single02{
    //构造器私有化
    private Single02(){};

    private  static Single02 instance;

    static {
        instance=new Single02();
    }

    public static Single02 getInstance()
    {
        return instance;
    }
}