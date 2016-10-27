/**
 * Created by Ryuilhan on 2016. 10. 27..
 */
import java.util.Scanner;
public class RectagleStars {
    public void Rectan(){
        int rec;

        Scanner scData = new Scanner(System.in);
        System.out.print("정사각형 크기 : ");
        rec = scData.nextInt();
        for(int i=0; i<rec; i++){
            for(int j=0; j<rec; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
