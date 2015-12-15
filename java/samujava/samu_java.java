package samujava;

import java.io.*;

class samu_java{
	public static void main ( String[] args ) {

		String[] test =
		{
			"A rare black squirrel has become a regular visitor to a suburban garden",
			"This is a car",
			"This car is mine",
			"I have a little car",
			"The sky is blue",
			"The little brown bear has eaten all of the honey",
			"I love Samu"
		};

		int j=0;

		for ( samu s = new samu(); s.run(); )
		{
			double sum =0.0;
			for ( int i=0; i<7; ++i )
			{
				s.putIn(test[i]);
				sum += s.reward();
			}
			System.out.print( "###### " + ++j + "-th iter " + sum + "\n");
		}

	}

}