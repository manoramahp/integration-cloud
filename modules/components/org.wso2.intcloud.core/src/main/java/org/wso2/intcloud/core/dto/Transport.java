/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.intcloud.core.dto;

public class Transport {
    private int id;
    private String serviceName;
    private String serviceProtocol;
    private int servicePort;
    private String serviceNamePrefix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServicePort() {
        return servicePort;
    }

    public void setServicePort(int servicePort) {
        this.servicePort = servicePort;
    }

    public String getServiceProtocol() {
        return serviceProtocol;
    }

    public void setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
    }

    public String getServiceNamePrefix() {
        return serviceNamePrefix;
    }

    public void setServiceNamePrefix(String serviceNamePrefix) {
        this.serviceNamePrefix = serviceNamePrefix;
    }
}
