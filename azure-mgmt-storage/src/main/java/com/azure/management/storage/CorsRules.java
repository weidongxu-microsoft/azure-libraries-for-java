// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The CorsRules model.
 */
@Fluent
public final class CorsRules {
    /*
     * The List of CORS rules. You can include up to five CorsRule elements in
     * the request.
     */
    @JsonProperty(value = "corsRules")
    private List<CorsRule> corsRules;

    /**
     * Get the corsRules property: The List of CORS rules. You can include up
     * to five CorsRule elements in the request.
     * 
     * @return the corsRules value.
     */
    public List<CorsRule> getCorsRules() {
        return this.corsRules;
    }

    /**
     * Set the corsRules property: The List of CORS rules. You can include up
     * to five CorsRule elements in the request.
     * 
     * @param corsRules the corsRules value to set.
     * @return the CorsRules object itself.
     */
    public CorsRules setCorsRules(List<CorsRule> corsRules) {
        this.corsRules = corsRules;
        return this;
    }
}
