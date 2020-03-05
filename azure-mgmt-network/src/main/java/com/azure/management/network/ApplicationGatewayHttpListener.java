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
 * The ApplicationGatewayHttpListener model.
 */
@JsonFlatten
@Fluent
public class ApplicationGatewayHttpListener extends SubResource {
    /*
     * Name of the HTTP listener that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Frontend IP configuration resource of an application gateway.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /*
     * Frontend port resource of an application gateway.
     */
    @JsonProperty(value = "properties.frontendPort")
    private SubResource frontendPort;

    /*
     * Protocol of the HTTP listener.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Host name of HTTP listener.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostName;

    /*
     * SSL certificate resource of an application gateway.
     */
    @JsonProperty(value = "properties.sslCertificate")
    private SubResource sslCertificate;

    /*
     * Applicable only if protocol is https. Enables SNI for multi-hosting.
     */
    @JsonProperty(value = "properties.requireServerNameIndication")
    private Boolean requireServerNameIndication;

    /*
     * Provisioning state of the HTTP listener resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Custom error configurations of the HTTP listener.
     */
    @JsonProperty(value = "properties.customErrorConfigurations")
    private List<ApplicationGatewayCustomError> customErrorConfigurations;

    /**
     * Get the name property: Name of the HTTP listener that is unique within
     * an Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the HTTP listener that is unique within
     * an Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withName(String name) {
        this.name = name;
        return this;
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
     * Set the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     * 
     * @param type the type value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the frontendIPConfiguration property: Frontend IP configuration
     * resource of an application gateway.
     * 
     * @return the frontendIPConfiguration value.
     */
    public SubResource frontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set the frontendIPConfiguration property: Frontend IP configuration
     * resource of an application gateway.
     * 
     * @param frontendIPConfiguration the frontendIPConfiguration value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
        return this;
    }

    /**
     * Get the frontendPort property: Frontend port resource of an application
     * gateway.
     * 
     * @return the frontendPort value.
     */
    public SubResource frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: Frontend port resource of an application
     * gateway.
     * 
     * @param frontendPort the frontendPort value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withFrontendPort(SubResource frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the protocol property: Protocol of the HTTP listener.
     * 
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol of the HTTP listener.
     * 
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the hostName property: Host name of HTTP listener.
     * 
     * @return the hostName value.
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set the hostName property: Host name of HTTP listener.
     * 
     * @param hostName the hostName value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the sslCertificate property: SSL certificate resource of an
     * application gateway.
     * 
     * @return the sslCertificate value.
     */
    public SubResource sslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set the sslCertificate property: SSL certificate resource of an
     * application gateway.
     * 
     * @param sslCertificate the sslCertificate value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withSslCertificate(SubResource sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * Get the requireServerNameIndication property: Applicable only if
     * protocol is https. Enables SNI for multi-hosting.
     * 
     * @return the requireServerNameIndication value.
     */
    public Boolean requireServerNameIndication() {
        return this.requireServerNameIndication;
    }

    /**
     * Set the requireServerNameIndication property: Applicable only if
     * protocol is https. Enables SNI for multi-hosting.
     * 
     * @param requireServerNameIndication the requireServerNameIndication value
     * to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withRequireServerNameIndication(Boolean requireServerNameIndication) {
        this.requireServerNameIndication = requireServerNameIndication;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the HTTP
     * listener resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the HTTP
     * listener resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the customErrorConfigurations property: Custom error configurations
     * of the HTTP listener.
     * 
     * @return the customErrorConfigurations value.
     */
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.customErrorConfigurations;
    }

    /**
     * Set the customErrorConfigurations property: Custom error configurations
     * of the HTTP listener.
     * 
     * @param customErrorConfigurations the customErrorConfigurations value to
     * set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withCustomErrorConfigurations(List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.customErrorConfigurations = customErrorConfigurations;
        return this;
    }
}
