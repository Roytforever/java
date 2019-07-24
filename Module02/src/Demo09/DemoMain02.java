package Demo09;

public class DemoMain02 {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        //为英雄起一个名字，并且设置年龄
        hero.setName("盖伦");
        hero.setAge(20);

        //创建武器
        Weapon weapon = new Weapon("多兰剑");
        //为英雄配备武器
        hero.setWeapon(weapon);

        //年龄为：20的盖伦用多兰剑攻击敌方。
        hero.attack();
    }
}
