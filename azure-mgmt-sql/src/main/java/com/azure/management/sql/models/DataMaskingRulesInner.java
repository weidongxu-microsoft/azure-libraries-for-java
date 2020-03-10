// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * DataMaskingRules.
 */
public final class DataMaskingRulesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private DataMaskingRulesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of DataMaskingRulesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public DataMaskingRulesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(DataMaskingRulesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientDataMaskingRules to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientDataMaskingRules")
    private interface DataMaskingRulesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/dataMaskingPolicies/{dataMaskingPolicyName}/rules/{dataMaskingRuleName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DataMaskingRuleInner>> createOrUpdate(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("dataMaskingPolicyName") String dataMaskingPolicyName, @PathParam("dataMaskingRuleName") String dataMaskingRuleName, @BodyParam("application/json") DataMaskingRuleInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/dataMaskingPolicies/{dataMaskingPolicyName}/rules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DataMaskingRuleListResultInner>> listByDatabase(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("dataMaskingPolicyName") String dataMaskingPolicyName);
    }

    /**
     * Creates or updates a database data masking rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param dataMaskingRuleName 
     * @param parameters Represents a database data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DataMaskingRuleInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, String dataMaskingRuleName, DataMaskingRuleInner parameters) {
        final String apiVersion = "2014-04-01";
        final String dataMaskingPolicyName = "Default";
        return service.createOrUpdate(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, dataMaskingPolicyName, dataMaskingRuleName, parameters);
    }

    /**
     * Creates or updates a database data masking rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param dataMaskingRuleName 
     * @param parameters Represents a database data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataMaskingRuleInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, String dataMaskingRuleName, DataMaskingRuleInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, dataMaskingRuleName, parameters)
            .flatMap((SimpleResponse<DataMaskingRuleInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a database data masking rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param dataMaskingRuleName 
     * @param parameters Represents a database data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataMaskingRuleInner createOrUpdate(String resourceGroupName, String serverName, String databaseName, String dataMaskingRuleName, DataMaskingRuleInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, dataMaskingRuleName, parameters).block();
    }

    /**
     * Gets a list of database data masking rules.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DataMaskingRuleInner>> listByDatabaseSinglePageAsync(String resourceGroupName, String serverName, String databaseName) {
        final String apiVersion = "2014-04-01";
        final String dataMaskingPolicyName = "Default";
        return service.listByDatabase(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, dataMaskingPolicyName).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            null,
            null));
    }

    /**
     * Gets a list of database data masking rules.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DataMaskingRuleInner> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName));
    }

    /**
     * Gets a list of database data masking rules.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataMaskingRuleInner> listByDatabase(String resourceGroupName, String serverName, String databaseName) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName));
    }
}
