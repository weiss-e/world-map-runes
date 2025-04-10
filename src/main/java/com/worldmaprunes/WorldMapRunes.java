/*
 * Copyright (c) 2018, Morgan Lewis <https://github.com/MESLewis>
 * This is a modified version of the WorldMapPlugin.java originally created by Morgan Lewis.
 * Copyright (c) 2025, weiss <https://github.com/weiss-e>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.worldmaprunes;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.function.Predicate;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.worldmap.WorldMapPoint;
import net.runelite.client.ui.overlay.worldmap.WorldMapPointManager;
import net.runelite.client.util.ImageUtil;

@Slf4j
@PluginDescriptor(
		name = "World Map Runes",
		description = "Displays runes required for teleportation spells on world map.",
		tags = {"teleports"}
)
public class WorldMapRunes extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private WorldMapPointManager worldMapPointManager;

	@Override
	protected void startUp() throws Exception
	{
		updateShownIcons();
	}

	@Override
	protected void shutDown() throws Exception
	{
		worldMapPointManager.removeIf(MapPoint.class::isInstance);
	}

	private void updateShownIcons()
	{
		Arrays.stream(TeleportLocationData.values())
				.map(l ->
						MapPoint.builder()
								.type(MapPoint.Type.CUSTOM_TELEPORT)
								.worldPoint(l.getLocation())
								.tooltip(l.getTooltip())
								.image(ImageUtil.loadImageResource(com.worldmaprunes.WorldMapRunes.class, l.getIconPath()))
								.build()
				)
				.forEach(worldMapPointManager::add);
	}

	private static Predicate<WorldMapPoint> isType(MapPoint.Type type)
	{
		return w -> w instanceof MapPoint && ((MapPoint) w).getType() == type;
	}
}