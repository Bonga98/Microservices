package com.banking.accounts.service;

import com.banking.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * Creates a new customer and an associated account.
     *
     * @param customerDto - CustomerDto object holding the customer details
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetches customer and account details for a given mobile number.
     *
     * @param mobileNumber - input mobile number
     * @return the customer details, including the associated account
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Updates customer and account details.
     *
     * @param customerDto - CustomerDto object holding the updated details
     * @return true if the update succeeded, false otherwise
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Deletes the customer and the associated account for a given mobile number.
     *
     * @param mobileNumber - input mobile number
     * @return true if the delete succeeded, false otherwise
     */
    boolean deleteAccount(String mobileNumber);

}
