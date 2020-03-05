// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The VirtualMachineIdentity model.
 */
@Fluent
public final class VirtualMachineIdentity {
    /*
     * The principal id of virtual machine identity. This property will only be
     * provided for a system assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant id associated with the virtual machine. This property will
     * only be provided for a system assigned identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The type of identity used for the virtual machine. The type
     * 'SystemAssigned, UserAssigned' includes both an implicitly created
     * identity and a set of user assigned identities. The type 'None' will
     * remove any identities from the virtual machine.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /*
     * The list of user identities associated with the Virtual Machine. The
     * user identity dictionary key references will be ARM resource ids in the
     * form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, VirtualMachineIdentityUserAssignedIdentities> userAssignedIdentities;

    /**
     * Get the principalId property: The principal id of virtual machine
     * identity. This property will only be provided for a system assigned
     * identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id associated with the virtual
     * machine. This property will only be provided for a system assigned
     * identity.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of identity used for the virtual
     * machine. The type 'SystemAssigned, UserAssigned' includes both an
     * implicitly created identity and a set of user assigned identities. The
     * type 'None' will remove any identities from the virtual machine.
     * 
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the virtual
     * machine. The type 'SystemAssigned, UserAssigned' includes both an
     * implicitly created identity and a set of user assigned identities. The
     * type 'None' will remove any identities from the virtual machine.
     * 
     * @param type the type value to set.
     * @return the VirtualMachineIdentity object itself.
     */
    public VirtualMachineIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities
     * associated with the Virtual Machine. The user identity dictionary key
     * references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, VirtualMachineIdentityUserAssignedIdentities> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities
     * associated with the Virtual Machine. The user identity dictionary key
     * references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the VirtualMachineIdentity object itself.
     */
    public VirtualMachineIdentity withUserAssignedIdentities(Map<String, VirtualMachineIdentityUserAssignedIdentities> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }
}
