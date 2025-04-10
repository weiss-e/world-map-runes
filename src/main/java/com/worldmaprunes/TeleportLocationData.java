/*
 * Copyright (c) 2018, Morgan Lewis <https://github.com/MESLewis>
 * This is a modified version of TeleportLocationData.java originally created by Morgan Lewis.
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

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
enum TeleportLocationData
{
    VARROCK(TeleportType.STANDARD, "Varrock", 25, new WorldPoint(3213, 3424, 0), "/varrock_teleport_icon.png"),
    VARROCK_GE(TeleportType.STANDARD, "Varrock GE", 25, new WorldPoint(3164, 3478, 0), "/varrock_teleport_icon.png"),
    LUMBRIDGE(TeleportType.STANDARD, "Lumbridge", 31, new WorldPoint(3222, 3218, 0), "/lumbridge_teleport_icon.png"),
    FALADOR(TeleportType.STANDARD, "Falador", 37, new WorldPoint(2965, 3381, 0), "/falador_teleport_icon.png"),
    CAMELOT(TeleportType.STANDARD, "Camelot", 45, new WorldPoint(2757, 3477, 0), "/camelot_teleport_icon.png"),
    CAMELOT_BANK(TeleportType.STANDARD, "Camelot Bank", 45, new WorldPoint(2726, 3485, 0), "/camelot_teleport_icon.png"),
    KOUREND(TeleportType.STANDARD, "Kourend", 48, new WorldPoint(1643, 3672, 0), "/kourend_teleport_icon.png"),
    ARDOUGNE(TeleportType.STANDARD, "Ardougne", 51, new WorldPoint(2664, 3306, 0), "/ardougne_teleport_icon.png"),
    CIVITAS_ILLA_FORTIS(TeleportType.STANDARD, "Civitas illa Fortis", 54, new WorldPoint(1681, 3133, 0), "/civitas_illa_fortis_teleport_icon.png"),
    WATCHTOWER(TeleportType.STANDARD, "Watchtower", 58, new WorldPoint(2547, 3114, 0), "/watchtower_teleport_icon.png"),
    WATCHTOWER_YANILLE(TeleportType.STANDARD, "Watchtower Yanille", 58, new WorldPoint(2584, 3097, 0), "/watchtower_teleport_icon.png"),
    TROLLHEIM(TeleportType.STANDARD, "Trollheim", 61, new WorldPoint(2891, 3678, 0), "/trollheim_teleport_icon.png"),
    APE_ATOLL(TeleportType.STANDARD, "Ape Atoll", 64, new WorldPoint(2796, 2791, 0), "/ape_atoll_teleport_icon.png"),
    PADDEWWA(TeleportType.ANCIENT, "Paddewwa", 54, new WorldPoint(3097, 9880, 0), "/paddewwa_teleport_icon.png"),
    SENNTISTEN(TeleportType.ANCIENT, "Senntisten", 60, new WorldPoint(3319, 3336, 0), "/senntisten_teleport_icon.png"),
    KHARYRLL(TeleportType.ANCIENT, "Kharyrll", 66, new WorldPoint(3494, 3473, 0), "/kharyrll_teleport_icon.png"),
    LASSAR(TeleportType.ANCIENT, "Lassar", 72, new WorldPoint(3002, 3472, 0), "/lassar_teleport_icon.png"),
    DAREEYAK(TeleportType.ANCIENT, "Dareeyak", 78, new WorldPoint(2969, 3695, 0), "/dareeyak_teleport_icon.png"),
    CARRALLANGER(TeleportType.ANCIENT, "Carrallanger", 84, new WorldPoint(3157, 3667, 0), "/carrallanger_teleport_icon.png"),
    ANNAKARL(TeleportType.ANCIENT, "Annakarl", 90, new WorldPoint(3288, 3888, 0), "/annakarl_teleport_icon.png"),
    GHORROCK(TeleportType.ANCIENT, "Ghorrock", 96, new WorldPoint(2977, 3872, 0), "/ghorrock_teleport_icon.png"),
    MOONCLAN(TeleportType.LUNAR, "Moonclan", 69, new WorldPoint(2113, 3915, 0), "/moonclan_teleport_icon.png"),
    OURANIA(TeleportType.LUNAR, "Ourania", 71, new WorldPoint(2468, 3246, 0), "/ourania_teleport_icon.png"),
    WATERBIRTH(TeleportType.LUNAR, "Waterbirth", 72, new WorldPoint(2546, 3755, 0), "/waterbirth_teleport_icon.png"),
    BARBARIAN(TeleportType.LUNAR, "Barbarian", 75, new WorldPoint(2543, 3568, 0), "/barbarian_teleport_icon.png"),
    KHAZARD(TeleportType.LUNAR, "Khazard", 78, new WorldPoint(2636, 3167, 0), "/khazard_teleport_icon.png"),
    FISHING_GUILD(TeleportType.LUNAR, "Fishing Guild", 85, new WorldPoint(2612, 3391, 0), "/fishing_guild_teleport_icon.png"),
    CATHERBY(TeleportType.LUNAR, "Catherby", 87, new WorldPoint(2802, 3449, 0), "/catherby_teleport_icon.png"),
    ICE_PLATEAU(TeleportType.LUNAR, "Ice Plateau", 89, new WorldPoint(2973, 3939, 0), "/ice_plateau_teleport_icon.png"),
    ARCEUUS_LIBRARY(TeleportType.ARCEUUS, "Arceuus Library", 6, new WorldPoint(1632, 3838, 0), "/arceuus_library_teleport_icon_arceuus.png"),
    DRAYNOR_MANOR(TeleportType.ARCEUUS, "Draynor Manor", 17, new WorldPoint(3108, 3352, 0), "/draynor_manor_teleport_icon.png"),
    BATTLEFRONT(TeleportType.ARCEUUS, "Battlefront", 23, new WorldPoint(1349, 3739, 0), "/battlefront_teleport_icon.png"),
    SALVE_GRAVEYARD(TeleportType.ARCEUUS, "Salve Graveyard", 40, new WorldPoint(3433, 3461, 0), "/salve_graveyard_teleport_icon.png"),
    FENKENSTRAINS_CASTLE(TeleportType.ARCEUUS, "Fenkenstrain's Castle", 48, new WorldPoint(3548, 3528, 0), "/fenkenstrains_castle_teleport_icon.png"),
    WEST_ARDOUGNE(TeleportType.ARCEUUS, "West Ardougne", 61, new WorldPoint(2500, 3291, 0), "/west_ardougne_teleport_icon.png"),
    HARMONY_ISLAND(TeleportType.ARCEUUS, "Harmony Island", 65, new WorldPoint(3797, 2866, 0), "/harmony_island_teleport_icon.png"),
    CEMETERY(TeleportType.ARCEUUS, "Cemetery", 71, new WorldPoint(2978, 3763, 0), "/cemetery_teleport_icon.png"),
    BARROWS(TeleportType.ARCEUUS, "Barrows", 83, new WorldPoint(3565, 3315, 0), "/barrows_teleport_icon.png"),
    APE_ATOLL_ARCEUUS(TeleportType.ARCEUUS, "Ape Atoll Arceuus", 90, new WorldPoint(2770, 2703, 0), "/ape_atoll_teleport_icon_arceuus.png");

    private final TeleportType type;
    private final String tooltip;
    private final WorldPoint location;
    private final String iconPath;

    TeleportLocationData(TeleportType type, String destination, int magicLevel, WorldPoint location, String iconPath)
    {
        this.type = type;
        this.tooltip = type.getPrefix() + " " + destination + " - lvl " + magicLevel + "<br>" + humanFriendly(getRunesRequired(destination));
        this.location = location;
        this.iconPath = iconPath;

    }

    public String humanFriendly(String[] runes) {
        if (runes == null || runes.length == 0) {
            return "";
        }
        Map<String, String> runeNames = new HashMap<>();
        runeNames.put("AI", "Air");
        runeNames.put("FI", "Fire");
        runeNames.put("EA", "Earth");
        runeNames.put("WA", "Water");
        runeNames.put("LA", "Law");
        runeNames.put("BL", "Blood");
        runeNames.put("AS", "Astral");
        runeNames.put("SO", "Soul");
        runeNames.put("NA", "Nature");
        runeNames.put("BA", "Banana");

        List<String> friendlyRunes = new ArrayList<>();
        for (String rune : runes) {
            if (rune.length() < 3) {
                continue;
            }

            String quantity = rune.substring(0, rune.length() - 2);
            String abbrev = rune.substring(rune.length() - 2);
            String fullName = runeNames.getOrDefault(abbrev, abbrev);

            // If the Quantity is "1", use the base name; otherwise, pluralize the rune name.
            if ("1".equals(quantity)) {
                friendlyRunes.add(quantity + " " + fullName);
            } else {
                friendlyRunes.add(quantity + " " + fullName + "s");
            }
        }
        return String.join(", ", friendlyRunes);
    }


    public String[] getRunesRequired(String destination) {
        switch (destination)
        {
            case "Varrock":
            case "Varrock GE":
                return new String[] {"3AI", "1FI", "1LA"};
            case "Lumbridge":
                return new String[] {"3AI", "1EA", "1LA"};
            case "Falador":
                return new String[] {"3AI", "1WA", "1LA"};
            case "Camelot":
            case "Camelot Bank":
                return new String[] {"5AI", "1LA"};
            case "Kourend":
                return new String[] {"1FI", "1WA", "2LA"};
            case "Ardougne":
                return new String[] {"2WA", "2LA"};
            case "Civitas illa Fortis":
                return new String[] {"1EA", "1FI", "2LA"};
            case "Watchtower":
            case "Watchtower Yanille":
                return new String[] {"2EA", "2LA"};
            case "Trollheim":
                return new String[] {"2FI", "2LA"};
            case "Ape Atoll":
                return new String[] {"2FI", "2WA", "2LA", "1BA"};
            case "Paddewwa":
                return new String[] {"1AI", "1FI", "2LA"};
            case "Senntisten":
                return new String[] {"2LA", "1SO"};
            case "Kharyrll":
                return new String[] {"1BL", "2LA"};
            case "Lassar":
                return new String[] {"4WA", "2LA"};
            case "Dareeyak":
                return new String[] {"2AI", "3FI", "2LA"};
            case "Carrallanger":
            case "West Ardougne":
                return new String[] {"2LA", "2SO"};
            case "Annakarl":
                return new String[] {"2BL", "2LA"};
            case "Ghorrock":
                return new String[] {"8WA", "2LA"};
            case "Moonclan":
                return new String[] {"2EA", "2AS", "1LA"};
            case "Ourania":
                return new String[] {"6EA", "2AS", "1LA"};
            case "Waterbirth":
                return new String[] {"1WA", "2AS", "1LA"};
            case "Barbarian":
                return new String[] {"3FI", "2AS", "2LA"};
            case "Khazard":
                return new String[] {"4WA", "2AS", "2LA"};
            case "Fishing Guild":
            case "Catherby":
                return new String[] {"10WA", "3AS", "3LA"};
            case "Ice Plateau":
                return new String[] {"8WA", "3AS", "3LA"};
            case "Arceuus Library":
                return new String[] {"2EA", "1LA"};
            case "Draynor Manor":
                return new String[] {"1EA", "1WA", "1LA"};
            case "Battlefront":
                return new String[] {"1EA", "1FI", "1LA"};
            case "Ape Atoll Arceuus":
                return new String[] {"2BL", "2LA", "2SO"};
            case "Salve Graveyard":
                return new String[] {"1LA", "2SO"};
            case "Fenkenstrain's Castle":
                return new String[] {"1EA", "1LA", "1SO"};
            case "Harmony Island":
                return new String[] {"1LA", "1NA", "1SO"};
            case "Cemetery":
                return new String[] {"1BL", "1LA", "1SO"};
            case "Barrows":
                return new String[] {"1BL", "2LA", "2SO"};
            default:
                return new String[0];
        }
    }
}