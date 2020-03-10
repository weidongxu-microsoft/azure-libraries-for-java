// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Snapshot model.
 */
@JsonFlatten
@Immutable
public class SnapshotInner extends ProxyOnlyResource {
    /*
     * The time the snapshot was taken.
     */
    @JsonProperty(value = "properties.time", access = JsonProperty.Access.WRITE_ONLY)
    private String time;

    /**
     * Get the time property: The time the snapshot was taken.
     * 
     * @return the time value.
     */
    public String time() {
        return this.time;
    }
}