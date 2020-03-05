// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VirtualMachineScaleSetUpdate model.
 */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSetUpdate extends UpdateResource {
    /*
     * The virtual machine scale set sku.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The purchase plan when deploying a virtual machine scale set from VM
     * Marketplace images.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * The identity of the virtual machine scale set, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineScaleSetIdentity identity;

    /*
     * The upgrade policy.
     */
    @JsonProperty(value = "properties.upgradePolicy")
    private UpgradePolicy upgradePolicy;

    /*
     * Policy for automatic repairs.
     */
    @JsonProperty(value = "properties.automaticRepairsPolicy")
    private AutomaticRepairsPolicy automaticRepairsPolicy;

    /*
     * The virtual machine profile.
     */
    @JsonProperty(value = "properties.virtualMachineProfile")
    private VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile;

    /*
     * Specifies whether the Virtual Machine Scale Set should be
     * overprovisioned.
     */
    @JsonProperty(value = "properties.overprovision")
    private Boolean overprovision;

    /*
     * When Overprovision is enabled, extensions are launched only on the
     * requested number of VMs which are finally kept. This property will hence
     * ensure that the extensions do not run on the extra overprovisioned VMs.
     */
    @JsonProperty(value = "properties.doNotRunExtensionsOnOverprovisionedVMs")
    private Boolean doNotRunExtensionsOnOverprovisionedVMs;

    /*
     * When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines.
     */
    @JsonProperty(value = "properties.singlePlacementGroup")
    private Boolean singlePlacementGroup;

    /*
     * Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the
     * Virtual Machines have the capability to support attaching managed data
     * disks with UltraSSD_LRS storage account type.
     */
    @JsonProperty(value = "properties.additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /*
     * Specifies the scale-in policy that decides which virtual machines are
     * chosen for removal when a Virtual Machine Scale Set is scaled-in.
     */
    @JsonProperty(value = "properties.scaleInPolicy")
    private ScaleInPolicy scaleInPolicy;

    /*
     * Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. <br><br>Minimum
     * api-version: 2018-04-01.
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /**
     * Get the sku property: The virtual machine scale set sku.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The virtual machine scale set sku.
     * 
     * @param sku the sku value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the plan property: The purchase plan when deploying a virtual
     * machine scale set from VM Marketplace images.
     * 
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: The purchase plan when deploying a virtual
     * machine scale set from VM Marketplace images.
     * 
     * @param plan the plan value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the identity property: The identity of the virtual machine scale
     * set, if configured.
     * 
     * @return the identity value.
     */
    public VirtualMachineScaleSetIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the virtual machine scale
     * set, if configured.
     * 
     * @param identity the identity value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withIdentity(VirtualMachineScaleSetIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the upgradePolicy property: The upgrade policy.
     * 
     * @return the upgradePolicy value.
     */
    public UpgradePolicy upgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set the upgradePolicy property: The upgrade policy.
     * 
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withUpgradePolicy(UpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get the automaticRepairsPolicy property: Policy for automatic repairs.
     * 
     * @return the automaticRepairsPolicy value.
     */
    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.automaticRepairsPolicy;
    }

    /**
     * Set the automaticRepairsPolicy property: Policy for automatic repairs.
     * 
     * @param automaticRepairsPolicy the automaticRepairsPolicy value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        this.automaticRepairsPolicy = automaticRepairsPolicy;
        return this;
    }

    /**
     * Get the virtualMachineProfile property: The virtual machine profile.
     * 
     * @return the virtualMachineProfile value.
     */
    public VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile() {
        return this.virtualMachineProfile;
    }

    /**
     * Set the virtualMachineProfile property: The virtual machine profile.
     * 
     * @param virtualMachineProfile the virtualMachineProfile value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withVirtualMachineProfile(VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile) {
        this.virtualMachineProfile = virtualMachineProfile;
        return this;
    }

    /**
     * Get the overprovision property: Specifies whether the Virtual Machine
     * Scale Set should be overprovisioned.
     * 
     * @return the overprovision value.
     */
    public Boolean overprovision() {
        return this.overprovision;
    }

    /**
     * Set the overprovision property: Specifies whether the Virtual Machine
     * Scale Set should be overprovisioned.
     * 
     * @param overprovision the overprovision value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withOverprovision(Boolean overprovision) {
        this.overprovision = overprovision;
        return this;
    }

    /**
     * Get the doNotRunExtensionsOnOverprovisionedVMs property: When
     * Overprovision is enabled, extensions are launched only on the requested
     * number of VMs which are finally kept. This property will hence ensure
     * that the extensions do not run on the extra overprovisioned VMs.
     * 
     * @return the doNotRunExtensionsOnOverprovisionedVMs value.
     */
    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.doNotRunExtensionsOnOverprovisionedVMs;
    }

    /**
     * Set the doNotRunExtensionsOnOverprovisionedVMs property: When
     * Overprovision is enabled, extensions are launched only on the requested
     * number of VMs which are finally kept. This property will hence ensure
     * that the extensions do not run on the extra overprovisioned VMs.
     * 
     * @param doNotRunExtensionsOnOverprovisionedVMs the
     * doNotRunExtensionsOnOverprovisionedVMs value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withDoNotRunExtensionsOnOverprovisionedVMs(Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        this.doNotRunExtensionsOnOverprovisionedVMs = doNotRunExtensionsOnOverprovisionedVMs;
        return this;
    }

    /**
     * Get the singlePlacementGroup property: When true this limits the scale
     * set to a single placement group, of max size 100 virtual machines.
     * 
     * @return the singlePlacementGroup value.
     */
    public Boolean singlePlacementGroup() {
        return this.singlePlacementGroup;
    }

    /**
     * Set the singlePlacementGroup property: When true this limits the scale
     * set to a single placement group, of max size 100 virtual machines.
     * 
     * @param singlePlacementGroup the singlePlacementGroup value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withSinglePlacementGroup(Boolean singlePlacementGroup) {
        this.singlePlacementGroup = singlePlacementGroup;
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional
     * capabilities enabled or disabled on the Virtual Machines in the Virtual
     * Machine Scale Set. For instance: whether the Virtual Machines have the
     * capability to support attaching managed data disks with UltraSSD_LRS
     * storage account type.
     * 
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set the additionalCapabilities property: Specifies additional
     * capabilities enabled or disabled on the Virtual Machines in the Virtual
     * Machine Scale Set. For instance: whether the Virtual Machines have the
     * capability to support attaching managed data disks with UltraSSD_LRS
     * storage account type.
     * 
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get the scaleInPolicy property: Specifies the scale-in policy that
     * decides which virtual machines are chosen for removal when a Virtual
     * Machine Scale Set is scaled-in.
     * 
     * @return the scaleInPolicy value.
     */
    public ScaleInPolicy scaleInPolicy() {
        return this.scaleInPolicy;
    }

    /**
     * Set the scaleInPolicy property: Specifies the scale-in policy that
     * decides which virtual machines are chosen for removal when a Virtual
     * Machine Scale Set is scaled-in.
     * 
     * @param scaleInPolicy the scaleInPolicy value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        this.scaleInPolicy = scaleInPolicy;
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about
     * the proximity placement group that the virtual machine scale set should
     * be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     * 
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about
     * the proximity placement group that the virtual machine scale set should
     * be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     * 
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }
}
