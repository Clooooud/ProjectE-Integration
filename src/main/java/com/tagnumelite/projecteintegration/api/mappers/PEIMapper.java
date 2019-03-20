package com.tagnumelite.projecteintegration.api.mappers;

import com.tagnumelite.projecteintegration.api.PEIApi;

import java.util.List;
import java.util.Map;

import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.proxy.IConversionProxy;
import moze_intel.projecte.emc.IngredientMap;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fluids.FluidStack;

public abstract class PEIMapper {
	public final String name;
	public final String desc;
	public final boolean disabled_by_default;
	protected final IConversionProxy conversion_proxy;

	/**
	 * @param name {@code String} The name of the recipe type
	 * @param description {@code String} The config comment
	 */
	public PEIMapper(String name, String description) {
		this(name, description, false);
	}

	/**
	 * @param name {@code String} The name of the recipe type
	 * @param description {@code String} The config comment
	 * @param disableByDefault {@code boolean} Disable by default
	 */
	protected PEIMapper(String name, String description, boolean disableByDefault) {
		this.name = name;
		this.desc = description;
		this.disabled_by_default = disableByDefault;
		this.conversion_proxy = ProjectEAPI.getConversionProxy();
	}
	
	/**
	 * You setup conversions and call {@code addConversion} here!
	 */
	public abstract void setup();
		ItemStack output = recipe.getRecipeOutput();
		
		IngredientMap<Object> ingredients = new IngredientMap<Object>();

		for (Ingredient ingredient : recipe.getIngredients()) {
			if (ingredient == Ingredient.EMPTY)
				continue;

			ingredients.addIngredient(PEIApi.getIngredient(ingredient), 1);
		}

		addConversion(output, ingredients.getMap());
	/**
	 * Add Conversion for ItemStack
	 * @param item {@code ItemStack} The {@code ItemStack} to be processed
	 * @param input {@inheritDoc} The {@code Map<Object, Integer>} that contains the ingredients
	 */
	protected void addConversion(ItemStack item, Map<Object, Integer> input) {
		if (item == null || item.isEmpty())
    public final String name;
    public final String desc;
    public final boolean disabled_by_default;
    protected final IConversionProxy conversion_proxy;

    /**
     * @param name
     *            {@code String} The name of the recipe type
     * @param description
     *            {@code String} The config comment
     */
    public PEIMapper(String name, String description) {
        this(name, description, false);
    }

    /**
     * @param name
     *            {@code String} The name of the recipe type
     * @param description
     *            {@code String} The config comment
     * @param disableByDefault
     *            {@code boolean} Disable by default
     */
    protected PEIMapper(String name, String description, boolean disableByDefault) {
        this.name = name;
     *            {@code IRecipe} The recipe to convert
     */
    protected void addRecipe(IRecipe recipe) {
        ItemStack output = recipe.getRecipeOutput();

        IngredientMap<Object> ingredients = new IngredientMap<Object>();
        if (output == null || output.isEmpty())
            return;

        addRecipe(output.getCount(), output, inputs);
    protected void addRecipe(FluidStack output, Object... inputs) {
        if (output == null || output.amount <= 0)
            if (input instanceof ItemStack) {
                if (((ItemStack) input).isEmpty())
                    continue;

}
