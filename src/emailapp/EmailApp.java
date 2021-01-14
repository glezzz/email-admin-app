package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Alej", "Glez");

        em1.setAlternateEmail("raulglez@gmail.com");
        System.out.println("Your alternate email is: " + em1.getAlternateEmail());
        em1.changePassword("realmadrid");
        System.out.println("Your new password is: " + em1.getPassword());
    }
}
