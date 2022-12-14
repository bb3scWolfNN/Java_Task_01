public class Main {
    public static void main(String[] args) {
        int costTicket = 10000; // Стоимость билета
        int priceBonus = 20; // Стоимость одной мили
        int milesBonus = costTicket / priceBonus; //Расчет количества миль

        System.out.println(milesBonus);
    }
}

