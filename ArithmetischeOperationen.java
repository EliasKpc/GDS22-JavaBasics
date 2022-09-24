public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        int ErgebnisAddition = a + b;
        System.out.println("Ergebnis Addition: " + ErgebnisAddition);

        int ErgebnisSubtraktion = a - b;
        System.out.println("Ergebnis Subtraktion: " + ErgebnisSubtraktion);

        int ErgebnisMulitplikation = a * b;
        System.out.println("Ergebnis Subtraktion: " + ErgebnisMulitplikation);

        int ErgebnisDivision = a / b;
        System.out.println("Ergebnis Division: " + ErgebnisDivision);
        double div = (double) a / (double) b;
        //double div = a / (1.0 * b);
        System.out.println("Ergebnis Division: " + div);

        int ErgebnisModulo = a % b;
        System.out.println("Ergebnis Modulo: " + ErgebnisModulo);



        //a++  --> Bedeutet a = a + 1
        System.out.println("a++");
        // ich erwarte mir 3
        System.out.println(a++);
        System.out.println("a = " + a); // ich erwarte mir 4

        System.out.println("-----------------");

        //++b
        System.out.println("++b");
        // ich erwarte mir 3
        System.out.println(++b);
        System.out.println("b = " + b);
    }
}
