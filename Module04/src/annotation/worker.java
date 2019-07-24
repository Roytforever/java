package annotation;

@MyAnno(/*value = */  value = 12,/*,name = "张三"*/per = Person.P1 ,anno2 = @MyAnno2,strs = {"aaa","bbb"})
@MyAnno3
public class worker {
    @MyAnno3
    public String name = "aaa";

    @MyAnno3
    public void show(){

    }
}
