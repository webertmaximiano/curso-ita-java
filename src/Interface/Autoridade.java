package Interface;

public class Autoridade {
    private String nome;
    private String sobrenome;
    private FormatadorNome formatadorNome;

    public Autoridade (String nome, String sobrenome, FormatadorNome formatadorNome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.formatadorNome = formatadorNome;

    }
    public String getTratamento() {
        return formatadorNome.formatarNome(nome, sobrenome);
    }
    //implementação informal
    public static class FormatadorNomeInformal implements FormatadorNome {
        @Override
        public String formatarNome(String nome, String sobrenome) {
            return nome;
        }
    }
    //implementação respeitoso
    public static  class FormatadorNomeRespeitoso implements FormatadorNome {
        private String genero;

        public FormatadorNomeRespeitoso(String genero) {
            this.genero = genero;
        }

        @Override
        public String formatarNome(String nome, String sobrenome) {
            if (genero.equals("masculino")) {
                return "Sr. " + sobrenome;
            } else if (genero.equals("feminino")) {
                return "Sra. " + sobrenome;
            } else {
                return sobrenome;
            }
        }
    }

    //implementação com Título
    public static class FormatadorNomeComTitulo implements FormatadorNome {
        private String titulo;

        public FormatadorNomeComTitulo(String titulo) {
            this.titulo = titulo;
        }

        @Override
        public String formatarNome(String nome, String sobrenome) {
            return titulo + " " + nome + " " + sobrenome;
        }
    }

}
