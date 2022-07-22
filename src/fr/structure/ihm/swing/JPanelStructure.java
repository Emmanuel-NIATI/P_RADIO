package fr.structure.ihm.swing;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public abstract class JPanelStructure extends JPanel
{

	private Image image;
	
	protected Font fontConsolasItalicBold008;
	protected Font fontConsolasItalicBold009;
	protected Font fontConsolasItalicBold010;
	protected Font fontConsolasItalicBold012;
	protected Font fontConsolasItalicBold014;
	
	public JPanelStructure()
	{

		this.image = null;
		
		// Gestion des polices de caractères
		fontConsolasItalicBold008 = new Font("Consolas", Font.ITALIC | Font.BOLD, 8);
		fontConsolasItalicBold009 = new Font("Consolas", Font.ITALIC | Font.BOLD, 9);
		fontConsolasItalicBold010 = new Font("Consolas", Font.ITALIC | Font.BOLD, 10);
		fontConsolasItalicBold012 = new Font("Consolas", Font.ITALIC | Font.BOLD, 12);
		fontConsolasItalicBold014 = new Font("Consolas", Font.ITALIC | Font.BOLD, 14);
		
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
	
	public Image getImage()
	{
		
		return this.image;
	}
	
	public void setImage( Image image_ )
	{
		
		this.image = image_;
	}

}
