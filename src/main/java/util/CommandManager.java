package util;

import command.CommandExecutor;
import command.CommandExecutor;
import entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class CommandManager {

    private final HashMap<String, CommandExecutor> COMMANDS = new HashMap<>();

    private CommandManager() {
    }

    public static CommandManager getCommandManager() {
        return new CommandManager();
    }

    public void registerCommand(CommandExecutor command, String name) {
        COMMANDS.put(name, command);
    }

    public void executeInput(List<String> command, Player player) {
        if (COMMANDS.containsKey(command.get(0))) {

            List<String> args = new ArrayList<>(List.copyOf(command));
            args.remove(0);

            COMMANDS.get(command.get(0)).onCommand(player, args.toArray(String[]::new), new Command(command.get(0)));
        }
    }

    public HashMap<String, CommandExecutor> getCommands() {
        return COMMANDS;
    }
}
