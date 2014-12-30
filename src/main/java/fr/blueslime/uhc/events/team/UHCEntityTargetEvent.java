package fr.blueslime.uhc.events.team;

import fr.blueslime.uhc.events.solo.*;
import fr.blueslime.uhc.events.common.*;
import fr.blueslime.uhc.UHC;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class UHCEntityTargetEvent implements Listener
{
    @EventHandler
    public void event(EntityTargetEvent event)
    {
        if(event.getTarget() != null)
        {
            if(event.getTarget().getType() == EntityType.PLAYER)
            {
                if(!UHC.getPlugin().getArenaTeam().hasPlayer(event.getTarget().getUniqueId()))
                    event.setCancelled(true);
            }
        }
    }
}
