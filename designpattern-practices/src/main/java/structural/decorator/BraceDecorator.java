package structural.decorator;

public class BraceDecorator extends Decorator {
	public BraceDecorator(Component component) {
		super(component);
	}

	@Override
	public String operation() {
		String text = component.operation();
		return "{" + text + "}";
	}
}
