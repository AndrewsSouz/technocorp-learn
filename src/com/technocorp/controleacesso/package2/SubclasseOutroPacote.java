package com.technocorp.controleacesso.package2;

import com.technocorp.controleacesso.package1.Interativa;

public class SubclasseOutroPacote extends Interativa {


    public void modificarIdProtected(){
        System.out.println("Alterando o valor de idProtected através do super, também poderia ser feito usando 'this'.");
        super.idProtected = 5;
        System.out.println("Mostrando idProtected diretamente através de 'super.': "+super.idProtected);
    }
}
