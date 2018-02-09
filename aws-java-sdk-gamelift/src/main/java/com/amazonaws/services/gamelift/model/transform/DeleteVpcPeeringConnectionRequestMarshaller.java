/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteVpcPeeringConnectionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteVpcPeeringConnectionRequestMarshaller {

    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<String> VPCPEERINGCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcPeeringConnectionId").build();

    private static final DeleteVpcPeeringConnectionRequestMarshaller instance = new DeleteVpcPeeringConnectionRequestMarshaller();

    public static DeleteVpcPeeringConnectionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteVpcPeeringConnectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteVpcPeeringConnectionRequest.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(deleteVpcPeeringConnectionRequest.getVpcPeeringConnectionId(), VPCPEERINGCONNECTIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
