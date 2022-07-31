import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
             int day, mounth;
             String burc;
             Scanner input = new Scanner(System.in);


             System.out.print("Dogdugunuz gun: ");
             day = input.nextInt();

             System.out.print("Dogdugunuz ay: ");
             mounth = input.nextInt();

                 if (mounth == 1) {
                     if (day >= 1 && day <= 31) {
                         if (day < 22) {
                             burc = "oglak";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "kova";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                 else if (mounth == 2) {
                     if (day >= 1 && day <= 28) {
                         if (day < 20) {
                             burc = "kova";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "balik";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                 else if (mounth == 3) {
                     if (day >= 1 && day <= 31) {
                         if (day < 21) {
                             burc = "balik";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "koc";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                else if (mounth == 4) {
                     if (day >= 1 && day <= 31) {
                         if (day < 21) {
                             burc = "koc";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "boga";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                 else if (mounth == 5) {
                     if (day >= 1 && day <= 31) {
                         if (day < 23) {
                             burc = "boga";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "ikizler";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                else if (mounth == 6) {
                     if (day >= 1 && day <= 31) {
                         if (day < 23) {
                             burc = "ikizler";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "yengec";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                else if (mounth == 7) {
                     if (day >= 1 && day <= 31) {
                         if (day < 23) {
                             burc = "yengec";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "aslan";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                else if (mounth == 8) {
                     if (day >= 1 && day <= 31) {
                         if (day < 23) {
                             burc = "aslan";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "basak";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                else if (mounth == 9) {
                     if (day >= 1 && day <= 31) {
                         if (day < 23) {
                             burc = "basak";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "terazi";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                 else if (mounth == 10) {
                     if (day >= 1 && day <= 31) {
                         if (day < 22) {
                             burc = "terazi";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "akrep";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                else if (mounth == 11) {
                     if (day >= 1 && day <= 31) {
                         if (day < 22) {
                             burc = "akrep";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "yay";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }

                 else if (mounth == 12) {
                     if (day >= 1 && day <= 31) {
                         if (day < 22) {
                             burc = "yay";
                             System.out.println("burcunuz: " + burc);
                         } else {
                             burc = "oglak";
                             System.out.println("burcunuz: " + burc);
                         }
                     }
                     else {
                         System.out.println("gecersiz gun girdisi!");
                     }
                 }
                 else {
                     System.out.println("gecersiz ay girdisi!");
                 }

        }
}




