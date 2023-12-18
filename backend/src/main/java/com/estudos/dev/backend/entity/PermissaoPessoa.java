package com.estudos.dev.backend.entity;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "permissao_pessoa")
@Data
public class PermissaoPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idPessoa")
    @JsonIgnore
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "idPermissao")
    private Permissao permissao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

}