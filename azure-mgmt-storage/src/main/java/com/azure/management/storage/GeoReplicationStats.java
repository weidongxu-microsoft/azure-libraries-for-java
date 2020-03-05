// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The GeoReplicationStats model.
 */
@Immutable
public final class GeoReplicationStats {
    /*
     * The status of the secondary location. Possible values are: - Live:
     * Indicates that the secondary location is active and operational. -
     * Bootstrap: Indicates initial synchronization from the primary location
     * to the secondary location is in progress.This typically occurs when
     * replication is first enabled. - Unavailable: Indicates that the
     * secondary location is temporarily unavailable.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private GeoReplicationStatus status;

    /*
     * All primary writes preceding this UTC date/time value are guaranteed to
     * be available for read operations. Primary writes following this point in
     * time may or may not be available for reads. Element may be default value
     * if value of LastSyncTime is not available, this can happen if secondary
     * is offline or we are in bootstrap.
     */
    @JsonProperty(value = "lastSyncTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastSyncTime;

    /*
     * A boolean flag which indicates whether or not account failover is
     * supported for the account.
     */
    @JsonProperty(value = "canFailover", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canFailover;

    /**
     * Get the status property: The status of the secondary location. Possible
     * values are: - Live: Indicates that the secondary location is active and
     * operational. - Bootstrap: Indicates initial synchronization from the
     * primary location to the secondary location is in progress.This typically
     * occurs when replication is first enabled. - Unavailable: Indicates that
     * the secondary location is temporarily unavailable.
     * 
     * @return the status value.
     */
    public GeoReplicationStatus getStatus() {
        return this.status;
    }

    /**
     * Get the lastSyncTime property: All primary writes preceding this UTC
     * date/time value are guaranteed to be available for read operations.
     * Primary writes following this point in time may or may not be available
     * for reads. Element may be default value if value of LastSyncTime is not
     * available, this can happen if secondary is offline or we are in
     * bootstrap.
     * 
     * @return the lastSyncTime value.
     */
    public OffsetDateTime getLastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * Get the canFailover property: A boolean flag which indicates whether or
     * not account failover is supported for the account.
     * 
     * @return the canFailover value.
     */
    public Boolean isCanFailover() {
        return this.canFailover;
    }
}
