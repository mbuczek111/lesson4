public class CatTester {
    public static class Cat {
    private String name;
    private boolean isHungry=true;

    Cat (String n){
        name=n;
    }

    void eat(String food) {
        if (this.isHungry) {
            this.isHungry = false;
            System.out.println(this.name + " is eating " + food);
        }
        else
        {
            System.out.println(this.name + " is not hungry");
        }
    }

    void play(String toy)
    {
        System.out.println(this.name + " is playing around with "+ toy);
    }

    void sleep(int time)
    {
        this.isHungry=true;
        System.out.println(this.name + " is going to sleep for " + time + " hours");
    }

    void isHungry()
    {
        if(this.isHungry)
        {
            System.out.println(this.name + " is hungry");
        }
        else
        {
            System.out.println(this.name + " is not hungry");
        }
    }
    }

    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        tom.eat("milk");
        tom.eat("mouse");
        tom.sleep(5);
        tom.isHungry();
        tom.eat("mouse");
        tom.isHungry();
        tom.play("ball");


    }
}
