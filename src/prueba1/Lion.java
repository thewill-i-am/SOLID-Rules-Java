package prueba1;

public class Lion extends Animal {
    public Lion(int age, String name) {
        super(age, name);
    }
    private void roar() {
        System.out.println("The "+getAge()+" year old lion says: Roar!");
    }
}