package pocketmon_game;

public class Hero {
    public String name;
    public int hp;
    public int mp;

    public Hero(int user_hp, int user_mp) {
        this.hp = user_hp;
        this.mp =user_mp;
    }

    public int skill1(String input,  String monster_name) {
        System.out.println(input+ "이(가) 기본공격 스킬을 사용하였습니다.");
        System.out.println(monster_name+ "에게 " + 3 + "만큼 공격하였습니다.");
        return 3;
    }
    
    public int skill2(String input, String monster_name) {
        mp = mp - 5;
        System.out.println(input+ "이(가) 물공격 스킬을 사용하였습니다.");
        System.out.println(monster_name+ "에게 " + 5 + "만큼 공격하였습니다.");
        return 5;
    }

    public int skill3(String input, String monster_name) {
        mp = mp - 10;
        System.out.println(input+ "이(가) 물공격 스킬을 사용하였습니다.");
        System.out.println(monster_name+ "에게 " + 10 + "만큼 공격하였습니다.");
        return 10;
    }

    public void dmg(String input, int monster_dmg) {
        hp = hp - monster_dmg;
        System.out.println("용사는 " + input + "에게 " +monster_dmg+ "만큼 공격 받았습니다.");
    }

    public void info(String input) {
        System.out.println("===============["+input+"]===============");
        System.out.println("남은 HP : " +hp + " 남은 MP : " + mp);
    }

}
