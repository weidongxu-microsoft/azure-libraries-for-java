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
 * ExpressRoutePorts.
 */
public final class ExpressRoutePortsInner implements InnerSupportsGet<ExpressRoutePortInner>, InnerSupportsListing<ExpressRoutePortInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private ExpressRoutePortsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRoutePortsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRoutePortsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(ExpressRoutePortsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientExpressRoutePorts to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientExpressRoutePorts")
    private interface ExpressRoutePortsService {
        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("expressRoutePortName") String expressRoutePortName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRoutePortInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("expressRoutePortName") String expressRoutePortName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("expressRoutePortName") String expressRoutePortName, @BodyParam("application/json") ExpressRoutePortInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> updateTags(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("expressRoutePortName") String expressRoutePortName, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRoutePortListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/ExpressRoutePorts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRoutePortListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("expressRoutePortName") String expressRoutePortName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRoutePortInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("expressRoutePortName") String expressRoutePortName, @BodyParam("application/json") ExpressRoutePortInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRoutePortInner>> beginUpdateTags(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("expressRoutePortName") String expressRoutePortName, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRoutePortListResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRoutePortListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String expressRoutePortName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, expressRoutePortName, apiVersion);
    }

    /**
     * Deletes the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String expressRoutePortName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, expressRoutePortName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String expressRoutePortName) {
        deleteAsync(resourceGroupName, expressRoutePortName).block();
    }

    /**
     * Retrieves the requested ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRoutePortInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String expressRoutePortName) {
        final String apiVersion = "2019-06-01";
        return service.getByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, expressRoutePortName, apiVersion);
    }

    /**
     * Retrieves the requested ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRoutePortInner> getByResourceGroupAsync(String resourceGroupName, String expressRoutePortName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, expressRoutePortName)
            .flatMap((SimpleResponse<ExpressRoutePortInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves the requested ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRoutePortInner getByResourceGroup(String resourceGroupName, String expressRoutePortName) {
        return getByResourceGroupAsync(resourceGroupName, expressRoutePortName).block();
    }

    /**
     * Creates or updates the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param parameters ExpressRoutePort resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String expressRoutePortName, ExpressRoutePortInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, expressRoutePortName, parameters, apiVersion);
    }

    /**
     * Creates or updates the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param parameters ExpressRoutePort resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRoutePortInner> createOrUpdateAsync(String resourceGroupName, String expressRoutePortName, ExpressRoutePortInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, expressRoutePortName, parameters);
        return this.client.<ExpressRoutePortInner, ExpressRoutePortInner>getLroResultAsync(response, this.client.getHttpPipeline(), ExpressRoutePortInner.class, ExpressRoutePortInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param parameters ExpressRoutePort resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRoutePortInner createOrUpdate(String resourceGroupName, String expressRoutePortName, ExpressRoutePortInner parameters) {
        return createOrUpdateAsync(resourceGroupName, expressRoutePortName, parameters).block();
    }

    /**
     * Update ExpressRoutePort tags.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateTagsWithResponseAsync(String resourceGroupName, String expressRoutePortName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.updateTags(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, expressRoutePortName, parameters, apiVersion);
    }

    /**
     * Update ExpressRoutePort tags.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRoutePortInner> updateTagsAsync(String resourceGroupName, String expressRoutePortName, Map<String, String> tags) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateTagsWithResponseAsync(resourceGroupName, expressRoutePortName, tags);
        return this.client.<ExpressRoutePortInner, ExpressRoutePortInner>getLroResultAsync(response, this.client.getHttpPipeline(), ExpressRoutePortInner.class, ExpressRoutePortInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Update ExpressRoutePort tags.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRoutePortInner updateTags(String resourceGroupName, String expressRoutePortName, Map<String, String> tags) {
        return updateTagsAsync(resourceGroupName, expressRoutePortName, tags).block();
    }

    /**
     * List all the ExpressRoutePort resources in the specified resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRoutePortInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-06-01";
        return service.listByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * List all the ExpressRoutePort resources in the specified resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExpressRoutePortInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * List all the ExpressRoutePort resources in the specified resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRoutePortInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * List all the ExpressRoutePort resources in the specified subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRoutePortInner>> listSinglePageAsync() {
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
     * List all the ExpressRoutePort resources in the specified subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExpressRoutePortInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List all the ExpressRoutePort resources in the specified subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRoutePortInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Deletes the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String expressRoutePortName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, expressRoutePortName, apiVersion);
    }

    /**
     * Deletes the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String expressRoutePortName) {
        return beginDeleteWithResponseAsync(resourceGroupName, expressRoutePortName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String expressRoutePortName) {
        beginDeleteAsync(resourceGroupName, expressRoutePortName).block();
    }

    /**
     * Creates or updates the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param parameters ExpressRoutePort resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRoutePortInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String expressRoutePortName, ExpressRoutePortInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, expressRoutePortName, parameters, apiVersion);
    }

    /**
     * Creates or updates the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param parameters ExpressRoutePort resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRoutePortInner> beginCreateOrUpdateAsync(String resourceGroupName, String expressRoutePortName, ExpressRoutePortInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, expressRoutePortName, parameters)
            .flatMap((SimpleResponse<ExpressRoutePortInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates the specified ExpressRoutePort resource.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param parameters ExpressRoutePort resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRoutePortInner beginCreateOrUpdate(String resourceGroupName, String expressRoutePortName, ExpressRoutePortInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, expressRoutePortName, parameters).block();
    }

    /**
     * Update ExpressRoutePort tags.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRoutePortInner>> beginUpdateTagsWithResponseAsync(String resourceGroupName, String expressRoutePortName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.beginUpdateTags(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, expressRoutePortName, parameters, apiVersion);
    }

    /**
     * Update ExpressRoutePort tags.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRoutePortInner> beginUpdateTagsAsync(String resourceGroupName, String expressRoutePortName, Map<String, String> tags) {
        return beginUpdateTagsWithResponseAsync(resourceGroupName, expressRoutePortName, tags)
            .flatMap((SimpleResponse<ExpressRoutePortInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Update ExpressRoutePort tags.
     * 
     * @param resourceGroupName 
     * @param expressRoutePortName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRoutePortInner beginUpdateTags(String resourceGroupName, String expressRoutePortName, Map<String, String> tags) {
        return beginUpdateTagsAsync(resourceGroupName, expressRoutePortName, tags).block();
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
    public Mono<PagedResponse<ExpressRoutePortInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
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
    public Mono<PagedResponse<ExpressRoutePortInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
