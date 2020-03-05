// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The VirtualMachineScaleSetUpdateStorageProfile model.
 */
@Fluent
public final class VirtualMachineScaleSetUpdateStorageProfile {
    /*
     * The image reference.
     */
    @JsonProperty(value = "imageReference")
    private ImageReference imageReference;

    /*
     * The OS disk.
     */
    @JsonProperty(value = "osDisk")
    private VirtualMachineScaleSetUpdateOSDisk osDisk;

    /*
     * The data disks.
     */
    @JsonProperty(value = "dataDisks")
    private List<VirtualMachineScaleSetDataDisk> dataDisks;

    /**
     * Get the imageReference property: The image reference.
     * 
     * @return the imageReference value.
     */
    public ImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: The image reference.
     * 
     * @param imageReference the imageReference value to set.
     * @return the VirtualMachineScaleSetUpdateStorageProfile object itself.
     */
    public VirtualMachineScaleSetUpdateStorageProfile withImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the osDisk property: The OS disk.
     * 
     * @return the osDisk value.
     */
    public VirtualMachineScaleSetUpdateOSDisk osDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: The OS disk.
     * 
     * @param osDisk the osDisk value to set.
     * @return the VirtualMachineScaleSetUpdateStorageProfile object itself.
     */
    public VirtualMachineScaleSetUpdateStorageProfile withOsDisk(VirtualMachineScaleSetUpdateOSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * Get the dataDisks property: The data disks.
     * 
     * @return the dataDisks value.
     */
    public List<VirtualMachineScaleSetDataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: The data disks.
     * 
     * @param dataDisks the dataDisks value to set.
     * @return the VirtualMachineScaleSetUpdateStorageProfile object itself.
     */
    public VirtualMachineScaleSetUpdateStorageProfile withDataDisks(List<VirtualMachineScaleSetDataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
}
