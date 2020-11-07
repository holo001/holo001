public class Animal {


  int age;//年龄
  String sex;//性别
  String name;//名字

 //成员方法
    public void eat(){
   System.out.println("恰饭");

  }


  public void sleep(){
      System.out.println(this.name);
      System.out.println(this.age);
      System.out.println(this.sex);
   System.out.println("睡觉");
  }
    public void run(){
        System.out.println("跑步");
    }
//
//
//  public static void main(String[]args){
//   Animal cat = new Animal();//创建一只猫
//   cat.eat();
//   cat.age = 17;
//   cat.sex = "雄";
//   cat.name = "holo000";
//   System.out.println(cat.age);
//      System.out.println(cat.sex);
//      System.out.println(cat.name);
//
//
//      Animal dog = new Animal();
//      dog.sleep();//定义一只狗
//      dog.name = "holo001";
//      System.out.println(dog.name);
//      dog.run();
//
//}
 }