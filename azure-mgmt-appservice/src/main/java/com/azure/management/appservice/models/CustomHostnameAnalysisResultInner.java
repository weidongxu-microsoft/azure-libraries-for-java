// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.DnsVerificationTestResult;
import com.azure.management.appservice.ErrorEntity;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The CustomHostnameAnalysisResult model.
 */
@JsonFlatten
@Fluent
public class CustomHostnameAnalysisResultInner extends ProxyOnlyResource {
    /*
     * <code>true</code> if hostname is already verified; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.isHostnameAlreadyVerified", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isHostnameAlreadyVerified;

    /*
     * DNS verification test result.
     */
    @JsonProperty(value = "properties.customDomainVerificationTest", access = JsonProperty.Access.WRITE_ONLY)
    private DnsVerificationTestResult customDomainVerificationTest;

    /*
     * Body of the error response returned from the API.
     */
    @JsonProperty(value = "properties.customDomainVerificationFailureInfo", access = JsonProperty.Access.WRITE_ONLY)
    private ErrorEntity customDomainVerificationFailureInfo;

    /*
     * <code>true</code> if there is a conflict on a scale unit; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.hasConflictOnScaleUnit", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasConflictOnScaleUnit;

    /*
     * <code>true</code> if there is a conflict across subscriptions;
     * otherwise, <code>false</code>.
     */
    @JsonProperty(value = "properties.hasConflictAcrossSubscription", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasConflictAcrossSubscription;

    /*
     * Name of the conflicting app on scale unit if it's within the same
     * subscription.
     */
    @JsonProperty(value = "properties.conflictingAppResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String conflictingAppResourceId;

    /*
     * CName records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.cNameRecords")
    private List<String> cNameRecords;

    /*
     * TXT records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.txtRecords")
    private List<String> txtRecords;

    /*
     * A records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.aRecords")
    private List<String> aRecords;

    /*
     * Alternate CName records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.alternateCNameRecords")
    private List<String> alternateCNameRecords;

    /*
     * Alternate TXT records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.alternateTxtRecords")
    private List<String> alternateTxtRecords;

    /**
     * Get the isHostnameAlreadyVerified property:
     * &lt;code&gt;true&lt;/code&gt; if hostname is already verified;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isHostnameAlreadyVerified value.
     */
    public Boolean isHostnameAlreadyVerified() {
        return this.isHostnameAlreadyVerified;
    }

    /**
     * Get the customDomainVerificationTest property: DNS verification test
     * result.
     * 
     * @return the customDomainVerificationTest value.
     */
    public DnsVerificationTestResult customDomainVerificationTest() {
        return this.customDomainVerificationTest;
    }

    /**
     * Get the customDomainVerificationFailureInfo property: Body of the error
     * response returned from the API.
     * 
     * @return the customDomainVerificationFailureInfo value.
     */
    public ErrorEntity customDomainVerificationFailureInfo() {
        return this.customDomainVerificationFailureInfo;
    }

    /**
     * Get the hasConflictOnScaleUnit property: &lt;code&gt;true&lt;/code&gt;
     * if there is a conflict on a scale unit; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the hasConflictOnScaleUnit value.
     */
    public Boolean hasConflictOnScaleUnit() {
        return this.hasConflictOnScaleUnit;
    }

    /**
     * Get the hasConflictAcrossSubscription property:
     * &lt;code&gt;true&lt;/code&gt; if there is a conflict across
     * subscriptions; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the hasConflictAcrossSubscription value.
     */
    public Boolean hasConflictAcrossSubscription() {
        return this.hasConflictAcrossSubscription;
    }

    /**
     * Get the conflictingAppResourceId property: Name of the conflicting app
     * on scale unit if it's within the same subscription.
     * 
     * @return the conflictingAppResourceId value.
     */
    public String conflictingAppResourceId() {
        return this.conflictingAppResourceId;
    }

    /**
     * Get the cNameRecords property: CName records controller can see for this
     * hostname.
     * 
     * @return the cNameRecords value.
     */
    public List<String> cNameRecords() {
        return this.cNameRecords;
    }

    /**
     * Set the cNameRecords property: CName records controller can see for this
     * hostname.
     * 
     * @param cNameRecords the cNameRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withCNameRecords(List<String> cNameRecords) {
        this.cNameRecords = cNameRecords;
        return this;
    }

    /**
     * Get the txtRecords property: TXT records controller can see for this
     * hostname.
     * 
     * @return the txtRecords value.
     */
    public List<String> txtRecords() {
        return this.txtRecords;
    }

    /**
     * Set the txtRecords property: TXT records controller can see for this
     * hostname.
     * 
     * @param txtRecords the txtRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withTxtRecords(List<String> txtRecords) {
        this.txtRecords = txtRecords;
        return this;
    }

    /**
     * Get the aRecords property: A records controller can see for this
     * hostname.
     * 
     * @return the aRecords value.
     */
    public List<String> aRecords() {
        return this.aRecords;
    }

    /**
     * Set the aRecords property: A records controller can see for this
     * hostname.
     * 
     * @param aRecords the aRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withARecords(List<String> aRecords) {
        this.aRecords = aRecords;
        return this;
    }

    /**
     * Get the alternateCNameRecords property: Alternate CName records
     * controller can see for this hostname.
     * 
     * @return the alternateCNameRecords value.
     */
    public List<String> alternateCNameRecords() {
        return this.alternateCNameRecords;
    }

    /**
     * Set the alternateCNameRecords property: Alternate CName records
     * controller can see for this hostname.
     * 
     * @param alternateCNameRecords the alternateCNameRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withAlternateCNameRecords(List<String> alternateCNameRecords) {
        this.alternateCNameRecords = alternateCNameRecords;
        return this;
    }

    /**
     * Get the alternateTxtRecords property: Alternate TXT records controller
     * can see for this hostname.
     * 
     * @return the alternateTxtRecords value.
     */
    public List<String> alternateTxtRecords() {
        return this.alternateTxtRecords;
    }

    /**
     * Set the alternateTxtRecords property: Alternate TXT records controller
     * can see for this hostname.
     * 
     * @param alternateTxtRecords the alternateTxtRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withAlternateTxtRecords(List<String> alternateTxtRecords) {
        this.alternateTxtRecords = alternateTxtRecords;
        return this;
    }
}
