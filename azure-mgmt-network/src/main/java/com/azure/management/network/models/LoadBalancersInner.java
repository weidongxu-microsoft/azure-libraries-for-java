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
import com.azure.management.network.TagsObject;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * LoadBalancers.
 */
public final class LoadBalancersInner implements InnerSupportsGet<LoadBalancerInner>, InnerSupportsListing<LoadBalancerInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private LoadBalancersService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LoadBalancersInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public LoadBalancersInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(LoadBalancersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientLoadBalancers to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientLoadBalancers")
    private interface LoadBalancersService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LoadBalancerInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") LoadBalancerInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> updateTags(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/loadBalancers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LoadBalancerListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LoadBalancerListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LoadBalancerInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") LoadBalancerInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LoadBalancerInner>> beginUpdateTags(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LoadBalancerListResultInner>> listAllNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LoadBalancerListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String loadBalancerName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, loadBalancerName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String loadBalancerName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, loadBalancerName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String loadBalancerName) {
        deleteAsync(resourceGroupName, loadBalancerName).block();
    }

    /**
     * Gets the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LoadBalancerInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String loadBalancerName, String expand) {
        final String apiVersion = "2019-06-01";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, loadBalancerName, this.client.getSubscriptionId(), expand, apiVersion);
    }

    /**
     * Gets the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancerInner> getByResourceGroupAsync(String resourceGroupName, String loadBalancerName, String expand) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, loadBalancerName, expand)
            .flatMap((SimpleResponse<LoadBalancerInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancerInner> getByResourceGroupAsync(String resourceGroupName, String loadBalancerName) {
        final String expand = null;
        final String apiVersion = "2019-06-01";
        return getByResourceGroupWithResponseAsync(resourceGroupName, loadBalancerName, expand)
            .flatMap((SimpleResponse<LoadBalancerInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LoadBalancerInner getByResourceGroup(String resourceGroupName, String loadBalancerName, String expand) {
        return getByResourceGroupAsync(resourceGroupName, loadBalancerName, expand).block();
    }

    /**
     * Gets the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LoadBalancerInner getByResourceGroup(String resourceGroupName, String loadBalancerName) {
        final String expand = null;
        final String apiVersion = "2019-06-01";
        return getByResourceGroupAsync(resourceGroupName, loadBalancerName, expand).block();
    }

    /**
     * Creates or updates a load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param parameters LoadBalancer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String loadBalancerName, LoadBalancerInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, loadBalancerName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param parameters LoadBalancer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancerInner> createOrUpdateAsync(String resourceGroupName, String loadBalancerName, LoadBalancerInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, loadBalancerName, parameters);
        return this.client.<LoadBalancerInner, LoadBalancerInner>getLroResultAsync(response, this.client.getHttpPipeline(), LoadBalancerInner.class, LoadBalancerInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param parameters LoadBalancer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LoadBalancerInner createOrUpdate(String resourceGroupName, String loadBalancerName, LoadBalancerInner parameters) {
        return createOrUpdateAsync(resourceGroupName, loadBalancerName, parameters).block();
    }

    /**
     * Updates a load balancer tags.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateTagsWithResponseAsync(String resourceGroupName, String loadBalancerName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.updateTags(this.client.getHost(), resourceGroupName, loadBalancerName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a load balancer tags.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancerInner> updateTagsAsync(String resourceGroupName, String loadBalancerName, Map<String, String> tags) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateTagsWithResponseAsync(resourceGroupName, loadBalancerName, tags);
        return this.client.<LoadBalancerInner, LoadBalancerInner>getLroResultAsync(response, this.client.getHttpPipeline(), LoadBalancerInner.class, LoadBalancerInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates a load balancer tags.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LoadBalancerInner updateTags(String resourceGroupName, String loadBalancerName, Map<String, String> tags) {
        return updateTagsAsync(resourceGroupName, loadBalancerName, tags).block();
    }

    /**
     * Gets all the load balancers in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LoadBalancerInner>> listSinglePageAsync() {
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
     * Gets all the load balancers in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LoadBalancerInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listAllNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the load balancers in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LoadBalancerInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets all the load balancers in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LoadBalancerInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
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
     * Gets all the load balancers in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LoadBalancerInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the load balancers in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LoadBalancerInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Deletes the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String loadBalancerName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, loadBalancerName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String loadBalancerName) {
        return beginDeleteWithResponseAsync(resourceGroupName, loadBalancerName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String loadBalancerName) {
        beginDeleteAsync(resourceGroupName, loadBalancerName).block();
    }

    /**
     * Creates or updates a load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param parameters LoadBalancer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LoadBalancerInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String loadBalancerName, LoadBalancerInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, loadBalancerName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param parameters LoadBalancer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancerInner> beginCreateOrUpdateAsync(String resourceGroupName, String loadBalancerName, LoadBalancerInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, loadBalancerName, parameters)
            .flatMap((SimpleResponse<LoadBalancerInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a load balancer.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param parameters LoadBalancer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LoadBalancerInner beginCreateOrUpdate(String resourceGroupName, String loadBalancerName, LoadBalancerInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, loadBalancerName, parameters).block();
    }

    /**
     * Updates a load balancer tags.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LoadBalancerInner>> beginUpdateTagsWithResponseAsync(String resourceGroupName, String loadBalancerName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.beginUpdateTags(this.client.getHost(), resourceGroupName, loadBalancerName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a load balancer tags.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancerInner> beginUpdateTagsAsync(String resourceGroupName, String loadBalancerName, Map<String, String> tags) {
        return beginUpdateTagsWithResponseAsync(resourceGroupName, loadBalancerName, tags)
            .flatMap((SimpleResponse<LoadBalancerInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a load balancer tags.
     * 
     * @param resourceGroupName 
     * @param loadBalancerName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LoadBalancerInner beginUpdateTags(String resourceGroupName, String loadBalancerName, Map<String, String> tags) {
        return beginUpdateTagsAsync(resourceGroupName, loadBalancerName, tags).block();
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
    public Mono<PagedResponse<LoadBalancerInner>> listAllNextSinglePageAsync(String nextLink) {
        return service.listAllNext(nextLink).map(res -> new PagedResponseBase<>(
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
    public Mono<PagedResponse<LoadBalancerInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
