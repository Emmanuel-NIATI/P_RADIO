package fr.radio.ihm.swing.panelradio.client.clock.screen.analogic;

import java.awt.BorderLayout;
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

public class JPanelRadioClientClockScreenAnalogic extends JPanelStructure
{
	
	private GridBagLayout gridBagLayoutRadioClientClockScreenAnalogic;
	private GridBagConstraints gridBagConstraintsRadioClientClockScreenAnalogic;
	
	private JLabel jLabelRadioClientClockScreenAnalogic_00_00;
	
	public JPanelRadioClientClockScreenAnalogic()
	{

		super();
		
		// Gestion de l'apparence du Panel Radio Client Clock Screen Analogic
		this.setPreferredSize( new Dimension( 720, 360) );
		this.setOpaque( false );
				
		// Gestion de la disposition du panel
		gridBagLayoutRadioClientClockScreenAnalogic = new GridBagLayout();
		this.setLayout( gridBagLayoutRadioClientClockScreenAnalogic );

		gridBagConstraintsRadioClientClockScreenAnalogic = new GridBagConstraints(); 
				
		jLabelRadioClientClockScreenAnalogic_00_00 = new JLabel();
		
		jLabelRadioClientClockScreenAnalogic_00_00.setIcon( seconde("00", 1) );
		
		gridBagConstraintsRadioClientClockScreenAnalogic.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraintsRadioClientClockScreenAnalogic.gridwidth = 3;
		gridBagConstraintsRadioClientClockScreenAnalogic.gridheight = 3;
		gridBagConstraintsRadioClientClockScreenAnalogic.gridx = 0;
		gridBagConstraintsRadioClientClockScreenAnalogic.gridy = 0;
		this.add(jLabelRadioClientClockScreenAnalogic_00_00, gridBagConstraintsRadioClientClockScreenAnalogic); 
		
		// Création du Thread Time
		ThreadTimeRadioClientClockScreenAnalogic threadTimeRadioClientClockScreenAnalogic = new ThreadTimeRadioClientClockScreenAnalogic();
		threadTimeRadioClientClockScreenAnalogic.start();
		
	}
	
	// Génération transparence
	private ImageIcon transparent( ImageIcon imageIcon )
	{
		
		Image image = imageIcon.getImage();
		
		BufferedImage bufferedImage = new BufferedImage(  image.getWidth( null ), image.getHeight( null ), BufferedImage.TYPE_INT_ARGB );    

		Graphics2D graphics2D = bufferedImage.createGraphics();
		graphics2D.drawImage(image, 0, 0, null);
		graphics2D.dispose();
		
		for( int c = 0; c < imageIcon.getIconWidth(); c++ )
		{

			for( int l = 0; l < imageIcon.getIconHeight(); l++ )
			{

				int rgb = bufferedImage.getRGB(c, l);

				if( rgb != -16777216 )
				{

					bufferedImage.setRGB(c,  l, 16777215);
				}

			}

		}

		ImageIcon imageIconTransparent = new ImageIcon( bufferedImage );

		return imageIconTransparent;

	}
	
	// Génération couleur
	private ImageIcon colorize( ImageIcon imageIcon)
	{

		Image image = imageIcon.getImage();
		
		BufferedImage bufferedImage = new BufferedImage(  image.getWidth( null ), image.getHeight( null ), BufferedImage.TYPE_INT_ARGB );    

		Graphics2D graphics2D = bufferedImage.createGraphics();
		graphics2D.drawImage(image, 0, 0, null);
		graphics2D.dispose();

		for( int c = 0; c < imageIcon.getIconWidth(); c++ )
		{

			for( int l = 0; l < imageIcon.getIconHeight(); l++ )
			{

				int rgb = bufferedImage.getRGB(c, l);
				
				if( rgb == -16777216 )
				{

					bufferedImage.setRGB( c,  l, getForeground().getRGB() );
				}

			}

		}
		
		ImageIcon imageIconColorized = new ImageIcon( bufferedImage );

		return imageIconColorized;
		
	}
	
	// Génération taille
	private ImageIcon resize( ImageIcon imageIcon, int size )
	{

		Image image = imageIcon.getImage();
		
		BufferedImage bufferedImageOriginal = new BufferedImage(  image.getWidth( null ), image.getHeight( null ), BufferedImage.TYPE_INT_ARGB );    

		Graphics2D graphics2D = bufferedImageOriginal.createGraphics();
		graphics2D.drawImage(image, 0, 0, null);
		graphics2D.dispose();

		int widthOriginal = bufferedImageOriginal.getWidth();
		int heightOriginal = bufferedImageOriginal.getHeight();
		
		int type = bufferedImageOriginal.getType();
		
		int widthSized = widthOriginal * size;
		int heightSized = heightOriginal * size;

		BufferedImage bufferedImageSized = new BufferedImage(widthSized, heightSized, type);		
		
		for (int ho = 0; ho < heightOriginal; ho++)
		{

			for (int hv = 0; hv < size; hv++)
			{

				for (int wo = 0; wo < widthOriginal; wo++)
				{

					for (int wv = 0; wv < size; wv++)
					{

						int ws = wo * size + wv;
						int hs = ho * size + hv;
						
						bufferedImageSized.setRGB( ws, hs, bufferedImageOriginal.getRGB( wo, ho) );

					}

				}

			}

		}

		ImageIcon imageIconSized = new ImageIcon( bufferedImageSized );

		return imageIconSized;

	}
	
	// Génération seconde
	private ImageIcon seconde( String s, int size )
	{
		
		ImageIcon imageIcon = new ImageIcon( this.getClass().getResource("analogic_720x360_seconde_" + s + ".png") );
		
		imageIcon = transparent( imageIcon );
		imageIcon = colorize( imageIcon );
		
		if( size < 4 )
		{
		
			imageIcon = resize( imageIcon, size );
			
		}

		return imageIcon;

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
				
		jLabelRadioClientClockScreenAnalogic_00_00.setIcon( seconde(seconde_, 1) );
		
	}
	
	// Thread Radio Client Clock Screen Numeric
	public class ThreadTimeRadioClientClockScreenAnalogic extends Thread
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
