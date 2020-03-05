// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.management.network.VirtualNetworkUsageName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VirtualNetworkUsage model.
 */
@Immutable
public final class VirtualNetworkUsageInner {
    /*
     * Indicates number of IPs used from the Subnet.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Double currentValue;

    /*
     * Subnet identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Indicates the size of the subnet.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Double limit;

    /*
     * The name containing common and localized value for usage.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkUsageName name;

    /*
     * Usage units. Returns 'Count'.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * Get the currentValue property: Indicates number of IPs used from the
     * Subnet.
     * 
     * @return the currentValue value.
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Get the id property: Subnet identifier.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the limit property: Indicates the size of the subnet.
     * 
     * @return the limit value.
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Get the name property: The name containing common and localized value
     * for usage.
     * 
     * @return the name value.
     */
    public VirtualNetworkUsageName name() {
        return this.name;
    }

    /**
     * Get the unit property: Usage units. Returns 'Count'.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }
}
