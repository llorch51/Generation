package com.soap_practica1;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HolaMundoCliente {

	public static void main(String[] args) {

		try {
		URL miURL=new URL("http://localhost:9876/HolaMundo?wsdl");
		//						Nombre Package pero al revéz
		QName miQName=new QName("http://soap_practica1.com/", "HolaMundoServerImplementationService");//Agregar SERVICE
		Service miServicio=Service.create(miURL, miQName);
		IHolaMundoServer server=miServicio.getPort(IHolaMundoServer.class);
		System.out.println(server.diHolaMundo());
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
