public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(50, 199)) {
            System.out.println("Случайное число: " + r);
            if (r == 199) {
                System.out.println("Выпало число 199, давайте на этом закончим");
                break;
            }
        }
    }
}
