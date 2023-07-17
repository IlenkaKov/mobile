public class Main {
    public static void main(String[] args) {
        int score = 300; //первоначальный счет
        int amount = 100; // сумма пополнения

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100 * 1;
        } else {
            bonus = 0;
        }

        int itog = bonus + score + amount;

        System.out.println("Итоговый бонус" + bonus);
        System.out.println("Итоговый счет" + itog);
    }
}


