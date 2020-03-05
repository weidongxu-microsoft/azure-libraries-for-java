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
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * DatabaseAutomaticTunings.
 */
public final class DatabaseAutomaticTuningsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private DatabaseAutomaticTuningsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseAutomaticTuningsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public DatabaseAutomaticTuningsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(DatabaseAutomaticTuningsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientDatabaseAutomaticTunings to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientDatabaseAutomaticTunings")
    private interface DatabaseAutomaticTuningsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/automaticTuning/current")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DatabaseAutomaticTuningInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/automaticTuning/current")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DatabaseAutomaticTuningInner>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") DatabaseAutomaticTuningInner parameters, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Gets a database's automatic tuning.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DatabaseAutomaticTuningInner>> getWithResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        final String apiVersion = "2015-05-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, databaseName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a database's automatic tuning.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseAutomaticTuningInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap((SimpleResponse<DatabaseAutomaticTuningInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a database's automatic tuning.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseAutomaticTuningInner get(String resourceGroupName, String serverName, String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).block();
    }

    /**
     * Update automatic tuning properties for target database.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters Database-level Automatic Tuning.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DatabaseAutomaticTuningInner>> updateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters) {
        final String apiVersion = "2015-05-01-preview";
        return service.update(this.client.getHost(), resourceGroupName, serverName, databaseName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Update automatic tuning properties for target database.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters Database-level Automatic Tuning.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseAutomaticTuningInner> updateAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters) {
        return updateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters)
            .flatMap((SimpleResponse<DatabaseAutomaticTuningInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Update automatic tuning properties for target database.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters Database-level Automatic Tuning.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseAutomaticTuningInner update(String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters) {
        return updateAsync(resourceGroupName, serverName, databaseName, parameters).block();
    }
}
