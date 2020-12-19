package br.edu.ifpb.gugawag.social.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String imagem;

    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public String getImagem(){
        return imagem;
    }
    public void setImagem(String imagem){
        this.imagem = imagem;
    }
}
