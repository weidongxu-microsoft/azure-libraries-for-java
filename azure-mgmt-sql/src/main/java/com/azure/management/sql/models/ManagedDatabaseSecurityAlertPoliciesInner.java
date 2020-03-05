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
 * ManagedDatabaseSecurityAlertPolicies.
 */
public final class ManagedDatabaseSecurityAlertPoliciesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ManagedDatabaseSecurityAlertPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedDatabaseSecurityAlertPoliciesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ManagedDatabaseSecurityAlertPoliciesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ManagedDatabaseSecurityAlertPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientManagedDatabaseSecurityAlertPolicies to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientManagedDatabaseSecurityAlertPolicies")
    private interface ManagedDatabaseSecurityAlertPoliciesService {
        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedDatabaseSecurityAlertPolicyInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("securityAlertPolicyName") String securityAlertPolicyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedDatabaseSecurityAlertPolicyInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("securityAlertPolicyName") String securityAlertPolicyName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ManagedDatabaseSecurityAlertPolicyInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/securityAlertPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedDatabaseSecurityAlertPolicyListResultInner>> listByDatabase(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedDatabaseSecurityAlertPolicyListResultInner>> listByDatabaseNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a managed database's security alert policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedDatabaseSecurityAlertPolicyInner>> getWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        final String securityAlertPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, securityAlertPolicyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a managed database's security alert policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedDatabaseSecurityAlertPolicyInner> getAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, databaseName)
            .flatMap((SimpleResponse<ManagedDatabaseSecurityAlertPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a managed database's security alert policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedDatabaseSecurityAlertPolicyInner get(String resourceGroupName, String managedInstanceName, String databaseName) {
        return getAsync(resourceGroupName, managedInstanceName, databaseName).block();
    }

    /**
     * Creates or updates a database's security alert policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A managed database security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedDatabaseSecurityAlertPolicyInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedDatabaseSecurityAlertPolicyInner parameters) {
        final String securityAlertPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, securityAlertPolicyName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a database's security alert policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A managed database security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedDatabaseSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedDatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, parameters)
            .flatMap((SimpleResponse<ManagedDatabaseSecurityAlertPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a database's security alert policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A managed database security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedDatabaseSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String managedInstanceName, String databaseName, ManagedDatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, managedInstanceName, databaseName, parameters).block();
    }

    /**
     * Gets a list of managed database's security alert policies.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedDatabaseSecurityAlertPolicyInner>> listByDatabaseSinglePageAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByDatabase(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of managed database's security alert policies.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedDatabaseSecurityAlertPolicyInner> listByDatabaseAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of managed database's security alert policies.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedDatabaseSecurityAlertPolicyInner> listByDatabase(String resourceGroupName, String managedInstanceName, String databaseName) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedDatabaseSecurityAlertPolicyInner>> listByDatabaseNextSinglePageAsync(String nextLink) {
        return service.listByDatabaseNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
