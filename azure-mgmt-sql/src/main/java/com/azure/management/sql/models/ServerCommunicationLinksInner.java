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
 * ServerCommunicationLinks.
 */
public final class ServerCommunicationLinksInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServerCommunicationLinksService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerCommunicationLinksInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ServerCommunicationLinksInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ServerCommunicationLinksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientServerCommunicationLinks to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientServerCommunicationLinks")
    private interface ServerCommunicationLinksService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/communicationLinks/{communicationLinkName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("communicationLinkName") String communicationLinkName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/communicationLinks/{communicationLinkName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerCommunicationLinkInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("communicationLinkName") String communicationLinkName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/communicationLinks/{communicationLinkName}")
        @ExpectedResponses({201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("communicationLinkName") String communicationLinkName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ServerCommunicationLinkInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/communicationLinks")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerCommunicationLinkListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/communicationLinks/{communicationLinkName}")
        @ExpectedResponses({201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ServerCommunicationLinkInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("communicationLinkName") String communicationLinkName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ServerCommunicationLinkInner parameters);
    }

    /**
     * Deletes a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String serverName, String communicationLinkName) {
        final String apiVersion = "2014-04-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, communicationLinkName, apiVersion);
    }

    /**
     * Deletes a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String communicationLinkName) {
        return deleteWithResponseAsync(resourceGroupName, serverName, communicationLinkName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String communicationLinkName) {
        deleteAsync(resourceGroupName, serverName, communicationLinkName).block();
    }

    /**
     * Returns a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServerCommunicationLinkInner>> getWithResponseAsync(String resourceGroupName, String serverName, String communicationLinkName) {
        final String apiVersion = "2014-04-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, communicationLinkName, apiVersion);
    }

    /**
     * Returns a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerCommunicationLinkInner> getAsync(String resourceGroupName, String serverName, String communicationLinkName) {
        return getWithResponseAsync(resourceGroupName, serverName, communicationLinkName)
            .flatMap((SimpleResponse<ServerCommunicationLinkInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Returns a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerCommunicationLinkInner get(String resourceGroupName, String serverName, String communicationLinkName) {
        return getAsync(resourceGroupName, serverName, communicationLinkName).block();
    }

    /**
     * Creates a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @param partnerServer The name of the partner server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String communicationLinkName, String partnerServer) {
        final String apiVersion = "2014-04-01";
        ServerCommunicationLinkInner parameters = new ServerCommunicationLinkInner();
        parameters.withPartnerServer(partnerServer);
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, communicationLinkName, apiVersion, parameters);
    }

    /**
     * Creates a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @param partnerServer The name of the partner server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerCommunicationLinkInner> createOrUpdateAsync(String resourceGroupName, String serverName, String communicationLinkName, String partnerServer) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, communicationLinkName, partnerServer);
        return this.client.<ServerCommunicationLinkInner, ServerCommunicationLinkInner>getLroResultAsync(response, this.client.getHttpPipeline(), ServerCommunicationLinkInner.class, ServerCommunicationLinkInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @param partnerServer The name of the partner server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerCommunicationLinkInner createOrUpdate(String resourceGroupName, String serverName, String communicationLinkName, String partnerServer) {
        return createOrUpdateAsync(resourceGroupName, serverName, communicationLinkName, partnerServer).block();
    }

    /**
     * Gets a list of server communication links.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ServerCommunicationLinkInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2014-04-01";
        return service.listByServer(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            null,
            null));
    }

    /**
     * Gets a list of server communication links.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ServerCommunicationLinkInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName));
    }

    /**
     * Gets a list of server communication links.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServerCommunicationLinkInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * Creates a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @param partnerServer The name of the partner server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServerCommunicationLinkInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String communicationLinkName, String partnerServer) {
        final String apiVersion = "2014-04-01";
        ServerCommunicationLinkInner parameters = new ServerCommunicationLinkInner();
        parameters.withPartnerServer(partnerServer);
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, communicationLinkName, apiVersion, parameters);
    }

    /**
     * Creates a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @param partnerServer The name of the partner server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerCommunicationLinkInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String communicationLinkName, String partnerServer) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, communicationLinkName, partnerServer)
            .flatMap((SimpleResponse<ServerCommunicationLinkInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a server communication link.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param communicationLinkName 
     * @param partnerServer The name of the partner server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerCommunicationLinkInner beginCreateOrUpdate(String resourceGroupName, String serverName, String communicationLinkName, String partnerServer) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, communicationLinkName, partnerServer).block();
    }
}
