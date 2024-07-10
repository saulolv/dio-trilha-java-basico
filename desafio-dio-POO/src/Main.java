import br.edu.dio.desafio.dominio.BootCamp;
import br.edu.dio.desafio.dominio.Curso;
import br.edu.dio.desafio.dominio.Mentoria;
import br.edu.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BootCamp bootcamp = new BootCamp("Bootcamp Java Developer", "Bootcamp para formação de desenvolvedores Java");

        Curso curso1 = new Curso("Java Básico");
        curso1.setDescricao("Curso de Java básico para iniciantes");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso("Java Intermediário");
        curso2.setDescricao("Curso de Java intermediário para iniciantes");
        curso2.setCargaHoraria(40);

        Curso curso3 = new Curso("Java Avançado");
        curso3.setDescricao("Curso de Java avançado para iniciantes");
        curso3.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria("Java Avançado");
        mentoria.setDescricao("Mentoria de Java avançado");
        mentoria.setData(LocalDate.now());

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev("João");
        devJose.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: ");
        devJose.getConteudosInscritos().forEach(System.out::println);

        System.out.println("Conteúdos concluídos: ");
        devJose.progredir();
        devJose.progredir();
        System.out.println("Conteúdos concluídos: " + devJose.getConteudosConcluidos());

        System.out.println("XP total: " + devJose.calcularTotalXp());
    }
}
