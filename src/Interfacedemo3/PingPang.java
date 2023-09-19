package Interfacedemo3;

public class PingPang extends Sporters implements English{
    public PingPang(){

    }
    public PingPang(String name,int age){
        super(name,age);
    }
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语！");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学打乒乓球！");
    }
}
