package com.soap_practica1;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)//en qu� formato el WSDL
public interface IHolaMundoServer {//WebService
	
	@WebMethod
	public String diHolaMundo();//Interfaz, m�todos vac�os

}
