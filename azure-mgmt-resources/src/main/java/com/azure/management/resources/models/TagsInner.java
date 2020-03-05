// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

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
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Tags.
 */
public final class TagsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private TagsService service;

    /**
     * The service client containing this operation class.
     */
    private ResourceManagementClientImpl client;

    /**
     * Initializes an instance of TagsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public TagsInner(ResourceManagementClientImpl client) {
        this.service = RestProxy.create(TagsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourceManagementClientTags
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ResourceManagementClientTags")
    private interface TagsService {
        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Delete("/subscriptions/{subscriptionId}/tagNames/{tagName}/tagValues/{tagValue}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> deleteValue(@HostParam("$host") String host, @PathParam("tagName") String tagName, @PathParam("tagValue") String tagValue, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/tagNames/{tagName}/tagValues/{tagValue}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<TagValueInner>> createOrUpdateValue(@HostParam("$host") String host, @PathParam("tagName") String tagName, @PathParam("tagValue") String tagValue, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Put("/subscriptions/{subscriptionId}/tagNames/{tagName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<TagDetailsInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("tagName") String tagName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Delete("/subscriptions/{subscriptionId}/tagNames/{tagName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("tagName") String tagName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/tagNames")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<TagsListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<TagsListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes a tag value.
     * 
     * @param tagName The additional properties.
     * @param tagValue The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteValueWithResponseAsync(String tagName, String tagValue) {
        return service.deleteValue(this.client.getHost(), tagName, tagValue, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * Deletes a tag value.
     * 
     * @param tagName The additional properties.
     * @param tagValue The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteValueAsync(String tagName, String tagValue) {
        return deleteValueWithResponseAsync(tagName, tagValue)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a tag value.
     * 
     * @param tagName The additional properties.
     * @param tagValue The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteValue(String tagName, String tagValue) {
        deleteValueAsync(tagName, tagValue).block();
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     * 
     * @param tagName The additional properties.
     * @param tagValue The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<TagValueInner>> createOrUpdateValueWithResponseAsync(String tagName, String tagValue) {
        return service.createOrUpdateValue(this.client.getHost(), tagName, tagValue, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     * 
     * @param tagName The additional properties.
     * @param tagValue The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagValueInner> createOrUpdateValueAsync(String tagName, String tagValue) {
        return createOrUpdateValueWithResponseAsync(tagName, tagValue)
            .flatMap((SimpleResponse<TagValueInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     * 
     * @param tagName The additional properties.
     * @param tagValue The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TagValueInner createOrUpdateValue(String tagName, String tagValue) {
        return createOrUpdateValueAsync(tagName, tagValue).block();
    }

    /**
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     * 
     * @param tagName The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<TagDetailsInner>> createOrUpdateWithResponseAsync(String tagName) {
        return service.createOrUpdate(this.client.getHost(), tagName, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     * 
     * @param tagName The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagDetailsInner> createOrUpdateAsync(String tagName) {
        return createOrUpdateWithResponseAsync(tagName)
            .flatMap((SimpleResponse<TagDetailsInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     * 
     * @param tagName The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TagDetailsInner createOrUpdate(String tagName) {
        return createOrUpdateAsync(tagName).block();
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     * 
     * @param tagName The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String tagName) {
        return service.delete(this.client.getHost(), tagName, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     * 
     * @param tagName The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String tagName) {
        return deleteWithResponseAsync(tagName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     * 
     * @param tagName The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String tagName) {
        deleteAsync(tagName).block();
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TagDetailsInner>> listSinglePageAsync() {
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TagDetailsInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TagDetailsInner> list() {
        return new PagedIterable<>(listAsync());
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
    public Mono<PagedResponse<TagDetailsInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }
}
