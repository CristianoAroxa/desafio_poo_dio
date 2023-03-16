package br.com.dio.desafio.dominio;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Devs> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Devs> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Devs> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Bootcamp bootcamp = (Bootcamp) object;
        return java.util.Objects.equals(nome, bootcamp.nome) && java.util.Objects.equals(descricao, bootcamp.descricao) && java.util.Objects.equals(dataInicial, bootcamp.dataInicial) && java.util.Objects.equals(dataFinal, bootcamp.dataFinal) && java.util.Objects.equals(devsInscritos, bootcamp.devsInscritos) && java.util.Objects.equals(conteudosInscritos, bootcamp.conteudosInscritos);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), nome, descricao, dataInicial, dataFinal, devsInscritos, conteudosInscritos);
    }
}
