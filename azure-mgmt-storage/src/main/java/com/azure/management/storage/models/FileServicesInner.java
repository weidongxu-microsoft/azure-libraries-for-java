// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.BodyParam;
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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.management.storage.CorsRules;
import com.azure.management.storage.DeleteRetentionPolicy;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * FileServices.
 */
public final class FileServicesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private FileServicesService service;

    /**
     * The service client containing this operation class.
     */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of FileServicesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public FileServicesInner(StorageManagementClientImpl client) {
        this.service = RestProxy.create(FileServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * StorageManagementClientFileServices to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementClientFileServices")
    private interface FileServicesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/fileServices")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FileServiceItemsInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/fileServices/{FileServicesName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FileServicePropertiesInner>> setServiceProperties(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @PathParam("FileServicesName") String fileServicesName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") FileServicePropertiesInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/fileServices/{FileServicesName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FileServicePropertiesInner>> getServiceProperties(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @PathParam("FileServicesName") String fileServicesName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * List all file services in storage accounts.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileServiceItemsInner>> listWithResponseAsync(String resourceGroupName, String accountName) {
        return service.list(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * List all file services in storage accounts.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FileServiceItemsInner> listAsync(String resourceGroupName, String accountName) {
        return listWithResponseAsync(resourceGroupName, accountName)
            .flatMap((SimpleResponse<FileServiceItemsInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * List all file services in storage accounts.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileServiceItemsInner list(String resourceGroupName, String accountName) {
        return listAsync(resourceGroupName, accountName).block();
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param cors Sets the CORS rules. You can include up to five CorsRule elements in the request.
     * @param shareDeleteRetentionPolicy The service properties for soft delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileServicePropertiesInner>> setServicePropertiesWithResponseAsync(String resourceGroupName, String accountName, CorsRules cors, DeleteRetentionPolicy shareDeleteRetentionPolicy) {
        final String fileServicesName = "default";
        FileServicePropertiesInner parameters = new FileServicePropertiesInner();
        parameters.setCors(cors);
        parameters.setShareDeleteRetentionPolicy(shareDeleteRetentionPolicy);
        return service.setServiceProperties(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), fileServicesName, this.client.getApiVersion(), parameters);
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param cors Sets the CORS rules. You can include up to five CorsRule elements in the request.
     * @param shareDeleteRetentionPolicy The service properties for soft delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FileServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, CorsRules cors, DeleteRetentionPolicy shareDeleteRetentionPolicy) {
        return setServicePropertiesWithResponseAsync(resourceGroupName, accountName, cors, shareDeleteRetentionPolicy)
            .flatMap((SimpleResponse<FileServicePropertiesInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param cors Sets the CORS rules. You can include up to five CorsRule elements in the request.
     * @param shareDeleteRetentionPolicy The service properties for soft delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileServicePropertiesInner setServiceProperties(String resourceGroupName, String accountName, CorsRules cors, DeleteRetentionPolicy shareDeleteRetentionPolicy) {
        return setServicePropertiesAsync(resourceGroupName, accountName, cors, shareDeleteRetentionPolicy).block();
    }

    /**
     * Gets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileServicePropertiesInner>> getServicePropertiesWithResponseAsync(String resourceGroupName, String accountName) {
        final String fileServicesName = "default";
        return service.getServiceProperties(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), fileServicesName, this.client.getApiVersion());
    }

    /**
     * Gets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FileServicePropertiesInner> getServicePropertiesAsync(String resourceGroupName, String accountName) {
        return getServicePropertiesWithResponseAsync(resourceGroupName, accountName)
            .flatMap((SimpleResponse<FileServicePropertiesInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileServicePropertiesInner getServiceProperties(String resourceGroupName, String accountName) {
        return getServicePropertiesAsync(resourceGroupName, accountName).block();
    }
}
