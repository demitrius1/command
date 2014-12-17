package com.command.modelo;

import com.command.impl.Command;

public class CarroRadioControleOffCommand implements Command {

	CarroRadioControle carroRadioControle;

	public CarroRadioControleOffCommand(CarroRadioControle carroRadioControle) {
		this.carroRadioControle = carroRadioControle;
	}

	public void executar() {
		carroRadioControle.carroRadioControleOff();
	}

	public void desfazer() {
		carroRadioControle.carroRadioControleOn();
	}

}