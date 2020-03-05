// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

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
 * VirtualMachineScaleSetRollingUpgrades.
 */
public final class VirtualMachineScaleSetRollingUpgradesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualMachineScaleSetRollingUpgradesService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineScaleSetRollingUpgradesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineScaleSetRollingUpgradesInner(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(VirtualMachineScaleSetRollingUpgradesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ComputeManagementClientVirtualMachineScaleSetRollingUpgrades to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementClientVirtualMachineScaleSetRollingUpgrades")
    private interface VirtualMachineScaleSetRollingUpgradesService {
        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> cancel(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> startOSUpgrade(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensionRollingUpgrade")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> startExtensionUpgrade(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/latest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RollingUpgradeStatusInfoInner>> getLatest(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginCancel(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginStartOSUpgrade(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json", "Accept: application/json;q=0.9" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensionRollingUpgrade")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginStartExtensionUpgrade(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> cancelWithResponseAsync(String resourceGroupName, String vmScaleSetName) {
        final String apiVersion = "2019-03-01";
        return service.cancel(this.client.getHost(), resourceGroupName, vmScaleSetName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelAsync(String resourceGroupName, String vmScaleSetName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = cancelWithResponseAsync(resourceGroupName, vmScaleSetName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancel(String resourceGroupName, String vmScaleSetName) {
        cancelAsync(resourceGroupName, vmScaleSetName).block();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> startOSUpgradeWithResponseAsync(String resourceGroupName, String vmScaleSetName) {
        final String apiVersion = "2019-03-01";
        return service.startOSUpgrade(this.client.getHost(), resourceGroupName, vmScaleSetName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> startOSUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = startOSUpgradeWithResponseAsync(resourceGroupName, vmScaleSetName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void startOSUpgrade(String resourceGroupName, String vmScaleSetName) {
        startOSUpgradeAsync(resourceGroupName, vmScaleSetName).block();
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> startExtensionUpgradeWithResponseAsync(String resourceGroupName, String vmScaleSetName) {
        final String apiVersion = "2019-03-01";
        return service.startExtensionUpgrade(this.client.getHost(), resourceGroupName, vmScaleSetName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> startExtensionUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = startExtensionUpgradeWithResponseAsync(resourceGroupName, vmScaleSetName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void startExtensionUpgrade(String resourceGroupName, String vmScaleSetName) {
        startExtensionUpgradeAsync(resourceGroupName, vmScaleSetName).block();
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RollingUpgradeStatusInfoInner>> getLatestWithResponseAsync(String resourceGroupName, String vmScaleSetName) {
        final String apiVersion = "2019-03-01";
        return service.getLatest(this.client.getHost(), resourceGroupName, vmScaleSetName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RollingUpgradeStatusInfoInner> getLatestAsync(String resourceGroupName, String vmScaleSetName) {
        return getLatestWithResponseAsync(resourceGroupName, vmScaleSetName)
            .flatMap((SimpleResponse<RollingUpgradeStatusInfoInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RollingUpgradeStatusInfoInner getLatest(String resourceGroupName, String vmScaleSetName) {
        return getLatestAsync(resourceGroupName, vmScaleSetName).block();
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginCancelWithResponseAsync(String resourceGroupName, String vmScaleSetName) {
        final String apiVersion = "2019-03-01";
        return service.beginCancel(this.client.getHost(), resourceGroupName, vmScaleSetName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginCancelAsync(String resourceGroupName, String vmScaleSetName) {
        return beginCancelWithResponseAsync(resourceGroupName, vmScaleSetName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginCancel(String resourceGroupName, String vmScaleSetName) {
        beginCancelAsync(resourceGroupName, vmScaleSetName).block();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginStartOSUpgradeWithResponseAsync(String resourceGroupName, String vmScaleSetName) {
        final String apiVersion = "2019-03-01";
        return service.beginStartOSUpgrade(this.client.getHost(), resourceGroupName, vmScaleSetName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginStartOSUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        return beginStartOSUpgradeWithResponseAsync(resourceGroupName, vmScaleSetName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginStartOSUpgrade(String resourceGroupName, String vmScaleSetName) {
        beginStartOSUpgradeAsync(resourceGroupName, vmScaleSetName).block();
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginStartExtensionUpgradeWithResponseAsync(String resourceGroupName, String vmScaleSetName) {
        final String apiVersion = "2019-03-01";
        return service.beginStartExtensionUpgrade(this.client.getHost(), resourceGroupName, vmScaleSetName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginStartExtensionUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        return beginStartExtensionUpgradeWithResponseAsync(resourceGroupName, vmScaleSetName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginStartExtensionUpgrade(String resourceGroupName, String vmScaleSetName) {
        beginStartExtensionUpgradeAsync(resourceGroupName, vmScaleSetName).block();
    }
}
