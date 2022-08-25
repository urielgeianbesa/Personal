import org.omg.CORBA.TRANSACTION_ROLLEDBACK;

public class App {
    public static void main(String[] args) {

        Character Assassin = new Character();

        Assassin.strength = 5;
        Assassin.agility = 10;
        Assassin.intelligence = 10;
        Assassin.name = "Ling";
        Assassin.sayMyName();
        Assassin.sayMyStats();


        Character Tank = new Character();

        Tank.strength = 10;
        Tank.agility = 2;
        Tank.intelligence = 1;
        Tank.name = "Grock";
        Tank.sayMyName();
        Tank.sayMyStats();

        Character Mage = new Character();
        Tank.agility = 3;
        Mage.strength = 2;
        Mage.intelligence = 10;
        Mage.name = "Rafaela";
        Mage.sayMyName();
        Mage.sayMyStats();

        Character Fighter = new Character();
        Fighter.strength = 10;
        Fighter.agility = 7;
        Fighter.intelligence = 5;
        Fighter.name = "Alucard";
        Fighter.sayMyName();
        Fighter.sayMyStats();

        Character Support = new Character();
        Support.strength = 3;
        Support.agility = 3;
        Support.intelligence = 10;
        Support.name = "Diggie";
        Support.sayMyName();
        Support.sayMyStats();



    }
}
