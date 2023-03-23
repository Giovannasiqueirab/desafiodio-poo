import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;
import br.com.dio.desafio.br.com.dio.desafio.dominio.Conteudos;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


            /*System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);
            */

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(Mentoria);

            Dev devGiovanna = new Dev();
            devGiovanna.setNome("Giovanna");
            devGiovanna.inscreverBootcamp(Bootcam);
            System.out.println("Conteudos Inscritos Giovanna: " + devGiovanna.getConteudosinscritos());

            devGiovanna.progredir();
            System.out.println("-");

            System.out.println("Conteudos Inscritos Giovanna: " + devGiovanna.getConteudosinscritos());
            System.out.println("Conteudos Concluidos Giovanna: " + devGiovanna.getConteudosConluidos());
            System.out.println("XP: " + devGiovanna.calcularTotalXp());

            System.out.println("-------------");

            Dev devJeniffer = new Dev();
            devJeniffer.setNome("Jeniffer");
            devJeniffer.inscreverBootcamp(Bootcam);
            System.out.println("Conteudos Inscritos Jeniffer: " + devJeniffer.getConteudosinscritos());

            devJeniffer.progredir();
            System.out.println("-");

            System.out.println("Conteudos Inscritos Giovanna: " + devGiovanna.getConteudosinscritos());
            System.out.println("Conteudos Concluidos Jeniffer: " + devGiovanna.getConteudosConluidos());
            System.out.println("XP: " + devJeniffer.calcularTotalXp());


            }

    }
}
