package de.cooperr.command;

import de.cooperr.entity.Player;

public interface CommandExecutor {

    void onCommand(Player player, String[] args, Command command);
}
