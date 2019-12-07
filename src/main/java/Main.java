import service.CalculatorService;

public class Main {

    public static void main(String[] args) {

        // citeste a si b de la tastatura
        int a = 1;
        int b = 2;

        // calculeaza
        int c = new CalculatorService().sum(a,b);

        // afiseaza la consola pe c
        System.out.println(c);
    }
}
