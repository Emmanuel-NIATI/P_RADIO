package fr.radio.ihm.swing.frameradio;

import javax.swing.JFrame;

import fr.radio.ihm.swing.panelradio.JPanelRadio;
import fr.structure.ihm.swing.JFrameStructure;

public class JFrameRadio extends JFrameStructure 
{

	public JFrameRadio()
	{

		super();
		
		// Gestion de l'apparence de la Frame Radio
		this.setTitle("Radio");
		this.setLocation(0, 0);
		this.setSize(720, 480);
		this.setUndecorated( true );

		// Gestion du Panel Radio
		JPanelRadio jPanelRadio = new JPanelRadio();
	
		// Gestion du contenu de la Frame Radio
		this.getContentPane().add( jPanelRadio );		
		
		// Gestion de la visibilité de la Frame Radio
		this.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
		this.setResizable( false );
		this.setVisible( true );
	
	}

}
