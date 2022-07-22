package fr.structure.application;

public class ApplicationLinux extends Application 
{

	private static final ApplicationLinux instance = new ApplicationLinux();

	private ApplicationLinux()
	{

		super();
		
	}
	
	public static final ApplicationLinux getInstance()
	{
		
		return instance;
	}
	
}
