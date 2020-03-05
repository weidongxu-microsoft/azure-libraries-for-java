// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.management.appservice.DefaultErrorResponseException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * CertificateRegistrationProviders.
 */
public final class CertificateRegistrationProvidersInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private CertificateRegistrationProvidersService service;

    /**
     * The service client containing this operation class.
     */
    private WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of CertificateRegistrationProvidersInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public CertificateRegistrationProvidersInner(WebSiteManagementClientImpl client) {
        this.service = RestProxy.create(CertificateRegistrationProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * WebSiteManagementClientCertificateRegistrationProviders to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementClientCertificateRegistrationProviders")
    private interface CertificateRegistrationProvidersService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/providers/Microsoft.CertificateRegistration/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CsmOperationCollectionInner>> listOperations(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CsmOperationCollectionInner>> listOperationsNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource provider.
     * 
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsSinglePageAsync() {
        return service.listOperations(this.client.getHost(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource provider.
     * 
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CsmOperationDescriptionInner> listOperationsAsync() {
        return new PagedFlux<>(
            () -> listOperationsSinglePageAsync(),
            nextLink -> listOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource provider.
     * 
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CsmOperationDescriptionInner> listOperations() {
        return new PagedIterable<>(listOperationsAsync());
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsNextSinglePageAsync(String nextLink) {
        return service.listOperationsNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
