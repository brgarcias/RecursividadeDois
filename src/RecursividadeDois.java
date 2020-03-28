public class RecursividadeDois {

    public static void main(String[] args) {


        //chamada menor valor
        int mv[] = {4, 8, 2, 1, 7, 9, 3, 6, 12, 15, -1};
        System.out.println("O menor valor é: " + menorRecursivo(mv));


        System.out.println("\n// ---------- Recursividade 2 -------- //");
        // ---------- Recursividade 2 -------- //

        //Exercicio 5
        //potenciação
        System.out.println("2^10 = " + potenciacao(2, 10));

        //Exercicio 7
        //binario para decimal
        System.out.println("O binário 1100 é em decimal: " + binarioDecimal("1100"));


    }

    // Menor valor do vetor Recursivamente:

    public static int menorRecursivo(int[] valor) {
        int aux = -1; //valor invalido
        if (valor != null && valor.length > 0) {
            aux = valor[0];
            for (int menor : valor) {
                if (menor < aux) {
                    aux = menor;
                }
            }
        }
        return aux;
    }


    // ---------- Recursividade 2 -------- //

    //Exercicio 5
    //potenciação
    public static double potenciacao(double base, int exp) {
        if (exp == 0) return 1;
        else return potenciacao(base, exp - 1) * base;
    }

    //Exercicio 7
    //binário para decimal
    public static int binarioDecimal(String bin) {
        int potencia = 0;
        int decimal = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            decimal += Math.pow(2, potencia) * Character.getNumericValue(bin.charAt(i));
            potencia++;
        }
        return decimal;
    }


}

