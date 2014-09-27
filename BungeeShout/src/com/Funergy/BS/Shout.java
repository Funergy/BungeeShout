package com.Funergy.BS;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class Shout extends Command{
	
	public Shout() {
		super("shout", "bungeeshout.shout", "sh");
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length < 1){
			sender.sendMessage(new TextComponent(ChatColor.RED+"[Soultpoint]: /shout <message>"));
			return;
		}
		 StringBuilder msgBuilder = new StringBuilder();
         
         for (int i = 0; i < args.length; i++) {
                 msgBuilder.append(args[i]).append(" ");
         }
        
         String msg = ChatColor.translateAlternateColorCodes('&', msgBuilder.toString().trim());
         ProxyServer.getInstance().broadcast(new TextComponent(msg));
	}

}
