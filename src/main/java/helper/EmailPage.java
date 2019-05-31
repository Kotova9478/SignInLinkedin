package helper;

public class EmailPage {
    public static String createEmail(){

        long number = System.currentTimeMillis();
         StringBuilder builder = new StringBuilder();

         builder.append("it9478")
                 .append("+")
                 .append(number)
                 .append("@gmail.com");

         String email = builder.toString();

        return email;
    }
}
