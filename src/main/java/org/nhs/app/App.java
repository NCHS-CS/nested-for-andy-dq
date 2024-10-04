public class App{
    public static void main(String[] args){
        challenge();
    }
    public static void one(){
        for(int i = 1; i<=5;i++){
            for(int x = 1; x <= i; x++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void two(){
        for(int i = 1; i<= 5; i++){
            for (int x = 1; x<= 5-i; x++){
                System.out.print("*");
            }
            for(int z = 1; z<= i;z++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void three(){
        for(int i = 1; i<= 5; i++){
            for (int x = 1; x<= 5-i; x++){
                System.out.print("*");
            }
            System.out.print(i);

            for(int z  = 1; z<= i-1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void challenge(){
        for (int i = -8; i<= 8; i++){
            for(int y = 1; y<=Math.abs(i); y++){
                System.out.print(" ");
            }
            for(int x = 1; x<= (9-Math.abs(i))*2; x++){
                System.out.print(9-Math.abs(i));

            }
            System.out.println();
        }
    }
}