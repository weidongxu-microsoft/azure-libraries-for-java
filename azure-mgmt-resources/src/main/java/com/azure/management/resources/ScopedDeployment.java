// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ScopedDeployment model.
 */
@Fluent
public final class ScopedDeployment {
    /*
     * The location to store the deployment data.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Deployment properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DeploymentProperties properties;

    /**
     * Get the location property: The location to store the deployment data.
     * 
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location to store the deployment data.
     * 
     * @param location the location value to set.
     * @return the ScopedDeployment object itself.
     */
    public ScopedDeployment setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: Deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the ScopedDeployment object itself.
     */
    public ScopedDeployment setProperties(DeploymentProperties properties) {
        this.properties = properties;
        return this;
    }
}
