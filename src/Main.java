public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster(1,4);
        Monster monster3 = new Monster(3,6,5);
        monster1.voice();
        monster2.voice(5);
        monster3.voice(3,"Я монстррр!");



    }
}
