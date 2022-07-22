package fr.structure.application;

public class ApplicationWindows extends Application 
{

	private static final ApplicationWindows instance = new ApplicationWindows();

	private ApplicationWindows()
	{

		super();
		
	}
	
	public static final ApplicationWindows getInstance()
	{
		
		return instance;
	}
	
}
