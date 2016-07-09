package pyramid;

import java.util.ArrayList;

class TextBasedMenu {
	
	private IntegerInputPrompt optionPrompter;
	private String prompt;
	private ArrayList<String> optionTexts;
	private ArrayList<Object> actions;
	
	TextBasedMenu() {
		optionPrompter = new IntegerInputPrompt();
		prompt = "Select an option number: ";
		optionTexts = new ArrayList<String>();
		actions = new ArrayList<Object>();
	}
	
	void addOption(String optionText, Object action) {
			optionTexts.add(optionText);
			actions.add(action);
	}
	
	Object getSelectionFromMenu() throws NullPointerException {
		if (optionTexts.size() == 0) 
			throw new NullPointerException();
		printOptionsList();
		int optionSelected = optionPrompter.getBoundedIntegerInput(1, optionTexts.size(), prompt);			 
		Object actionSelected = actions.get(optionSelected-1);
		return actionSelected;
	}
			
	private void printOptionsList() {
		System.out.print("\n");
		for (int i = 0; i < optionTexts.size(); i++) {
			System.out.printf("   (%d) %s\n", i+1, optionTexts.get(i));
		}
		System.out.print("\n");
	}
	
}