// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PrivateLinkServiceConnection model.
 */
@JsonFlatten
@Fluent
public class PrivateLinkServiceConnection extends SubResource {
    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The provisioning state of the private link service connection.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The resource id of private link service.
     */
    @JsonProperty(value = "properties.privateLinkServiceId")
    private String privateLinkServiceId;

    /*
     * The ID(s) of the group(s) obtained from the remote resource that this
     * private endpoint should connect to.
     */
    @JsonProperty(value = "properties.groupIds")
    private List<String> groupIds;

    /*
     * A message passed to the owner of the remote resource with this
     * connection request. Restricted to 140 chars.
     */
    @JsonProperty(value = "properties.requestMessage")
    private String requestMessage;

    /*
     * A collection of read-only information about the state of the connection
     * to the remote resource.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * Get the name property: The name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * private link service connection.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the
     * private link service connection.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the privateLinkServiceId property: The resource id of private link
     * service.
     * 
     * @return the privateLinkServiceId value.
     */
    public String privateLinkServiceId() {
        return this.privateLinkServiceId;
    }

    /**
     * Set the privateLinkServiceId property: The resource id of private link
     * service.
     * 
     * @param privateLinkServiceId the privateLinkServiceId value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withPrivateLinkServiceId(String privateLinkServiceId) {
        this.privateLinkServiceId = privateLinkServiceId;
        return this;
    }

    /**
     * Get the groupIds property: The ID(s) of the group(s) obtained from the
     * remote resource that this private endpoint should connect to.
     * 
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the groupIds property: The ID(s) of the group(s) obtained from the
     * remote resource that this private endpoint should connect to.
     * 
     * @param groupIds the groupIds value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    /**
     * Get the requestMessage property: A message passed to the owner of the
     * remote resource with this connection request. Restricted to 140 chars.
     * 
     * @return the requestMessage value.
     */
    public String requestMessage() {
        return this.requestMessage;
    }

    /**
     * Set the requestMessage property: A message passed to the owner of the
     * remote resource with this connection request. Restricted to 140 chars.
     * 
     * @param requestMessage the requestMessage value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of
     * read-only information about the state of the connection to the remote
     * resource.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of
     * read-only information about the state of the connection to the remote
     * resource.
     * 
     * @param privateLinkServiceConnectionState the
     * privateLinkServiceConnectionState value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }
}
