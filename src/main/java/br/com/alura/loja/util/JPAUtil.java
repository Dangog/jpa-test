package br.com.alura.loja.util;

<<<<<<< HEAD

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.stream.events.EntityReference;

public class JPAUtil {

    private static final EntityManagerFactory FACTORY = Persistence
            .createEntityManagerFactory("loja");

    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }

=======
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("loja");

	public static EntityManager getEntityManager() { 
		return FACTORY.createEntityManager();
	}
	
>>>>>>> 759d5d522b91f9fd880b6ec2e4bbbadf2bbc053b
}
