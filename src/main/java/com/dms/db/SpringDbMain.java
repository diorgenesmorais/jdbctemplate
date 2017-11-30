package com.dms.db;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dms.db.repository.UsuarioRepository;

public class SpringDbMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringDbMain.class.getPackage().getName());
		
		UsuarioRepository repo = applicationContext.getBean(UsuarioRepository.class);
		repo.listar().forEach(u -> System.out.println(u));
		
		System.out.println("Buscando por id: " + repo.buscar(2L));
		
		applicationContext.close();
		System.out.println("Encerrou!");
	}

}
