public class Bird extends Animal {
    public Bird() {
        super();
        name="Bird";
        System.out.println("I am a" +name);
    }

    public void speak(){
        System.out.println("Chirp...chirp...");
    }
    public void fly(){
        System.out.println("I'm flying");
    }
}
