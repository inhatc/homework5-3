/**
 * Created by Ryuilhan on 2016. 10. 27..
 */
import java.util.Scanner;

public class ExamForWhileStars {
    public static void main(String[] args) {
        new ExamForWhileStars().start();
    }

    public void start() {
        int menu;
        Scanner scData = new Scanner(System.in);
        try {
            System.out.println("1. 정사각형 별찍기");
            System.out.println("2. 직각삼각 별찍기");
            System.out.println("3. 이등변삼각형 별찍기");
            System.out.println("4. 다이아몬드 별찍기");
            System.out.println("5. 종료하기");
            System.out.print("원하는 메뉴는>>");
            menu = scData.nextInt();
            this.select(menu);
        } catch (Exception e) {
            System.out.println("정확히 입력해주세요");
            this.start();
        }
    }

    public void select(int menu) {
        if(menu==1) { new RectagleStars().Rectan(); this.start();  }
        else if(menu==2) { new TriangleStars().input(); this.start(); }
        else if(menu==3) { new IsoscelesTriangleStars().input(); this.start(); }
        else if(menu==4) { new DiamondStars().input(); this.start(); }
        else if(menu==5) { return; }
    }
}





