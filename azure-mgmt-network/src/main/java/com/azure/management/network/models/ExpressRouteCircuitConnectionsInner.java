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
 * ExpressRouteCircuitConnections.
 */
public final class ExpressRouteCircuitConnectionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ExpressRouteCircuitConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteCircuitConnectionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRouteCircuitConnectionsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(ExpressRouteCircuitConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientExpressRouteCircuitConnections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientExpressRouteCircuitConnections")
    private interface ExpressRouteCircuitConnectionsService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitConnectionInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitConnectionListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitConnectionInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitConnectionListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
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
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, circuitName, peeringName, connectionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
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
    public Mono<Void> deleteAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, circuitName, peeringName, connectionName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
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
    public void delete(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        deleteAsync(resourceGroupName, circuitName, peeringName, connectionName).block();
    }

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
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
    public Mono<SimpleResponse<ExpressRouteCircuitConnectionInner>> getWithResponseAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), resourceGroupName, circuitName, peeringName, connectionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
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
    public Mono<ExpressRouteCircuitConnectionInner> getAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return getWithResponseAsync(resourceGroupName, circuitName, peeringName, connectionName)
            .flatMap((SimpleResponse<ExpressRouteCircuitConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
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
    public ExpressRouteCircuitConnectionInner get(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return getAsync(resourceGroupName, circuitName, peeringName, connectionName).block();
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @param expressRouteCircuitConnectionParameters Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName, ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, circuitName, peeringName, connectionName, this.client.getSubscriptionId(), apiVersion, expressRouteCircuitConnectionParameters);
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @param expressRouteCircuitConnectionParameters Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCircuitConnectionInner> createOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName, ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters);
        return this.client.<ExpressRouteCircuitConnectionInner, ExpressRouteCircuitConnectionInner>getLroResultAsync(response, this.client.getHttpPipeline(), ExpressRouteCircuitConnectionInner.class, ExpressRouteCircuitConnectionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @param expressRouteCircuitConnectionParameters Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitConnectionInner createOrUpdate(String resourceGroupName, String circuitName, String peeringName, String connectionName, ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        return createOrUpdateAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters).block();
    }

    /**
     * Gets all global reach connections associated with a private peering in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRouteCircuitConnectionInner>> listSinglePageAsync(String resourceGroupName, String circuitName, String peeringName) {
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
     * Gets all global reach connections associated with a private peering in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExpressRouteCircuitConnectionInner> listAsync(String resourceGroupName, String circuitName, String peeringName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, circuitName, peeringName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all global reach connections associated with a private peering in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteCircuitConnectionInner> list(String resourceGroupName, String circuitName, String peeringName) {
        return new PagedIterable<>(listAsync(resourceGroupName, circuitName, peeringName));
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
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
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, circuitName, peeringName, connectionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
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
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, circuitName, peeringName, connectionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
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
    public void beginDelete(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        beginDeleteAsync(resourceGroupName, circuitName, peeringName, connectionName).block();
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @param expressRouteCircuitConnectionParameters Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteCircuitConnectionInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName, ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, circuitName, peeringName, connectionName, this.client.getSubscriptionId(), apiVersion, expressRouteCircuitConnectionParameters);
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @param expressRouteCircuitConnectionParameters Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCircuitConnectionInner> beginCreateOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName, ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters)
            .flatMap((SimpleResponse<ExpressRouteCircuitConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param connectionName 
     * @param expressRouteCircuitConnectionParameters Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitConnectionInner beginCreateOrUpdate(String resourceGroupName, String circuitName, String peeringName, String connectionName, ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters).block();
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
    public Mono<PagedResponse<ExpressRouteCircuitConnectionInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
