package ui.commands;
import ui.Console;
public class End implements Command {
    private Console console;

    public End (Console console) {
        this.console = console;
    }

    @Override
    public String getDescription() {
        return "Завершить работу программы";
    }

    @Override
    public void execute() {
        console.finish();
    }
}

