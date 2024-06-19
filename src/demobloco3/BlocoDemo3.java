package demobloco3;

public class BlocoDemo3 {

    public static void main(String[] args) {
       // Escopo externo
        {
           // Escopo interno
            int n1 = 2;
            System.out.println("O valor de n1 é " + n1); // Compila corretamente.
        }
    }

}
