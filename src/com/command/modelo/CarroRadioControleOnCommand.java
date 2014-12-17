package com.command.modelo;

import com.command.impl.Command;

public class CarroRadioControleOnCommand implements Command {

	CarroRadioControle carroRadioControle;

	public CarroRadioControleOnCommand(CarroRadioControle carroRadioControle) {
		this.carroRadioControle = carroRadioControle;
	}

	public void executar() {
		carroRadioControle.carroRadioControleOn();
	}

	public void desfazer() {
		carroRadioControle.carroRadioControleOff();
	}

}