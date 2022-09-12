package fordsoft.task.auth.dto;

import lombok.Data;

@Data
public class SubAccountRequest {
    private Boolean status;
    private String message;
    private SubAccount[] subAccounts;
    private Meta meta;
}
