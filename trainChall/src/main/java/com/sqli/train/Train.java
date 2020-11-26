package com.sqli.train;
import com.sqli.train.wagon.IWagon;
import com.sqli.train.wagon.impl.Wagon;
import com.sqli.train.wagon_factory.IWagonFactory;
import com.sqli.train.wagon_factory.impl.WagonFactory;
/**
 * Issues found working with decorator on this project:
 * 	- I can't pick a single element (wagon) from the train, if this wasn't about printing strings, it wouldn't work for me. 
 * 	- I basically create a wagon object ("entireTrain") that contains a lot of wagons, vocabulary isn't correct, but unfortunetly 
 * 		the "Train" class is locked as it is used in the TrainTest, and i needed to change the train instanciation
 * 		to make it vocabulary correct, and it would've been a better solution than this one. 
 * @author medkhalil
 *
 */
public class Train{
	
	
	//entireTrain = w1 => w1 + w2 => 2....
	private IWagon entireTrain = new Wagon() ; //initiate 
	private IWagonFactory wf = WagonFactory.getInstance(); 
	
	public Train(String trainStringRepresentation) {
		for(char wagonCharRepr : trainStringRepresentation.toCharArray()) {
			this.entireTrain = wf.createWagon(this.entireTrain, wagonCharRepr); 
//			entireTrain.print("");
		}
	}
	/**
	 * CHANGE THIS METHOD
	 * @return a string illustrating the train. 
	 */
	public String print() {
		System.out.print(entireTrain.print(""));
		return entireTrain.print("");
	}
	
	/**
	 * CHANGE THIS METHOD
	 * @return a boolean, so we know if there is any empty cargo that could be filled. 
	 */
	public Boolean fill() {
		return false; 
	}

	/**
	 * CHANGE THIS METHOD
	 */
	public void detachHead() {
		
	}
	
	/**
	 * CHANGE THIS METHOD
	 */	
	public void detachEnd() {
		
	}
}
