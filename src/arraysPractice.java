import org.junit.Test;

public class arraysPractice {



    public Object[][] datatest(){

    Object[][] data = new Object[3][2];

        data[0][0] = "abc";
        data[0][1] = "abcd";
        data[1][0] = "abce";
        data[1][1] = "abcf";
        data[2][0] = "abcg";
        data[2][1] = "abch";

        System.out.println(data[0].length);

        for(int i=0; i<data.length;i++ ) {

            for (int j = 0; j < data[0].length; j++) {

                System.out.println(data[i][j]);

            }
        }

     return  data;

    }


}
