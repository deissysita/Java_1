package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Data {

	static List<GestoresBd> ListaGestores(){
		List<GestoresBd> listaGestores = new ArrayList<GestoresBd>();
		listaGestores.add(new GestoresBd(1,"Oracle"));
		listaGestores.add(new GestoresBd(2,"Mysql"));
		listaGestores.add(new GestoresBd(3,"Postgres"));
		listaGestores.add(new GestoresBd(4,"SQLite"));
		listaGestores.add(new GestoresBd(5,"MS Access"));
		return listaGestores;
	}
	
	static GestoresBd buscar(int id, List<GestoresBd> listaGestores) {
		for(GestoresBd gestor : listaGestores)
		{
			if (gestor.getId()==id) {
				return gestor;
			}
		}
		return null;
	}
}
