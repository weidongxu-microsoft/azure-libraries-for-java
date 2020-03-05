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
 * ExpressRouteCircuitAuthorizations.
 */
public final class ExpressRouteCircuitAuthorizationsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ExpressRouteCircuitAuthorizationsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteCircuitAuthorizationsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRouteCircuitAuthorizationsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(ExpressRouteCircuitAuthorizationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientExpressRouteCircuitAuthorizations to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientExpressRouteCircuitAuthorizations")
    private interface ExpressRouteCircuitAuthorizationsService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/authorizations/{authorizationName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("authorizationName") String authorizationName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/authorizations/{authorizationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitAuthorizationInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("authorizationName") String authorizationName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/authorizations/{authorizationName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("authorizationName") String authorizationName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ExpressRouteCircuitAuthorizationInner authorizationParameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/authorizations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AuthorizationListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/authorizations/{authorizationName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("authorizationName") String authorizationName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/authorizations/{authorizationName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitAuthorizationInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("authorizationName") String authorizationName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ExpressRouteCircuitAuthorizationInner authorizationParameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AuthorizationListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String circuitName, String authorizationName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, circuitName, authorizationName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String circuitName, String authorizationName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, circuitName, authorizationName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String circuitName, String authorizationName) {
        deleteAsync(resourceGroupName, circuitName, authorizationName).block();
    }

    /**
     * Gets the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteCircuitAuthorizationInner>> getWithResponseAsync(String resourceGroupName, String circuitName, String authorizationName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), resourceGroupName, circuitName, authorizationName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCircuitAuthorizationInner> getAsync(String resourceGroupName, String circuitName, String authorizationName) {
        return getWithResponseAsync(resourceGroupName, circuitName, authorizationName)
            .flatMap((SimpleResponse<ExpressRouteCircuitAuthorizationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorizationInner get(String resourceGroupName, String circuitName, String authorizationName) {
        return getAsync(resourceGroupName, circuitName, authorizationName).block();
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorizationInner authorizationParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, circuitName, authorizationName, this.client.getSubscriptionId(), authorizationParameters, apiVersion);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCircuitAuthorizationInner> createOrUpdateAsync(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorizationInner authorizationParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, circuitName, authorizationName, authorizationParameters);
        return this.client.<ExpressRouteCircuitAuthorizationInner, ExpressRouteCircuitAuthorizationInner>getLroResultAsync(response, this.client.getHttpPipeline(), ExpressRouteCircuitAuthorizationInner.class, ExpressRouteCircuitAuthorizationInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorizationInner createOrUpdate(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorizationInner authorizationParameters) {
        return createOrUpdateAsync(resourceGroupName, circuitName, authorizationName, authorizationParameters).block();
    }

    /**
     * Gets all authorizations in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRouteCircuitAuthorizationInner>> listSinglePageAsync(String resourceGroupName, String circuitName) {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), resourceGroupName, circuitName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all authorizations in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExpressRouteCircuitAuthorizationInner> listAsync(String resourceGroupName, String circuitName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, circuitName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all authorizations in an express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteCircuitAuthorizationInner> list(String resourceGroupName, String circuitName) {
        return new PagedIterable<>(listAsync(resourceGroupName, circuitName));
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String circuitName, String authorizationName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, circuitName, authorizationName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String circuitName, String authorizationName) {
        return beginDeleteWithResponseAsync(resourceGroupName, circuitName, authorizationName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String circuitName, String authorizationName) {
        beginDeleteAsync(resourceGroupName, circuitName, authorizationName).block();
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteCircuitAuthorizationInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorizationInner authorizationParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, circuitName, authorizationName, this.client.getSubscriptionId(), authorizationParameters, apiVersion);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCircuitAuthorizationInner> beginCreateOrUpdateAsync(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorizationInner authorizationParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, circuitName, authorizationName, authorizationParameters)
            .flatMap((SimpleResponse<ExpressRouteCircuitAuthorizationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param authorizationName 
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorizationInner beginCreateOrUpdate(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorizationInner authorizationParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, circuitName, authorizationName, authorizationParameters).block();
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
    public Mono<PagedResponse<ExpressRouteCircuitAuthorizationInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
