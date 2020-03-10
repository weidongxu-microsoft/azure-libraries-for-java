// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AzureFirewallRCAction model.
 */
@Fluent
public final class AzureFirewallRCAction {
    /*
     * The type of action.
     */
    @JsonProperty(value = "type")
    private AzureFirewallRCActionType type;

    /**
     * Get the type property: The type of action.
     * 
     * @return the type value.
     */
    public AzureFirewallRCActionType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of action.
     * 
     * @param type the type value to set.
     * @return the AzureFirewallRCAction object itself.
     */
    public AzureFirewallRCAction withType(AzureFirewallRCActionType type) {
        this.type = type;
        return this;
    }
}