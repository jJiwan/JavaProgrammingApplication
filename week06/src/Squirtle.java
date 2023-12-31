public class Squirtle extends Pokemon{
    public Squirtle(Flyable f) {
        super();  // 부모 클래스의 기본 생성자 호출 (생략 가능)
        System.out.println("꼬북꼬북..");
        //this.setLevel(1);
        this.level = 1;
        this.setHp(44);
        this.attackRate=48;
        this.defenceRate=65;
        this.name = "꼬부기";
        this.flyable = f; // Association, has-a (Aggregation)
        this.skills = new String[]{"아쿠아테일", "물기", "물대포"};
        this.specialAttackRate = new int[]{90, 60, 40};
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}