package main.main;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Bukkit;

import org.bukkit.Material;

import org.bukkit.entity.Fireball;

import org.bukkit.entity.Player;

import org.bukkit.event.EventHandler;

import org.bukkit.event.Listener;

import org.bukkit.event.block.Action;

import org.bukkit.event.player.PlayerInteractEvent;


public class Main extends JavaPlugin implements Listener{




    @Override

    public void onEnable() {

        System.out.println("TEST PLUGIN");

        System.out.println("PLUGIN IS ACTIVATED");

        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @Override

    public void onDisable() {

        System.out.println("PLUGIN DISACTIVATED");

    }

    //iron
    @EventHandler

    public void rightClick1(PlayerInteractEvent e)

    {

        Player p = e.getPlayer();

        Action a = e.getAction();



        if(a == Action.RIGHT_CLICK_AIR)

        {

            if(p.getItemInHand().getType() == Material.IRON_SWORD)

            {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }

        }

    }

    @EventHandler

    public void rightClick2(PlayerInteractEvent e)

    {

        Player p = e.getPlayer();

        Action a = e.getAction();



        if(a == Action.RIGHT_CLICK_BLOCK)

        {

            if(p.getItemInHand().getType() == Material.IRON_SWORD)

            {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }

        }

    }

}