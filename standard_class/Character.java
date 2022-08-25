public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void sayMyStats() {
        System.out.println("\nMy strength is " +  strength +  "\nMy agility is  "+  agility +  "\nMy intelligence is " + intelligence + "\n"); 
}}
