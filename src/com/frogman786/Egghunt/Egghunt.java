package com.frogman786.Egghunt;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;


public class Egghunt extends JavaPlugin{

	public final Logger Log = Logger.getLogger("Minecarft");

	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.Log.info(pdfFile.getName() + " Has Been Disabled! ");
	}

	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.Log.info(pdfFile.getName() + " " + pdfFile.getVersion() +  " Has Been Enabled! ");
	}
		
	ItemStack egg1 = new ItemStack(Material.MONSTER_EGG, 1, (short) 57);
	ItemStack egg2 = new ItemStack(Material.MONSTER_EGG, 1, (short) 56);
	ItemStack egg3 = new ItemStack(Material.MONSTER_EGG, 1, (short) 55);
	ItemStack egg4 = new ItemStack(Material.MONSTER_EGG, 1, (short) 54);
	ItemStack egg5 = new ItemStack(Material.MONSTER_EGG, 1, (short) 52);
	ItemStack egg6 = new ItemStack(Material.MONSTER_EGG, 1, (short) 51);
	ItemStack egg7 = new ItemStack(Material.MONSTER_EGG, 1, (short) 50);
	ItemStack egg8 = new ItemStack(Material.MONSTER_EGG, 1, (short) 66);
	ItemStack egg9 = new ItemStack(Material.MONSTER_EGG, 1, (short) 65);
	ItemStack egg10 = new ItemStack(Material.MONSTER_EGG, 1, (short) 62);
	ItemStack egg11 = new ItemStack(Material.MONSTER_EGG, 1, (short) 61);
	ItemStack egg12 = new ItemStack(Material.MONSTER_EGG, 1, (short) 60);
	ItemStack egg13 = new ItemStack(Material.MONSTER_EGG, 1, (short) 59);
	ItemStack egg14 = new ItemStack(Material.MONSTER_EGG, 1, (short) 58);
	ItemStack egg15 = new ItemStack(Material.MONSTER_EGG, 1, (short) 90);
	ItemStack egg16 = new ItemStack(Material.MONSTER_EGG, 1, (short) 91);
	ItemStack egg17 = new ItemStack(Material.MONSTER_EGG, 1, (short) 92);
	ItemStack egg18 = new ItemStack(Material.MONSTER_EGG, 1, (short) 93);
	ItemStack egg19 = new ItemStack(Material.MONSTER_EGG, 1, (short) 94);
	ItemStack egg20 = new ItemStack(Material.MONSTER_EGG, 1, (short) 95);
	ItemStack egg21 = new ItemStack(Material.MONSTER_EGG, 1, (short) 96);
	ItemStack egg22 = new ItemStack(Material.MONSTER_EGG, 1, (short) 98);
	ItemStack egg23 = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
	ItemStack egg24 = new ItemStack(Material.MONSTER_EGG, 1, (short) 120);
	ItemStack egg25 = new ItemStack(Material.MONSTER_EGG, 1, (short) 63);
	ItemStack egg26 = new ItemStack(Material.EGG, 1, (short) 0);
	int iegg1 = 0;
	int iegg2 = 0;
	int iegg3 = 0;
	int iegg4 = 0;
	int iegg5 = 0;
	int iegg6 = 0;
	int iegg7 = 0;
	int iegg8 = 0;
	int iegg9 = 0;
	int iegg10 = 0;
	int iegg11 = 0;
	int iegg12 = 0;
	int iegg13 = 0;
	int iegg14 = 0;
	int iegg15 = 0;
	int iegg16 = 0;
	int iegg17 = 0;
	int iegg18 = 0;
	int iegg19 = 0;
	int iegg20 = 0;
	int iegg21 = 0;
	int iegg22 = 0;
	int iegg23 = 0;
	int iegg24 = 0;
	int iegg25 = 0;
	int iegg26 = 0;
	String segg1 = "";
	String segg2 = "";
	String segg3 = "";
	String segg4 = "";
	String segg5 = "";
	String segg6 = "";
	String segg7 = "";
	String segg8 = "";
	String segg9 = "";
	String segg10 = "";
	String segg11 = "";
	String segg12 = "";
	String segg13 = "";
	String segg14 = "";
	String segg15 = "";
	String segg16 = "";
	String segg17 = "";
	String segg18 = "";
	String segg19 = "";
	String segg20 = "";
	String segg21 = "";
	String segg22 = "";
	String segg23 = "";
	String segg24 = "";
	String segg25 = "";
	String segg26 = "";
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args){
		if(lbl.equalsIgnoreCase("eggs")){
			Player player = (Player) sender;
		    PlayerInventory inventory = player.getInventory();
		    if(inventory.contains(egg1)){
				iegg1 = 1;
				segg1 = "egg1, ";
			}else{
				iegg1 = 0;
				segg1 = "";
			}
			if(inventory.contains(egg2)){
				iegg2 = 1;
				segg2 = "egg2, ";
			}else{
				iegg2 = 0;
				segg2 = "";
			}
			if(inventory.contains(egg3)){
				iegg3 = 1;
				segg3 = "egg3, ";
			}else{
				iegg3 = 0;
				segg3 = "";
			}
			if(inventory.contains(egg4)){
				iegg4 = 1;
				segg4 = "egg4, ";
			}else{
				iegg4 = 0;
				segg4 = "";
			}
			if(inventory.contains(egg5)){
				iegg5 = 1;
				segg5 = "egg5, ";
			}else{
				iegg5 = 0;
				segg5 = "";
			}
			if(inventory.contains(egg6)){
				iegg6 = 1;
				segg6 = "egg6, ";
			}else{
				iegg6 = 0;
				segg6 = "";
			}
			if(inventory.contains(egg7)){
				iegg7 = 1;
				segg7 = "egg7, ";
			}else{
				iegg7 = 0;
				segg7 = "";
			}
			if(inventory.contains(egg8)){
				iegg8 = 1;
				segg8 = "egg8, ";
			}else{
				iegg8 = 0;
				segg8 = "";
			}
			if(inventory.contains(egg9)){
				iegg9 = 1;
				segg9 = "egg9, ";
			}else{
				iegg9 = 0;
				segg9 = "";
			}
			if(inventory.contains(egg10)){
				iegg10 = 1;
				segg10 = "egg10, ";
			}else{
				iegg10 = 0;
				segg10 = "";
			}
			if(inventory.contains(egg11)){
				iegg11 = 1;
				segg11 = "egg11, ";
			}else{
				iegg11 = 0;
				segg11 = "";
			}
			if(inventory.contains(egg12)){
				iegg12 = 1;
				segg12 = "egg12, ";
			}else{
				iegg12 = 0;
				segg12 = "";
			}
			if(inventory.contains(egg13)){
				iegg13 = 1;
				segg13 = "egg13, ";
			}else{
				iegg13 = 0;
				segg13 = "";
			}
			if(inventory.contains(egg14)){
				iegg14 = 1;
				segg14 = "egg14, ";
			}else{
				iegg14 = 0;
				segg14 = "";
			}
			if(inventory.contains(egg15)){
				iegg15 = 1;
				segg15 = "egg15, ";
			}else{
				iegg15 = 0;
				segg15 = "";
			}
			if(inventory.contains(egg16)){
				iegg16 = 1;
				segg16 = "egg16, ";
			}else{
				iegg16 = 0;
				segg16 = "";
			}
			if(inventory.contains(egg17)){
				iegg17 = 1;
				segg17 = "egg17, ";
			}else{
				iegg17 = 0;
				segg17 = "";
			}
			if(inventory.contains(egg18)){
				iegg18 = 1;
				segg18 = "egg18, ";
			}else{
				iegg18 = 0;
				segg18 = "";
			}
			if(inventory.contains(egg19)){
				iegg19 = 1;
				segg19 = "egg19, ";
			}else{
				iegg19 = 0;
				segg19 = "";
			}
			if(inventory.contains(egg20)){
				iegg20 = 1;
				segg20 = "egg20, ";
			}else{
				iegg20 = 0;
				segg20 = "";
			}
			if(inventory.contains(egg21)){
				iegg21 = 1;
				segg21 = "egg21, ";
			}else{
				iegg21 = 0;
				segg21 = "";
			}
			if(inventory.contains(egg22)){
				iegg22 = 1;
				segg22 = "egg22, ";
			}else{
				iegg22 = 0;
				segg22 = "";
			}
			if(inventory.contains(egg23)){
				iegg23 = 1;
				segg23 = "egg23, ";
			}else{
				iegg23 = 0;
				segg23 = "";
			}
			if(inventory.contains(egg24)){
				iegg24 = 1;
				segg24 = "egg24, ";
			}else{
				iegg24 = 0;
				segg24 = "";
			}
			if(inventory.contains(egg25)){
				iegg25 = 1;
				segg25 = "egg25, ";
			}else{
				iegg25 = 0;
				segg25 = "";
			}
			if(inventory.contains(egg26)){
				iegg26 = 1;
				segg26 = "egg26, ";
			}else{
				iegg26 = 0;
				segg26 = "";
			}
			String alleggsnames = (segg1+segg2+segg3+segg4+segg5+segg6+segg7+segg8+segg9+segg10+segg11+segg12+segg13+segg14+segg15+segg16+segg17+segg18+segg19+segg20+segg21+segg22+segg23+segg24+segg25+segg26);
			int itotaleggs = (iegg1 + iegg2 + iegg3 + iegg4 + iegg5 + iegg6 + iegg7 + iegg8 + iegg9 + iegg10 + iegg11 + iegg12 + iegg13 + iegg14 + iegg15 + iegg16 + iegg17 + iegg18 + iegg19 + iegg20 + iegg21 + iegg22 + iegg23 + iegg24 + iegg25 + iegg26);
			player.sendMessage("you found " +ChatColor.GREEN+itotaleggs+"/26"+ChatColor.WHITE+ " eggs\nYour score has been submitted");
			String name = player.getName();
			this.Log.info("[EGGHUNT] score submission -> Player: "+name+" total: "+itotaleggs+"/26 eggnames: "+alleggsnames);
			return true;
		}
		return false;
	}

}
