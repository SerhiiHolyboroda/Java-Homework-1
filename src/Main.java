import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String text = br.readLine();
        int radius = Integer.parseInt(br.readLine());
        Circle circle = new Circle(radius);
        circle.displayPerimeter();
    }
}
