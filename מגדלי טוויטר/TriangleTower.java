import java.util.Scanner;

public class TriangleTower extends Tower {
    Scanner in=new Scanner(System.in);
    public TriangleTower(double width,double height){
        super(width,height);
    }
    @Override
    public void Hekef() {
        double tzela=Math.pow(getHeight(),2)+Math.pow((getWidth()/2),2);
        tzela=Math.sqrt(tzela);
        double hekef=getWidth()+tzela*2;
        System.out.println(hekef);
    }
    public  void PrintTriangle() {
    if(getWidth()%2==0||getHeight()>(getWidth()*2))
        System.out.println("The triangle cannot be printed");
    else {
        int x=((int)getHeight()-2);
        int c=x/(((int)getWidth()-2)/2);
        int s=x%(((int)getWidth()-2)/2);
        int w=(int)getWidth();
        int k=0,j=0;
        int value=1;
        print(1,value);
        value+=2;

            print(s,value);
            for(int i=0;i<x/c;i++)
            {
                print(c,value);
                value+=2;
            }

        print(1,value);


    }
    }
public void print(int lines,int width){
   int w=((int)getWidth()-width) /2;

   for(int j=0;j<lines;j++){
       for(w=((int)getWidth()-width) /2+1;w>0;w--)
           System.out.print(" ");
   for(int i=0;i<width;i++)
       System.out.print("*");
    System.out.println();
}}
    @Override
    public void choice() {
    int n=0;
        System.out.println("press 1 to get the hekef or 2 to print the triangle:");
        n=in.nextInt();
        while(n!=1&&n!=2)
        {
            System.out.println("a Wrong choice");
            System.out.println("please press 1 to get the hekef or 2 to print the triangle:");
            n=in.nextInt();

        }
        switch(n){
            case 1: {
                this.Hekef();
                break;
            }
            case 2: {
                this.PrintTriangle();
                break;
            }

        }
    }
}
