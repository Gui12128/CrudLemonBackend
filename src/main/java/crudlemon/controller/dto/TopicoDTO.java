package crudlemon.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import crudlemon.modelo.Topico;

public class TopicoDTO {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String marcaCarro;
	
	public TopicoDTO(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
		this.marcaCarro = topico.getCarro().getMarca();
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getMarcaCarro() {
		return marcaCarro;
	}

	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static Page<TopicoDTO> converter(Page<Topico> topicos) {
		return topicos.map(TopicoDTO::new);
	}
	
}