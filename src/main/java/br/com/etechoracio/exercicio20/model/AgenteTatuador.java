package br.com.etechoracio.exercicio20.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.exercicio20.enums.StatusAgenteEnum;
import br.com.etechoracio.exercicio20.enums.TipoAgenteEnum;

@Table(name="TBL_AGENTE_AUTUADOR")
@Entity
public class AgenteTatuador {
	
	
	@Id
	@Column(name="ID_AGENTE")
	private Long id;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Column(name="TX_FONE")
	private String telefone;
	
	@Column(name="TP_AGENTE")
	@Enumerated(EnumType.STRING)
	private TipoAgenteEnum tipo;
	
	@Column(name="ST_AGENTE")
	@Enumerated(EnumType.STRING)
	private StatusAgenteEnum status;
}
