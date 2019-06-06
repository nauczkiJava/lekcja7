abstract class Silnik {
    boolean uruchomiony;

    public Silnik() {
        this.uruchomiony = false;
    }

    void wlacz(){
        if (uruchomiony == true) {
            System.out.println("Silnik jest już uruchomiony.");
        } else {
            System.out.println("Uruchomiono silnik.");
            uruchomiony = true;
        }
    }

    void wylacz(){
        if (uruchomiony == false) {
            System.out.println("Silnik jest już wyłączony.");
        } else {
            System.out.println("Wyłączono silnik.");
            uruchomiony = false;
        }
    }
}