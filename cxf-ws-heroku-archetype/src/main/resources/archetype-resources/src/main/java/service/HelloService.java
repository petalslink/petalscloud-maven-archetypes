#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author chamerling
 * 
 */
@WebService
public interface HelloService {

	@WebMethod
	String sayHi(String input);
}
