import java.io.*;

public class DataHuman {
    public class DataHuman implements WorkWithData {
        public class DataHuman<E extends Human> implements WorkWithData <E>{


            @Override
            public void familyTreeSave(Human human) throws IOException {
                public void familyTreeSave(E e) throws IOException {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                            new FileOutputStream(human.getName().toLowerCase()+".out"));
                    objectOutputStream.writeObject(human);
                    new FileOutputStream(e.getName().toLowerCase()+".out"));
                    objectOutputStream.writeObject(e);
                    objectOutputStream.flush();

                }

                @Override
                public Human familyTreeLoad(Human human) throws IOException, ClassNotFoundException {
                    public E familyTreeLoad(E e) throws IOException, ClassNotFoundException {
                        ObjectInputStream objectInputStream = new ObjectInputStream(
                                new FileInputStream(human.getName().toLowerCase()+".out"));
                        return (Human) objectInputStream.readObject();
                        new FileInputStream(e.getName().toLowerCase()+".out"));
                        return (E) objectInputStream.readObject();
                    }
}
            }
        }
    }
}
