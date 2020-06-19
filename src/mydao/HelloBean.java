package mydao;
import javax.ejb.Stateless;
@Stateless
public class HelloBean implements HelloBeanLocal, HelloBeanRemote {
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "hello,"+name;
	}
}
