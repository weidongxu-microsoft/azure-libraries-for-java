// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
 * EncryptionProtectors.
 */
public final class EncryptionProtectorsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private EncryptionProtectorsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of EncryptionProtectorsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public EncryptionProtectorsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(EncryptionProtectorsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientEncryptionProtectors to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientEncryptionProtectors")
    private interface EncryptionProtectorsService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector/{encryptionProtectorName}/revalidate")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> revalidate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("encryptionProtectorName") String encryptionProtectorName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<EncryptionProtectorListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector/{encryptionProtectorName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<EncryptionProtectorInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("encryptionProtectorName") String encryptionProtectorName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector/{encryptionProtectorName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("encryptionProtectorName") String encryptionProtectorName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") EncryptionProtectorInner parameters);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector/{encryptionProtectorName}/revalidate")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginRevalidate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("encryptionProtectorName") String encryptionProtectorName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector/{encryptionProtectorName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<EncryptionProtectorInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("encryptionProtectorName") String encryptionProtectorName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") EncryptionProtectorInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<EncryptionProtectorListResultInner>> listByServerNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> revalidateWithResponseAsync(String resourceGroupName, String serverName) {
        final String encryptionProtectorName = "current";
        final String apiVersion = "2015-05-01-preview";
        return service.revalidate(this.client.getHost(), resourceGroupName, serverName, encryptionProtectorName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> revalidateAsync(String resourceGroupName, String serverName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = revalidateWithResponseAsync(resourceGroupName, serverName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void revalidate(String resourceGroupName, String serverName) {
        revalidateAsync(resourceGroupName, serverName).block();
    }

    /**
     * Gets a list of server encryption protectors.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<EncryptionProtectorInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
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
     * Gets a list of server encryption protectors.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<EncryptionProtectorInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of server encryption protectors.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EncryptionProtectorInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * Gets a server encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EncryptionProtectorInner>> getWithResponseAsync(String resourceGroupName, String serverName) {
        final String encryptionProtectorName = "current";
        final String apiVersion = "2015-05-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, encryptionProtectorName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a server encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EncryptionProtectorInner> getAsync(String resourceGroupName, String serverName) {
        return getWithResponseAsync(resourceGroupName, serverName)
            .flatMap((SimpleResponse<EncryptionProtectorInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a server encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionProtectorInner get(String resourceGroupName, String serverName) {
        return getAsync(resourceGroupName, serverName).block();
    }

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        final String encryptionProtectorName = "current";
        final String apiVersion = "2015-05-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, encryptionProtectorName, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EncryptionProtectorInner> createOrUpdateAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, parameters);
        return this.client.<EncryptionProtectorInner, EncryptionProtectorInner>getLroResultAsync(response, this.client.getHttpPipeline(), EncryptionProtectorInner.class, EncryptionProtectorInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionProtectorInner createOrUpdate(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, parameters).block();
    }

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginRevalidateWithResponseAsync(String resourceGroupName, String serverName) {
        final String encryptionProtectorName = "current";
        final String apiVersion = "2015-05-01-preview";
        return service.beginRevalidate(this.client.getHost(), resourceGroupName, serverName, encryptionProtectorName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginRevalidateAsync(String resourceGroupName, String serverName) {
        return beginRevalidateWithResponseAsync(resourceGroupName, serverName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginRevalidate(String resourceGroupName, String serverName) {
        beginRevalidateAsync(resourceGroupName, serverName).block();
    }

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EncryptionProtectorInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        final String encryptionProtectorName = "current";
        final String apiVersion = "2015-05-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, encryptionProtectorName, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EncryptionProtectorInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, parameters)
            .flatMap((SimpleResponse<EncryptionProtectorInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionProtectorInner beginCreateOrUpdate(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, parameters).block();
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
    public Mono<PagedResponse<EncryptionProtectorInner>> listByServerNextSinglePageAsync(String nextLink) {
        return service.listByServerNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
