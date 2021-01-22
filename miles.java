public class miles {
    public static void main(String[] args) {
        int start = 100; // сколько на счету
        long charge = 1100; // сколько пополняет
        long bonus;
        if (charge > 1000) {
            bonus = charge / 100 ;
        } else {
            bonus = 0;
        }
        long total = start + charge + bonus;
        System.out.println(bonus);
        System.out.println(total);
}
}