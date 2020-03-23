public class Monster {

    int eyes;
    int legs;
    int arms;

    Monster() {

    }
    Monster (int eyes) {
        this.eyes = eyes;
        this.legs = 2;
        this.arms = 2;

    }

    Monster(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = 2;

    }

    Monster(int eyes, int legs, int arms) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
    }

    void voice () {
        System.out.println("Голос");
    }
    void voice(int i) {
        for (int n=0; n<i; n++) {
            System.out.println("Голос");

        }

    }

    void voice(int i, String word) {
        for (int n = 0; n < i; n++) {
            System.out.println(word);
        }
    }




}

