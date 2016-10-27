/**
 * Created by Ryuilhan on 2016. 10. 27..
 */
import java.util.Scanner;
public class IsoscelesTriangleStars {
    public void input(){
        int height;
        Scanner scData = new Scanner(System.in);
        try {
            System.out.print("이등변삼각형 높이입력 : ");
            height = scData.nextInt();
            this.isosceles(height);
        }catch (Exception e ){
            System.out.println("정확히 입력하세요.");
        }
    }

    public String isosceles(int h){
        String strData = "*";
        for(int i=0; i<h; i++){
            for(int j=h-i; j>0; j--){
                System.out.print(" ");
            }
            System.out.println(strData);
            strData+="**";
        }
        return strData;
    }
}
