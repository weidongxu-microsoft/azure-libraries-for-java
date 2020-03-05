// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.JobSchedule;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Job model.
 */
@JsonFlatten
@Fluent
public class JobInner extends ProxyResource {
    /*
     * User-defined description of the job.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The job version number.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private Integer version;

    /*
     * Schedule properties of the job.
     */
    @JsonProperty(value = "properties.schedule")
    private JobSchedule schedule;

    /**
     * Get the description property: User-defined description of the job.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: User-defined description of the job.
     * 
     * @param description the description value to set.
     * @return the JobInner object itself.
     */
    public JobInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the version property: The job version number.
     * 
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Get the schedule property: Schedule properties of the job.
     * 
     * @return the schedule value.
     */
    public JobSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Schedule properties of the job.
     * 
     * @param schedule the schedule value to set.
     * @return the JobInner object itself.
     */
    public JobInner withSchedule(JobSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
}
