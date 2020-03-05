// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.management.storage.ErrorResponseException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PrivateEndpointConnections.
 */
public final class PrivateEndpointConnectionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private PrivateEndpointConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsInner(StorageManagementClientImpl client) {
        this.service = RestProxy.create(PrivateEndpointConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * StorageManagementClientPrivateEndpointConnections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementClientPrivateEndpointConnections")
    private interface PrivateEndpointConnectionsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> put(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName, @BodyParam("application/json") PrivateEndpointConnectionInner properties, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> getWithResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return service.get(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), privateEndpointConnectionName, this.client.getApiVersion());
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName)
            .flatMap((SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner get(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getAsync(resourceGroupName, accountName, privateEndpointConnectionName).block();
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @param properties The Private Endpoint Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> putWithResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return service.put(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), privateEndpointConnectionName, properties, this.client.getApiVersion());
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @param properties The Private Endpoint Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> putAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return putWithResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, properties)
            .flatMap((SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @param properties The Private Endpoint Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner put(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return putAsync(resourceGroupName, accountName, privateEndpointConnectionName, properties).block();
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return service.delete(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), privateEndpointConnectionName, this.client.getApiVersion());
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return deleteWithResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        deleteAsync(resourceGroupName, accountName, privateEndpointConnectionName).block();
    }
}
