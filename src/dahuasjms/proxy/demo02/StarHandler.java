package dahuasjms.proxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK自带的动态代理：

　　java.lang.reflect.Proxy 作用：动态生成代理类和对象

　　java.lang.reflect.InvocationHandler(处理器接口)

　　　　可以通过invoke方法实现对真实角色的代理访问。

　　　　每次通过Proxy生成代理类对象时都要指定对应的处理器对象。

 * @author Macx
 *
 */
public class StarHandler implements InvocationHandler{

	private Star star;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object object = null;
		   System.out.println("真正的方法执行前");
           System.out.println("面谈，签合同，预付款，订机票");
           if(method.getName().equals("sing")) {
        	   	object = method.invoke(star, args);
           }
           System.out.println("真正的方法执行后");
           System.out.println("收尾款");
           
		
		return object;
	}

	public StarHandler(Star star) {
		super();
		this.star = star;
	}

}
