

import java.util.Scanner;
public class appCalculadora {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        Scanner teclado = new Scanner(System.in);

          
        System.out.println("Digite o primeiro valor");
        double x = teclado.nextDouble();

        System.out.println("Digite o segundo valor");
        double y = teclado.nextDouble();


        System.out.println("Escolha a operação: +, - , *, /");
        teclado.nextLine();
        char op = teclado.nextLine().charAt(0);


        if (op == '+') {
            System.out.println(calc.soma(x,y));
        } else if (op == '-') {
            System.out.println(calc.subt(x,y));

        } else if (op == '*') {
            System.out.println(calc.multi(x,y));
        } else if (op == '/') {
            System.out.println(calc.divis(x,y));
        } else {
                System.out.println("Opção inválida");
        }



         
    


    }

    private static void tecladonextlLne() {
    }
}
