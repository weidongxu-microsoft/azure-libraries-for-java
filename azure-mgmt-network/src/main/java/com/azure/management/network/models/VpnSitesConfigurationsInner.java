// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.network.ErrorException;
import com.azure.management.network.GetVpnSitesConfigurationRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VpnSitesConfigurations.
 */
public final class VpnSitesConfigurationsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VpnSitesConfigurationsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnSitesConfigurationsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VpnSitesConfigurationsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VpnSitesConfigurationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVpnSitesConfigurations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientVpnSitesConfigurations")
    private interface VpnSitesConfigurationsService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWANName}/vpnConfiguration")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> download(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWANName") String virtualWANName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") GetVpnSitesConfigurationRequest request);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWANName}/vpnConfiguration")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> beginDownload(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWANName") String virtualWANName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") GetVpnSitesConfigurationRequest request);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> downloadWithResponseAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        final String apiVersion = "2019-06-01";
        return service.download(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWANName, apiVersion, request);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> downloadAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = downloadWithResponseAsync(resourceGroupName, virtualWANName, request);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void download(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        downloadAsync(resourceGroupName, virtualWANName, request).block();
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDownloadWithResponseAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        final String apiVersion = "2019-06-01";
        return service.beginDownload(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWANName, apiVersion, request);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDownloadAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        return beginDownloadWithResponseAsync(resourceGroupName, virtualWANName, request)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDownload(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        beginDownloadAsync(resourceGroupName, virtualWANName, request).block();
    }
}