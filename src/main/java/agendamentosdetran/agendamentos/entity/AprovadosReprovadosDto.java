package agendamentosdetran.agendamentos.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AprovadosReprovadosDto {

    private String resultado;
    private Long contagem;
    private BigDecimal porcentagem;

    public AprovadosReprovadosDto() {
        this.resultado = resultado;
        this.contagem = contagem;
        this.porcentagem=porcentagem;
    }
}
