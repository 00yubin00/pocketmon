package pocketmon_game;

public class Monster {
    public String name;
    public int hp;
    public int mp;
    public int monster_dmg;

    public Monster(String monster_name ,int monster_hp, int monster_mp) {
        this.name = monster_name;
        this.hp = monster_hp;
        this.mp =monster_mp;
    }

    public int skill1(String input) {
        mp = mp - 5;
        monster_dmg = ((int) (Math.random()*100)+1);
        System.out.println(name+ "이(가) 몸통박치기를 사용하였습니다.");
        System.out.println(input+ "에게 " + monster_dmg + "만큼 공격하였습니다.");
        return monster_dmg;
    }
    
    public int skill2(String input) {
        mp = mp - 10;
        monster_dmg = ((int) (Math.random()*100)+100);
        System.out.println(name+ "(이)가 물어뜯기를 사용하였습니다.");
        System.out.println(input+ "에게 " + monster_dmg + "만큼 공격하였습니다.");
        return monster_dmg;
    }

    public void dmg(String input, int user_dmg) {
        hp = hp - user_dmg;
        System.out.println(name+ "은(는) 용사 " + input + "에게 " +user_dmg+ "만큼 공격 받았습니다.");
    }

    public void info() {
        System.out.println("===============["+name+"]===============");
        System.out.println("남은 HP : " +hp + " 남은 MP : " + mp);
    }

}
