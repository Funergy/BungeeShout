package com.Funergy.BS;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeShout extends Plugin{
        @Override
        public void onEnable() {
                    ProxyServer.getInstance().getPluginManager().registerCommand(this, new Shout());
                    ProxyServer.getInstance().getPluginManager().registerCommand(this, new PShout());

        }
}
