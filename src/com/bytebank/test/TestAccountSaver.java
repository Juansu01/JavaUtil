package com.bytebank.test;

import com.bytebank.models.CuentaCorriente;
import com.bytebank.models.GuardaCuentas;

public class TestAccountSaver {
    public static void main(String[] args) {
        GuardaCuentas accountSaver = new GuardaCuentas();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(33, 45);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(3, 4);
        accountSaver.adicionar(cuentaCorriente);
        accountSaver.adicionar(cuentaCorriente2);
        accountSaver.showAccounts();
    }
}
