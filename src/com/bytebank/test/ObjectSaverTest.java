package com.bytebank.test;

import com.bytebank.models.Cliente;
import com.bytebank.models.CuentaAhorros;
import com.bytebank.models.CuentaCorriente;
import com.bytebank.models.ObjectSaver;
public class ObjectSaverTest {

    public static void main(String[] args) {
        ObjectSaver mySaver = new ObjectSaver();
        CuentaCorriente myCuentaCorriente = new CuentaCorriente(43, 54);
        CuentaAhorros myCuentaAhorros = new CuentaAhorros(55, 88);
        Cliente myCliente = new Cliente();
        Cliente myCliente2 = new Cliente();
        myCliente.setNombre("Juan");
        myCliente2.setNombre("Carlos");
        myCuentaCorriente.setTitular(myCliente);
        myCuentaAhorros.setTitular(myCliente2);
        mySaver.addObj(myCliente);
        mySaver.addObj(myCliente2);
        mySaver.addObj(myCuentaAhorros);
        mySaver.addObj(myCuentaCorriente);
        mySaver.showAllObjects();
    }
}
