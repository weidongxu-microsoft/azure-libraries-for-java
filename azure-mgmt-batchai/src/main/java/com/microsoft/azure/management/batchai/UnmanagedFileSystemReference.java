/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Unmananged file system mounting configuration.
 */
public class UnmanagedFileSystemReference {
    /**
     * Mount command.
     * Mount command line. Note, Batch AI will append mount path to the command
     * on its own.
     */
    @JsonProperty(value = "mountCommand", required = true)
    private String mountCommand;

    /**
     * Relative mount path.
     * The relative path on the compute node where the unmanaged file system
     * will be mounted. Note that all cluster level unmanaged file systems will
     * be mounted under $AZ_BATCHAI_MOUNT_ROOT location and all job level
     * unmanaged file systems will be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /**
     * Get mount command line. Note, Batch AI will append mount path to the command on its own.
     *
     * @return the mountCommand value
     */
    public String mountCommand() {
        return this.mountCommand;
    }

    /**
     * Set mount command line. Note, Batch AI will append mount path to the command on its own.
     *
     * @param mountCommand the mountCommand value to set
     * @return the UnmanagedFileSystemReference object itself.
     */
    public UnmanagedFileSystemReference withMountCommand(String mountCommand) {
        this.mountCommand = mountCommand;
        return this;
    }

    /**
     * Get the relative path on the compute node where the unmanaged file system will be mounted. Note that all cluster level unmanaged file systems will be mounted under $AZ_BATCHAI_MOUNT_ROOT location and all job level unmanaged file systems will be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     *
     * @return the relativeMountPath value
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set the relative path on the compute node where the unmanaged file system will be mounted. Note that all cluster level unmanaged file systems will be mounted under $AZ_BATCHAI_MOUNT_ROOT location and all job level unmanaged file systems will be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     *
     * @param relativeMountPath the relativeMountPath value to set
     * @return the UnmanagedFileSystemReference object itself.
     */
    public UnmanagedFileSystemReference withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

}
