package Lab2.ex2;

interface Chargeable {
    void charge();
}

public class Charger {
    public void charge(Chargeable c){
        c.charge();
    }
}
