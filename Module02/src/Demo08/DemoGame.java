package Demo08;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("德玛"); //设置英雄名称

        //设置英雄技能
  //      hero.setSkill(new SkillImpl());

        //还可以改为使用匿名内部类
        //Skill skill = new Skill() {
            //@Override
           // public void use() {
            //    System.out.println(" 打 打 打");
          //  }
       // };
        //hero.setSkill(skill);

        //进一步简化，同时使用匿名内部类和匿名对象

        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("滴 滴 滴");
            }
        });
        hero.attack();
    }
}
