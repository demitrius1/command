package com.command.modelo;

import com.command.impl.Command;

public class LuzOffCommand implements Command {

	Luz luz;

	public LuzOffCommand(Luz luz) {
		this.luz = luz;
	}

	public void executar() {
		luz.luzOff();
	}

	public void desfazer() {
		luz.luzOn();
	}

}