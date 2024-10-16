import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // Считывание пяти целых чисел X,A,B,C,D из консоли
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int satisfiedCustomers = 0;
        // Объявляем количество покупателей, которые смогли купить планируемое количество бананов
        if (A<=X) {
            // Сравниваем: хватит ли бананов в магазине, чтобы покупатель A ушел довольным.
            // Если хватит, то один покупатель уходит довольным, соответственно количество satisfiedCustomers
            // увеличивается на 1. Также количество бананов в магазине уменьшится на то количество, сколько купил A.
            // Если бананов не хватает, то вывожу количество довольных покупателей на данный момент.
            satisfiedCustomers+=1;
            X -= A;
            if (B<=X) {
                // Делаем то же самое, что и для цикла с покупателем A.
                satisfiedCustomers+=1;
                X -= B;
                if (C<=X){
                    // Делаем то же самое, что и для цикла с покупателем A.
                    satisfiedCustomers+=1;
                    X -= C;
                    if (D<=X){
                        // Сравниваем: хватит ли бананов в магазине, чтобы покупатель D ушел довольным.
                        // Если хватит, то один покупатель уходит довольным, соответственно, количество satisfiedCustomers
                        // увеличивается на 1. После выводим количество довольных покупателей, так как очередь кончилась.
                        // Если бананов не хватает, то вывожу количество довольных покупателей на данный момент.
                        satisfiedCustomers+=1;
                        out.print(satisfiedCustomers);
                    }
                    else{
                        out.print(satisfiedCustomers);
                    }
                }
                else{
                    out.print(satisfiedCustomers);
                }
            }
            else{
                out.print(satisfiedCustomers);
            }
        }
        else {
            out.print(satisfiedCustomers);
        }

    }
}
