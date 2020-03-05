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
 * The AliasPathType model.
 */
@Fluent
public final class AliasPathType {
    /*
     * The path of an alias.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The API versions.
     */
    @JsonProperty(value = "apiVersions")
    private List<String> apiVersions;

    /**
     * Get the path property: The path of an alias.
     * 
     * @return the path value.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path property: The path of an alias.
     * 
     * @param path the path value to set.
     * @return the AliasPathType object itself.
     */
    public AliasPathType setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the apiVersions property: The API versions.
     * 
     * @return the apiVersions value.
     */
    public List<String> getApiVersions() {
        return this.apiVersions;
    }

    /**
     * Set the apiVersions property: The API versions.
     * 
     * @param apiVersions the apiVersions value to set.
     * @return the AliasPathType object itself.
     */
    public AliasPathType setApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }
}
