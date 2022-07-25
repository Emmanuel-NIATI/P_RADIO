package fr.radio.ihm.swing.panelradio;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import fr.radio.ihm.swing.panelradio.client.alarm.JPanelRadioClientAlarm;
import fr.radio.ihm.swing.panelradio.client.clock.JPanelRadioClientClock;
import fr.structure.ihm.swing.JPanelStructure;

public class JPanelRadio extends JPanelStructure implements ActionListener
{

	private static final String PANEL_RADIO_CLIENT_CLOCK = "fr.radio.ihm.swing.panelradio.JPanelRadio.PANEL_RADIO_CLIENT_CLOCK";
	private static final String PANEL_RADIO_CLIENT_ALARM = "fr.radio.ihm.swing.panelradio.JPanelRadio.PANEL_RADIO_CLIENT_ALARM";
	private static final String PANEL_RADIO_CLIENT_RADIO = "fr.radio.ihm.swing.panelradio.JPanelRadio.PANEL_RADIO_CLIENT_RADIO";
	private static final String PANEL_RADIO_CLIENT_TRACK = "fr.radio.ihm.swing.panelradio.JPanelRadio.PANEL_RADIO_CLIENT_TRACK";

	private JButton jButtonRadioClientClock;
	private JButton jButtonRadioClientAlarm;
	private JButton jButtonRadioClientRadio;
	private JButton jButtonRadioClientTrack;

	private JPanelRadioNorth jPanelRadioNorth;
	private JPanelRadioClient jPanelRadioClient;
	private JPanelRadioClientClock jPanelRadioClientClock;
	private JPanelRadioClientAlarm jPanelRadioClientAlarm;

	private Color colorRadioClient;
	private Border borderRadioClient;
	private CardLayout cardLayoutRadioClient;

	public JPanelRadio()
	{

		super();
		
		// Gestion de l'apparence du Panel Radio
		this.setSize(720, 480);
		this.setOpaque( false );
		
		BorderLayout borderLayoutRadio = new BorderLayout();

		borderLayoutRadio.setHgap(0);
		borderLayoutRadio.setVgap(0);
		
		this.setLayout(borderLayoutRadio);
		
		// Gestion du Panel Radio Nord
		jPanelRadioNorth = new JPanelRadioNorth();

		// Gestion de l'apparence du Panel Radio North
		jPanelRadioNorth.setPreferredSize( new Dimension( 720, 60) );
		jPanelRadioNorth.setOpaque( false );
				
		// Gestion de la disposition du Panel Radio Nord
		FlowLayout flowLayoutRadioNorth = new FlowLayout();

		flowLayoutRadioNorth.setAlignment( FlowLayout.CENTER );
		
		flowLayoutRadioNorth.setHgap(10);
		flowLayoutRadioNorth.setVgap(10);
		
		jPanelRadioNorth.setLayout(flowLayoutRadioNorth);
		
		// Gestion des boutons modaux
		
		jButtonRadioClientClock = new JButton();
		jButtonRadioClientClock.setSize(40, 120);
		jButtonRadioClientClock.setMargin( new Insets(0, 0, 0, 0) );
		jButtonRadioClientClock.setIcon( new ImageIcon( this.getClass().getResource("btn_clock.png") ) );
				
		jButtonRadioClientAlarm = new JButton();
		jButtonRadioClientAlarm.setSize(40, 120);
		jButtonRadioClientAlarm.setMargin( new Insets(0, 0, 0, 0) );
		jButtonRadioClientAlarm.setIcon( new ImageIcon( this.getClass().getResource("btn_alarm.png") ) );
						
		jButtonRadioClientRadio = new JButton();
		jButtonRadioClientRadio.setSize(40, 120);
		jButtonRadioClientRadio.setMargin( new Insets(0, 0, 0, 0) );
		jButtonRadioClientRadio.setIcon( new ImageIcon( this.getClass().getResource("btn_radio.png") ) );
		
		jButtonRadioClientTrack = new JButton();
		jButtonRadioClientTrack.setSize(40, 120);
		jButtonRadioClientTrack.setMargin( new Insets(0, 0, 0, 0) );
		jButtonRadioClientTrack.setIcon( new ImageIcon( this.getClass().getResource("btn_track.png") ) );

		jPanelRadioNorth.add( jButtonRadioClientClock, flowLayoutRadioNorth );
		jPanelRadioNorth.add( jButtonRadioClientAlarm, flowLayoutRadioNorth );
		jPanelRadioNorth.add( jButtonRadioClientRadio, flowLayoutRadioNorth );
		jPanelRadioNorth.add( jButtonRadioClientTrack, flowLayoutRadioNorth );
		
		// Gestion de la partie modale
		jButtonRadioClientClock.addActionListener( this );
		jButtonRadioClientAlarm.addActionListener( this );
		jButtonRadioClientRadio.addActionListener( this );
		jButtonRadioClientTrack.addActionListener( this );
				
		// Gestion du Panel Radio Client
		jPanelRadioClient = new JPanelRadioClient();
		
		// Gestion de l'apparence du Panel Radio Client
		jPanelRadioClient.setPreferredSize( new Dimension( 720, 420) );
		jPanelRadioClient.setOpaque( false );
		
		// Gestion de la disposition du Panel Radio Client
		cardLayoutRadioClient = new CardLayout( 0, 0);
		cardLayoutRadioClient.setHgap( 0 );
		cardLayoutRadioClient.setVgap( 0 ); 
		
		jPanelRadioClient.setLayout( cardLayoutRadioClient );
		
		// Gestion du Panel Radio Client Clock		
		jPanelRadioClientClock = new JPanelRadioClientClock();
		
		// Gestion du Panel Radio Client Alarm		
		jPanelRadioClientAlarm = new JPanelRadioClientAlarm();
		
		cardLayoutRadioClient.addLayoutComponent( jPanelRadioClientClock, PANEL_RADIO_CLIENT_CLOCK );
		jPanelRadioClient.add( jPanelRadioClientClock );
		
		cardLayoutRadioClient.addLayoutComponent( jPanelRadioClientAlarm, PANEL_RADIO_CLIENT_ALARM );
		jPanelRadioClient.add( jPanelRadioClientAlarm );
				
		// Gestion de la position du Panel Radio Nord
		this.add( jPanelRadioNorth, BorderLayout.NORTH );
		
		// Gestion de la position du Panel Radio Centre
		this.add( jPanelRadioClient, BorderLayout.CENTER );

		// Mise au mode Horloge
		this.setModeRadioClientClock();

	}
	
	// Mode Horloge (Clock)
	public void setModeRadioClientClock()
	{

		cardLayoutRadioClient.show( jPanelRadioClient, PANEL_RADIO_CLIENT_CLOCK );
		
		borderRadioClient = BorderFactory.createLineBorder( colorRadioClient, 1 );
		borderRadioClient = BorderFactory.createTitledBorder( borderRadioClient, "Horloge", TitledBorder.LEFT, TitledBorder.TOP, fontConsolasItalicBold014 );
		jPanelRadioClient.setBorder( borderRadioClient );
		
	}
	
	// Mode Réveil (Alarm) 
	public void setModeRadioClientAlarm()
	{

		cardLayoutRadioClient.show( jPanelRadioClient, PANEL_RADIO_CLIENT_ALARM );
				
		borderRadioClient = BorderFactory.createLineBorder( colorRadioClient, 1 );
		borderRadioClient = BorderFactory.createTitledBorder( borderRadioClient, "Réveil", TitledBorder.LEFT, TitledBorder.TOP, fontConsolasItalicBold014 );
		jPanelRadioClient.setBorder( borderRadioClient );

	}
	
	// Mode Radio (Radio)
	public void setModeRadioClientRadio()
	{

		cardLayoutRadioClient.show( jPanelRadioClient, PANEL_RADIO_CLIENT_RADIO );
		
		borderRadioClient = BorderFactory.createLineBorder( colorRadioClient, 1 );
		borderRadioClient = BorderFactory.createTitledBorder( borderRadioClient, "Radio", TitledBorder.LEFT, TitledBorder.TOP, fontConsolasItalicBold014 );
		jPanelRadioClient.setBorder( borderRadioClient );
		
	}
	
	// Mode Lecteur MP3 (Track) 
	public void setModeRadioClientTrack()
	{

		cardLayoutRadioClient.show( jPanelRadioClient, PANEL_RADIO_CLIENT_TRACK );
				
		borderRadioClient = BorderFactory.createLineBorder( colorRadioClient, 1 );
		borderRadioClient = BorderFactory.createTitledBorder( borderRadioClient, "Lecteur MP3", TitledBorder.LEFT, TitledBorder.TOP, fontConsolasItalicBold014 );
		jPanelRadioClient.setBorder( borderRadioClient );

	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{

		if( e.getSource() == jButtonRadioClientClock )
		{
			
			setModeRadioClientClock(); 
		}
		else if( e.getSource() == jButtonRadioClientAlarm )
		{

			setModeRadioClientAlarm();
		}
		else if( e.getSource() == jButtonRadioClientRadio )
		{

			setModeRadioClientRadio();
		}
		else if( e.getSource() == jButtonRadioClientTrack )
		{

			setModeRadioClientTrack();
		}
		
	}

}
