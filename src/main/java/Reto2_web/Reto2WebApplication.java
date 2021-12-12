//Mdelo
//interface
//repositorio
//servicio
//controlador


package Reto2_web;

import Reto2_web.interfaces.InterfaceFragance;
import Reto2_web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner{
    @Autowired
    private InterfaceFragance interfaceFragance;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}
      @Override
    public void run(String... args) throws Exception {
        interfaceFragance.deleteAll();
        interfaceUser.deleteAll();
    }
}
