public class Slytherin extends Hogwarts{
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int powerLust;

    public Slytherin(String name,
                     int magicPower,
                     int transgressionDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int powerLust) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void innerCompareTo(Slytherin other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println(other.getName() + " лучший Слизерин, чем " + this.getName());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println(this.getName() + " лучший Слизерин, чем " + other.getName());
        } else {
            System.out.println(String.format("Студенты %s и %s равны по силе %n", this.getName(), other.getName()));
        }
    }

    private int scoreSum() {
        return cunning + determination + ambition + resourcefulness + powerLust;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", powerLust=" + powerLust;
    }
}
