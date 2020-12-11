import java.util.Scanner;

class role extends rule {
    public static void main(String[]args) {

        rule role = new rule();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入名字");
        String name = scanner.next();
        role.name = name;
        role.skillname = "skill1";
        role.skillstrength = 100;
        role.sex = "女";
        role.blood = 5000;
        role.experience = 0;

        System.out.println("创建"+ role.sex +"角色名为"+ name + "，初始血量为" + role.blood);

        role.Eat();
        


    }
}
