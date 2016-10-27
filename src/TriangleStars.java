/**
 * Created by Ryuilhan on 2016. 10. 27..
 */
import java.util.Scanner;
public class TriangleStars {
    public void input(){
        Scanner scDaTa = new Scanner(System.in);
        int height;
        int blank;
        try {
            System.out.print("직각삼각형의 왼쪽여백과 높이입력 : ");
            blank=scDaTa.nextInt();
            height=scDaTa.nextInt();
            this.Triangle(blank, height);
        }catch (Exception e){
            System.out.println("정확히 입력하세요.");
        }
    }

    public void Triangle(int b, int h){
        for(int i=0; i<h; i++){
            for(int j=b-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int z=0; z<=i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
