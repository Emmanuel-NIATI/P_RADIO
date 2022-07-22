package fr.radio.application;

import fr.radio.ihm.swing.frameradio.JFrameRadio;
import fr.structure.application.Application;

public class ApplicationRadio extends Application
{

	private static final ApplicationRadio instance = new ApplicationRadio();
	
	private ApplicationRadio()
	{

		super();
					
		// Gestion de la Frame Radio
		JFrameRadio jFrameRadio = new JFrameRadio();

	}

	public static final ApplicationRadio getInstance()
	{

		return instance;
	}
	
}
