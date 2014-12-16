package com.command.app;

import com.command.modelo.ControleRemoto;
import com.command.modelo.Luz;
import com.command.modelo.LuzOffCommand;
import com.command.modelo.LuzOnCommand;

public class TesteControleRemoto {

	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		Luz luz = new Luz();
		LuzOnCommand luzOnCommand = new LuzOnCommand(luz);
		LuzOffCommand luzOffCommand = new LuzOffCommand(luz);
		controle.setCommand(0, luzOnCommand, luzOffCommand);
		controle.botaoOnPressionado(0);
		controle.botaoOffPressionado(0);
		controle.botaoDesPressionado(0);
	}
}