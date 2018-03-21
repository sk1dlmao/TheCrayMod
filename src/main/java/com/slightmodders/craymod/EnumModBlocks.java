
package com.slightmodders.craymod;
/**
 * Used for storing names of Blocks
 * @author TyrellPlayz
 */

public enum EnumModBlocks {

	// unlocalizedName for lang file
	// registryName for model file and give command - MC makes it lowerCASE
	// 	BLOCKNAME("lowercaseblockname", "lowercaseblockname"), < PUT SEMICOLON WHEN ENDING BLOCKLIST
	// Remove semicolon after { on public enum EnumModBlocks{; and read above

	EXAMPLEBLOCK("exampleblock", "exampleblock");

	private String unlocalizedName;
	private String registryName;
	
	EnumModBlocks(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
	}
	
	public String getRegistryName() {return registryName;}
	public String getUnlocalizedName() {return unlocalizedName;}
	
}
