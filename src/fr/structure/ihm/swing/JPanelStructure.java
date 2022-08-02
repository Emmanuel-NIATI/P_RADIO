package fr.structure.ihm.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public abstract class JPanelStructure extends JPanel
{

	private Image image;
	
	protected static final Font fontConsolasItalicBold008 = new Font("Consolas", Font.ITALIC | Font.BOLD, 8);
	protected static final Font fontConsolasItalicBold009 = new Font("Consolas", Font.ITALIC | Font.BOLD, 9);
	protected static final Font fontConsolasItalicBold010 = new Font("Consolas", Font.ITALIC | Font.BOLD, 10);
	protected static final Font fontConsolasItalicBold012 = new Font("Consolas", Font.ITALIC | Font.BOLD, 12);
	protected static final Font fontConsolasItalicBold014 = new Font("Consolas", Font.ITALIC | Font.BOLD, 14);

	protected static final Color COLOR_GRAY = Color.GRAY;
	protected static final Color COLOR_WHITE = Color.WHITE;
	protected static final Color COLOR_GREEN = Color.GREEN;
	protected static final Color COLOR_BLUE = Color.BLUE;
	protected static final Color COLOR_YELLOW = Color.YELLOW;
	protected static final Color COLOR_BLACK = Color.BLACK;
	
	public JPanelStructure()
	{

		this.image = null;
		
	}
	
	@Override
	public void paintComponent(Graphics g)
	{

	    if( this.image != null )
	    {

	    	Graphics2D g2d = ( Graphics2D ) g;
	    	g2d.setRenderingHint( RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR );
	    	g2d.drawImage( image, 0, 0, getWidth(), getHeight(), null );

	    }

	}
	
	// Génération transparence
	protected ImageIcon transparent( ImageIcon imageIcon )
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
	protected ImageIcon recolorize( ImageIcon imageIcon, int e, int s)
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
				
				if( rgb == e )
				{

					bufferedImage.setRGB( c,  l, s );
				}

			}

		}
		
		ImageIcon imageIconRecolorized = new ImageIcon( bufferedImage );

		return imageIconRecolorized;
		
	}
	
	// Génération taille
	protected ImageIcon resize( ImageIcon imageIcon, int size )
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
	
	// Génération espacement
	protected ImageIcon spacer( char c, int size )
	{
		
		ImageIcon imageIcon = new ImageIcon( this.getClass().getResource("spacer_" + c + ".png") );
		
		if( size < 4 )
		{
		
			imageIcon = resize( imageIcon, size );
			
		}

		return imageIcon;

	}

	// Génération nombre
	protected ImageIcon number( char c, int size )
	{
		
		ImageIcon imageIcon = new ImageIcon( this.getClass().getResource("number_" + c + ".png") );
		
		if( size < 4 )
		{
		
			imageIcon = resize( imageIcon, size );
			
		}
		
		return imageIcon;

	}
	
	// Génération lettre
	protected ImageIcon letter( char c, int size )
	{
		
		ImageIcon imageIcon = new ImageIcon( this.getClass().getResource("letter_" + c + ".png") );

		if( size < 4 )
		{
		
			imageIcon = resize( imageIcon, size );
			
		}

		return imageIcon;

	}
	
	// Génération hour
	protected ImageIcon hour( String hour_, String minute_, int size )
	{

		// ImageIcon imageIcon = new ImageIcon( this.getClass().getResource("analogic_700x340_hour_" + s + ".png") );

		if( size < 4 )
		{
		
			imageIcon = resize( imageIcon, size );
			
		}

		return imageIcon;

	}
	
	// Génération minute	
	protected ImageIcon minute( String minute_, int size )
	{

		ImageIcon imageIcon = new ImageIcon( this.getClass().getResource("analogic_700x340_minute_" + minute_ + ".png") );

		if( size < 4 )
		{
		
			imageIcon = resize( imageIcon, size );
			
		}

		return imageIcon;

	}
	
	// Génération seconde
	protected ImageIcon seconde( String s, int size )
	{

		ImageIcon imageIcon = new ImageIcon( this.getClass().getResource("analogic_700x340_seconde_" + s + ".png") );

		if( size < 4 )
		{
		
			imageIcon = resize( imageIcon, size );
			
		}

		return imageIcon;

	}
	
	// get/set
	
	public Image getImage()
	{
		
		return this.image;
	}
	
	public void setImage( Image image_ )
	{
		
		this.image = image_;
	}

}
