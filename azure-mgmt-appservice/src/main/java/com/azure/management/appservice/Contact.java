// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Contact model.
 */
@Fluent
public final class Contact {
    /*
     * Mailing address.
     */
    @JsonProperty(value = "addressMailing")
    private Address addressMailing;

    /*
     * Email address.
     */
    @JsonProperty(value = "email", required = true)
    private String email;

    /*
     * Fax number.
     */
    @JsonProperty(value = "fax")
    private String fax;

    /*
     * Job title.
     */
    @JsonProperty(value = "jobTitle")
    private String jobTitle;

    /*
     * First name.
     */
    @JsonProperty(value = "nameFirst", required = true)
    private String nameFirst;

    /*
     * Last name.
     */
    @JsonProperty(value = "nameLast", required = true)
    private String nameLast;

    /*
     * Middle name.
     */
    @JsonProperty(value = "nameMiddle")
    private String nameMiddle;

    /*
     * Organization contact belongs to.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * Phone number.
     */
    @JsonProperty(value = "phone", required = true)
    private String phone;

    /**
     * Get the addressMailing property: Mailing address.
     * 
     * @return the addressMailing value.
     */
    public Address addressMailing() {
        return this.addressMailing;
    }

    /**
     * Set the addressMailing property: Mailing address.
     * 
     * @param addressMailing the addressMailing value to set.
     * @return the Contact object itself.
     */
    public Contact withAddressMailing(Address addressMailing) {
        this.addressMailing = addressMailing;
        return this;
    }

    /**
     * Get the email property: Email address.
     * 
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email address.
     * 
     * @param email the email value to set.
     * @return the Contact object itself.
     */
    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the fax property: Fax number.
     * 
     * @return the fax value.
     */
    public String fax() {
        return this.fax;
    }

    /**
     * Set the fax property: Fax number.
     * 
     * @param fax the fax value to set.
     * @return the Contact object itself.
     */
    public Contact withFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Get the jobTitle property: Job title.
     * 
     * @return the jobTitle value.
     */
    public String jobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: Job title.
     * 
     * @param jobTitle the jobTitle value to set.
     * @return the Contact object itself.
     */
    public Contact withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the nameFirst property: First name.
     * 
     * @return the nameFirst value.
     */
    public String nameFirst() {
        return this.nameFirst;
    }

    /**
     * Set the nameFirst property: First name.
     * 
     * @param nameFirst the nameFirst value to set.
     * @return the Contact object itself.
     */
    public Contact withNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
        return this;
    }

    /**
     * Get the nameLast property: Last name.
     * 
     * @return the nameLast value.
     */
    public String nameLast() {
        return this.nameLast;
    }

    /**
     * Set the nameLast property: Last name.
     * 
     * @param nameLast the nameLast value to set.
     * @return the Contact object itself.
     */
    public Contact withNameLast(String nameLast) {
        this.nameLast = nameLast;
        return this;
    }

    /**
     * Get the nameMiddle property: Middle name.
     * 
     * @return the nameMiddle value.
     */
    public String nameMiddle() {
        return this.nameMiddle;
    }

    /**
     * Set the nameMiddle property: Middle name.
     * 
     * @param nameMiddle the nameMiddle value to set.
     * @return the Contact object itself.
     */
    public Contact withNameMiddle(String nameMiddle) {
        this.nameMiddle = nameMiddle;
        return this;
    }

    /**
     * Get the organization property: Organization contact belongs to.
     * 
     * @return the organization value.
     */
    public String organization() {
        return this.organization;
    }

    /**
     * Set the organization property: Organization contact belongs to.
     * 
     * @param organization the organization value to set.
     * @return the Contact object itself.
     */
    public Contact withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the phone property: Phone number.
     * 
     * @return the phone value.
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone property: Phone number.
     * 
     * @param phone the phone value to set.
     * @return the Contact object itself.
     */
    public Contact withPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
