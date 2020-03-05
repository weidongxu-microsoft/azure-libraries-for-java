// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.network.PrivateLinkServicePropertiesAutoApproval;
import com.azure.management.network.PrivateLinkServicePropertiesVisibility;
import com.azure.management.network.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PrivateLinkService model.
 */
@JsonFlatten
@Fluent
public class PrivateLinkServiceInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * An array of references to the load balancer IP configurations.
     */
    @JsonProperty(value = "properties.loadBalancerFrontendIpConfigurations")
    private List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations;

    /*
     * An array of references to the private link service IP configuration.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<PrivateLinkServiceIpConfigurationInner> ipConfigurations;

    /*
     * Gets an array of references to the network interfaces created for this
     * private link service.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> networkInterfaces;

    /*
     * The provisioning state of the private link service.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /*
     * An array of list about connections to the private endpoint.
     */
    @JsonProperty(value = "properties.privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The visibility list of the private link service.
     */
    @JsonProperty(value = "properties.visibility")
    private PrivateLinkServicePropertiesVisibility visibility;

    /*
     * The auto-approval list of the private link service.
     */
    @JsonProperty(value = "properties.autoApproval")
    private PrivateLinkServicePropertiesAutoApproval autoApproval;

    /*
     * The list of Fqdn.
     */
    @JsonProperty(value = "properties.fqdns")
    private List<String> fqdns;

    /*
     * The alias of the private link service.
     */
    @JsonProperty(value = "properties.alias", access = JsonProperty.Access.WRITE_ONLY)
    private String alias;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

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
     * Set the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the loadBalancerFrontendIpConfigurations property: An array of
     * references to the load balancer IP configurations.
     * 
     * @return the loadBalancerFrontendIpConfigurations value.
     */
    public List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations() {
        return this.loadBalancerFrontendIpConfigurations;
    }

    /**
     * Set the loadBalancerFrontendIpConfigurations property: An array of
     * references to the load balancer IP configurations.
     * 
     * @param loadBalancerFrontendIpConfigurations the
     * loadBalancerFrontendIpConfigurations value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withLoadBalancerFrontendIpConfigurations(List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations) {
        this.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
        return this;
    }

    /**
     * Get the ipConfigurations property: An array of references to the private
     * link service IP configuration.
     * 
     * @return the ipConfigurations value.
     */
    public List<PrivateLinkServiceIpConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: An array of references to the private
     * link service IP configuration.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withIpConfigurations(List<PrivateLinkServiceIpConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the networkInterfaces property: Gets an array of references to the
     * network interfaces created for this private link service.
     * 
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * private link service.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the
     * private link service.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: An array of list about
     * connections to the private endpoint.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: An array of list about
     * connections to the private endpoint.
     * 
     * @param privateEndpointConnections the privateEndpointConnections value
     * to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the visibility property: The visibility list of the private link
     * service.
     * 
     * @return the visibility value.
     */
    public PrivateLinkServicePropertiesVisibility visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: The visibility list of the private link
     * service.
     * 
     * @param visibility the visibility value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withVisibility(PrivateLinkServicePropertiesVisibility visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the autoApproval property: The auto-approval list of the private
     * link service.
     * 
     * @return the autoApproval value.
     */
    public PrivateLinkServicePropertiesAutoApproval autoApproval() {
        return this.autoApproval;
    }

    /**
     * Set the autoApproval property: The auto-approval list of the private
     * link service.
     * 
     * @param autoApproval the autoApproval value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval) {
        this.autoApproval = autoApproval;
        return this;
    }

    /**
     * Get the fqdns property: The list of Fqdn.
     * 
     * @return the fqdns value.
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * Set the fqdns property: The list of Fqdn.
     * 
     * @param fqdns the fqdns value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withFqdns(List<String> fqdns) {
        this.fqdns = fqdns;
        return this;
    }

    /**
     * Get the alias property: The alias of the private link service.
     * 
     * @return the alias value.
     */
    public String alias() {
        return this.alias;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withId(String id) {
        this.id = id;
        return this;
    }
}
