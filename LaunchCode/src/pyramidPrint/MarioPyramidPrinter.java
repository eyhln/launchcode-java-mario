package pyramidPrint;

public class MarioPyramidPrinter {
	
	private int heightInSteps;
	private TextPyramidBuilder pyramid;
	private TerminalIntegerInputPrompt heightGetter;
	private TextBasedMenu menu;
	
	public MarioPyramidPrinter() {
		pyramid = new TextPyramidBuilder();
		heightGetter = new TerminalIntegerInputPrompt();
		menu = new TextBasedMenu();
	}
	
	public static void main (String[] args) {
		MarioPyramidPrinter mpp = new MarioPyramidPrinter();
		mpp.printPyramid();
	}
	
	public void printPyramid() {
		String title = "MARIO PYRAMID PRINTER";
		menu.printMenuHeader(50, title);
		String option1 = "Print pyramid to standard output";
		String option2 = "Print pyramid to file";
		int option = menu.getUserSelectionFromMenu(option1, option2);
		if (option == 0) {
			String prompt = "Enter a number of steps for a printed pyramid: ";
			heightInSteps = heightGetter.getBoundedIntegerInput(0,23,prompt);
			printPyramidToStandardOutput();
		}
		if (option == 1) {
			
		}

	}
	
	private void printPyramidToStandardOutput() {
		String pyramidOutput = pyramid.buildPyramidString(heightInSteps);
		System.out.println(pyramidOutput);
	}
	
}
		
	