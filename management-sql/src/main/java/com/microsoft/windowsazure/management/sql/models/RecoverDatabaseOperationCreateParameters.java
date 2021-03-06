/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql.models;

/**
* Contains the parameters supplied to the Create Recover Database Operation
* request.
*/
public class RecoverDatabaseOperationCreateParameters {
    private String sourceDatabaseName;
    
    /**
    * Required. Gets or sets the name of the source Azure SQL Database.
    * @return The SourceDatabaseName value.
    */
    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }
    
    /**
    * Required. Gets or sets the name of the source Azure SQL Database.
    * @param sourceDatabaseNameValue The SourceDatabaseName value.
    */
    public void setSourceDatabaseName(final String sourceDatabaseNameValue) {
        this.sourceDatabaseName = sourceDatabaseNameValue;
    }
    
    private String targetDatabaseName;
    
    /**
    * Optional. Gets or sets the name of the target Azure SQL Database.
    * @return The TargetDatabaseName value.
    */
    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }
    
    /**
    * Optional. Gets or sets the name of the target Azure SQL Database.
    * @param targetDatabaseNameValue The TargetDatabaseName value.
    */
    public void setTargetDatabaseName(final String targetDatabaseNameValue) {
        this.targetDatabaseName = targetDatabaseNameValue;
    }
    
    private String targetServerName;
    
    /**
    * Optional. Gets or sets the name of the target Azure SQL Database Server.
    * @return The TargetServerName value.
    */
    public String getTargetServerName() {
        return this.targetServerName;
    }
    
    /**
    * Optional. Gets or sets the name of the target Azure SQL Database Server.
    * @param targetServerNameValue The TargetServerName value.
    */
    public void setTargetServerName(final String targetServerNameValue) {
        this.targetServerName = targetServerNameValue;
    }
    
    /**
    * Initializes a new instance of the
    * RecoverDatabaseOperationCreateParameters class.
    *
    */
    public RecoverDatabaseOperationCreateParameters() {
    }
    
    /**
    * Initializes a new instance of the
    * RecoverDatabaseOperationCreateParameters class with required arguments.
    *
    * @param sourceDatabaseName The source database name.
    */
    public RecoverDatabaseOperationCreateParameters(String sourceDatabaseName) {
        if (sourceDatabaseName == null) {
            throw new NullPointerException("sourceDatabaseName");
        }
        this.setSourceDatabaseName(sourceDatabaseName);
    }
}
