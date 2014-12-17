package com.command.modelo;

import com.command.impl.Command;

public class RadioControle {

	Command[] onCommands;
	Command[] offCommands;
	Command desCommand;

	public RadioControle() {
		onCommands = new Command[1];
		offCommands = new Command[1];
		desCommand = null;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void botaoOnPressionado(int slot) {
		onCommands[slot].executar();
		desCommand = onCommands[slot];
	}

	public void botaoOffPressionado(int slot) {
		offCommands[slot].executar();
		desCommand = offCommands[slot];
	}

	public void botaoDesPressionado(int slot) {
		desCommand.desfazer();
	}

}