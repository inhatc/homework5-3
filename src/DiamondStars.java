/**
 * Created by Ryuilhan on 2016. 10. 27..
 */
import java.util.Scanner;
public class DiamondStars {
    public void input(){
        int height;
        Scanner scData = new Scanner(System.in);
        try {
            System.out.print("다이아몬드의 크기입력 :");
            height = scData.nextInt();
            this.diamond(height);
        }catch (Exception e){
            System.out.println("정확히 입력해주세요");
        }
    }

    public void diamond(int h){
        String strData = "";
        if(h==0||h==1) {
            System.out.println("다이아몬드를 그릴수 없습니다.");
        }
        else { strData = new IsoscelesTriangleStars().isosceles(h); }
        for(int i=1; i<h; i++){
            for(int j=h-i; j<=h; j++){
                System.out.print(" ");
            }
            for(int k=0; k<strData.length()-(2+(i*2)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
