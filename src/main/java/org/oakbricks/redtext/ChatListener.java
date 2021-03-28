package org.oakbricks.redtext;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static java.lang.Character.isLetter;

public class ChatListener implements Listener {

    //Main chat listener event. Changes messages that start with 1 to red, excluding emotes.
    @EventHandler
    public void AsyncChatEvent(AsyncPlayerChatEvent e) {
        String pMessage = e.getMessage();
        Player p = e.getPlayer();

        if (pMessage.startsWith("!") && pMessage.length() > 1 && isLetter(pMessage.charAt(1))) {
            if (p.hasPermission("redtext.use")) {
                e.setMessage(ChatColor.RED + pMessage);
            }
        }
    }
}