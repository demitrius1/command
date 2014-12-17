package com.command.app;

import com.command.modelo.RadioControle;
import com.command.modelo.CarroRadioControle;
import com.command.modelo.CarroRadioControleOffCommand;
import com.command.modelo.CarroRadioControleOnCommand;

public class TesteControleRemoto {

	public static void main(String[] args) {
		RadioControle controle = new RadioControle();
		CarroRadioControle carroRadioControle = new CarroRadioControle();
		CarroRadioControleOnCommand carroRadioControleOnCommand = new CarroRadioControleOnCommand(carroRadioControle);
		CarroRadioControleOffCommand carroRadioControleOffCommand = new CarroRadioControleOffCommand(carroRadioControle);
		controle.setCommand(0, carroRadioControleOnCommand, carroRadioControleOffCommand);
		controle.botaoOnPressionado(0);
		controle.botaoOffPressionado(0);
		controle.botaoDesPressionado(0);
	}
}