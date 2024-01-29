public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int rechargeAmount = 1905;


        int bonus = 0;
        if (rechargeAmount > 1000) {
            bonus = rechargeAmount / 100;
        }

        int totalBalance = initialBalance + rechargeAmount + bonus;
        System.out.println("Итоговая сумма на счету клиента: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}
