// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FunctionSecrets model.
 */
@JsonFlatten
@Fluent
public class FunctionSecretsInner extends ProxyOnlyResource {
    /*
     * Secret key.
     */
    @JsonProperty(value = "properties.key")
    private String key;

    /*
     * Trigger URL.
     */
    @JsonProperty(value = "properties.trigger_url")
    private String triggerUrl;

    /**
     * Get the key property: Secret key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Secret key.
     * 
     * @param key the key value to set.
     * @return the FunctionSecretsInner object itself.
     */
    public FunctionSecretsInner withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the triggerUrl property: Trigger URL.
     * 
     * @return the triggerUrl value.
     */
    public String triggerUrl() {
        return this.triggerUrl;
    }

    /**
     * Set the triggerUrl property: Trigger URL.
     * 
     * @param triggerUrl the triggerUrl value to set.
     * @return the FunctionSecretsInner object itself.
     */
    public FunctionSecretsInner withTriggerUrl(String triggerUrl) {
        this.triggerUrl = triggerUrl;
        return this;
    }
}
