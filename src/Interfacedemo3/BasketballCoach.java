package Interfacedemo3;

public class BasketballCoach extends Coaches{
    public BasketballCoach(){

    }
    public BasketballCoach(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("篮球教练在教打篮球！");
    }
}
