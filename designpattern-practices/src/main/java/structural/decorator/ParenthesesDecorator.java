package structural.decorator;

public class ParenthesesDecorator extends Decorator {
	public ParenthesesDecorator(Component component) {
		super(component);
	}
	
	@Override
	public String operation() {
		String text = component.operation();
		return "(" + text + ")";
	}
}
