package com.mycompany.a2.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class UndoCom extends Command {
	public UndoCom() {
		super("Undo");
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
	    System.out.println("Undo command is invoked...");
	}
}