// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The EffectiveNetworkSecurityGroup model.
 */
@Fluent
public final class EffectiveNetworkSecurityGroup {
    /*
     * The ID of network security group that is applied.
     */
    @JsonProperty(value = "networkSecurityGroup")
    private SubResource networkSecurityGroup;

    /*
     * Associated resources.
     */
    @JsonProperty(value = "association")
    private EffectiveNetworkSecurityGroupAssociation association;

    /*
     * A collection of effective security rules.
     */
    @JsonProperty(value = "effectiveSecurityRules")
    private List<EffectiveNetworkSecurityRule> effectiveSecurityRules;

    /*
     * Mapping of tags to list of IP Addresses included within the tag.
     */
    @JsonProperty(value = "tagMap")
    private String tagMap;

    /**
     * Get the networkSecurityGroup property: The ID of network security group
     * that is applied.
     * 
     * @return the networkSecurityGroup value.
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The ID of network security group
     * that is applied.
     * 
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the EffectiveNetworkSecurityGroup object itself.
     */
    public EffectiveNetworkSecurityGroup withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the association property: Associated resources.
     * 
     * @return the association value.
     */
    public EffectiveNetworkSecurityGroupAssociation association() {
        return this.association;
    }

    /**
     * Set the association property: Associated resources.
     * 
     * @param association the association value to set.
     * @return the EffectiveNetworkSecurityGroup object itself.
     */
    public EffectiveNetworkSecurityGroup withAssociation(EffectiveNetworkSecurityGroupAssociation association) {
        this.association = association;
        return this;
    }

    /**
     * Get the effectiveSecurityRules property: A collection of effective
     * security rules.
     * 
     * @return the effectiveSecurityRules value.
     */
    public List<EffectiveNetworkSecurityRule> effectiveSecurityRules() {
        return this.effectiveSecurityRules;
    }

    /**
     * Set the effectiveSecurityRules property: A collection of effective
     * security rules.
     * 
     * @param effectiveSecurityRules the effectiveSecurityRules value to set.
     * @return the EffectiveNetworkSecurityGroup object itself.
     */
    public EffectiveNetworkSecurityGroup withEffectiveSecurityRules(List<EffectiveNetworkSecurityRule> effectiveSecurityRules) {
        this.effectiveSecurityRules = effectiveSecurityRules;
        return this;
    }

    /**
     * Get the tagMap property: Mapping of tags to list of IP Addresses
     * included within the tag.
     * 
     * @return the tagMap value.
     */
    public String tagMap() {
        return this.tagMap;
    }

    /**
     * Set the tagMap property: Mapping of tags to list of IP Addresses
     * included within the tag.
     * 
     * @param tagMap the tagMap value to set.
     * @return the EffectiveNetworkSecurityGroup object itself.
     */
    public EffectiveNetworkSecurityGroup withTagMap(String tagMap) {
        this.tagMap = tagMap;
        return this;
    }
}
