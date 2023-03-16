import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Devs;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Devs devCristiano = new Devs();
        devCristiano.setNome("Cristiano");
        devCristiano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" +devCristiano.getConteudosInscritos());
        devCristiano.progredir();
        devCristiano.progredir();
        System.out.printf(".");
        System.out.println("Conteúdos Inscritos" +devCristiano.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" +devCristiano.getConteudosConcluidos());
        System.out.println("XP" +devCristiano.calcularTotalXp());

        System.out.println("****************");

        Devs devJoshua = new Devs();
        devJoshua.setNome("Joshua");
        devJoshua.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" +devJoshua.getConteudosInscritos());
        devJoshua.progredir();
        devJoshua.progredir();
        devJoshua.progredir();
        System.out.println("Conteúdos Inscritos" +devJoshua.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" +devJoshua.getConteudosConcluidos());
        System.out.println("XP" +devJoshua.calcularTotalXp());


        Conteudo conteudo = new Conteudo();
    }
}