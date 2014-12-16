package com.command.modelo;

import com.command.impl.Command;

public class LuzOnCommand implements Command {

	Luz luz;

	public LuzOnCommand(Luz luz) {
		this.luz = luz;
	}

	public void executar() {
		luz.luzOn();
	}

	public void desfazer() {
		luz.luzOff();
	}

}