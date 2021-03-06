/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.eagle.service.alert.resolver.impl;

import org.apache.eagle.service.alert.resolver.AttributeResolveException;
import org.apache.eagle.service.alert.resolver.GenericAttributeResolveRequest;
import org.apache.eagle.service.alert.resolver.AttributeResolvable;

import java.util.Arrays;
import java.util.List;

/**
 * @since 6/16/15
 */
public class BooleanAttributeResolver implements AttributeResolvable<GenericAttributeResolveRequest,String> {
    @Override
    public List<String> resolve(GenericAttributeResolveRequest request) throws AttributeResolveException {
        return Arrays.asList("true", "false");
    }

    @Override
    public void validateRequest(GenericAttributeResolveRequest request){
    }

    @Override
    public Class<GenericAttributeResolveRequest> getRequestClass() {
        return GenericAttributeResolveRequest.class;
    }
}