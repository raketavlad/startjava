public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public Jaeger() {

    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight,
            int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrenght() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public static void showJaegerInfo(Jaeger jaeger) {
        System.out.println("Модель робота: " + jaeger.getModelName() +
                "\nМарка : " + jaeger.getMark() + "\nПроизведен: " + jaeger.getOrigin() +
                "\nВысота: " + jaeger.getHeight() + " meters" +
                "\nВес: " + jaeger.getWeight() + " tons" +
                "\nСила: " + jaeger.getStrenght() + "\nБроня: " + jaeger.getArmor() + "\n");
    }

    public static void move(Jaeger jaeger) {
        System.out.println(jaeger.getModelName() + " двигается вперёд!");
    }

    public static void attackKaiju(Jaeger jaeger) {
        System.out.println(jaeger.getModelName() + " напал на Кайдзю!");
    }

    public static void hitKaiju(Jaeger jaeger) {
        System.out.println(jaeger.getModelName() + " ударил Кайдзю!");
    }

    public static void shootKaiju(Jaeger jaeger) {
        System.out.println(jaeger.getModelName() + " стреляет из орудия в Кайдзю!");
    }

    public static void jump(Jaeger jaeger) {
        System.out.println(jaeger.getModelName() + " подпрыгивает!");
    }
}