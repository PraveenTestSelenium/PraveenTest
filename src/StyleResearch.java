import org.apache.xpath.operations.String;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StyleResearch{



    public static void main(String[] args) {

    }

        @Test
        public void testss(){

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devanalyzer.styleresearch.com");
    }

    @Test
    public void testWhile(){

            int x= 0;
            int sum=0;

            while(x<10){
                x++;
                sum =sum+x;
            }

        System.out.println(sum);

    }

    @Test
    public void testFor(){

        int sum=0;
        int x=0;
         for (int i=1;i<= 10; i++){

             sum= sum+i;
             i=sum;


             System.out.println(sum);





        }


    }



    @Test
    public void ifTest(){
        int age= 30;

        if (age > 24){

            System.out.println("pass");
        }else{

            System.out.println("fail");
        }


    }



    @Test
    public void getMethod(){

        TestConstructor tc = new TestConstructor("test");

       // tc.setMovie("avatar");

        tc.fresults();
    }


    @Test
    public void itTest(){

        newConstructor nc = new newConstructor("aaa", "bbb","ccc");
        nc.apple();



    }



}

