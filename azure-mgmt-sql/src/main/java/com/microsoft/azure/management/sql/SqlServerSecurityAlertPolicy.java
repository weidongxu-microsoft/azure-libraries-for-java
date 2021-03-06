/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasId;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasName;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.azure.management.resources.fluentcore.model.Indexable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Updatable;
import com.microsoft.azure.management.sql.implementation.ServerSecurityAlertPolicyInner;

import java.util.List;

/**
 * An immutable client-side representation of an Azure SQL Server Security Alert Policy.
 */
@Fluent
@Beta(Beta.SinceVersion.V1_15_0)
public interface SqlServerSecurityAlertPolicy extends
    HasId,
    HasInner<ServerSecurityAlertPolicyInner>,
    HasName,
    HasResourceGroup,
    Indexable,
    Refreshable<SqlServerSecurityAlertPolicy>,
    Updatable<SqlServerSecurityAlertPolicy.Update> {

    /**
     * @return name of the SQL Server to which this DNS alias belongs
     */
    String sqlServerName();

    /**
     * @return the parent SQL server ID
     */
    String parentId();

    /**
     * @return the state of the policy, whether it is enabled or disabled
     */
    SecurityAlertPolicyState state();

    /**
     * @return a list of alerts that are disabled
     */
    List<String> disabledAlerts();

    /**
     * @return a list of e-mail addresses to which the alert is sent
     */
    List<String> emailAddresses();

    /**
     * @return true if an alert will be sent to the account administrators
     */
    boolean emailAccountAdmins();

    /**
     * @return the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net); this blob storage will hold
     *   all Threat Detection audit logs
     */
    String storageEndpoint();

    /**
     * @return the identifier key of the Threat Detection audit storage account
     */
    String storageAccountAccessKey();

    /**
     * @return the number of days to keep in the Threat Detection audit logs
     */
    int retentionDays();

    /**
     * The template for a SQL Server Security Alert Policy update operation, containing all the settings that can be modified.
     */
    interface Update extends
        SqlServerSecurityAlertPolicy.UpdateStages.WithState,
        SqlServerSecurityAlertPolicy.UpdateStages.WithEmailAccountAdmins,
        SqlServerSecurityAlertPolicy.UpdateStages.WithStorageAccount,
        SqlServerSecurityAlertPolicy.UpdateStages.WithEmailAddresses,
        SqlServerSecurityAlertPolicy.UpdateStages.WithDisabledAlerts,
        SqlServerSecurityAlertPolicy.UpdateStages.WithRetentionDays,
        Appliable<SqlServerSecurityAlertPolicy> {
    }

    /**
     * Grouping of all the SQL Server Security Alert Policy update stages.
     */
    interface UpdateStages {
        /**
         * The SQL Server Security Alert Policy update definition to set the state.
         */
        @Beta(Beta.SinceVersion.V1_15_0)
        interface WithState {
            /**
             * Specifies the state of the policy, whether it is enabled or disabled.
             *
             * @param state the state of the policy, whether it is enabled or disabled
             * @return The next stage of the definition.
             */
            SqlServerSecurityAlertPolicy.Update withState(SecurityAlertPolicyState state);
        }

        /**
         * The SQL Server Security Alert Policy update definition to set if an alert will be sent to the account administrators.
         */
        @Beta(Beta.SinceVersion.V1_15_0)
        interface WithEmailAccountAdmins {
            /**
             * Specifies that an alert will be sent to the account administrators.
             *
             * @return The next stage of the definition.
             */
            SqlServerSecurityAlertPolicy.Update withEmailAccountAdmins();

            /**
             * Specifies that an alert will not be sent to the account administrators.
             *
             * @return The next stage of the definition.
             */
            SqlServerSecurityAlertPolicy.Update withoutEmailAccountAdmins();
        }

        /**
         * The SQL Server Security Alert Policy update definition to specify the storage account blob endpoint and access key.
         */
        @Beta(Beta.SinceVersion.V1_15_0)
        interface WithStorageAccount {
            /**
             * Specifies the storage account blob endpoint and access key.
             *
             * @param storageEndpointUri the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net); this
             *                           blob storage will hold all Threat Detection audit logs
             * @param storageAccessKey the identifier key of the Threat Detection audit storage account
             * @return The next stage of the definition.
             */
            SqlServerSecurityAlertPolicy.Update withStorageEndpoint(String storageEndpointUri, String storageAccessKey);
        }

        /**
         * The SQL Server Security Alert Policy update definition to set an array of e-mail addresses to which the alert is sent.
         */
        @Beta(Beta.SinceVersion.V1_15_0)
        interface WithEmailAddresses {
            /**
             * Specifies an array of e-mail addresses to which the alert is sent.
             *
             * @param emailAddresses an array of e-mail addresses to which the alert is sent to
             * @return The next stage of the definition.
             */
            SqlServerSecurityAlertPolicy.Update withEmailAddresses(String... emailAddresses);
        }

        /**
         * The SQL Server Security Alert Policy update definition to set an array of alerts that are disabled.
         */
        @Beta(Beta.SinceVersion.V1_15_0)
        interface WithDisabledAlerts {
            /**
             * Specifies an array of alerts that are disabled.
             *
             * @param disabledAlerts an array of alerts that are disabled
             * @return The next stage of the definition.
             */
            SqlServerSecurityAlertPolicy.Update withDisabledAlerts(String... disabledAlerts);
        }

        /**
         * The SQL Server Security Alert Policy update definition to set the number of days to keep in the Threat Detection audit logs.
         */
        @Beta(Beta.SinceVersion.V1_15_0)
        interface WithRetentionDays {
            /**
             * Specifies the number of days to keep in the Threat Detection audit logs.
             *
             * @param days the number of days to keep in the Threat Detection audit logs
             * @return The next stage of the definition.
             */
            SqlServerSecurityAlertPolicy.Update withRetentionDays(int days);
        }
    }
}
