package Pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Pessoa {
   private Date dataDeNascimento;
   private String nome;

   //Construtor
   public Pessoa(String nome, Date dataDeNascimento) {
      this.nome = nome;
      this.dataDeNascimento = dataDeNascimento;
   }

   public String getNome() {
      return nome;
   }

   public Date getDataDeNascimento() {
      return dataDeNascimento;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setDataDeNascimento(Date dataDeNascimento) {
      this.dataDeNascimento = dataDeNascimento;
   }

   //Metodos de Acessos
   public int getIdade() {
      LocalDate hoje = LocalDate.now();
      LocalDate dataNascimento = new java.sql.Date(dataDeNascimento.getTime()).toLocalDate();
      Period periodo = Period.between(dataNascimento, hoje);
      return periodo.getYears();
   }
   public String getSigno() {
      LocalDate dataNascimento = new java.sql.Date(dataDeNascimento.getTime()).toLocalDate();
      int mes = dataNascimento.getMonthValue();
      int dia = dataNascimento.getDayOfMonth();
      switch (mes) {
         case 1:
            if (dia <= 19) {
               return "Capricórnio";
            } else {
               return "Aquário";
            }
         case 2:
            if (dia <= 18) {
               return "Aquário";
            } else {
               return "Peixes";
            }
         case 3:
            if (dia <= 20) {
               return "Peixes";
            } else {
               return "Áries";
            }
         case 4:
            if (dia <= 20) {
               return "Áries";
            } else {
               return "Touro";
            }
         case 5:
            if (dia <= 20) {
               return "Touro";
            } else {
               return "Gêmeos";
            }
         case 6:
            if (dia <= 20) {
               return "Gêmeos";
            } else {
               return "Câncer";
            }
         case 7:
            if (dia <= 21) {
               return "Câncer";
            } else {
               return "Leão";
            }
         case 8:
            if (dia <= 22) {
               return "Leão";
            } else {
               return "Virgem";
            }
         case 9:
            if (dia <= 22) {
               return "Virgem";
            } else {
               return "Libra";
            }
         case 10:
            if (dia <= 22) {
               return "Libra";
            } else {
               return "Escorpião";
            }
         case 11:
            if (dia <= 21) {
               return "Escorpião";
            } else {
               return "Sagitário";
            }
         case 12:
            if (dia <= 21) {
               return "Sagitário";
            } else {
               return "Capricórnio";
            }
         default:
            return "";
      }
   }

}
