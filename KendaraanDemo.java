public class KendaraanDemo {
    public static void main(String[] args) {
        SepedaMotor motor1 = new SepedaMotor("Vespa", "Matic", 2019, 7, "Pertamax");
        System.out.println(motor1.getInfo());

        SepedaMotor motor2 = new SepedaMotor("Kawasaki", "Classic", 2017, 13, "Pertamax Turbo");
        System.out.println(motor2.getInfo());
    }
}
