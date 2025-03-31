import java.util.Scanner;

public class B2708 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int jeeps = 0;
        int people = 0;

        while (true){
            String movement = sc.next();
            if (movement.equals("SALIDA")){
                people += sc.nextInt();
                jeeps++;
            }else if (movement.equals("VUELTA")){
                people -= sc.nextInt();
                jeeps--;
            }else break;
        }
        System.out.println(people + "\n" + jeeps);
    }
}
