import java.io.IOException;
import java.security.Provider;
import java.util.Scanner;

public class UserDataHuman {
        private DataHuman dataHuman = new DataHuman();
        private Provider.Service service = new Provider.Service();
        private Human human;
        private Scanner sc = new Scanner(System.in);

        public void userEnterDataFamylyTree() throws IOException {
            String command = "";
            do {
                System.out.println("Введите команду:\n" +
                        "add - чтобы добавить нового пользователя\n" +
                        "stop - чтобы завершить программу");
                command = sc.nextLine();

                if (command.equals("add")) {
                    System.out.println("Введите данные человека, его имя и возвраст");
                    String name = sc.nextLine();
                    int age = sc.nextInt();
                    sc.nextLine();
                    Human human = new Human(name,age);
                    dataHuman.familyTreeSave(human);
                } else if (!command.equals("stop")) {
                    System.out.println("Неверная команда. Попробуйте еще раз.");
                }
            } while (!command.equals("stop"));
        }
    }

