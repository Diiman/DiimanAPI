package com.diiman.diimanapi.module.type;

public enum EnumModuleType {
	
	AURA("Aura"),
	COMBAT("Combat"),
	CHAT("Chat"),
	MOVEMENT("Movement"),
	WORLD("World"),
	RENDER("Render"),
	BUILD("Build"),
	MISC("Misc"),
	BYPASSER("Bypasser");
	
	protected final String type;
	
	private EnumModuleType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
