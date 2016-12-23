package enumerator;

public enum EnumTipoLogradouro {
	
			ALAMEDA	("ALM",	"alameda"),
			AVENIDA	("AVN",	"avenida"),
			BECO	("BEC",	"beco"),
			BOULEVARD("BLV","boulevard"),
			CAMINHO	("CAM",	"caminho"),
			CAIS	("CAS",	"cais"),
			CAMPO	("CMP",	"campo"),
			ESCADA	("ESC",	"escada"),
			ESTRADA	("ETR",	"estrada"),
			FAVELA	("FAV",	"favela"),
			FAZENDA	("FAZ",	"fazenda"),
			FLORESTA("FLT",	"floresta"),
			ILHA	("ILH",	"ilha"),
			JARDIM	("JRD",	"jardim"),
			LADEIRA	("LAD",	"ladeira"),
			LARGO	("LRG",	"largo"),
			LOTEAMENTO("LTM","loteamento"),
			LUGAR	("LUG",	"lugar"	),
			MORRO	("MRR",	"morro"	),
			PARQUE	("PQE",	"parque"),
			PASSEIO	("PAS",	"passeio"),
			PRAIA	("PRA",	"praia"	),
			PRACA	("PRC",	"praça"	),
			RECANTO	("REC",	"recanto"),
			RODOVIA	("ROD",	"rodovia"),
			RUA	("RUA",	"rua"),
			SERVIDAO("SRV",	"servidao"),
			TRAVESSA("TRV",	"travessa"),
			VIA	("VIA",	"via"),
			VILA("VIL",	"vila");

	private	String condigo;
	private	String descricao;
	
	public static String getByCodigo(String codigo){
		for (EnumTipoLogradouro tipo : EnumTipoLogradouro.values()) {
			if (tipo.condigo == codigo) {
				return tipo.getDescricao();
			}
		}
		return null;
	}
	private EnumTipoLogradouro(String condigo, String descricao) {
		this.condigo = condigo;
		this.descricao = descricao;
	}

	private EnumTipoLogradouro(String condigo) {
		this.condigo = condigo;
	}

	public String getCondigo() {
		return condigo;
	}

	public void setCondigo(String condigo) {
		this.condigo = condigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
