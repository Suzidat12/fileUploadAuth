package fordsoft.task.auth.dto;

import lombok.Data;

@Data
public class SubAccount {
    private Float integration;
    private String domain;
    private String subaccount_code;
    private String business_name;
    private String description;
    private String primary_contact_name;
    private String primary_contact_email;
    private String primary_contact_phone;
    private String metadata;
    private String percentage_charge;
    private Boolean is_verified;
    private String settlement_bank;
    private String account_number;
    private Boolean active;
    private Boolean migrate;
    private String id;
    private String createdAt;
    private String updatedAt;


}
