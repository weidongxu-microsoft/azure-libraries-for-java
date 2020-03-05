// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.Channels;
import com.azure.management.appservice.NotificationLevel;
import com.azure.management.appservice.ProxyOnlyResource;
import com.azure.management.appservice.ResourceScopeType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * The Recommendation model.
 */
@JsonFlatten
@Fluent
public class RecommendationInner extends ProxyOnlyResource {
    /*
     * Timestamp when this instance was created.
     */
    @JsonProperty(value = "properties.creationTime")
    private OffsetDateTime creationTime;

    /*
     * A GUID value that each recommendation object is associated with.
     */
    @JsonProperty(value = "properties.recommendationId")
    private UUID recommendationId;

    /*
     * Full ARM resource ID string that this recommendation object is
     * associated with.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /*
     * Name of a resource type this recommendation applies, e.g. Subscription,
     * ServerFarm, Site.
     */
    @JsonProperty(value = "properties.resourceScope")
    private ResourceScopeType resourceScope;

    /*
     * Unique name of the rule.
     */
    @JsonProperty(value = "properties.ruleName")
    private String ruleName;

    /*
     * UI friendly name of the rule (may not be unique).
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * Recommendation text.
     */
    @JsonProperty(value = "properties.message")
    private String message;

    /*
     * Level indicating how critical this recommendation can impact.
     */
    @JsonProperty(value = "properties.level")
    private NotificationLevel level;

    /*
     * List of channels that this recommendation can apply.
     */
    @JsonProperty(value = "properties.channels")
    private Channels channels;

    /*
     * The list of category tags that this recommendation belongs to.
     */
    @JsonProperty(value = "properties.categoryTags", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> categoryTags;

    /*
     * Name of action recommended by this object.
     */
    @JsonProperty(value = "properties.actionName")
    private String actionName;

    /*
     * True if this recommendation is still valid (i.e. "actionable"). False if
     * it is invalid.
     */
    @JsonProperty(value = "properties.enabled")
    private Integer enabled;

    /*
     * The list of states of this recommendation. If it's null then it should
     * be considered "Active".
     */
    @JsonProperty(value = "properties.states")
    private List<String> states;

    /*
     * The beginning time in UTC of a range that the recommendation refers to.
     */
    @JsonProperty(value = "properties.startTime")
    private OffsetDateTime startTime;

    /*
     * The end time in UTC of a range that the recommendation refers to.
     */
    @JsonProperty(value = "properties.endTime")
    private OffsetDateTime endTime;

    /*
     * When to notify this recommendation next in UTC. Null means that this
     * will never be notified anymore.
     */
    @JsonProperty(value = "properties.nextNotificationTime")
    private OffsetDateTime nextNotificationTime;

    /*
     * Date and time in UTC when this notification expires.
     */
    @JsonProperty(value = "properties.notificationExpirationTime")
    private OffsetDateTime notificationExpirationTime;

    /*
     * Last timestamp in UTC this instance was actually notified. Null means
     * that this recommendation hasn't been notified yet.
     */
    @JsonProperty(value = "properties.notifiedTime")
    private OffsetDateTime notifiedTime;

    /*
     * A metric value measured by the rule.
     */
    @JsonProperty(value = "properties.score")
    private Double score;

    /*
     * True if this is associated with a dynamically added rule
     */
    @JsonProperty(value = "properties.isDynamic")
    private Boolean isDynamic;

    /*
     * Extension name of the portal if exists.
     */
    @JsonProperty(value = "properties.extensionName")
    private String extensionName;

    /*
     * Deep link to a blade on the portal.
     */
    @JsonProperty(value = "properties.bladeName")
    private String bladeName;

    /*
     * Forward link to an external document associated with the rule.
     */
    @JsonProperty(value = "properties.forwardLink")
    private String forwardLink;

    /**
     * Get the creationTime property: Timestamp when this instance was created.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: Timestamp when this instance was created.
     * 
     * @param creationTime the creationTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the recommendationId property: A GUID value that each recommendation
     * object is associated with.
     * 
     * @return the recommendationId value.
     */
    public UUID recommendationId() {
        return this.recommendationId;
    }

    /**
     * Set the recommendationId property: A GUID value that each recommendation
     * object is associated with.
     * 
     * @param recommendationId the recommendationId value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withRecommendationId(UUID recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * Get the resourceId property: Full ARM resource ID string that this
     * recommendation object is associated with.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Full ARM resource ID string that this
     * recommendation object is associated with.
     * 
     * @param resourceId the resourceId value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceScope property: Name of a resource type this
     * recommendation applies, e.g. Subscription, ServerFarm, Site.
     * 
     * @return the resourceScope value.
     */
    public ResourceScopeType resourceScope() {
        return this.resourceScope;
    }

    /**
     * Set the resourceScope property: Name of a resource type this
     * recommendation applies, e.g. Subscription, ServerFarm, Site.
     * 
     * @param resourceScope the resourceScope value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withResourceScope(ResourceScopeType resourceScope) {
        this.resourceScope = resourceScope;
        return this;
    }

    /**
     * Get the ruleName property: Unique name of the rule.
     * 
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName property: Unique name of the rule.
     * 
     * @param ruleName the ruleName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Get the displayName property: UI friendly name of the rule (may not be
     * unique).
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: UI friendly name of the rule (may not be
     * unique).
     * 
     * @param displayName the displayName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the message property: Recommendation text.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Recommendation text.
     * 
     * @param message the message value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the level property: Level indicating how critical this
     * recommendation can impact.
     * 
     * @return the level value.
     */
    public NotificationLevel level() {
        return this.level;
    }

    /**
     * Set the level property: Level indicating how critical this
     * recommendation can impact.
     * 
     * @param level the level value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withLevel(NotificationLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get the channels property: List of channels that this recommendation can
     * apply.
     * 
     * @return the channels value.
     */
    public Channels channels() {
        return this.channels;
    }

    /**
     * Set the channels property: List of channels that this recommendation can
     * apply.
     * 
     * @param channels the channels value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withChannels(Channels channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the categoryTags property: The list of category tags that this
     * recommendation belongs to.
     * 
     * @return the categoryTags value.
     */
    public List<String> categoryTags() {
        return this.categoryTags;
    }

    /**
     * Get the actionName property: Name of action recommended by this object.
     * 
     * @return the actionName value.
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName property: Name of action recommended by this object.
     * 
     * @param actionName the actionName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the enabled property: True if this recommendation is still valid
     * (i.e. "actionable"). False if it is invalid.
     * 
     * @return the enabled value.
     */
    public Integer enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: True if this recommendation is still valid
     * (i.e. "actionable"). False if it is invalid.
     * 
     * @param enabled the enabled value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the states property: The list of states of this recommendation. If
     * it's null then it should be considered "Active".
     * 
     * @return the states value.
     */
    public List<String> states() {
        return this.states;
    }

    /**
     * Set the states property: The list of states of this recommendation. If
     * it's null then it should be considered "Active".
     * 
     * @param states the states value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withStates(List<String> states) {
        this.states = states;
        return this;
    }

    /**
     * Get the startTime property: The beginning time in UTC of a range that
     * the recommendation refers to.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The beginning time in UTC of a range that
     * the recommendation refers to.
     * 
     * @param startTime the startTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time in UTC of a range that the
     * recommendation refers to.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time in UTC of a range that the
     * recommendation refers to.
     * 
     * @param endTime the endTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the nextNotificationTime property: When to notify this
     * recommendation next in UTC. Null means that this will never be notified
     * anymore.
     * 
     * @return the nextNotificationTime value.
     */
    public OffsetDateTime nextNotificationTime() {
        return this.nextNotificationTime;
    }

    /**
     * Set the nextNotificationTime property: When to notify this
     * recommendation next in UTC. Null means that this will never be notified
     * anymore.
     * 
     * @param nextNotificationTime the nextNotificationTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNextNotificationTime(OffsetDateTime nextNotificationTime) {
        this.nextNotificationTime = nextNotificationTime;
        return this;
    }

    /**
     * Get the notificationExpirationTime property: Date and time in UTC when
     * this notification expires.
     * 
     * @return the notificationExpirationTime value.
     */
    public OffsetDateTime notificationExpirationTime() {
        return this.notificationExpirationTime;
    }

    /**
     * Set the notificationExpirationTime property: Date and time in UTC when
     * this notification expires.
     * 
     * @param notificationExpirationTime the notificationExpirationTime value
     * to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNotificationExpirationTime(OffsetDateTime notificationExpirationTime) {
        this.notificationExpirationTime = notificationExpirationTime;
        return this;
    }

    /**
     * Get the notifiedTime property: Last timestamp in UTC this instance was
     * actually notified. Null means that this recommendation hasn't been
     * notified yet.
     * 
     * @return the notifiedTime value.
     */
    public OffsetDateTime notifiedTime() {
        return this.notifiedTime;
    }

    /**
     * Set the notifiedTime property: Last timestamp in UTC this instance was
     * actually notified. Null means that this recommendation hasn't been
     * notified yet.
     * 
     * @param notifiedTime the notifiedTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNotifiedTime(OffsetDateTime notifiedTime) {
        this.notifiedTime = notifiedTime;
        return this;
    }

    /**
     * Get the score property: A metric value measured by the rule.
     * 
     * @return the score value.
     */
    public Double score() {
        return this.score;
    }

    /**
     * Set the score property: A metric value measured by the rule.
     * 
     * @param score the score value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the isDynamic property: True if this is associated with a
     * dynamically added rule.
     * 
     * @return the isDynamic value.
     */
    public Boolean isDynamic() {
        return this.isDynamic;
    }

    /**
     * Set the isDynamic property: True if this is associated with a
     * dynamically added rule.
     * 
     * @param isDynamic the isDynamic value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * Get the extensionName property: Extension name of the portal if exists.
     * 
     * @return the extensionName value.
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set the extensionName property: Extension name of the portal if exists.
     * 
     * @param extensionName the extensionName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get the bladeName property: Deep link to a blade on the portal.
     * 
     * @return the bladeName value.
     */
    public String bladeName() {
        return this.bladeName;
    }

    /**
     * Set the bladeName property: Deep link to a blade on the portal.
     * 
     * @param bladeName the bladeName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withBladeName(String bladeName) {
        this.bladeName = bladeName;
        return this;
    }

    /**
     * Get the forwardLink property: Forward link to an external document
     * associated with the rule.
     * 
     * @return the forwardLink value.
     */
    public String forwardLink() {
        return this.forwardLink;
    }

    /**
     * Set the forwardLink property: Forward link to an external document
     * associated with the rule.
     * 
     * @param forwardLink the forwardLink value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withForwardLink(String forwardLink) {
        this.forwardLink = forwardLink;
        return this;
    }
}
