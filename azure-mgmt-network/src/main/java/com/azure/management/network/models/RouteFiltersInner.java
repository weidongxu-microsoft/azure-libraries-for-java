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
import com.azure.core.annotation.Patch;
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
import com.azure.management.network.PatchRouteFilter;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * RouteFilters.
 */
public final class RouteFiltersInner implements InnerSupportsGet<RouteFilterInner>, InnerSupportsListing<RouteFilterInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private RouteFiltersService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of RouteFiltersInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public RouteFiltersInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(RouteFiltersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientRouteFilters to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientRouteFilters")
    private interface RouteFiltersService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeFilters/{routeFilterName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeFilterName") String routeFilterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeFilters/{routeFilterName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteFilterInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeFilterName") String routeFilterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeFilters/{routeFilterName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeFilterName") String routeFilterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") RouteFilterInner routeFilterParameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeFilters/{routeFilterName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeFilterName") String routeFilterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") PatchRouteFilter routeFilterParameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeFilters")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteFilterListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/routeFilters")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteFilterListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeFilters/{routeFilterName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeFilterName") String routeFilterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeFilters/{routeFilterName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteFilterInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeFilterName") String routeFilterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") RouteFilterInner routeFilterParameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeFilters/{routeFilterName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteFilterInner>> beginUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeFilterName") String routeFilterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") PatchRouteFilter routeFilterParameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteFilterListResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteFilterListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String routeFilterName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, routeFilterName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String routeFilterName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, routeFilterName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String routeFilterName) {
        deleteAsync(resourceGroupName, routeFilterName).block();
    }

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RouteFilterInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String routeFilterName, String expand) {
        final String apiVersion = "2019-06-01";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, routeFilterName, this.client.getSubscriptionId(), expand, apiVersion);
    }

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteFilterInner> getByResourceGroupAsync(String resourceGroupName, String routeFilterName, String expand) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, routeFilterName, expand)
            .flatMap((SimpleResponse<RouteFilterInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteFilterInner> getByResourceGroupAsync(String resourceGroupName, String routeFilterName) {
        final String expand = null;
        final String apiVersion = "2019-06-01";
        return getByResourceGroupWithResponseAsync(resourceGroupName, routeFilterName, expand)
            .flatMap((SimpleResponse<RouteFilterInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterInner getByResourceGroup(String resourceGroupName, String routeFilterName, String expand) {
        return getByResourceGroupAsync(resourceGroupName, routeFilterName, expand).block();
    }

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterInner getByResourceGroup(String resourceGroupName, String routeFilterName) {
        final String expand = null;
        final String apiVersion = "2019-06-01";
        return getByResourceGroupAsync(resourceGroupName, routeFilterName, expand).block();
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, routeFilterName, this.client.getSubscriptionId(), apiVersion, routeFilterParameters);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteFilterInner> createOrUpdateAsync(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, routeFilterName, routeFilterParameters);
        return this.client.<RouteFilterInner, RouteFilterInner>getLroResultAsync(response, this.client.getHttpPipeline(), RouteFilterInner.class, RouteFilterInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterInner createOrUpdate(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters) {
        return createOrUpdateAsync(resourceGroupName, routeFilterName, routeFilterParameters).block();
    }

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters) {
        final String apiVersion = "2019-06-01";
        return service.update(this.client.getHost(), resourceGroupName, routeFilterName, this.client.getSubscriptionId(), apiVersion, routeFilterParameters);
    }

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteFilterInner> updateAsync(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateWithResponseAsync(resourceGroupName, routeFilterName, routeFilterParameters);
        return this.client.<RouteFilterInner, RouteFilterInner>getLroResultAsync(response, this.client.getHttpPipeline(), RouteFilterInner.class, RouteFilterInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterInner update(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters) {
        return updateAsync(resourceGroupName, routeFilterName, routeFilterParameters).block();
    }

    /**
     * Gets all route filters in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RouteFilterInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-06-01";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all route filters in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouteFilterInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all route filters in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteFilterInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Gets all route filters in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RouteFilterInner>> listSinglePageAsync() {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all route filters in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouteFilterInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all route filters in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteFilterInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String routeFilterName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, routeFilterName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String routeFilterName) {
        return beginDeleteWithResponseAsync(resourceGroupName, routeFilterName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String routeFilterName) {
        beginDeleteAsync(resourceGroupName, routeFilterName).block();
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RouteFilterInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, routeFilterName, this.client.getSubscriptionId(), apiVersion, routeFilterParameters);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteFilterInner> beginCreateOrUpdateAsync(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, routeFilterName, routeFilterParameters)
            .flatMap((SimpleResponse<RouteFilterInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterInner beginCreateOrUpdate(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, routeFilterName, routeFilterParameters).block();
    }

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RouteFilterInner>> beginUpdateWithResponseAsync(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginUpdate(this.client.getHost(), resourceGroupName, routeFilterName, this.client.getSubscriptionId(), apiVersion, routeFilterParameters);
    }

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteFilterInner> beginUpdateAsync(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters) {
        return beginUpdateWithResponseAsync(resourceGroupName, routeFilterName, routeFilterParameters)
            .flatMap((SimpleResponse<RouteFilterInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeFilterName 
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterInner beginUpdate(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters) {
        return beginUpdateAsync(resourceGroupName, routeFilterName, routeFilterParameters).block();
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
    public Mono<PagedResponse<RouteFilterInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return service.listByResourceGroupNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
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
    public Mono<PagedResponse<RouteFilterInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
