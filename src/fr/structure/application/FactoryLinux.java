package fr.structure.application;

public class FactoryLinux
{

	private static final FactoryLinux instance = new FactoryLinux();
	
	private FactoryLinux()
	{

		super();

	}

	public static final FactoryLinux getInstance()
	{
		
		return instance;
	}
	
}
