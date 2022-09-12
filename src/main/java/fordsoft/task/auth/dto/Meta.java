package fordsoft.task.auth.dto;

import lombok.Data;

@Data
public class Meta {
    private Float total;
    private Float skipped;
    private String perPage;
    private Float page;
    private Float pageCount;
}
