// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

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
 * GalleryImageVersions.
 */
public final class GalleryImageVersionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private GalleryImageVersionsService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of GalleryImageVersionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public GalleryImageVersionsInner(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(GalleryImageVersionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ComputeManagementClientGalleryImageVersions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementClientGalleryImageVersions")
    private interface GalleryImageVersionsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}/versions/{galleryImageVersionName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryImageName") String galleryImageName, @PathParam("galleryImageVersionName") String galleryImageVersionName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") GalleryImageVersionInner galleryImageVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}/versions/{galleryImageVersionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryImageVersionInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryImageName") String galleryImageName, @PathParam("galleryImageVersionName") String galleryImageVersionName, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}/versions/{galleryImageVersionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryImageName") String galleryImageName, @PathParam("galleryImageVersionName") String galleryImageVersionName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}/versions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryImageVersionListInner>> listByGalleryImage(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryImageName") String galleryImageName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}/versions/{galleryImageVersionName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryImageVersionInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryImageName") String galleryImageName, @PathParam("galleryImageVersionName") String galleryImageVersionName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") GalleryImageVersionInner galleryImageVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}/versions/{galleryImageVersionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryImageName") String galleryImageName, @PathParam("galleryImageVersionName") String galleryImageVersionName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryImageVersionListInner>> listByGalleryImageNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Create or update a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @param galleryImageVersion Specifies information about the gallery Image Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName, GalleryImageVersionInner galleryImageVersion) {
        final String apiVersion = "2019-03-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, apiVersion, galleryImageVersion);
    }

    /**
     * Create or update a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @param galleryImageVersion Specifies information about the gallery Image Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryImageVersionInner> createOrUpdateAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName, GalleryImageVersionInner galleryImageVersion) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, galleryImageVersion);
        return this.client.<GalleryImageVersionInner, GalleryImageVersionInner>getLroResultAsync(response, this.client.getHttpPipeline(), GalleryImageVersionInner.class, GalleryImageVersionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Create or update a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @param galleryImageVersion Specifies information about the gallery Image Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImageVersionInner createOrUpdate(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName, GalleryImageVersionInner galleryImageVersion) {
        return createOrUpdateAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, galleryImageVersion).block();
    }

    /**
     * Retrieves information about a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GalleryImageVersionInner>> getWithResponseAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        final String expand = "ReplicationStatus";
        final String apiVersion = "2019-03-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, expand, apiVersion);
    }

    /**
     * Retrieves information about a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryImageVersionInner> getAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        return getWithResponseAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName)
            .flatMap((SimpleResponse<GalleryImageVersionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves information about a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImageVersionInner get(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        return getAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName).block();
    }

    /**
     * Delete a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        final String apiVersion = "2019-03-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, apiVersion);
    }

    /**
     * Delete a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Delete a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        deleteAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName).block();
    }

    /**
     * List gallery Image Versions in a gallery Image Definition.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<GalleryImageVersionInner>> listByGalleryImageSinglePageAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        final String apiVersion = "2019-03-01";
        return service.listByGalleryImage(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryImageName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * List gallery Image Versions in a gallery Image Definition.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<GalleryImageVersionInner> listByGalleryImageAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        return new PagedFlux<>(
            () -> listByGalleryImageSinglePageAsync(resourceGroupName, galleryName, galleryImageName),
            nextLink -> listByGalleryImageNextSinglePageAsync(nextLink));
    }

    /**
     * List gallery Image Versions in a gallery Image Definition.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GalleryImageVersionInner> listByGalleryImage(String resourceGroupName, String galleryName, String galleryImageName) {
        return new PagedIterable<>(listByGalleryImageAsync(resourceGroupName, galleryName, galleryImageName));
    }

    /**
     * Create or update a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @param galleryImageVersion Specifies information about the gallery Image Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GalleryImageVersionInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName, GalleryImageVersionInner galleryImageVersion) {
        final String apiVersion = "2019-03-01";
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, apiVersion, galleryImageVersion);
    }

    /**
     * Create or update a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @param galleryImageVersion Specifies information about the gallery Image Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryImageVersionInner> beginCreateOrUpdateAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName, GalleryImageVersionInner galleryImageVersion) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, galleryImageVersion)
            .flatMap((SimpleResponse<GalleryImageVersionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Create or update a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @param galleryImageVersion Specifies information about the gallery Image Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImageVersionInner beginCreateOrUpdate(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName, GalleryImageVersionInner galleryImageVersion) {
        return beginCreateOrUpdateAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, galleryImageVersion).block();
    }

    /**
     * Delete a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        final String apiVersion = "2019-03-01";
        return service.beginDelete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, apiVersion);
    }

    /**
     * Delete a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete a gallery Image Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryImageName 
     * @param galleryImageVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        beginDeleteAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName).block();
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
    public Mono<PagedResponse<GalleryImageVersionInner>> listByGalleryImageNextSinglePageAsync(String nextLink) {
        return service.listByGalleryImageNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
