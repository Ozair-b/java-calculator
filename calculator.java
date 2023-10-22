import java.util.Scanner;
import java.lang.Math;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("😎😎😎😎Welcome to Calculator😎😎😎😎");
//        System.out.println("Pick operator\n1.add\t\t\t6.sin\n2.subtract\t\t7.cos\n3.multiply\t\t8.tan\n4.divide\t\t9.cot\n5.remainder\t\t10.sec\n\t\t\t\t11.cosec");
//        System.out.println("To Quit Calculator press '0' ");
        while (true) {
            System.out.println("Pick operator\n1.add➕\t\t\t6.sin\n2.subtract➖\t7.cos\n3.multiply✖️\t8.tan\n4.divide➗\t\t9.cot\n5.remainder\t\t10.sec\n\t\t\t\t11.cosec");
            System.out.println("To Quit Calculator😂🤣 \npress any value other than above numbers ");
            short a = sc.nextShort();
            double ans = 0;
            if (a>0 && a <= 5) {
                System.out.print("Enter 2 numbers\n");
                double x = sc.nextDouble(), y = sc.nextDouble();
                if (a == 1) {
                    ans = (long) (x + y);
                } else if (a == 2) {
                    ans = (long) (x - y);
                } else if (a == 3) {
                    ans = (long) (x * y);
                } else if (a == 4) {
                    if (y != 0) {
                        ans = (x / y);
                    } else System.out.println("division by zero not valid");
                } else if (a == 5) {
                    if (y != 0) {
                        ans =  (x % y);
                    } else System.out.println("division by zero not valid");
                }
                System.out.println("🟰"+ans);

            } else if (a>0 && a <= 11) {
                System.out.println("please enter angles in degree");
                float g = (float)sc.nextDouble();
                double angle = Math.toRadians(g);//(float)(g * Math.PI) / 180; //  Math.toRadians(g) also.
                if (a == 6) {
                    System.out.printf("sin(" + g + ")🟰%.3f\n",Math.sin(angle));
                } else if (a == 7) {
                    System.out.printf("cos(" + g + ")🟰%.3f\n" ,Math.cos(angle));
                } else if (a == 8) {
                    System.out.println("tan(" + g + ")🟰" + Math.tan(angle));
                } else if (a == 9) {
                    System.out.println("cot(" + g + ")🟰" + 1 / (Math.tan(angle)));
                } else if (a == 10) {
                    System.out.printf("sec(" + g + ")🟰%.3f\n", 1 / (Math.cos(angle)));
                } else if(a==11) {
                    System.out.printf("cosec(" + g + ")🟰%.3f\n", 1 / (Math.sin(angle)));
                }
            }
            else if(!(a>=1 && a<=11)){
                break;
            }
        }
        sc.close();
    }
}
