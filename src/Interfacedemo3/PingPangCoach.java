package Interfacedemo3;

public class PingPangCoach extends Coaches implements English{

    public PingPangCoach(){

    }
    public PingPangCoach(String name,int age){
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println("乒乓球教练在教打乒乓球！");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }
}
