import java.io.IOException;

public class WorkWithData {
    public interface WorkWithData {
        public interface WorkWithData<E extends Human> {

            void familyTreeSave(E e) throws IOException;

            E familyTreeLoad(E e) throws IOException, ClassNotFoundException;

            void familyTreeSave(Human human) throws IOException;

            Human familyTreeLoad(Human human) throws IOException, ClassNotFoundException;
        }
    }
}
