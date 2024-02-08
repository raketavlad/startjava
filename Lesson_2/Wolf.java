public class WolfTest {

    public static void main(String[] args) {
        Wolf akella = new Wolf();
        akella.gender = "male";
        akella.nickname = "Akella";
        akella.weight = 34.1f;
        akella.age = 13;
        akella.woolColor = "gray";
        System.out.println("Пол волка: " + akella.gender + "\nКличка волка: " + akella.nickname +
                "\nВес волка: " + akella.weight + "\nВозраст волка: " + akella.age +
                "\nОкрас волка: " + akella.woolColor);
        akella.go();
        akella.sit();
        akella.run();
        akella.howl();
        akella.hunt();
    }
}
public class Wolf {

    String gender;
    String nickname;
    float weight;
    int age;
    String woolColor;

    void go() {
        System.out.println("Идёт");
    }

    void sit() {
        System.out.println("Сидит");
    }

    void run() {
        System.out.println("Бежит");
    }

    void howl() {
        System.out.println("Воет");
    }

    void hunt() {
        System.out.println("Охотится");
    }
}