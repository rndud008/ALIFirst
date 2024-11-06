package hello.aiofirst.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InquiryAnswerRequestDTO {
    private Long inquiryId;
    private Long inquiryAnswerId;
    private String adminContent;

}
