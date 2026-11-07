package com.banking.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account information"
)
public class AccountDto {

    @NotNull(message = "AccountNumber can not be null")
    @Schema(
            description = "Account number of the Banking account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be a null or empty")
    @Schema(
            description = "Account type of the Banking account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be a null or empty")
    @Schema(
            description = "Banking branch address", example = "123 Main Street, New York"
    )
    private String branchAddress;

}
