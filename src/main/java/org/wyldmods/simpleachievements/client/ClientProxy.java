package org.wyldmods.simpleachievements.client;

import org.wyldmods.simpleachievements.client.render.RenderAchievementBook;
import org.wyldmods.simpleachievements.common.CommonProxy;
import org.wyldmods.simpleachievements.common.TileEntityAchievementStand;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAchievementStand.class, new RenderAchievementBook());
	}
}