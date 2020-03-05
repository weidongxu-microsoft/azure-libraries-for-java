// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The SubnetListResult model.
 */
@Fluent
public final class SubnetListResultInner {
    /*
     * The subnets in a virtual network.
     */
    @JsonProperty(value = "value")
    private List<SubnetInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The subnets in a virtual network.
     * 
     * @return the value value.
     */
    public List<SubnetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The subnets in a virtual network.
     * 
     * @param value the value value to set.
     * @return the SubnetListResultInner object itself.
     */
    public SubnetListResultInner withValue(List<SubnetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SubnetListResultInner object itself.
     */
    public SubnetListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
