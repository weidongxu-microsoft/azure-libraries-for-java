// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

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
 * VirtualNetworkRules.
 */
public final class VirtualNetworkRulesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualNetworkRulesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of VirtualNetworkRulesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualNetworkRulesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(VirtualNetworkRulesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientVirtualNetworkRules to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientVirtualNetworkRules")
    private interface VirtualNetworkRulesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/virtualNetworkRules/{virtualNetworkRuleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualNetworkRuleInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("virtualNetworkRuleName") String virtualNetworkRuleName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/virtualNetworkRules/{virtualNetworkRuleName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("virtualNetworkRuleName") String virtualNetworkRuleName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualNetworkRuleInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/virtualNetworkRules/{virtualNetworkRuleName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("virtualNetworkRuleName") String virtualNetworkRuleName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/virtualNetworkRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualNetworkRuleListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/virtualNetworkRules/{virtualNetworkRuleName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualNetworkRuleInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("virtualNetworkRuleName") String virtualNetworkRuleName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualNetworkRuleInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/virtualNetworkRules/{virtualNetworkRuleName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("virtualNetworkRuleName") String virtualNetworkRuleName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualNetworkRuleListResultInner>> listByServerNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualNetworkRuleInner>> getWithResponseAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        final String apiVersion = "2015-05-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, virtualNetworkRuleName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualNetworkRuleInner> getAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        return getWithResponseAsync(resourceGroupName, serverName, virtualNetworkRuleName)
            .flatMap((SimpleResponse<VirtualNetworkRuleInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkRuleInner get(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        return getAsync(resourceGroupName, serverName, virtualNetworkRuleName).block();
    }

    /**
     * Creates or updates an existing virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @param parameters A virtual network rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName, VirtualNetworkRuleInner parameters) {
        final String apiVersion = "2015-05-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, virtualNetworkRuleName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates an existing virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @param parameters A virtual network rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualNetworkRuleInner> createOrUpdateAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName, VirtualNetworkRuleInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, virtualNetworkRuleName, parameters);
        return this.client.<VirtualNetworkRuleInner, VirtualNetworkRuleInner>getLroResultAsync(response, this.client.getHttpPipeline(), VirtualNetworkRuleInner.class, VirtualNetworkRuleInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates an existing virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @param parameters A virtual network rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkRuleInner createOrUpdate(String resourceGroupName, String serverName, String virtualNetworkRuleName, VirtualNetworkRuleInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, virtualNetworkRuleName, parameters).block();
    }

    /**
     * Deletes the virtual network rule with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        final String apiVersion = "2015-05-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, serverName, virtualNetworkRuleName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the virtual network rule with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, serverName, virtualNetworkRuleName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the virtual network rule with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        deleteAsync(resourceGroupName, serverName, virtualNetworkRuleName).block();
    }

    /**
     * Gets a list of virtual network rules in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualNetworkRuleInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2015-05-01-preview";
        return service.listByServer(this.client.getHost(), resourceGroupName, serverName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of virtual network rules in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualNetworkRuleInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of virtual network rules in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetworkRuleInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * Creates or updates an existing virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @param parameters A virtual network rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualNetworkRuleInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName, VirtualNetworkRuleInner parameters) {
        final String apiVersion = "2015-05-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, virtualNetworkRuleName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates an existing virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @param parameters A virtual network rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualNetworkRuleInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName, VirtualNetworkRuleInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, virtualNetworkRuleName, parameters)
            .flatMap((SimpleResponse<VirtualNetworkRuleInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates an existing virtual network rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @param parameters A virtual network rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkRuleInner beginCreateOrUpdate(String resourceGroupName, String serverName, String virtualNetworkRuleName, VirtualNetworkRuleInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, virtualNetworkRuleName, parameters).block();
    }

    /**
     * Deletes the virtual network rule with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        final String apiVersion = "2015-05-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, serverName, virtualNetworkRuleName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the virtual network rule with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        return beginDeleteWithResponseAsync(resourceGroupName, serverName, virtualNetworkRuleName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the virtual network rule with the given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param virtualNetworkRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        beginDeleteAsync(resourceGroupName, serverName, virtualNetworkRuleName).block();
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
    public Mono<PagedResponse<VirtualNetworkRuleInner>> listByServerNextSinglePageAsync(String nextLink) {
        return service.listByServerNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
