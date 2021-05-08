package agendamento.domain;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private Long id;
    private String nome;
    private String cpf;
}
