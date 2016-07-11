/*
* Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package org.wso2.intcloud.core.dto;

import java.sql.Blob;
import java.util.List;

public class Application {

    private String applicationName;
    private String hashId;
    private String description;
    private String defaultVersion;
    private String applicationType;
    private String carbonApplicationName;
    private Blob icon;
    private List<Version> versions;
    private String paramConfiguration;
    private String taskConfiguration;


    public Application(){

    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public String getDefaultVersion() {
        return defaultVersion;
    }

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getCarbonApplicationName() {
        return carbonApplicationName;
    }

    public void setCarbonApplicationName(String carbonApplicationName) {
        this.carbonApplicationName = carbonApplicationName;
    }

    public void setIcon(Blob icon) {
        this.icon = icon;
    }

    public Blob getIcon() {
        return icon;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }

    public String getParamConfiguration() {
        return paramConfiguration;
    }

    public void setParamConfiguration(String paramConfiguration) {
        this.paramConfiguration = paramConfiguration;
    }

    public String getTaskConfiguration() {
        return taskConfiguration;
    }

    public void setTaskConfiguration(String taskConfiguration) {
        this.taskConfiguration = taskConfiguration;
    }
}
