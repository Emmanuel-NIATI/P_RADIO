package fr.structure.application;

public class FactoryWindows
{
	
	private static final FactoryWindows instance = new FactoryWindows();
	
	private FactoryWindows()
	{
		
		super();
	}

	public static final FactoryWindows getInstance()
	{
		
		return instance;
	}
	
}
