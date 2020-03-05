// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The AutoHealTriggers model.
 */
@Fluent
public final class AutoHealTriggers {
    /*
     * A rule based on total requests.
     */
    @JsonProperty(value = "requests")
    private RequestsBasedTrigger requests;

    /*
     * A rule based on private bytes.
     */
    @JsonProperty(value = "privateBytesInKB")
    private Integer privateBytesInKB;

    /*
     * A rule based on status codes.
     */
    @JsonProperty(value = "statusCodes")
    private List<StatusCodesBasedTrigger> statusCodes;

    /*
     * A rule based on request execution time.
     */
    @JsonProperty(value = "slowRequests")
    private SlowRequestsBasedTrigger slowRequests;

    /**
     * Get the requests property: A rule based on total requests.
     * 
     * @return the requests value.
     */
    public RequestsBasedTrigger requests() {
        return this.requests;
    }

    /**
     * Set the requests property: A rule based on total requests.
     * 
     * @param requests the requests value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withRequests(RequestsBasedTrigger requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Get the privateBytesInKB property: A rule based on private bytes.
     * 
     * @return the privateBytesInKB value.
     */
    public Integer privateBytesInKB() {
        return this.privateBytesInKB;
    }

    /**
     * Set the privateBytesInKB property: A rule based on private bytes.
     * 
     * @param privateBytesInKB the privateBytesInKB value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withPrivateBytesInKB(Integer privateBytesInKB) {
        this.privateBytesInKB = privateBytesInKB;
        return this;
    }

    /**
     * Get the statusCodes property: A rule based on status codes.
     * 
     * @return the statusCodes value.
     */
    public List<StatusCodesBasedTrigger> statusCodes() {
        return this.statusCodes;
    }

    /**
     * Set the statusCodes property: A rule based on status codes.
     * 
     * @param statusCodes the statusCodes value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withStatusCodes(List<StatusCodesBasedTrigger> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    /**
     * Get the slowRequests property: A rule based on request execution time.
     * 
     * @return the slowRequests value.
     */
    public SlowRequestsBasedTrigger slowRequests() {
        return this.slowRequests;
    }

    /**
     * Set the slowRequests property: A rule based on request execution time.
     * 
     * @param slowRequests the slowRequests value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withSlowRequests(SlowRequestsBasedTrigger slowRequests) {
        this.slowRequests = slowRequests;
        return this;
    }
}
