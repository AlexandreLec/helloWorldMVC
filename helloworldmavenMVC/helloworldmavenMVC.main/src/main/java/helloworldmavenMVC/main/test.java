package helloworldmavenMVC.main;

import helloworldmavenMVC.controller.controller;
import helloworldmavenMVC.model.Model;
import helloworldmavenMVC.view.View;

public class test {

	public static void main(String[] args) {
		
		Model model = new Model();
		View vue = new View();
		controller control = new controller(vue,model);
		control.run();

	}

}
