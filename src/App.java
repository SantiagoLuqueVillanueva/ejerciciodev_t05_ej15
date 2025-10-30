public class App {
    public static void main(String[] args) throws Exception {
        int base = Integer.parseInt(System.console().readLine("Intrroduzca la base: "));
        int expmax = Integer.parseInt(System.console().readLine("Intrroduzca el exponente máximo: "));
        int exp = 1;
        int sol = base;

        for (int i = 0; i < expmax; i++) {
            System.out.printf("%d^%d = %d%n", base, exp, sol);
            exp++;
            sol = sol * base;
        }
    }
}
