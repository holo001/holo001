

public class rule {
    int blood;
    String name;
    int strength;
    String sex;
    int gain1,gain2 = 100;
    String skillname;
    int skillstrength;
    int experience = 0;
    public void Eat(){

        this.blood = this.blood + gain1;
        this.experience = this.experience + gain2;
        System.out.println(new StringBuilder().append(name).append("获得增益，血量增加").append(gain1).append("，剩余血量").append(this.blood).append(".").append("获得经验").append(gain2).append(",当前经验").append(this.experience).toString());
    }

    public void Beat(){

    }
    public void Skill(){
        System.out.println(name);
    }
}
