package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao curso Java");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp java");
        bootCamp.setDescricao("Descrição bootcamp java");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(mentoria);

        Dev matheus = new Dev();
        matheus.setNome("Matheus");

        matheus.inscreverBootCapmp(bootCamp);

        System.out.println("Conteudos inscritos" + matheus.getConteudosInscritos());

        matheus.progredir();
        matheus.progredir();

        System.out.println("Conteudos inscritos" + matheus.getConteudosInscritos());
        System.out.println("Conteudos conluidos" + matheus.getConteudosConcluidos());
        System.out.println("XP - " + matheus.calcularTotalXp());

    }
}
