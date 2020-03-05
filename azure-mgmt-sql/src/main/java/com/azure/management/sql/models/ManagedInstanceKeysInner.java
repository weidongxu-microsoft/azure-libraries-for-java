// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedInstanceKeys.
 */
public final class ManagedInstanceKeysInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ManagedInstanceKeysService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedInstanceKeysInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ManagedInstanceKeysInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ManagedInstanceKeysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientManagedInstanceKeys to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientManagedInstanceKeys")
    private interface ManagedInstanceKeysService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/keys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceKeyListResultInner>> listByInstance(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @QueryParam("$filter") String filter, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/keys/{keyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceKeyInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/keys/{keyName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ManagedInstanceKeyInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/keys/{keyName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/keys/{keyName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceKeyInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ManagedInstanceKeyInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/keys/{keyName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceKeyListResultInner>> listByInstanceNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a list of managed instance keys.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedInstanceKeyInner>> listByInstanceSinglePageAsync(String resourceGroupName, String managedInstanceName, String filter) {
        final String apiVersion = "2017-10-01-preview";
        return service.listByInstance(this.client.getHost(), resourceGroupName, managedInstanceName, filter, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of managed instance keys.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedInstanceKeyInner> listByInstanceAsync(String resourceGroupName, String managedInstanceName, String filter) {
        return new PagedFlux<>(
            () -> listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName, filter),
            nextLink -> listByInstanceNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of managed instance keys.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedInstanceKeyInner> listByInstanceAsync(String resourceGroupName, String managedInstanceName) {
        final String filter = null;
        final String apiVersion = "2017-10-01-preview";
        return new PagedFlux<>(
            () -> listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName, filter),
            nextLink -> listByInstanceNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of managed instance keys.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedInstanceKeyInner> listByInstance(String resourceGroupName, String managedInstanceName, String filter) {
        return new PagedIterable<>(listByInstanceAsync(resourceGroupName, managedInstanceName, filter));
    }

    /**
     * Gets a list of managed instance keys.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedInstanceKeyInner> listByInstance(String resourceGroupName, String managedInstanceName) {
        final String filter = null;
        final String apiVersion = "2017-10-01-preview";
        return new PagedIterable<>(listByInstanceAsync(resourceGroupName, managedInstanceName, filter));
    }

    /**
     * Gets a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedInstanceKeyInner>> getWithResponseAsync(String resourceGroupName, String managedInstanceName, String keyName) {
        final String apiVersion = "2017-10-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, managedInstanceName, keyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceKeyInner> getAsync(String resourceGroupName, String managedInstanceName, String keyName) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, keyName)
            .flatMap((SimpleResponse<ManagedInstanceKeyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceKeyInner get(String resourceGroupName, String managedInstanceName, String keyName) {
        return getAsync(resourceGroupName, managedInstanceName, keyName).block();
    }

    /**
     * Creates or updates a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @param parameters A managed instance key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, String keyName, ManagedInstanceKeyInner parameters) {
        final String apiVersion = "2017-10-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, keyName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @param parameters A managed instance key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceKeyInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, String keyName, ManagedInstanceKeyInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, keyName, parameters);
        return this.client.<ManagedInstanceKeyInner, ManagedInstanceKeyInner>getLroResultAsync(response, this.client.getHttpPipeline(), ManagedInstanceKeyInner.class, ManagedInstanceKeyInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @param parameters A managed instance key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceKeyInner createOrUpdate(String resourceGroupName, String managedInstanceName, String keyName, ManagedInstanceKeyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, managedInstanceName, keyName, parameters).block();
    }

    /**
     * Deletes the managed instance key with the given name.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String managedInstanceName, String keyName) {
        final String apiVersion = "2017-10-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, managedInstanceName, keyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the managed instance key with the given name.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String managedInstanceName, String keyName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, managedInstanceName, keyName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the managed instance key with the given name.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String managedInstanceName, String keyName) {
        deleteAsync(resourceGroupName, managedInstanceName, keyName).block();
    }

    /**
     * Creates or updates a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @param parameters A managed instance key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedInstanceKeyInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, String keyName, ManagedInstanceKeyInner parameters) {
        final String apiVersion = "2017-10-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, keyName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @param parameters A managed instance key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceKeyInner> beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName, String keyName, ManagedInstanceKeyInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, keyName, parameters)
            .flatMap((SimpleResponse<ManagedInstanceKeyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a managed instance key.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @param parameters A managed instance key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceKeyInner beginCreateOrUpdate(String resourceGroupName, String managedInstanceName, String keyName, ManagedInstanceKeyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, managedInstanceName, keyName, parameters).block();
    }

    /**
     * Deletes the managed instance key with the given name.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String managedInstanceName, String keyName) {
        final String apiVersion = "2017-10-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, managedInstanceName, keyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the managed instance key with the given name.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String managedInstanceName, String keyName) {
        return beginDeleteWithResponseAsync(resourceGroupName, managedInstanceName, keyName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the managed instance key with the given name.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param keyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String managedInstanceName, String keyName) {
        beginDeleteAsync(resourceGroupName, managedInstanceName, keyName).block();
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
    public Mono<PagedResponse<ManagedInstanceKeyInner>> listByInstanceNextSinglePageAsync(String nextLink) {
        return service.listByInstanceNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
