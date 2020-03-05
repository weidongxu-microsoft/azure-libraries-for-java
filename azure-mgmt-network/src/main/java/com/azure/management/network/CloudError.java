// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudError model.
 */
@Fluent
public final class CloudError {
    /*
     * An error response from the Batch service.
     */
    @JsonProperty(value = "error")
    private CloudErrorBody error;

    /**
     * Get the error property: An error response from the Batch service.
     * 
     * @return the error value.
     */
    public CloudErrorBody error() {
        return this.error;
    }

    /**
     * Set the error property: An error response from the Batch service.
     * 
     * @param error the error value to set.
     * @return the CloudError object itself.
     */
    public CloudError withError(CloudErrorBody error) {
        this.error = error;
        return this;
    }
}
