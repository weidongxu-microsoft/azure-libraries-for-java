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
 * ExpressRouteCrossConnectionPeerings.
 */
public final class ExpressRouteCrossConnectionPeeringsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ExpressRouteCrossConnectionPeeringsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteCrossConnectionPeeringsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRouteCrossConnectionPeeringsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(ExpressRouteCrossConnectionPeeringsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientExpressRouteCrossConnectionPeerings to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientExpressRouteCrossConnectionPeerings")
    private interface ExpressRouteCrossConnectionPeeringsService {
        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCrossConnections/{crossConnectionName}/peerings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCrossConnectionPeeringListInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("crossConnectionName") String crossConnectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCrossConnections/{crossConnectionName}/peerings/{peeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("crossConnectionName") String crossConnectionName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCrossConnections/{crossConnectionName}/peerings/{peeringName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCrossConnectionPeeringInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("crossConnectionName") String crossConnectionName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCrossConnections/{crossConnectionName}/peerings/{peeringName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("crossConnectionName") String crossConnectionName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ExpressRouteCrossConnectionPeeringInner peeringParameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCrossConnections/{crossConnectionName}/peerings/{peeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("crossConnectionName") String crossConnectionName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCrossConnections/{crossConnectionName}/peerings/{peeringName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCrossConnectionPeeringInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("crossConnectionName") String crossConnectionName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ExpressRouteCrossConnectionPeeringInner peeringParameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCrossConnectionPeeringListInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRouteCrossConnectionPeeringInner>> listSinglePageAsync(String resourceGroupName, String crossConnectionName) {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), resourceGroupName, crossConnectionName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExpressRouteCrossConnectionPeeringInner> listAsync(String resourceGroupName, String crossConnectionName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, crossConnectionName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteCrossConnectionPeeringInner> list(String resourceGroupName, String crossConnectionName) {
        return new PagedIterable<>(listAsync(resourceGroupName, crossConnectionName));
    }

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String crossConnectionName, String peeringName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, crossConnectionName, peeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String crossConnectionName, String peeringName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, crossConnectionName, peeringName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String crossConnectionName, String peeringName) {
        deleteAsync(resourceGroupName, crossConnectionName, peeringName).block();
    }

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteCrossConnectionPeeringInner>> getWithResponseAsync(String resourceGroupName, String crossConnectionName, String peeringName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), resourceGroupName, crossConnectionName, peeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCrossConnectionPeeringInner> getAsync(String resourceGroupName, String crossConnectionName, String peeringName) {
        return getWithResponseAsync(resourceGroupName, crossConnectionName, peeringName)
            .flatMap((SimpleResponse<ExpressRouteCrossConnectionPeeringInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCrossConnectionPeeringInner get(String resourceGroupName, String crossConnectionName, String peeringName) {
        return getAsync(resourceGroupName, crossConnectionName, peeringName).block();
    }

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRoute Cross Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String crossConnectionName, String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, crossConnectionName, peeringName, this.client.getSubscriptionId(), peeringParameters, apiVersion);
    }

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRoute Cross Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCrossConnectionPeeringInner> createOrUpdateAsync(String resourceGroupName, String crossConnectionName, String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, crossConnectionName, peeringName, peeringParameters);
        return this.client.<ExpressRouteCrossConnectionPeeringInner, ExpressRouteCrossConnectionPeeringInner>getLroResultAsync(response, this.client.getHttpPipeline(), ExpressRouteCrossConnectionPeeringInner.class, ExpressRouteCrossConnectionPeeringInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRoute Cross Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCrossConnectionPeeringInner createOrUpdate(String resourceGroupName, String crossConnectionName, String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters) {
        return createOrUpdateAsync(resourceGroupName, crossConnectionName, peeringName, peeringParameters).block();
    }

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String crossConnectionName, String peeringName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, crossConnectionName, peeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String crossConnectionName, String peeringName) {
        return beginDeleteWithResponseAsync(resourceGroupName, crossConnectionName, peeringName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String crossConnectionName, String peeringName) {
        beginDeleteAsync(resourceGroupName, crossConnectionName, peeringName).block();
    }

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRoute Cross Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteCrossConnectionPeeringInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String crossConnectionName, String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, crossConnectionName, peeringName, this.client.getSubscriptionId(), peeringParameters, apiVersion);
    }

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRoute Cross Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCrossConnectionPeeringInner> beginCreateOrUpdateAsync(String resourceGroupName, String crossConnectionName, String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, crossConnectionName, peeringName, peeringParameters)
            .flatMap((SimpleResponse<ExpressRouteCrossConnectionPeeringInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName 
     * @param crossConnectionName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRoute Cross Connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCrossConnectionPeeringInner beginCreateOrUpdate(String resourceGroupName, String crossConnectionName, String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, crossConnectionName, peeringName, peeringParameters).block();
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
    public Mono<PagedResponse<ExpressRouteCrossConnectionPeeringInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
