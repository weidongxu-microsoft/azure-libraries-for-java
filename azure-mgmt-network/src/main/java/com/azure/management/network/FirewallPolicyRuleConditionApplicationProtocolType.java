// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for FirewallPolicyRuleConditionApplicationProtocolType.
 */
public final class FirewallPolicyRuleConditionApplicationProtocolType extends ExpandableStringEnum<FirewallPolicyRuleConditionApplicationProtocolType> {
    /**
     * Static value Http for FirewallPolicyRuleConditionApplicationProtocolType.
     */
    public static final FirewallPolicyRuleConditionApplicationProtocolType HTTP = fromString("Http");

    /**
     * Static value Https for FirewallPolicyRuleConditionApplicationProtocolType.
     */
    public static final FirewallPolicyRuleConditionApplicationProtocolType HTTPS = fromString("Https");

    /**
     * Creates or finds a FirewallPolicyRuleConditionApplicationProtocolType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyRuleConditionApplicationProtocolType.
     */
    @JsonCreator
    public static FirewallPolicyRuleConditionApplicationProtocolType fromString(String name) {
        return fromString(name, FirewallPolicyRuleConditionApplicationProtocolType.class);
    }

    /**
     * @return known FirewallPolicyRuleConditionApplicationProtocolType values.
     */
    public static Collection<FirewallPolicyRuleConditionApplicationProtocolType> values() {
        return values(FirewallPolicyRuleConditionApplicationProtocolType.class);
    }
}
