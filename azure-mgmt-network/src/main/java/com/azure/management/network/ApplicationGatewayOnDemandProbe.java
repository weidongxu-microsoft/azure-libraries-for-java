// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ApplicationGatewayOnDemandProbe model.
 */
@Fluent
public final class ApplicationGatewayOnDemandProbe {
    /*
     * The protocol used for the probe.
     */
    @JsonProperty(value = "protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Host name to send the probe to.
     */
    @JsonProperty(value = "host")
    private String host;

    /*
     * Relative path of probe. Valid path starts from '/'. Probe is sent to
     * <Protocol>://<host>:<port><path>.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The probe timeout in seconds. Probe marked as failed if valid response
     * is not received with this timeout period. Acceptable values are from 1
     * second to 86400 seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /*
     * Whether the host header should be picked from the backend http settings.
     * Default value is false.
     */
    @JsonProperty(value = "pickHostNameFromBackendHttpSettings")
    private Boolean pickHostNameFromBackendHttpSettings;

    /*
     * Criterion for classifying a healthy probe response.
     */
    @JsonProperty(value = "match")
    private ApplicationGatewayProbeHealthResponseMatch match;

    /*
     * Reference of backend pool of application gateway to which probe request
     * will be sent.
     */
    @JsonProperty(value = "backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * Reference of backend http setting of application gateway to be used for
     * test probe.
     */
    @JsonProperty(value = "backendHttpSettings")
    private SubResource backendHttpSettings;

    /**
     * Get the protocol property: The protocol used for the probe.
     * 
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol used for the probe.
     * 
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the host property: Host name to send the probe to.
     * 
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: Host name to send the probe to.
     * 
     * @param host the host value to set.
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the path property: Relative path of probe. Valid path starts from
     * '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Relative path of probe. Valid path starts from
     * '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     * 
     * @param path the path value to set.
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the timeout property: The probe timeout in seconds. Probe marked as
     * failed if valid response is not received with this timeout period.
     * Acceptable values are from 1 second to 86400 seconds.
     * 
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The probe timeout in seconds. Probe marked as
     * failed if valid response is not received with this timeout period.
     * Acceptable values are from 1 second to 86400 seconds.
     * 
     * @param timeout the timeout value to set.
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the pickHostNameFromBackendHttpSettings property: Whether the host
     * header should be picked from the backend http settings. Default value is
     * false.
     * 
     * @return the pickHostNameFromBackendHttpSettings value.
     */
    public Boolean pickHostNameFromBackendHttpSettings() {
        return this.pickHostNameFromBackendHttpSettings;
    }

    /**
     * Set the pickHostNameFromBackendHttpSettings property: Whether the host
     * header should be picked from the backend http settings. Default value is
     * false.
     * 
     * @param pickHostNameFromBackendHttpSettings the
     * pickHostNameFromBackendHttpSettings value to set.
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withPickHostNameFromBackendHttpSettings(Boolean pickHostNameFromBackendHttpSettings) {
        this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
        return this;
    }

    /**
     * Get the match property: Criterion for classifying a healthy probe
     * response.
     * 
     * @return the match value.
     */
    public ApplicationGatewayProbeHealthResponseMatch match() {
        return this.match;
    }

    /**
     * Set the match property: Criterion for classifying a healthy probe
     * response.
     * 
     * @param match the match value to set.
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withMatch(ApplicationGatewayProbeHealthResponseMatch match) {
        this.match = match;
        return this;
    }

    /**
     * Get the backendAddressPool property: Reference of backend pool of
     * application gateway to which probe request will be sent.
     * 
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Reference of backend pool of
     * application gateway to which probe request will be sent.
     * 
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettings property: Reference of backend http setting
     * of application gateway to be used for test probe.
     * 
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings property: Reference of backend http setting
     * of application gateway to be used for test probe.
     * 
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }
}