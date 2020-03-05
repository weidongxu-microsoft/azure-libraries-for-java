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
import com.azure.management.sql.GeoBackupPolicyState;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * GeoBackupPolicies.
 */
public final class GeoBackupPoliciesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private GeoBackupPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of GeoBackupPoliciesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public GeoBackupPoliciesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(GeoBackupPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientGeoBackupPolicies to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientGeoBackupPolicies")
    private interface GeoBackupPoliciesService {
        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/geoBackupPolicies/{geoBackupPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GeoBackupPolicyInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("geoBackupPolicyName") String geoBackupPolicyName, @BodyParam("application/json") GeoBackupPolicyInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/geoBackupPolicies/{geoBackupPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GeoBackupPolicyInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("geoBackupPolicyName") String geoBackupPolicyName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/geoBackupPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GeoBackupPolicyListResultInner>> listByDatabase(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Updates a database geo backup policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param state The state of the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GeoBackupPolicyInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, GeoBackupPolicyState state) {
        final String geoBackupPolicyName = "Default";
        final String apiVersion = "2014-04-01";
        GeoBackupPolicyInner parameters = new GeoBackupPolicyInner();
        parameters.withState(state);
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, geoBackupPolicyName, parameters, apiVersion);
    }

    /**
     * Updates a database geo backup policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param state The state of the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GeoBackupPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, GeoBackupPolicyState state) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, state)
            .flatMap((SimpleResponse<GeoBackupPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a database geo backup policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param state The state of the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GeoBackupPolicyInner createOrUpdate(String resourceGroupName, String serverName, String databaseName, GeoBackupPolicyState state) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, state).block();
    }

    /**
     * Gets a geo backup policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GeoBackupPolicyInner>> getWithResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        final String geoBackupPolicyName = "Default";
        final String apiVersion = "2014-04-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, geoBackupPolicyName, apiVersion);
    }

    /**
     * Gets a geo backup policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GeoBackupPolicyInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap((SimpleResponse<GeoBackupPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a geo backup policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GeoBackupPolicyInner get(String resourceGroupName, String serverName, String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).block();
    }

    /**
     * Returns a list of geo backup policies.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<GeoBackupPolicyInner>> listByDatabaseSinglePageAsync(String resourceGroupName, String serverName, String databaseName) {
        final String apiVersion = "2014-04-01";
        return service.listByDatabase(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            null,
            null));
    }

    /**
     * Returns a list of geo backup policies.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<GeoBackupPolicyInner> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName));
    }

    /**
     * Returns a list of geo backup policies.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GeoBackupPolicyInner> listByDatabase(String resourceGroupName, String serverName, String databaseName) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName));
    }
}
