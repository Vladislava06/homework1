
import java.io.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
        Human nick = new Human("Владислава Ряни", 17, Gender.male);
        Human mama = new Human("Наталия Баркан", 51, Gender.female);
        Human papa = new Human("Эдуард Ряни", 52, Gender.male);
        nick.setMother(mama);
        nick.setFather(papa);

        FamilyTree family = new FamilyTree();
        family.addHuman(nick);
        family.addHuman(mama);
        family.addHuman(papa);

        Human sister = new Human("Анна Баркан", 29, Gender.female, mama, papa);
        family.addHuman(sister);

        mama.showKids();
        System.out.println();
        nick.findSiblings();
        System.out.println();
        System.out.println();

        System.out.println(family.showAllRelatives());
        family.sortByName();
        System.out.println(family.showAllRelatives());
        family.sortByAge();
        System.out.println(family.showAllRelatives());
        String filePath = "family.txt";
        Writable writable = new Serialization();

        writable.save(family, filePath);

        FamilyTree tree = writable.read(filePath);
        System.out.println(family.showAllRelatives());
    }
}




