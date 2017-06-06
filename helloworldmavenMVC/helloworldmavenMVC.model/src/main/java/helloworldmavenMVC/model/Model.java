package helloworldmavenMVC.model;

import helloworldmavenMVC.contract.IModel;

public class Model implements IModel {

	public String getHelloWorld() {
		
		loadFile file = new loadFile();
		
		return file.getMessage();
	}

}
