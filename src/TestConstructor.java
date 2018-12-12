public class TestConstructor {

    private String fMovie;

    public TestConstructor(String x){

         fMovie=x;
    }


    public void setMovie(String movie){

        fMovie = movie;


    }

    public String getMovie(){

        return fMovie;
    }

    public void fresults(){


        System.out.println(fMovie);
    }
}
