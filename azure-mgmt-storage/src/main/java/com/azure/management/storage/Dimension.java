// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Dimension model.
 */
@Fluent
public final class Dimension {
    /*
     * Display name of dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the name property: Display name of dimension.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Display name of dimension.
     * 
     * @param name the name value to set.
     * @return the Dimension object itself.
     */
    public Dimension setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of dimension.
     * 
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of dimension.
     * 
     * @param displayName the displayName value to set.
     * @return the Dimension object itself.
     */
    public Dimension setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
