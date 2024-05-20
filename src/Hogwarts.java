public abstract class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compareTo(Hogwarts other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println(other.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + other.getName());
        } else {
            System.out.println(String.format("Студенты %s и %s равны по силе %n", this.getName(), other.getName()));
        }
    }

    private int scoreSum() {
        return magicPower + transgressionDistance;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;
    }
}
