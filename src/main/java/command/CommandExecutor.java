package command;

import entity.Player;

public interface CommandExecutor {

    void onCommand(Player player, String[] args, Command command);
}
