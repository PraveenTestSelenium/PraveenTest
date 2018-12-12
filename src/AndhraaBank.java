public class AndhraaBank implements bank {


    @Override
    public void login() {
        System.out.println("login");
    }

    @Override
    public void logout() {
        System.out.println("logout");
    }

    @Override
    public void forgotPassword() {
        System.out.println("forgotPassword");
        System.out.println("Andhrabank checkin---");
    }



    public void newAccount(){
        System.out.println("newAccount");

    }

    public void creditCards(){

        System.out.println("creditCards");
    }


}
