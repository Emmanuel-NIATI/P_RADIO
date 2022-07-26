package fr.radio.ihm.swing.panelradio.client.clock.screen.numeric;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import fr.structure.ihm.swing.JPanelStructure;

public class JPanelRadioClientClockScreenNumeric extends JPanelStructure
{
	
	private GridBagLayout gridBagLayoutRadioClientClockScreenNumeric;
	private GridBagConstraints gridBagConstraintsRadioClientClockScreenNumeric;
	
	private JLabel jLabelRadioClientClockScreenNumeric_00_00;
	private JLabel jLabelRadioClientClockScreenNumeric_03_00;
	private JLabel jLabelRadioClientClockScreenNumeric_06_00;
	private JLabel jLabelRadioClientClockScreenNumeric_09_00;
	private JLabel jLabelRadioClientClockScreenNumeric_12_00;
	private JLabel jLabelRadioClientClockScreenNumeric_15_00;
	private JLabel jLabelRadioClientClockScreenNumeric_17_00;
	private JLabel jLabelRadioClientClockScreenNumeric_19_00;

	private JLabel jLabelRadioClientClockScreenNumeric_00_04;

	private JLabel jLabelRadioClientClockScreenNumeric_00_05;
	private JLabel jLabelRadioClientClockScreenNumeric_01_05;
	private JLabel jLabelRadioClientClockScreenNumeric_02_05;
	private JLabel jLabelRadioClientClockScreenNumeric_03_05;
	private JLabel jLabelRadioClientClockScreenNumeric_04_05;
	private JLabel jLabelRadioClientClockScreenNumeric_05_05;
	private JLabel jLabelRadioClientClockScreenNumeric_06_05;
	private JLabel jLabelRadioClientClockScreenNumeric_07_05;
	private JLabel jLabelRadioClientClockScreenNumeric_08_05;
	private JLabel jLabelRadioClientClockScreenNumeric_09_05;
	private JLabel jLabelRadioClientClockScreenNumeric_10_05;
	private JLabel jLabelRadioClientClockScreenNumeric_11_05;
	private JLabel jLabelRadioClientClockScreenNumeric_12_05;
	private JLabel jLabelRadioClientClockScreenNumeric_13_05;
	private JLabel jLabelRadioClientClockScreenNumeric_14_05;
	private JLabel jLabelRadioClientClockScreenNumeric_15_05;
	
	public JPanelRadioClientClockScreenNumeric()
	{

		super();
		
		
		// Gestion de l'apparence du Panel Radio Client Clock Screen Numeric
		this.setPreferredSize( new Dimension( 720, 360) );
		this.setOpaque( false );

		// Gestion de la disposition du panel
		gridBagLayoutRadioClientClockScreenNumeric = new GridBagLayout();
		
		this.setLayout( gridBagLayoutRadioClientClockScreenNumeric );

		gridBagConstraintsRadioClientClockScreenNumeric = new GridBagConstraints(); 
		
		jLabelRadioClientClockScreenNumeric_00_00 = new JLabel();
		jLabelRadioClientClockScreenNumeric_03_00 = new JLabel();
		jLabelRadioClientClockScreenNumeric_06_00 = new JLabel();
		jLabelRadioClientClockScreenNumeric_09_00 = new JLabel();
		jLabelRadioClientClockScreenNumeric_12_00 = new JLabel();
		jLabelRadioClientClockScreenNumeric_15_00 = new JLabel();
		jLabelRadioClientClockScreenNumeric_17_00 = new JLabel();
		jLabelRadioClientClockScreenNumeric_19_00 = new JLabel();

		jLabelRadioClientClockScreenNumeric_00_04 = new JLabel();

		jLabelRadioClientClockScreenNumeric_00_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_01_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_02_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_03_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_04_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_05_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_06_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_07_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_08_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_09_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_10_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_11_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_12_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_13_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_14_05 = new JLabel();
		jLabelRadioClientClockScreenNumeric_15_05 = new JLabel();

		jLabelRadioClientClockScreenNumeric_00_00.setIcon( number('1', 3) );
		jLabelRadioClientClockScreenNumeric_03_00.setIcon( number('1', 3) );
		jLabelRadioClientClockScreenNumeric_06_00.setIcon( spacer('2', 3) );
		jLabelRadioClientClockScreenNumeric_09_00.setIcon( number('3', 3) );
		jLabelRadioClientClockScreenNumeric_12_00.setIcon( number('5', 3) );
		jLabelRadioClientClockScreenNumeric_15_00.setIcon( spacer('2', 2) );
		jLabelRadioClientClockScreenNumeric_17_00.setIcon( number('1', 2) );
		jLabelRadioClientClockScreenNumeric_19_00.setIcon( number('0', 2) );
                                                 
		jLabelRadioClientClockScreenNumeric_00_04.setIcon( spacer('0', 1) );
                                                 
		jLabelRadioClientClockScreenNumeric_00_05.setIcon( letter('M', 1) );
		jLabelRadioClientClockScreenNumeric_01_05.setIcon( letter('E', 1) );
		jLabelRadioClientClockScreenNumeric_02_05.setIcon( letter('R', 1) );
		jLabelRadioClientClockScreenNumeric_03_05.setIcon( spacer('0', 1) );
		jLabelRadioClientClockScreenNumeric_04_05.setIcon( number('2', 1) );
		jLabelRadioClientClockScreenNumeric_05_05.setIcon( number('0', 1) );
		jLabelRadioClientClockScreenNumeric_06_05.setIcon( spacer('0', 1) );
		jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter('J', 1) );
		jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter('U', 1) );
		jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter('I', 1) );
		jLabelRadioClientClockScreenNumeric_10_05.setIcon( letter('L', 1) );
		jLabelRadioClientClockScreenNumeric_11_05.setIcon( spacer('0', 1) );
		jLabelRadioClientClockScreenNumeric_12_05.setIcon( number('2', 1) );
		jLabelRadioClientClockScreenNumeric_13_05.setIcon( number('0', 1) );
		jLabelRadioClientClockScreenNumeric_14_05.setIcon( number('2', 1) );
		jLabelRadioClientClockScreenNumeric_15_05.setIcon( number('2', 1) );
		
		
		
		
		
		
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 0;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 0;
		this.add(jLabelRadioClientClockScreenNumeric_00_00, gridBagConstraintsRadioClientClockScreenNumeric); 

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 0;
		this.add(jLabelRadioClientClockScreenNumeric_03_00, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 6;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 0;
		this.add(jLabelRadioClientClockScreenNumeric_06_00, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 9;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 0;
		this.add(jLabelRadioClientClockScreenNumeric_09_00, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 12;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 0;
		this.add(jLabelRadioClientClockScreenNumeric_12_00, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 2;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 2;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 15;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 0;
		this.add(jLabelRadioClientClockScreenNumeric_15_00, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 2;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 2;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 17;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 0;
		this.add(jLabelRadioClientClockScreenNumeric_17_00, gridBagConstraintsRadioClientClockScreenNumeric);
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 2;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 2;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 19;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 0;
		this.add(jLabelRadioClientClockScreenNumeric_19_00, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 0;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 4;
		this.add(jLabelRadioClientClockScreenNumeric_00_04, gridBagConstraintsRadioClientClockScreenNumeric);
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 0;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_00_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_01_05, gridBagConstraintsRadioClientClockScreenNumeric);
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 2;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_02_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 3;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_03_05, gridBagConstraintsRadioClientClockScreenNumeric);
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 4;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_04_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 5;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_05_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 6;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_06_05, gridBagConstraintsRadioClientClockScreenNumeric);
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 7;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_07_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 8;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_08_05, gridBagConstraintsRadioClientClockScreenNumeric);
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 9;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_09_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 10;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_10_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 11;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_11_05, gridBagConstraintsRadioClientClockScreenNumeric);
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 12;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_12_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 13;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_13_05, gridBagConstraintsRadioClientClockScreenNumeric);
		
		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 14;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_14_05, gridBagConstraintsRadioClientClockScreenNumeric);

		gridBagConstraintsRadioClientClockScreenNumeric.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenNumeric.gridwidth = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridheight = 1;
		gridBagConstraintsRadioClientClockScreenNumeric.gridx = 15;
		gridBagConstraintsRadioClientClockScreenNumeric.gridy = 5;
		this.add(jLabelRadioClientClockScreenNumeric_15_05, gridBagConstraintsRadioClientClockScreenNumeric);

		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		// Création du Thread Time
		ThreadTimeRadioClientClockScreenNumeric threadTimeRadioClientClockScreenNumeric = new ThreadTimeRadioClientClockScreenNumeric();
		threadTimeRadioClientClockScreenNumeric.start();

	}
	
	
	// Mise à l'heure
	public void setTime( String hour_, String minute_, String seconde_, String dayOfWeek_, String day_, String month_, String year_)
	{
		
		String hourD = hour_.substring(0, 1);
		String hourU = hour_.substring(1, 2);
		String minuteD = minute_.substring(0, 1);
		String minuteU = minute_.substring(1, 2);
		String secondeD = seconde_.substring(0, 1);
		String secondeU = seconde_.substring(1, 2);

		String dayD = day_.substring(0, 1);
		String dayU = day_.substring(1, 2);
		
		String yearM = year_.substring(0, 1);
		String yearC = year_.substring(1, 2);
		String yearD = year_.substring(2, 3);
		String yearU = year_.substring(3, 4);
				
		jLabelRadioClientClockScreenNumeric_00_00.setIcon( number( hourD.charAt(0), 3 ) );
		jLabelRadioClientClockScreenNumeric_03_00.setIcon( number( hourU.charAt(0), 3 ) );

		jLabelRadioClientClockScreenNumeric_09_00.setIcon( number( minuteD.charAt(0), 3 ) );
		jLabelRadioClientClockScreenNumeric_12_00.setIcon( number( minuteU.charAt(0), 3 ) );
		
		jLabelRadioClientClockScreenNumeric_17_00.setIcon( number( secondeD.charAt(0), 2 ) );
		jLabelRadioClientClockScreenNumeric_19_00.setIcon( number( secondeU.charAt(0), 2 ) );
		
		if( dayOfWeek_.equals( "1" ) ) 
		{ 
			
			jLabelRadioClientClockScreenNumeric_00_05.setIcon( letter( 'L', 1 ) );
			jLabelRadioClientClockScreenNumeric_01_05.setIcon( letter( 'U', 1 ) );
			jLabelRadioClientClockScreenNumeric_02_05.setIcon( letter( 'N', 1 ) );

		}
		
		if( dayOfWeek_.equals( "2" ) ) 
		{
			
			jLabelRadioClientClockScreenNumeric_00_05.setIcon( letter( 'M', 1 ) );
			jLabelRadioClientClockScreenNumeric_01_05.setIcon( letter( 'A', 1 ) );
			jLabelRadioClientClockScreenNumeric_02_05.setIcon( letter( 'R', 1 ) );

		}
		
		if( dayOfWeek_.equals( "3" ) ) 
		{ 
			
			jLabelRadioClientClockScreenNumeric_00_05.setIcon( letter( 'M', 1 ) );
			jLabelRadioClientClockScreenNumeric_01_05.setIcon( letter( 'E', 1 ) );
			jLabelRadioClientClockScreenNumeric_02_05.setIcon( letter( 'R', 1 ) );

		}
		
		if( dayOfWeek_.equals( "4" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_00_05.setIcon( letter( 'J', 1 ) );
			jLabelRadioClientClockScreenNumeric_01_05.setIcon( letter( 'E', 1 ) );
			jLabelRadioClientClockScreenNumeric_02_05.setIcon( letter( 'U', 1 ) );

		}

		if( dayOfWeek_.equals( "5" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_00_05.setIcon( letter( 'V', 1 ) );
			jLabelRadioClientClockScreenNumeric_01_05.setIcon( letter( 'E', 1 ) );
			jLabelRadioClientClockScreenNumeric_02_05.setIcon( letter( 'N', 1 ) );

		}

		if( dayOfWeek_.equals( "6" ) ) 
		{

			jLabelRadioClientClockScreenNumeric_00_05.setIcon( letter( 'S', 1 ) );
			jLabelRadioClientClockScreenNumeric_01_05.setIcon( letter( 'A', 1 ) );
			jLabelRadioClientClockScreenNumeric_02_05.setIcon( letter( 'M', 1 ) );

		}

		if( dayOfWeek_.equals( "7" ) ) 
		{

			jLabelRadioClientClockScreenNumeric_00_05.setIcon( letter( 'D', 1 ) );
			jLabelRadioClientClockScreenNumeric_01_05.setIcon( letter( 'I', 1 ) );
			jLabelRadioClientClockScreenNumeric_02_05.setIcon( letter( 'M', 1 ) );

		}

		jLabelRadioClientClockScreenNumeric_04_05.setIcon( number( dayD.charAt(0), 1 ) );
		jLabelRadioClientClockScreenNumeric_05_05.setIcon( number( dayU.charAt(0), 1 ) );
		
		if( month_.equals( "01" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'J', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'A', 1 ) ); 
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'N', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );
			
		}
		
		if( month_.equals( "02" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'F', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'E', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'V', 1 ) ); 
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );
			
		}
		
		if( month_.equals( "03" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'M', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'A', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'R', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );
			
		}
		
		if( month_.equals( "04" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'A', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'V', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'R', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );
			
		}
		
		if( month_.equals( "05" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'M', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'A', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'I', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );
			
		}
		
		if( month_.equals( "06" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'J', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'U', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'I', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( letter( 'N', 1 ) );
			
		}
		
		if( month_.equals( "07" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'J', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'U', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'I', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( letter( 'L', 1 ) );
			
		}
		
		if( month_.equals( "08" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'A', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'O', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'U', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );

		}
		
		if( month_.equals( "09" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'S', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'E', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'P', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );
			
		}
		
		if( month_.equals( "10" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'O', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'C', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'T', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );
			
		}

		if( month_.equals( "11" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'N', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'O', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'V', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );

		}
		
		if( month_.equals( "12" ) ) 
		{ 

			jLabelRadioClientClockScreenNumeric_07_05.setIcon( letter( 'D', 1 ) );
			jLabelRadioClientClockScreenNumeric_08_05.setIcon( letter( 'E', 1 ) );
			jLabelRadioClientClockScreenNumeric_09_05.setIcon( letter( 'C', 1 ) );
			jLabelRadioClientClockScreenNumeric_10_05.setIcon( spacer( '0', 1 ) );

		}
		
		jLabelRadioClientClockScreenNumeric_12_05.setIcon( number( yearM.charAt(0), 1 ) );
		jLabelRadioClientClockScreenNumeric_13_05.setIcon( number( yearC.charAt(0), 1 ) );
		jLabelRadioClientClockScreenNumeric_14_05.setIcon( number( yearD.charAt(0), 1 ) );
		jLabelRadioClientClockScreenNumeric_15_05.setIcon( number( yearU.charAt(0), 1 ) );	
		
	}
	
	// Thread Radio Client Clock Screen Numeric
	public class ThreadTimeRadioClientClockScreenNumeric extends Thread
	{
		
		private void pause( int ms )
		{
			
			try
			{

				Thread.sleep( ms );
			}
			catch (InterruptedException ie)
			{

				System.out.println( ">>> InterruptedException : " + ie.getMessage() );
			}
			
		}
		
		public void run()
		{
			
			Date date;
			
			while( true )
			{
				
				date = Calendar.getInstance().getTime();

				SimpleDateFormat simpleDateFormatHour = new SimpleDateFormat("HH");
				SimpleDateFormat simpleDateFormatMinute = new SimpleDateFormat("mm");
				SimpleDateFormat simpleDateFormatSeconde = new SimpleDateFormat("ss");
				
				SimpleDateFormat simpleDateFormatDayOfWeek = new SimpleDateFormat("u");
				SimpleDateFormat simpleDateFormatDay = new SimpleDateFormat("dd");
				SimpleDateFormat simpleDateFormatMonth = new SimpleDateFormat("MM");
				SimpleDateFormat simpleDateFormatYear = new SimpleDateFormat("yyyy");
				
				String hour_ =  simpleDateFormatHour.format(date);
				String minute_ = simpleDateFormatMinute.format(date);
				String seconde_ = simpleDateFormatSeconde.format(date);

				String dayOfWeek_ = simpleDateFormatDayOfWeek.format(date);
				String day_ = simpleDateFormatDay.format(date);
				String month_ = simpleDateFormatMonth.format(date);
				String year_ = simpleDateFormatYear.format(date);
				
				setTime( hour_, minute_, seconde_, dayOfWeek_, day_, month_, year_);
				
				this.pause( 200 );
			}

		}

	}

}
