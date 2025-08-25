import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        System.out.println("Radius as input:");
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        System.out.printf("Area of circle: %f",3.14*r*r);
        sc.close();
    }
}
    

