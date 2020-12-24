public class WolfM {
    private char sex;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    void setSex(char sex) {
        this.sex = sex;
    }

    char getSex() {
        return sex;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    String getNickname() {
        return nickname;
    }

    void setWeight(float sex) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Incorrect Wolf age");
        } else {
            this.age = age;
        }
    }

    int getAge() {
        return age;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("walk method");
    }

    public void seat() {
        System.out.println("seat method");
    }

    public void run() {
        System.out.println("run method");
    }

    public void howl() {
        System.out.println("howl method");
    }

    public void hunt() {
        System.out.println("hunt method");
    }
}
