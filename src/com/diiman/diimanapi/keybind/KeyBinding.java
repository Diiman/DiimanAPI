package com.diiman.diimanapi.keybind;

import java.util.ArrayList;
import java.util.List;

public abstract class KeyBinding {
	
	protected int key;
	
	protected List<Integer> modifiers;
	
	protected BindingState state = BindingState.RELEASED;
	
	public KeyBinding(int key) {
		this.key = key;
		this.modifiers = new ArrayList();
	}
	
	/**
	 * Returns the sequence of keys that have to be pressed
	 * @return
	 * 		modifiers
	 */
	public Integer[] getModifiers() {
		if (modifiers.size() == 0) return new Integer[0];
		return modifiers.toArray(new Integer[modifiers.size() - 1]);
	}
	
	/**
	 * Returns the main key that has to be pressed
	 * @return
	 * 		key
	 */
	public int getKey() {
		return this.key;
	}
	
	public void addModifiers(int... modifiers) {
		for (Integer modifier : modifiers) {
			if (modifier != this.key) this.modifiers.add(modifier);
		}
	}
	
	public void setState(BindingState state) {
		this.state = state;
	}
	
	public enum BindingState {
		PRESSED,
		RELEASED;
	}
}
