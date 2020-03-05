// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.ErrorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceGroupExportResult model.
 */
@Fluent
public final class ResourceGroupExportResultInner {
    /*
     * The template content.
     */
    @JsonProperty(value = "template")
    private Object template;

    /*
     * The resource management error response.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get the template property: The template content.
     * 
     * @return the template value.
     */
    public Object getTemplate() {
        return this.template;
    }

    /**
     * Set the template property: The template content.
     * 
     * @param template the template value to set.
     * @return the ResourceGroupExportResultInner object itself.
     */
    public ResourceGroupExportResultInner setTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the error property: The resource management error response.
     * 
     * @return the error value.
     */
    public ErrorResponse getError() {
        return this.error;
    }

    /**
     * Set the error property: The resource management error response.
     * 
     * @param error the error value to set.
     * @return the ResourceGroupExportResultInner object itself.
     */
    public ResourceGroupExportResultInner setError(ErrorResponse error) {
        this.error = error;
        return this;
    }
}
