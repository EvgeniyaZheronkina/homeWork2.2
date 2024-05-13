public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри Поттер", 10, 5, 3, 7,1);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 7, 2, 4, 6, 2);
        Gryffindor weasley = new Gryffindor("Рон Уизли", 6, 10, 2, 5, 2);

        Slytherin malfoy = new Slytherin("Драко Малфой", 16, 3, 6, 2, 8, 10, 2);
        Slytherin montague = new Slytherin("Грэхэм Монтегю", 4, 5, 3, 9, 5, 2, 9);
        Slytherin goil = new Slytherin("Грегори Гойл", 3, 7, 1, 7, 2, 11, 6);

        Hufflepuff smith = new Hufflepuff("Захария Смит", 10, 6, 3, 7, 2);
        Hufflepuff sedrik = new Hufflepuff("Сердик Диггори", 9, 3, 5, 2, 12);
        Hufflepuff finchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 12, 8, 4, 7, 2);

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 6, 3, 7, 1, 9, 2);
        Ravenclaw patil = new Ravenclaw("Падма Патил", 11, 7, 3, 9, 4, 13);
        Ravenclaw belby = new Ravenclaw("маркус Белби", 9, 11, 4, 9, 7, 4);

        System.out.println(potter);
        System.out.println(germiona);
        System.out.println(weasley);
        System.out.println(malfoy);
        System.out.println(montague);
        System.out.println(goil);
        System.out.println(smith);
        System.out.println(sedrik);
        System.out.println(finchFletchley);
        System.out.println(chang);
        System.out.println(patil);
        System.out.println(belby);

        weasley.innerComparedTo(potter);
        malfoy.innerCompareTo(goil);
        finchFletchley.innerCompareTo(sedrik);
        chang.innerCompareTo(patil);

        potter.compareTo(malfoy);
        belby.compareTo(sedrik);
    }

}