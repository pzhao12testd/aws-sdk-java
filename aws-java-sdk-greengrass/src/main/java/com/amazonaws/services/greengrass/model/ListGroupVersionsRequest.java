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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroupVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique Id of the AWS Greengrass Group */
    private String groupId;
    /** Specifies the maximum number of list results to be returned in this page */
    private String maxResults;
    /** Specifies the pagination token used when iterating through a paginated request */
    private String nextToken;

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @param groupId
     *        The unique Id of the AWS Greengrass Group
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @return The unique Id of the AWS Greengrass Group
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @param groupId
     *        The unique Id of the AWS Greengrass Group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupVersionsRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * Specifies the maximum number of list results to be returned in this page
     * 
     * @param maxResults
     *        Specifies the maximum number of list results to be returned in this page
     */

    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Specifies the maximum number of list results to be returned in this page
     * 
     * @return Specifies the maximum number of list results to be returned in this page
     */

    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * Specifies the maximum number of list results to be returned in this page
     * 
     * @param maxResults
     *        Specifies the maximum number of list results to be returned in this page
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupVersionsRequest withMaxResults(String maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Specifies the pagination token used when iterating through a paginated request
     * 
     * @param nextToken
     *        Specifies the pagination token used when iterating through a paginated request
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Specifies the pagination token used when iterating through a paginated request
     * 
     * @return Specifies the pagination token used when iterating through a paginated request
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Specifies the pagination token used when iterating through a paginated request
     * 
     * @param nextToken
     *        Specifies the pagination token used when iterating through a paginated request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGroupVersionsRequest == false)
            return false;
        ListGroupVersionsRequest other = (ListGroupVersionsRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupVersionsRequest clone() {
        return (ListGroupVersionsRequest) super.clone();
    }

}
