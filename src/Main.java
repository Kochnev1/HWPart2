public class Main {
    public static void main(String[] args) {
        int invAmount = 100; //Начальный счет
        int repAmount = 2000; //Сумма пополнения
        int totalCsore = (invAmount + repAmount); //Итоговый счет

        int bonus;
        if (repAmount >= 1000) {
            bonus = repAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Баланс счета:" + totalCsore);
        System.out.println("Начислено бонусов:" + bonus);


    }
}
