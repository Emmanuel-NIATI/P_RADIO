package fr.radio.ihm.swing.panelradio.client.clock;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

import fr.radio.ihm.swing.panelradio.client.clock.screen.analogic.JPanelRadioClientClockScreenAnalogic;
import fr.radio.ihm.swing.panelradio.client.clock.screen.numeric.JPanelRadioClientClockScreenNumeric;
import fr.structure.ihm.swing.JPanelStructure;

public class JPanelRadioClientClock extends JPanelStructure implements ActionListener
{

	private static final String PANEL_RADIO_CLIENT_CLOCK_SCREEN_ANALOGIC = "fr.radio.ihm.swing.panelradio.client.clock.JPanelRadioClientClock.PANEL_RADIO_CLIENT_CLOCK_SCREEN_ANALOGIC";
	private static final String PANEL_RADIO_CLIENT_CLOCK_SCREEN_NUMERIC = "fr.radio.ihm.swing.panelradio.client.clock.JPanelRadioClientClock.PANEL_RADIO_CLIENT_CLOCK_SCREEN_NUMERIC";

	private JButton jButtonRadioClientClockAnalogic;
	private JButton jButtonRadioClientClockNumeric;
	
	private JPanelRadioClientClockScreen jPanelRadioClientClockScreen;
	private JPanelRadioClientClockScreenAnalogic jPanelRadioClientClockScreenAnalogic;
	private JPanelRadioClientClockScreenNumeric jPanelRadioClientClockScreenNumeric;
	private JPanelRadioClientClockSouth jPanelRadioClientClockSouth;

	private Color colorRadioClientClockScreen;
	private Border borderRadioClientClockScreen;
	private CardLayout cardLayoutRadioClientClockScreen;
	
	public JPanelRadioClientClock()
	{

		super();
		
		// Gestion de l'apparence du Panel Radio Client Clock
		this.setPreferredSize( new Dimension( 720, 420) );
		this.setOpaque( false );

		BorderLayout borderLayoutRadioClientClock = new BorderLayout();

		borderLayoutRadioClientClock.setHgap(0);
		borderLayoutRadioClientClock.setVgap(0);
		
		this.setLayout(borderLayoutRadioClientClock);
		
		// Gestion du Panel Radio Client Clock Screen
		jPanelRadioClientClockScreen = new JPanelRadioClientClockScreen();
				
		// Gestion de l'apparence du Panel Radio Client Clock Screen
		jPanelRadioClientClockScreen.setPreferredSize( new Dimension( 720, 360) );
		jPanelRadioClientClockScreen.setOpaque( false );
		
		// Gestion de la disposition du Panel Radio Client Clock Screen
		cardLayoutRadioClientClockScreen = new CardLayout( 0, 0);
		cardLayoutRadioClientClockScreen.setHgap( 0 );
		cardLayoutRadioClientClockScreen.setVgap( 0 ); 
		
		jPanelRadioClientClockScreen.setLayout( cardLayoutRadioClientClockScreen );
				
		// Gestion du Panel Radio Client Clock Screen Analogic	
		jPanelRadioClientClockScreenAnalogic = new JPanelRadioClientClockScreenAnalogic();
		
		// Gestion du Panel Radio Client Clock Screen Numeric		
		jPanelRadioClientClockScreenNumeric = new JPanelRadioClientClockScreenNumeric();
				
		cardLayoutRadioClientClockScreen.addLayoutComponent( jPanelRadioClientClockScreenAnalogic, PANEL_RADIO_CLIENT_CLOCK_SCREEN_ANALOGIC );
		jPanelRadioClientClockScreen.add( jPanelRadioClientClockScreenAnalogic );
		
		cardLayoutRadioClientClockScreen.addLayoutComponent( jPanelRadioClientClockScreenNumeric, PANEL_RADIO_CLIENT_CLOCK_SCREEN_NUMERIC );
		jPanelRadioClientClockScreen.add( jPanelRadioClientClockScreenNumeric );
		
		// Gestion du Panel Radio Client Clock South
		jPanelRadioClientClockSouth = new JPanelRadioClientClockSouth();

		// Gestion de l'apparence du Panel Radio Client Clock South
		jPanelRadioClientClockSouth.setPreferredSize( new Dimension( 720, 60) );
		jPanelRadioClientClockSouth.setOpaque( false );
		
		// Gestion de la disposition du Panel Radio Client Clock South
		FlowLayout flowLayoutRadioClientClockSouth = new FlowLayout();

		flowLayoutRadioClientClockSouth.setAlignment( FlowLayout.CENTER );
		
		flowLayoutRadioClientClockSouth.setHgap(10);
		flowLayoutRadioClientClockSouth.setVgap(10);
		
		jPanelRadioClientClockSouth.setLayout(flowLayoutRadioClientClockSouth);
		
		
		// Gestion des boutons modaux

		jButtonRadioClientClockAnalogic = new JButton();
		jButtonRadioClientClockAnalogic.setSize(40, 40);
		jButtonRadioClientClockAnalogic.setMargin( new Insets(0, 0, 0, 0) );
		jButtonRadioClientClockAnalogic.setIcon( new ImageIcon( this.getClass().getResource("btn_analogic.png") ) );
		
		jButtonRadioClientClockNumeric = new JButton();
		jButtonRadioClientClockNumeric.setSize(40, 40);
		jButtonRadioClientClockNumeric.setMargin( new Insets(0, 0, 0, 0) );
		jButtonRadioClientClockNumeric.setIcon( new ImageIcon( this.getClass().getResource("btn_numeric.png") ) );

		jPanelRadioClientClockSouth.add( jButtonRadioClientClockAnalogic, flowLayoutRadioClientClockSouth );
		jPanelRadioClientClockSouth.add( jButtonRadioClientClockNumeric, flowLayoutRadioClientClockSouth );

		// Gestion de la partie modale
		jButtonRadioClientClockAnalogic.addActionListener( this );
		jButtonRadioClientClockNumeric.addActionListener( this );
		
		// Gestion de la position du Panel Radio Client Clock Screen
		this.add( jPanelRadioClientClockScreen, BorderLayout.CENTER );

		// Gestion de la position du Panel Radio Client Clock Screen South
		this.add( jPanelRadioClientClockSouth, BorderLayout.SOUTH );
		
		// Mise au mode Analogic
		this.setModeRadioClientClockScreenAnalogic();
		
	}

	// Mode Analogic
	public void setModeRadioClientClockScreenAnalogic()
	{

		cardLayoutRadioClientClockScreen.show( jPanelRadioClientClockScreen, PANEL_RADIO_CLIENT_CLOCK_SCREEN_ANALOGIC);

	}

	// Mode Numeric
	public void setModeRadioClientClockScreenNumeric()
	{

		cardLayoutRadioClientClockScreen.show( jPanelRadioClientClockScreen, PANEL_RADIO_CLIENT_CLOCK_SCREEN_NUMERIC);

	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{

		if( e.getSource() == jButtonRadioClientClockAnalogic )
		{
			
			setModeRadioClientClockScreenAnalogic();
		}
		else if( e.getSource() == jButtonRadioClientClockNumeric )
		{

			setModeRadioClientClockScreenNumeric();
		}
		
	}
	
}
