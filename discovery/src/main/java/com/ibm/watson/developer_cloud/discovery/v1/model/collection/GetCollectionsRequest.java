/*
 * Copyright 2016 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.watson.developer_cloud.discovery.v1.model.collection;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * Request to get a list of {@link Collection}s.
 */
public class GetCollectionsRequest extends GenericModel {
    private final String environmentId;
    private final String name;

    private GetCollectionsRequest(Builder builder) {
        this.environmentId = builder.environmentId;
        this.name = builder.name;
    }

    public String getEnvironmentId() {
        return environmentId;
    }

    public String getName() {
        return name;
    }

    public boolean hasName() {
        return name != null;
    }

    public static class Builder {
        private final String environmentId;
        private String name;

        public Builder(String environmentId) {
            this.environmentId = environmentId;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public GetCollectionsRequest build() {
            return new GetCollectionsRequest(this);
        }
    }
}
