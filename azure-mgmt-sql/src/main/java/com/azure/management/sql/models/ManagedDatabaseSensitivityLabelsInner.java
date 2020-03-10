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
import com.azure.management.sql.SensitivityLabelSource;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedDatabaseSensitivityLabels.
 */
public final class ManagedDatabaseSensitivityLabelsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ManagedDatabaseSensitivityLabelsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedDatabaseSensitivityLabelsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ManagedDatabaseSensitivityLabelsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ManagedDatabaseSensitivityLabelsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientManagedDatabaseSensitivityLabels to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientManagedDatabaseSensitivityLabels")
    private interface ManagedDatabaseSensitivityLabelsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/schemas/{schemaName}/tables/{tableName}/columns/{columnName}/sensitivityLabels/{sensitivityLabelSource}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SensitivityLabelInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("schemaName") String schemaName, @PathParam("tableName") String tableName, @PathParam("columnName") String columnName, @PathParam("sensitivityLabelSource") SensitivityLabelSource sensitivityLabelSource, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/schemas/{schemaName}/tables/{tableName}/columns/{columnName}/sensitivityLabels/{sensitivityLabelSource}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SensitivityLabelInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("schemaName") String schemaName, @PathParam("tableName") String tableName, @PathParam("columnName") String columnName, @PathParam("sensitivityLabelSource") String sensitivityLabelSource, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") SensitivityLabelInner parameters);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/schemas/{schemaName}/tables/{tableName}/columns/{columnName}/sensitivityLabels/{sensitivityLabelSource}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("schemaName") String schemaName, @PathParam("tableName") String tableName, @PathParam("columnName") String columnName, @PathParam("sensitivityLabelSource") String sensitivityLabelSource, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/schemas/{schemaName}/tables/{tableName}/columns/{columnName}/sensitivityLabels/{sensitivityLabelSource}/disable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> disableRecommendation(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("schemaName") String schemaName, @PathParam("tableName") String tableName, @PathParam("columnName") String columnName, @PathParam("sensitivityLabelSource") String sensitivityLabelSource, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/schemas/{schemaName}/tables/{tableName}/columns/{columnName}/sensitivityLabels/{sensitivityLabelSource}/enable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> enableRecommendation(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("schemaName") String schemaName, @PathParam("tableName") String tableName, @PathParam("columnName") String columnName, @PathParam("sensitivityLabelSource") String sensitivityLabelSource, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/currentSensitivityLabels")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SensitivityLabelListResultInner>> listCurrentByDatabase(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @QueryParam("$filter") String filter, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/recommendedSensitivityLabels")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SensitivityLabelListResultInner>> listRecommendedByDatabase(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @QueryParam("includeDisabledRecommendations") Boolean includeDisabledRecommendations, @QueryParam("$skipToken") String skipToken, @QueryParam("$filter") String filter, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SensitivityLabelListResultInner>> listCurrentByDatabaseNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SensitivityLabelListResultInner>> listRecommendedByDatabaseNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @param sensitivityLabelSource 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SensitivityLabelInner>> getWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName, SensitivityLabelSource sensitivityLabelSource) {
        final String apiVersion = "2018-06-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, sensitivityLabelSource, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @param sensitivityLabelSource 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SensitivityLabelInner> getAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName, SensitivityLabelSource sensitivityLabelSource) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, sensitivityLabelSource)
            .flatMap((SimpleResponse<SensitivityLabelInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @param sensitivityLabelSource 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SensitivityLabelInner get(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName, SensitivityLabelSource sensitivityLabelSource) {
        return getAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, sensitivityLabelSource).block();
    }

    /**
     * Creates or updates the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @param parameters A sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SensitivityLabelInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName, SensitivityLabelInner parameters) {
        final String sensitivityLabelSource = "current";
        final String apiVersion = "2018-06-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, sensitivityLabelSource, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Creates or updates the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @param parameters A sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SensitivityLabelInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName, SensitivityLabelInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, parameters)
            .flatMap((SimpleResponse<SensitivityLabelInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @param parameters A sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SensitivityLabelInner createOrUpdate(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName, SensitivityLabelInner parameters) {
        return createOrUpdateAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, parameters).block();
    }

    /**
     * Deletes the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        final String sensitivityLabelSource = "current";
        final String apiVersion = "2018-06-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, sensitivityLabelSource, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        return deleteWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the sensitivity label of a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        deleteAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName).block();
    }

    /**
     * Disables sensitivity recommendations on a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> disableRecommendationWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        final String sensitivityLabelSource = "recommended";
        final String apiVersion = "2018-06-01-preview";
        return service.disableRecommendation(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, sensitivityLabelSource, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Disables sensitivity recommendations on a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> disableRecommendationAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        return disableRecommendationWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Disables sensitivity recommendations on a given column.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void disableRecommendation(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        disableRecommendationAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName).block();
    }

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> enableRecommendationWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        final String sensitivityLabelSource = "recommended";
        final String apiVersion = "2018-06-01-preview";
        return service.enableRecommendation(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, sensitivityLabelSource, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> enableRecommendationAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        return enableRecommendationWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param schemaName 
     * @param tableName 
     * @param columnName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void enableRecommendation(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName) {
        enableRecommendationAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName).block();
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SensitivityLabelInner>> listCurrentByDatabaseSinglePageAsync(String resourceGroupName, String managedInstanceName, String databaseName, String filter) {
        final String apiVersion = "2018-06-01-preview";
        return service.listCurrentByDatabase(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, filter, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SensitivityLabelInner> listCurrentByDatabaseAsync(String resourceGroupName, String managedInstanceName, String databaseName, String filter) {
        return new PagedFlux<>(
            () -> listCurrentByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName, filter),
            nextLink -> listCurrentByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SensitivityLabelInner> listCurrentByDatabaseAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listCurrentByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName, filter),
            nextLink -> listCurrentByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SensitivityLabelInner> listCurrentByDatabase(String resourceGroupName, String managedInstanceName, String databaseName, String filter) {
        return new PagedIterable<>(listCurrentByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName, filter));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SensitivityLabelInner> listCurrentByDatabase(String resourceGroupName, String managedInstanceName, String databaseName) {
        final String filter = null;
        return new PagedIterable<>(listCurrentByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName, filter));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param includeDisabledRecommendations 
     * @param skipToken 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SensitivityLabelInner>> listRecommendedByDatabaseSinglePageAsync(String resourceGroupName, String managedInstanceName, String databaseName, Boolean includeDisabledRecommendations, String skipToken, String filter) {
        final String apiVersion = "2018-06-01-preview";
        return service.listRecommendedByDatabase(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, includeDisabledRecommendations, skipToken, filter, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param includeDisabledRecommendations 
     * @param skipToken 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SensitivityLabelInner> listRecommendedByDatabaseAsync(String resourceGroupName, String managedInstanceName, String databaseName, Boolean includeDisabledRecommendations, String skipToken, String filter) {
        return new PagedFlux<>(
            () -> listRecommendedByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName, includeDisabledRecommendations, skipToken, filter),
            nextLink -> listRecommendedByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SensitivityLabelInner> listRecommendedByDatabaseAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        final Boolean includeDisabledRecommendations = null;
        final String skipToken = null;
        final String filter = null;
        return new PagedFlux<>(
            () -> listRecommendedByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName, includeDisabledRecommendations, skipToken, filter),
            nextLink -> listRecommendedByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param includeDisabledRecommendations 
     * @param skipToken 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SensitivityLabelInner> listRecommendedByDatabase(String resourceGroupName, String managedInstanceName, String databaseName, Boolean includeDisabledRecommendations, String skipToken, String filter) {
        return new PagedIterable<>(listRecommendedByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName, includeDisabledRecommendations, skipToken, filter));
    }

    /**
     * Gets the sensitivity labels of a given database.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SensitivityLabelInner> listRecommendedByDatabase(String resourceGroupName, String managedInstanceName, String databaseName) {
        final Boolean includeDisabledRecommendations = null;
        final String skipToken = null;
        final String filter = null;
        return new PagedIterable<>(listRecommendedByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName, includeDisabledRecommendations, skipToken, filter));
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
    public Mono<PagedResponse<SensitivityLabelInner>> listCurrentByDatabaseNextSinglePageAsync(String nextLink) {
        return service.listCurrentByDatabaseNext(nextLink).map(res -> new PagedResponseBase<>(
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
    public Mono<PagedResponse<SensitivityLabelInner>> listRecommendedByDatabaseNextSinglePageAsync(String nextLink) {
        return service.listRecommendedByDatabaseNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
