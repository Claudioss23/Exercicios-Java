package Praticando.Testes.Zodiaco.Classes;

import java.util.Date;

public class Relogio {

    public static Date data = null;

    public static Date agora() {
        if(data != null) {
            return (Date) data.clone();
        } else {
            return new Date();
        }
    }
}
