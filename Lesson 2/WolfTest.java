public class WolfTest {

    public static void main(String[] args) {
        Wolf wf = new Wolf();

        wf.sex = 'M';
        wf.nickname = "Jack";
        wf.weight = 50.0f;
        wf.age = 5;
        wf.color = "black";

        System.out.println("Wolf sex is " + wf.sex);
        System.out.println("Wolf nickname is " + wf.nickname);
        System.out.println("Wolf weight is " + wf.weight);
        System.out.println("Wolf age is " + wf.age);
        System.out.println("Wolf color is " + wf.color);

        wf.walk();
        wf.seat();
        wf.run();
        wf.howl();
        wf.hunt();
    }
}
