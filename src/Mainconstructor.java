import org.junit.Test;

public class Mainconstructor {

    private int a;

    private int b;

    private int c;

     public Mainconstructor(int a){

         this.a= a;



     }


    public Mainconstructor(int a, int b){

        this.a=a;
        this.b=b;

    }



    public Mainconstructor(int a, int b,int c){

        this.a=a;
        this.b=b;
        this.c=c;

    }


    public int oneValue(int a){
        int x=0;
        x= 5+a;
       return x;



    }


    public int add(int a, int b){
        int y=0;
        y= a+b;

        return y;


    }

    public int adding(int a, int b, int c){
        int z=0;
        z= a+b+c;

        return z;
    }


     @Test
     public void fResults(){

        oneValue(a);

        add(a,b);

        adding(a,b,c);

     }


}
