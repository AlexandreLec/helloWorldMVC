package helloworldmavenMVC.controller;

import helloworldmavenMVC.contract.IModel;
import helloworldmavenMVC.contract.IView;

public class controller {
	
	private final IView view;
	private final IModel model;

	public controller(IView view, IModel model){
		this.view = view;
		this.model = model;
	}
	
	public void run(){
		this.view.displayMessage(this.model.getHelloWorld());
	}
}
