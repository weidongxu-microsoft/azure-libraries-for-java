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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.management.sql.TransparentDataEncryptionStatus;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * TransparentDataEncryptions.
 */
public final class TransparentDataEncryptionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private TransparentDataEncryptionsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of TransparentDataEncryptionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public TransparentDataEncryptionsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(TransparentDataEncryptionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientTransparentDataEncryptions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientTransparentDataEncryptions")
    private interface TransparentDataEncryptionsService {
        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/transparentDataEncryption/{transparentDataEncryptionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<TransparentDataEncryptionInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("transparentDataEncryptionName") String transparentDataEncryptionName, @BodyParam("application/json") TransparentDataEncryptionInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/transparentDataEncryption/{transparentDataEncryptionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<TransparentDataEncryptionInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("transparentDataEncryptionName") String transparentDataEncryptionName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param status The status of the database transparent data encryption.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<TransparentDataEncryptionInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionStatus status) {
        final String transparentDataEncryptionName = "current";
        final String apiVersion = "2014-04-01";
        TransparentDataEncryptionInner parameters = new TransparentDataEncryptionInner();
        parameters.withStatus(status);
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, transparentDataEncryptionName, parameters, apiVersion);
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param status The status of the database transparent data encryption.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionStatus status) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, status)
            .flatMap((SimpleResponse<TransparentDataEncryptionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param status The status of the database transparent data encryption.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TransparentDataEncryptionInner createOrUpdate(String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionStatus status) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, status).block();
    }

    /**
     * Gets a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<TransparentDataEncryptionInner>> getWithResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        final String transparentDataEncryptionName = "current";
        final String apiVersion = "2014-04-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, transparentDataEncryptionName, apiVersion);
    }

    /**
     * Gets a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TransparentDataEncryptionInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap((SimpleResponse<TransparentDataEncryptionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TransparentDataEncryptionInner get(String resourceGroupName, String serverName, String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).block();
    }
}
