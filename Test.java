import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
            family.addRelative(nick);
            family.addRelative(mama);
            family.addRelative(papa);
            Human sister = new Human("Анна Баркан", 29, Gender.female, mama, papa);
            family.addRelative(sister);
            family.updateKids();

            mama.showKids();
            System.out.println();
            nick.findSiblings();
            System.out.println();

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("family.out"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("family.out"));

            Serialization serialization = new Serialization(objectOutputStream, objectInputStream, new FamilyTree());
            serialization.save(family);
            serialization.readFile();
            serialization.newFamily.showAllRelatives();
        }
    }

