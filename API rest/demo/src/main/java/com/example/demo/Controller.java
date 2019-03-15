package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	List<GestoresBd> listado = Data.ListaGestores();
	GestoresBd gestor=new GestoresBd();
	
	
	@GetMapping("/testGet")
	List<GestoresBd> listarTodo() {
		return listado;
	}
	
	@GetMapping("/testGet/{id}")
	GestoresBd listarUno(@PathVariable int id) {
		return gestor=Data.buscar(id, listado);
	}

	@PostMapping("/testPost")
	String agregarGestor(@RequestBody GestoresBd newGestor) {
		try{
			listado.add(newGestor);
		}catch(Exception e) {
			return "No se agregó el gestor";
		}
		return "Se agregó el gestor";
	}
	
	@PutMapping("/testPut/{id}")
	String pruebaPut(@RequestBody GestoresBdUpdate upGestor, @PathVariable int id) {
		try{
			gestor=Data.buscar(id, listado);
			gestor.setNombre(upGestor.getNombre());
			listado.remove(gestor);
			listado.add(gestor);
		}catch(Exception e) {
			return "No se modificó el gestor";
		}
		return "Se modificó el gestor";
	}
	
	@DeleteMapping("/testDel/{id}")
	void pruebaDelete(@PathVariable int id) {
		gestor=Data.buscar(id, listado);
		if ( gestor!= null) {
			listado.remove(gestor);}
	}
}
