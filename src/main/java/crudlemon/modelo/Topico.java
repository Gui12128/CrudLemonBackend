package crudlemon.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

@Entity
public class Topico {


		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String titulo;
		private String mensagem;
		private LocalDateTime dataCriacao = LocalDateTime.now();
		@Enumerated(EnumType.STRING)
		private StatusTopico status = StatusTopico.NAO_RESPONDIDO;
		@ManyToOne
		private Usuario usuario;
		@ManyToOne
		@NotNull
		private Carro carro;
		@OneToMany(mappedBy = "topico")
		private List<Resposta> respostas = new ArrayList<>();
		
		public Topico() {
		}
		
		public Topico(String titulo, String mensagem, Carro carro, Usuario usuario) {
			this.titulo = titulo;
			this.mensagem = mensagem;
			this.carro = carro;
			this.usuario = usuario;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Topico other = (Topico) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

		public LocalDateTime getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(LocalDateTime dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public StatusTopico getStatus() {
			return status;
		}

		public void setStatus(StatusTopico status) {
			this.status = status;
		}

		
		
		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Carro getCarro() {
			return carro;
		}

		public void setCarro(Carro carro) {
			this.carro = carro;
		}

		public List<Resposta> getRespostas() {
			return respostas;
		}

		public void setRespostas(List<Resposta> respostas) {
			this.respostas = respostas;
		}

	}