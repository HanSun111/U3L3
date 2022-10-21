public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age
public int getAge(){
        return age;
}


    // MODIFY this method so that the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak()
    {
        int x = 1 + (int)(Math.random() * 3);
        if(x == 1) {
            return "meow!";
        } else if (x==2) {
            return "Me want to dip claw in your cup.";
        }
           else return "you shall be my servant";
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. " + speak());
    }

}
