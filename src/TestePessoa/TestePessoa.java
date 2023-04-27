package TestePessoa;

import Pessoa.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestePessoa {

    @Test //GetIdade
    public void testIdade() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse("15/04/1995");
        Pessoa pessoa = new Pessoa("João", dataNascimento);
        Assert.assertEquals(28, pessoa.getIdade());
    }

    @Test //GetSigno
    public void testSigno() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse("15/04/1995");
        Pessoa pessoa = new Pessoa("João", dataNascimento);
        Assert.assertEquals("Áries", pessoa.getSigno());
    }


}