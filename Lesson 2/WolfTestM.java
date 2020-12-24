public class WolfTestM {

    public static void main(String[] args) {
        WolfM wf = new WolfM();

        wf.setSex('M');
        wf.setNickname("Jack");
        wf.setWeight(50.0f);
        wf.setAge(5);
        wf.setColor("black");

        System.out.println("Wolf sex is " + wf.getSex());
        System.out.println("Wolf nickname is " + wf.getNickname());
        System.out.println("Wolf weight is " + wf.getWeight());
        System.out.println("Wolf age is " + wf.getAge());
        System.out.println("Wolf color is " + wf.getColor());

        wf.walk();
        wf.seat();
        wf.run();
        wf.howl();
        wf.hunt();
    }
}
