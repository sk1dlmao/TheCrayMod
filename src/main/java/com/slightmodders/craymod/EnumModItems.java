package com.slightmodders.craymod;

/**
 * Used for storing names of Items
 * @author TyrellPlayz
 */
public enum EnumModItems {

	// unlocalizedName for lang file
	// registryName for model file and give command - MC makes it lowerCASE
	EXAMPLEITEM("exampleItem", "example_item");
	
	private String unlocalizedName;
	private String registryName;
	
	EnumModItems(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
	}
	
	public String getRegistryName() {return registryName;}
	public String getUnlocalizedName() {return unlocalizedName;}
	
}
