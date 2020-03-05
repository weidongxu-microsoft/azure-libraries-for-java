// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ExportTemplateRequest model.
 */
@Fluent
public final class ExportTemplateRequest {
    /*
     * The IDs of the resources to filter the export by. To export all
     * resources, supply an array with single entry '*'.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /*
     * The export template options. A CSV-formatted list containing zero or
     * more of the following: 'IncludeParameterDefaultValue',
     * 'IncludeComments', 'SkipResourceNameParameterization',
     * 'SkipAllParameterization'
     */
    @JsonProperty(value = "options")
    private String options;

    /**
     * Get the resources property: The IDs of the resources to filter the
     * export by. To export all resources, supply an array with single entry
     * '*'.
     * 
     * @return the resources value.
     */
    public List<String> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The IDs of the resources to filter the
     * export by. To export all resources, supply an array with single entry
     * '*'.
     * 
     * @param resources the resources value to set.
     * @return the ExportTemplateRequest object itself.
     */
    public ExportTemplateRequest setResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the options property: The export template options. A CSV-formatted
     * list containing zero or more of the following:
     * 'IncludeParameterDefaultValue', 'IncludeComments',
     * 'SkipResourceNameParameterization', 'SkipAllParameterization'.
     * 
     * @return the options value.
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * Set the options property: The export template options. A CSV-formatted
     * list containing zero or more of the following:
     * 'IncludeParameterDefaultValue', 'IncludeComments',
     * 'SkipResourceNameParameterization', 'SkipAllParameterization'.
     * 
     * @param options the options value to set.
     * @return the ExportTemplateRequest object itself.
     */
    public ExportTemplateRequest setOptions(String options) {
        this.options = options;
        return this;
    }
}
