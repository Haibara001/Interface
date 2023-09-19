package Interfacedemo3;

public class Test {
    public static void main(String[] args) {
        //创建运动员或者教练的对象
        PingPang pp = new PingPang("张三",18);
        System.out.println("姓名："+pp.getName()+","+"年龄："+pp.getAge());
        pp.study();
        PingPangCoach ppc = new PingPangCoach("李四",22);
        System.out.println("姓名："+ppc.getName()+"年龄："+ppc.getAge());
        ppc.speakEnglish();
        ppc.teach();
    }
}
