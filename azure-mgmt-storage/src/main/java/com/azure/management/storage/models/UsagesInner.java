// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
 * Usages.
 */
public final class UsagesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private UsagesService service;

    /**
     * The service client containing this operation class.
     */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of UsagesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public UsagesInner(StorageManagementClientImpl client) {
        this.service = RestProxy.create(UsagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * StorageManagementClientUsages to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementClientUsages")
    private interface UsagesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Storage/locations/{location}/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<UsageListResultInner>> listByLocation(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("location") String location);
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     * 
     * @param location 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UsageInner>> listByLocationSinglePageAsync(String location) {
        return service.listByLocation(this.client.getHost(), this.client.getApiVersion(), this.client.getSubscriptionId(), location).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            null,
            null));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     * 
     * @param location 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UsageInner> listByLocationAsync(String location) {
        return new PagedFlux<>(
            () -> listByLocationSinglePageAsync(location));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     * 
     * @param location 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> listByLocation(String location) {
        return new PagedIterable<>(listByLocationAsync(location));
    }
}
