public class Ravenclaw extends Hogwarts{
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name,
                     int magicPower,
                     int transgressionDistance,
                     int intelligence,
                     int wisdom,
                     int wit,
                     int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void innerCompareTo(Ravenclaw other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println(other.getName() + " лучший Когтевран, чем " + this.getName());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println(this.getName() + " лучший Когтевран, чем " + other.getName());
        } else {
            System.out.println(String.format("Студенты %s и %s равны по силе %n", this.getName(), other.getName()));
        }
    }

    private int scoreSum() {
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}
