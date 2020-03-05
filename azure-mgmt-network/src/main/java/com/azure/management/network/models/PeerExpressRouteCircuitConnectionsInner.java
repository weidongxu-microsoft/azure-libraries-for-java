// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

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
 * PeerExpressRouteCircuitConnections.
 */
public final class PeerExpressRouteCircuitConnectionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private PeerExpressRouteCircuitConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of PeerExpressRouteCircuitConnectionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public PeerExpressRouteCircuitConnectionsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(PeerExpressRouteCircuitConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientPeerExpressRouteCircuitConnections to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientPeerExpressRouteCircuitConnections")
    private interface PeerExpressRouteCircuitConnectionsService {
        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/peerConnections/{connectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PeerExpressRouteCircuitConnectionInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/peerConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PeerExpressRouteCircuitConnectionListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PeerExpressRouteCircuitConnectionListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PeerExpressRouteCircuitConnectionInner>> getWithResponseAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), resourceGroupName, circuitName, peeringName, connectionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PeerExpressRouteCircuitConnectionInner> getAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return getWithResponseAsync(resourceGroupName, circuitName, peeringName, connectionName)
            .flatMap((SimpleResponse<PeerExpressRouteCircuitConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PeerExpressRouteCircuitConnectionInner get(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return getAsync(resourceGroupName, circuitName, peeringName, connectionName).block();
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PeerExpressRouteCircuitConnectionInner>> listSinglePageAsync(String resourceGroupName, String circuitName, String peeringName) {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), resourceGroupName, circuitName, peeringName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PeerExpressRouteCircuitConnectionInner> listAsync(String resourceGroupName, String circuitName, String peeringName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, circuitName, peeringName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeerExpressRouteCircuitConnectionInner> list(String resourceGroupName, String circuitName, String peeringName) {
        return new PagedIterable<>(listAsync(resourceGroupName, circuitName, peeringName));
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
    public Mono<PagedResponse<PeerExpressRouteCircuitConnectionInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
