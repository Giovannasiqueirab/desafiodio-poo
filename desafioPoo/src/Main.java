import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        
            System.out.println(curso1);
            System.out.println(curso2);

    }
}