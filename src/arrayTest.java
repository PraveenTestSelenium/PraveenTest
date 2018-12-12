import org.junit.Test;

public class arrayTest {

    @Test
    public void firstTest(){

        int arrayT[] = {21,25,60,50,40};

        for(int i=0; i<arrayT.length; i++ ){

            System.out.println(arrayT[i]);

        }
    }

   //@Test
   // public void enhancedForloop(){

        //int arrayTest[] = {21,25,60,50,40};

       // int total = 0;

        //for(int j:arrayTest){



         //   total = total+j;

      //  }

     //  System.out.println(total);
   // }

    @Test
    public void BeforeChange(){

        int arr[] ={15, 25,45,55,65};
        changeValues(arr);

        for(int k=0 ; k<arr.length; k++){
            System.out.println(arr[k]);
        }




    }


    public  void changeValues (int x[]){


        for(int l= 0; l<x.length; l++){

            x[l] +=10;

            }


    }



}
