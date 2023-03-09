import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;

        System.out.print("Digite uma String: ");
        String texto = sc.nextLine();
        char[] textoInvertido = new char[texto.length()];

        for(int x = texto.length() -1;x >= 0;x--) {
            textoInvertido[index] = texto.charAt(x);
            index++;
        }
        System.out.println(textoInvertido);
    }
}
