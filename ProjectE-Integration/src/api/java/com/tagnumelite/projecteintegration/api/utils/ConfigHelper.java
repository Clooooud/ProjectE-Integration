package com.tagnumelite.projecteintegration.api.utils;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;

public final class ConfigHelper {
    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_PLUGINS = "plugins";
    public static final String CATEGORY_MISC = "misc";

    public static String getCategory(String... txts) {
        return String.join(Configuration.CATEGORY_SPLITTER, txts);
    }

    /**
     * @param modid Modid of the mod
     * @return String CATEGORY_PLUGINS + CATEGORY_SPLITTER + key
     */
    public static String getPluginCategory(String modid) {
        return getCategory(CATEGORY_PLUGINS, modid);
    }

    public static String getResourceCategory() {
        return getCategory(CATEGORY_GENERAL, "resources");
    }

    public static String resourceIntoCFGName(ResourceLocation resource) {
        return resource.getResourceDomain() + '-' + resource.getResourcePath();
    }

    public static String getConversionName(String name) {
        return "enable_" + ConfigHelper.prepareForConfig(name) + "_conversions";
    }

    public static String prepareForConfig(String txt) {
        return txt.toLowerCase().replace(' ', '_');
    }
}
