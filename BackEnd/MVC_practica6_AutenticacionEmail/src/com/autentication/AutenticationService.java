package com.autentication;

import java.util.ArrayList;
//Se importa la clase Usuario
import com.utileria.Usuario;

public class AutenticationService  {
	
	ArrayList<Usuario> arregloUsers=new ArrayList();//ArrayList es arreglo dinámico
	Usuario usr1=new Usuario("pepe66@gmail.com", "12345");
	Usuario usr2=new Usuario("vaquita44@gmail.com", "54321");
	Usuario usr3=new Usuario("leidirosa22@gmail.com", "66633");
	Usuario usr4=new Usuario("reinitatres@gmail.com", "99966");
	
	public AutenticationService() {
		arregloUsers.add(usr1);
		arregloUsers.add(usr2);
		arregloUsers.add(usr3);
		arregloUsers.add(usr4);
	}
	
	public Usuario authentication(String email,String password) {
		
		for(Usuario lili:arregloUsers) {//Equals compara objetos tipo object, == datos primitivos
			if(lili.getEmail().equals(email) && lili.getPassword().equals(password)) {
				return lili;
			}
		}
		
		return null;
	}
}
