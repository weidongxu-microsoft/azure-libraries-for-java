// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BlobContainersLockImmutabilityPolicyHeaders model.
 */
@Fluent
public final class BlobContainersLockImmutabilityPolicyHeaders {
    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the BlobContainersLockImmutabilityPolicyHeaders object itself.
     */
    public BlobContainersLockImmutabilityPolicyHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }
}
