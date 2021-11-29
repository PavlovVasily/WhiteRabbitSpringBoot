package com.pavlov.core.dto;
import com.pavlov.core.model.RuWord;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private Long id;
    private EnWordDTO enWordDTO;
    private RuWordDTO ruWordDTO;
    private ImageDTO imageDTO;
    private Long rating;

}
