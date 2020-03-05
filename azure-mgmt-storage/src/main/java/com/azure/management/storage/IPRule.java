// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IPRule model.
 */
@Fluent
public final class IPRule {
    /*
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is
     * allowed.
     */
    @JsonProperty(value = "value", required = true)
    private String iPAddressOrRange;

    /*
     * The action of virtual network rule.
     */
    @JsonProperty(value = "action")
    private String action;

    /**
     * Creates an instance of IPRule class.
     */
    public IPRule() {
        action = "Allow";
    }

    /**
     * Get the iPAddressOrRange property: Specifies the IP or IP range in CIDR
     * format. Only IPV4 address is allowed.
     * 
     * @return the iPAddressOrRange value.
     */
    public String getIPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    /**
     * Set the iPAddressOrRange property: Specifies the IP or IP range in CIDR
     * format. Only IPV4 address is allowed.
     * 
     * @param iPAddressOrRange the iPAddressOrRange value to set.
     * @return the IPRule object itself.
     */
    public IPRule setIPAddressOrRange(String iPAddressOrRange) {
        this.iPAddressOrRange = iPAddressOrRange;
        return this;
    }

    /**
     * Get the action property: The action of virtual network rule.
     * 
     * @return the action value.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action of virtual network rule.
     * 
     * @param action the action value to set.
     * @return the IPRule object itself.
     */
    public IPRule setAction(String action) {
        this.action = action;
        return this;
    }
}
