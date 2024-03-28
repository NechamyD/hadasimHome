import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n=0;
//        Tower t;
        double width,height;
        String tower="";
        while(n!=3){
            System.out.println("press 1 to a rectangle tower ,2 to a triangle  tower ,3 to exit");
                n=in.nextInt();
                switch(n){
                    case 1: {
                        System.out.println("press  width and height");
                        width = in.nextDouble();
                        height = in.nextDouble();
                        RectengleTower r = new RectengleTower(width, height);
                        r.choice();
                        break;
                    }
                    case 2: {
                        System.out.println("press  width and height");
                        width = in.nextDouble();
                        height = in.nextDouble();
                        TriangleTower t = new TriangleTower(width, height);
                        t.choice();
                        break;
                    }
                    case 3:
                        break;

                }


        }
    }
}