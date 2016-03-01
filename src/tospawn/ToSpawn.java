package tospawn;

import cn.nukkit.*;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.level.Level;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class ToSpawn extends PluginBase {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Level level = getServer().getDefaultLevel();
		((Player)sender).setLevel(level);
		((Player)sender).teleport(level.getSpawnLocation());
		sender.sendMessage(TextFormat.BLUE + "[서버] 스폰으로 이동하였습니다.");
		return true;
	}
}
