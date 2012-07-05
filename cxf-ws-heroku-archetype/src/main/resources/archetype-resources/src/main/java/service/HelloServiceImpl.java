#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

/**
 * @author chamerling
 * 
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String input) {
		System.out.println("Hello invoked : " + input);
		return String.format("Hello '%s'", input);
	}

}
