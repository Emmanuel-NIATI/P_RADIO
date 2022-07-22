package fr.radio.test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import fr.radio.application.ApplicationRadio;

public class TestRadio
{

	public static void main(String[] args)
	{

		ApplicationRadio applicationRadio;

		if( "Linux".equals( System.getProperty("os.name") ) )
		{
			
			try
			{
				
				System.out.println(">>> " + "OS" + " : " + System.getProperty("os.name") );
				UIManager.setLookAndFeel( ApplicationRadio.LOOK_AND_FEEL_METAL );
				applicationRadio = ApplicationRadio.getInstance();
			}
			catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
			{

				System.out.println(">>> " + e.getClass() + " : " + e.getMessage() );
			}
			
		}
		else if( "Windows 10".equals( System.getProperty("os.name") ) )
		{

			try
			{

				System.out.println(">>> " + "OS" + " : " + System.getProperty("os.name") );
				UIManager.setLookAndFeel( ApplicationRadio.LOOK_AND_FEEL_WINDOWS );
				applicationRadio = ApplicationRadio.getInstance();
			}
			catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
			{

				System.out.println(">>> " + e.getClass() + " : " + e.getMessage() );
			}
			
		}
		else
		{
			
			System.out.println(">>> " + "OS non prévu" + " : " + System.getProperty("os.name") );
			
		}
		
	}
	
}
