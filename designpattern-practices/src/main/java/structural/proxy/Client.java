package structural.proxy;

import structural.proxy.context.Proxy;
// import structural.proxy.context.Context;
import structural.proxy.i.Subject;

public class Client {
	public static void main(String[] args) {
		// Context ctx = new Context();
		// Subject subject = ctx.getSubject();
		// subject.doAction();
		
		Subject subject = new Proxy();
		subject.doAction();
	}
}
