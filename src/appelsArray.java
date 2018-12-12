import org.junit.Test;

public class appelsArray {


    @Test
    public void testingArray(){

        int apples[][] = {{22,33}, {22,55}, {45,55}};

              change(apples);
   }


    public void change(int dummy[][]){

        for(int r=0; r<dummy.length;r++){

            for(int c=0; c<dummy[r].length;c++){

                System.out.println(dummy[r][c]);
            }

            System.out.println("praveen test ");

            System.out.println("praveen pull test ");


            System.out.println("praveen ready to commit test ");

            System.out.println("praveen ready to commit test brab=nch  test ");
        }





    }




    @Test
    public void testingArray1(){

        int apples[][] = {{22,33}, {22,55}, {45,55}};

        for(int r=0; r<apples.length;r++){

            for(int c=0; c<apples[r].length;c++){

                System.out.println(apples[r][c]);
            }

            System.out.println();

        }



    }

    @Test
    public void getData(){

        arraysPractice aP = new arraysPractice();


        aP.datatest();

    }
}
