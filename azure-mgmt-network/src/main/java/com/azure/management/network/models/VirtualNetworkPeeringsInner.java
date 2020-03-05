// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

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
 * VirtualNetworkPeerings.
 */
public final class VirtualNetworkPeeringsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualNetworkPeeringsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VirtualNetworkPeeringsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualNetworkPeeringsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VirtualNetworkPeeringsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVirtualNetworkPeerings to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientVirtualNetworkPeerings")
    private interface VirtualNetworkPeeringsService {
        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualNetworkPeeringInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualNetworkPeeringInner virtualNetworkPeeringParameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualNetworkPeeringListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/virtualNetworkPeerings/{virtualNetworkPeeringName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualNetworkPeeringInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("virtualNetworkPeeringName") String virtualNetworkPeeringName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualNetworkPeeringInner virtualNetworkPeeringParameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualNetworkPeeringListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        deleteAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName).block();
    }

    /**
     * Gets the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualNetworkPeeringInner>> getWithResponseAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualNetworkPeeringInner> getAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        return getWithResponseAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName)
            .flatMap((SimpleResponse<VirtualNetworkPeeringInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeeringInner get(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        return getAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName).block();
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.getSubscriptionId(), virtualNetworkPeeringParameters, apiVersion);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualNetworkPeeringInner> createOrUpdateAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters);
        return this.client.<VirtualNetworkPeeringInner, VirtualNetworkPeeringInner>getLroResultAsync(response, this.client.getHttpPipeline(), VirtualNetworkPeeringInner.class, VirtualNetworkPeeringInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeeringInner createOrUpdate(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        return createOrUpdateAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters).block();
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualNetworkPeeringInner>> listSinglePageAsync(String resourceGroupName, String virtualNetworkName) {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), resourceGroupName, virtualNetworkName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualNetworkPeeringInner> listAsync(String resourceGroupName, String virtualNetworkName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, virtualNetworkName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetworkPeeringInner> list(String resourceGroupName, String virtualNetworkName) {
        return new PagedIterable<>(listAsync(resourceGroupName, virtualNetworkName));
    }

    /**
     * Deletes the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        return beginDeleteWithResponseAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified virtual network peering.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        beginDeleteAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName).block();
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualNetworkPeeringInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, this.client.getSubscriptionId(), virtualNetworkPeeringParameters, apiVersion);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualNetworkPeeringInner> beginCreateOrUpdateAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters)
            .flatMap((SimpleResponse<VirtualNetworkPeeringInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param virtualNetworkPeeringName 
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeeringInner beginCreateOrUpdate(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters).block();
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
    public Mono<PagedResponse<VirtualNetworkPeeringInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
