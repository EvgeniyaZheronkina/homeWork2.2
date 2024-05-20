public class Hufflepuff extends Hogwarts{
    private final int hardworking;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name,
                      int magicPower,
                      int transgressionDistance,
                      int hardworking,
                      int loyalty,
                      int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void innerCompareTo(Hufflepuff other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println(other.getName() + " лучший Пуффендуй, чем " + this.getName());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println(this.getName() + " лучший Пуффендуй, чем " + other.getName());
        } else {
            System.out.println(String.format("Студенты %s и %s равны по силе %n", this.getName(), other.getName()));
        }
    }

    private int scoreSum() {
        return hardworking + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}
