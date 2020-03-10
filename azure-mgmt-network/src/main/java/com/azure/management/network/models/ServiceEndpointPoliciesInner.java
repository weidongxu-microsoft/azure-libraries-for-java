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
 * ServiceEndpointPolicies.
 */
public final class ServiceEndpointPoliciesInner implements InnerSupportsGet<ServiceEndpointPolicyInner>, InnerSupportsListing<ServiceEndpointPolicyInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServiceEndpointPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ServiceEndpointPoliciesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ServiceEndpointPoliciesInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(ServiceEndpointPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientServiceEndpointPolicies to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientServiceEndpointPolicies")
    private interface ServiceEndpointPoliciesService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/serviceEndpointPolicies/{serviceEndpointPolicyName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serviceEndpointPolicyName") String serviceEndpointPolicyName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/serviceEndpointPolicies/{serviceEndpointPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServiceEndpointPolicyInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serviceEndpointPolicyName") String serviceEndpointPolicyName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @QueryParam("$expand") String expand);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/serviceEndpointPolicies/{serviceEndpointPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serviceEndpointPolicyName") String serviceEndpointPolicyName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ServiceEndpointPolicyInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/serviceEndpointPolicies/{serviceEndpointPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serviceEndpointPolicyName") String serviceEndpointPolicyName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/ServiceEndpointPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServiceEndpointPolicyListResultInner>> list(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/serviceEndpointPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServiceEndpointPolicyListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/serviceEndpointPolicies/{serviceEndpointPolicyName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serviceEndpointPolicyName") String serviceEndpointPolicyName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/serviceEndpointPolicies/{serviceEndpointPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServiceEndpointPolicyInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serviceEndpointPolicyName") String serviceEndpointPolicyName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ServiceEndpointPolicyInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/serviceEndpointPolicies/{serviceEndpointPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServiceEndpointPolicyInner>> beginUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serviceEndpointPolicyName") String serviceEndpointPolicyName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServiceEndpointPolicyListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServiceEndpointPolicyListResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, serviceEndpointPolicyName, apiVersion, this.client.getSubscriptionId());
    }

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serviceEndpointPolicyName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, serviceEndpointPolicyName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serviceEndpointPolicyName) {
        deleteAsync(resourceGroupName, serviceEndpointPolicyName).block();
    }

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServiceEndpointPolicyInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName, String expand) {
        final String apiVersion = "2019-06-01";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, serviceEndpointPolicyName, apiVersion, this.client.getSubscriptionId(), expand);
    }

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServiceEndpointPolicyInner> getByResourceGroupAsync(String resourceGroupName, String serviceEndpointPolicyName, String expand) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, serviceEndpointPolicyName, expand)
            .flatMap((SimpleResponse<ServiceEndpointPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServiceEndpointPolicyInner> getByResourceGroupAsync(String resourceGroupName, String serviceEndpointPolicyName) {
        final String expand = null;
        return getByResourceGroupWithResponseAsync(resourceGroupName, serviceEndpointPolicyName, expand)
            .flatMap((SimpleResponse<ServiceEndpointPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyInner getByResourceGroup(String resourceGroupName, String serviceEndpointPolicyName, String expand) {
        return getByResourceGroupAsync(resourceGroupName, serviceEndpointPolicyName, expand).block();
    }

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyInner getByResourceGroup(String resourceGroupName, String serviceEndpointPolicyName) {
        final String expand = null;
        return getByResourceGroupAsync(resourceGroupName, serviceEndpointPolicyName, expand).block();
    }

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serviceEndpointPolicyName, apiVersion, this.client.getSubscriptionId(), parameters);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServiceEndpointPolicyInner> createOrUpdateAsync(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serviceEndpointPolicyName, parameters);
        return this.client.<ServiceEndpointPolicyInner, ServiceEndpointPolicyInner>getLroResultAsync(response, this.client.getHttpPipeline(), ServiceEndpointPolicyInner.class, ServiceEndpointPolicyInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyInner createOrUpdate(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serviceEndpointPolicyName, parameters).block();
    }

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.update(this.client.getHost(), resourceGroupName, serviceEndpointPolicyName, apiVersion, this.client.getSubscriptionId(), parameters);
    }

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServiceEndpointPolicyInner> updateAsync(String resourceGroupName, String serviceEndpointPolicyName, Map<String, String> tags) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateWithResponseAsync(resourceGroupName, serviceEndpointPolicyName, tags);
        return this.client.<ServiceEndpointPolicyInner, ServiceEndpointPolicyInner>getLroResultAsync(response, this.client.getHttpPipeline(), ServiceEndpointPolicyInner.class, ServiceEndpointPolicyInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyInner update(String resourceGroupName, String serviceEndpointPolicyName, Map<String, String> tags) {
        return updateAsync(resourceGroupName, serviceEndpointPolicyName, tags).block();
    }

    /**
     * Gets all the service endpoint policies in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ServiceEndpointPolicyInner>> listSinglePageAsync() {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), apiVersion, this.client.getSubscriptionId()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all the service endpoint policies in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ServiceEndpointPolicyInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the service endpoint policies in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceEndpointPolicyInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets all service endpoint Policies in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ServiceEndpointPolicyInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-06-01";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, apiVersion, this.client.getSubscriptionId()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all service endpoint Policies in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ServiceEndpointPolicyInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all service endpoint Policies in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceEndpointPolicyInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, serviceEndpointPolicyName, apiVersion, this.client.getSubscriptionId());
    }

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String serviceEndpointPolicyName) {
        return beginDeleteWithResponseAsync(resourceGroupName, serviceEndpointPolicyName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String serviceEndpointPolicyName) {
        beginDeleteAsync(resourceGroupName, serviceEndpointPolicyName).block();
    }

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServiceEndpointPolicyInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serviceEndpointPolicyName, apiVersion, this.client.getSubscriptionId(), parameters);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServiceEndpointPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serviceEndpointPolicyName, parameters)
            .flatMap((SimpleResponse<ServiceEndpointPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyInner beginCreateOrUpdate(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serviceEndpointPolicyName, parameters).block();
    }

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServiceEndpointPolicyInner>> beginUpdateWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.beginUpdate(this.client.getHost(), resourceGroupName, serviceEndpointPolicyName, apiVersion, this.client.getSubscriptionId(), parameters);
    }

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServiceEndpointPolicyInner> beginUpdateAsync(String resourceGroupName, String serviceEndpointPolicyName, Map<String, String> tags) {
        return beginUpdateWithResponseAsync(resourceGroupName, serviceEndpointPolicyName, tags)
            .flatMap((SimpleResponse<ServiceEndpointPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName 
     * @param serviceEndpointPolicyName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyInner beginUpdate(String resourceGroupName, String serviceEndpointPolicyName, Map<String, String> tags) {
        return beginUpdateAsync(resourceGroupName, serviceEndpointPolicyName, tags).block();
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
    public Mono<PagedResponse<ServiceEndpointPolicyInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
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
    public Mono<PagedResponse<ServiceEndpointPolicyInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return service.listByResourceGroupNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
