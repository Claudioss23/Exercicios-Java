package Praticando.Testes.Zodiaco.Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {

    private final Date dataDeNascimento;

    public Pessoa(String dataDeNascimento) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        this.dataDeNascimento = format.parse(dataDeNascimento);
    }

    public int getIdade() {
        Date agora = Relogio.agora();
        Calendar c = new GregorianCalendar();
        Calendar c2 = new GregorianCalendar();

        c.setTime(agora);
        c2.setTime(dataDeNascimento);

        int idade = c.get(Calendar.YEAR) - c2.get(Calendar.YEAR);

        if(agora.compareTo(dataDeNascimento) < 0) {
            idade--;
        }

        return idade;
    }

    public String getSigno() {
        Calendar c = new GregorianCalendar();
        String zodiaco = "";

        c.setTime(dataDeNascimento);

        switch (c.get(Calendar.MONTH)) {
            case 0: {
                if(c.get(Calendar.DAY_OF_MONTH) > 20) {
                    zodiaco = "Aquário: 21 de Janeiro - 19 de fevereiro";
                } else {
                    zodiaco = "Capricórnio: 22 de dezembro - 20 de janeiro";
                }
                break;
            }
            case 1: {
                if(c.get(Calendar.DAY_OF_MONTH) > 19) {
                    zodiaco = "Peixes: 20 de fevereiro - 20 de março";
                } else {
                    zodiaco = "Aquário: 21 de Janeiro - 19 de fevereiro";
                }
                break;
            }
            case 2: {
                if(c.get(Calendar.DAY_OF_MONTH) > 20) {
                    zodiaco = "Áries: 21 de março - 20 de abril";
                } else {
                    zodiaco = "Peixes: 20 de fevereiro - 20 de março";
                }
                break;
            }
            case 3: {
                if(c.get(Calendar.DAY_OF_MONTH) > 20) {
                    zodiaco = "Touro: 21 de abril - 20 de maio";
                } else {
                    zodiaco = "Áries: 21 de março - 20 de abril";
                }
                break;
            }
            case 4: {
                if(c.get(Calendar.DAY_OF_MONTH) > 20) {
                    zodiaco = "Gêmeos: 21 de maio - 20 de junho";
                } else {
                    zodiaco = "Touro: 21 de abril - 20 de maio";
                }
                break;
            }
            case 5: {
                if(c.get(Calendar.DAY_OF_MONTH) > 20) {
                    zodiaco = "Câncer: 21 de junho - 21 de julho";
                } else {
                    zodiaco = "Gêmeos: 21 de maio - 20 de junho";
                }
                break;
            }
            case 6: {
                if(c.get(Calendar.DAY_OF_MONTH) > 21) {
                    zodiaco = "Leão: 22 de julho - 22 de agosto";
                } else {
                    zodiaco = "Câncer: 21 de junho - 21 de julho";
                }
                break;
            }
            case 7: {
                if(c.get(Calendar.DAY_OF_MONTH) > 22) {
                    zodiaco = "Virgem: 23 de agosto - 22 de setembro";
                } else {
                    zodiaco = "Leão: 22 de julho - 22 de agosto";
                }
                break;
            }
            case 8: {
                if(c.get(Calendar.DAY_OF_MONTH) > 22) {
                    zodiaco = "Libra: 23 de setembro - 22 de outubro";
                } else {
                    zodiaco = "Virgem: 23 de agosto - 22 de setembro";
                }
                break;
            }
            case 9: {
                if(c.get(Calendar.DAY_OF_MONTH) > 22) {
                    zodiaco = "Escorpião: 23 de outubro - 21 de novembro";
                } else {
                    zodiaco = "Libra: 23 de setembro - 22 de outubro";
                }
                break;
            }
            case 10: {
                if(c.get(Calendar.DAY_OF_MONTH) > 21) {
                    zodiaco = "Sagitário: 22 de novembro - 21 de dezembro";
                } else {
                    zodiaco = "Escorpião: 23 de outubro - 21 de novembro";
                }
                break;
            }
            case 11: {
                if(c.get(Calendar.DAY_OF_MONTH) > 21) {
                    zodiaco = "Capricórnio: 22 de dezembro - 20 de janeiro";
                } else {
                    zodiaco = "Sagitário: 22 de novembro - 21 de dezembro";
                }
                break;
            }
        }
        return zodiaco;
    }
}
