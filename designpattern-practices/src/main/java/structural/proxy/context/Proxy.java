package structural.proxy.context;

import structural.proxy.i.Subject;

public class Proxy implements Subject {

	@Override
	public void doAction() {
		new Context().getSubject().doAction();
	}

}
