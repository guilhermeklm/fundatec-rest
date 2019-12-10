package br.com.fundatec.carro.api.dto;

import java.time.LocalDate;

public class CarroOutputDTO {

    private Long id;
    private String nome;
    private String placa;
    private LocalDate dataFabricacao;
    private LocalDate dataModelo;
    private String marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataModelo() {
        return dataModelo;
    }

    public void setDataModelo(LocalDate dataModelo) {
        this.dataModelo = dataModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}