// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.management.appservice.DefaultErrorResponseException;
import com.azure.management.appservice.TopLevelDomainAgreementOption;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * TopLevelDomains.
 */
public final class TopLevelDomainsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private TopLevelDomainsService service;

    /**
     * The service client containing this operation class.
     */
    private WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of TopLevelDomainsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public TopLevelDomainsInner(WebSiteManagementClientImpl client) {
        this.service = RestProxy.create(TopLevelDomainsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * WebSiteManagementClientTopLevelDomains to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementClientTopLevelDomains")
    private interface TopLevelDomainsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<TopLevelDomainCollectionInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<TopLevelDomainInner>> get(@HostParam("$host") String host, @PathParam("name") String name, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}/listAgreements")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<TldLegalAgreementCollectionInner>> listAgreements(@HostParam("$host") String host, @PathParam("name") String name, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") TopLevelDomainAgreementOption agreementOption);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<TopLevelDomainCollectionInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<TldLegalAgreementCollectionInner>> listAgreementsNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Description for Get all top-level domains supported for registration.
     * 
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TopLevelDomainInner>> listSinglePageAsync() {
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Description for Get all top-level domains supported for registration.
     * 
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TopLevelDomainInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get all top-level domains supported for registration.
     * 
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TopLevelDomainInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Description for Get details of a top-level domain.
     * 
     * @param name 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<TopLevelDomainInner>> getWithResponseAsync(String name) {
        return service.get(this.client.getHost(), name, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * Description for Get details of a top-level domain.
     * 
     * @param name 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TopLevelDomainInner> getAsync(String name) {
        return getWithResponseAsync(name)
            .flatMap((SimpleResponse<TopLevelDomainInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Description for Get details of a top-level domain.
     * 
     * @param name 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TopLevelDomainInner get(String name) {
        return getAsync(name).block();
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     * 
     * @param name 
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TldLegalAgreementInner>> listAgreementsSinglePageAsync(String name, TopLevelDomainAgreementOption agreementOption) {
        return service.listAgreements(this.client.getHost(), name, this.client.getSubscriptionId(), this.client.getApiVersion(), agreementOption).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     * 
     * @param name 
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TldLegalAgreementInner> listAgreementsAsync(String name, TopLevelDomainAgreementOption agreementOption) {
        return new PagedFlux<>(
            () -> listAgreementsSinglePageAsync(name, agreementOption),
            nextLink -> listAgreementsNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     * 
     * @param name 
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TldLegalAgreementInner> listAgreements(String name, TopLevelDomainAgreementOption agreementOption) {
        return new PagedIterable<>(listAgreementsAsync(name, agreementOption));
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
    public Mono<PagedResponse<TopLevelDomainInner>> listNextSinglePageAsync(String nextLink) {
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
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TldLegalAgreementInner>> listAgreementsNextSinglePageAsync(String nextLink) {
        return service.listAgreementsNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
