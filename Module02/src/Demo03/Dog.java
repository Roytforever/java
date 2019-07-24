package Demo03;

//子类也是抽象类
public abstract class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("吃");
    }

    //public abstract void sleep();
}
