package com.bytebank.models;

public class GuardaCuentas {
	
	// Crear un objeto para guardar muchas Cuentas
	// Permitirnos agregar cuentas con un metodo 
	// guardaCuentas.adiciona(cuenta);
	// obtener, remover, etc.
	
	Cuenta[] cuentas = new Cuenta[10];
	int indice = 0;

	public void adicionar(Cuenta cc) {
		cuentas[indice] = cc;
		indice++;
	}
	
	public Cuenta obtener(int indice) {
		return cuentas[indice];
	}

	public void showAccounts() {
		int index = 0;
		while (index < this.indice) {
			System.out.println(this.cuentas[index]);
			index++;
		}

	}
}
