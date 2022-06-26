package pocketmon_game;
import java.util.*;
public class main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        Monster monster = new Monster("파이리" , 10, 10);
        String monster_name = monster.name;
        Hero user = new Hero(10, 10);

        System.out.println("용사의 이름을 입력해주세요.");
        String input = scan.nextLine();

        System.out.println("깊은 숲 속....");
        scan.nextLine();
        System.out.println("용사 " +input+ "(이)가 걸어가고 있습니다...");
        scan.nextLine();
        System.out.println("뚜벅...... 뚜벅......");
        scan.nextLine();

        System.out.println("부스럭..!!!");
        scan.nextLine();
        System.out.println("용사 " +input+ "(이)가 몬스터 " +monster_name+ "을 마주쳤습니다!!!");
        scan.nextLine();

        //용사가 공격
        monster.dmg(input, user.skill1(input, monster_name));
        scan.nextLine();
        //남은 몬스터 스탯
        monster.info();
        scan.nextLine();

        //몬스터가 공격
        user.dmg(input, monster.skill1(input));
        scan.nextLine();
        //남은 용사 스탯
        user.info(input);
        scan.nextLine();


    }
}
