import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {
    public static void main(String[] args) throws IOException  {


        String name;
        String adress;
//        System.out.println("dsadsa");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
     name  = br.readLine();
        System.out.println("Where do you live?" + " " + name);
        adress  = br.readLine();
        System.out.println("You live in" + adress + "and your name is" + name);
        
    }
}
