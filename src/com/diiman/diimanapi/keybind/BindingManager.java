package com.diiman.diimanapi.keybind;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;

import com.diiman.diimanapi.keybind.KeyBinding.BindingState;

public final class BindingManager implements KeyListener{
	
	private HashSet<KeyBinding> bindings = new HashSet<KeyBinding>();
	
	public BindingManager() {}
	
	public void registerBinding(KeyBinding binding) {
		this.bindings.add(binding);
	}
	
	public void unregisterBinding(KeyBinding binding) {
		this.bindings.remove(binding);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		this.bindings.stream().filter(bind -> bind.getKey() == e.getKeyCode()).forEach(bind -> bind.setState(BindingState.PRESSED));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		this.bindings.stream().filter(bind -> bind.getKey() == e.getKeyCode()).forEach(bind -> bind.setState(BindingState.RELEASED));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		this.bindings.forEach(bind -> {
			
		});
	}
}
