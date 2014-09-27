package com.Funergy.BS;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class PShout extends Command{

	public PShout() {
		super("pshout","ps");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length < 1){
			sender.sendMessage(new TextComponent(ChatColor.RED+"[Soultpoint]: /pshout <message>"));
			return;
		}
		 StringBuilder msgBuilder = new StringBuilder();
         
         for (int i = 0; i < args.length; i++) {
                 msgBuilder.append(args[i]).append(" ");
         }
        
         String msg = ChatColor.translateAlternateColorCodes('&', msgBuilder.toString().trim());
         if(sender.hasPermission("bungeeshout.admin")){
         ProxyServer.getInstance().broadcast(new TextComponent(ChatColor.RED+sender.getName().toUpperCase()+": §f"+msg));
         }
         if(sender.hasPermission("bungeeshout.owner")){
             ProxyServer.getInstance().broadcast(new TextComponent(ChatColor.GOLD+sender.getName().toUpperCase()+": §f"+msg));
             }
	
		
	}

}
