package one.digitalinnovation.gof.subsitema2.cep;

import one.digitalinnovation.gof.facade.Facade;

public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }
}
