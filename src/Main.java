import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");;
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devYuri = new Dev();
		devYuri.setNome("Yuri");
		devYuri.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Yuri" + devYuri.getConteudoInscrito());
		devYuri.progredir();
		devYuri.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Yuri" + devYuri.getConteudoInscrito());
		System.out.println("Conteúdos Concluidos Yuri" + devYuri.getConteudoConcluido());
		System.out.println("XP:" + devYuri.calcularTotalXp());
		
		System.out.println("--------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscrito());
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscrito());
		System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudoConcluido());
		System.out.println("XP:" + devCamila.calcularTotalXp());

	}

}
