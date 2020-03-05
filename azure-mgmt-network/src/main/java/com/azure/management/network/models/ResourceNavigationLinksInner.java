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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ResourceNavigationLinks.
 */
public final class ResourceNavigationLinksInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ResourceNavigationLinksService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ResourceNavigationLinksInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ResourceNavigationLinksInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(ResourceNavigationLinksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientResourceNavigationLinks to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientResourceNavigationLinks")
    private interface ResourceNavigationLinksService {
        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}/ResourceNavigationLinks")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ResourceNavigationLinksListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subnetName") String subnetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Gets a list of resource navigation links for a subnet.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param subnetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ResourceNavigationLinksListResultInner>> listWithResponseAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), resourceGroupName, virtualNetworkName, subnetName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a list of resource navigation links for a subnet.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param subnetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResourceNavigationLinksListResultInner> listAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
        return listWithResponseAsync(resourceGroupName, virtualNetworkName, subnetName)
            .flatMap((SimpleResponse<ResourceNavigationLinksListResultInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a list of resource navigation links for a subnet.
     * 
     * @param resourceGroupName 
     * @param virtualNetworkName 
     * @param subnetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceNavigationLinksListResultInner list(String resourceGroupName, String virtualNetworkName, String subnetName) {
        return listAsync(resourceGroupName, virtualNetworkName, subnetName).block();
    }
}
