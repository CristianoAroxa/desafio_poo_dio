package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;

public class Devs {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Ste<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos);
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
       Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {

            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");

        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }


    public String getNome() {
        return nome;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Devs devs = (Devs) object;
        return java.util.Objects.equals(nome, devs.nome) && java.util.Objects.equals(conteudosInscritos, devs.conteudosInscritos) && java.util.Objects.equals(conteudosConcluidos, devs.conteudosConcluidos);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), nome, conteudosInscritos, conteudosConcluidos);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Ste<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Ste<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
