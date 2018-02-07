/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to add a method to an existing <a>Resource</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMethodRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specifies the method request's HTTP method type.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for
     * using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code>
     * for using a Cognito user pool.
     * </p>
     */
    private String authorizationType;
    /**
     * <p>
     * Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * </p>
     */
    private String authorizerId;
    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     */
    private Boolean apiKeyRequired;
    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     * href="http://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * </p>
     */
    private String operationName;
    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A
     * key defines a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>
     * , where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag
     * indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method
     * request parameter names defined here are available in <a>Integration</a> to be mapped to integration request
     * parameters or body-mapping templates.
     * </p>
     */
    private java.util.Map<String, Boolean> requestParameters;
    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type. Request models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     */
    private java.util.Map<String, String> requestModels;
    /**
     * <p>
     * The identifier of a <a>RequestValidator</a> for validating the method request.
     * </p>
     */
    private String requestValidatorId;
    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by matching
     * the method scopes against the scopes parsed from the access token in the incoming request. The method invocation
     * is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not
     * authorized. When the method scope is configured, the client must provide an access token instead of an identity
     * token for authorization purposes.
     * </p>
     */
    private java.util.List<String> authorizationScopes;

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @param resourceId
     *        The <a>Resource</a> identifier for the new <a>Method</a> resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @return The <a>Resource</a> identifier for the new <a>Method</a> resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @param resourceId
     *        The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specifies the method request's HTTP method type.
     * </p>
     * 
     * @param httpMethod
     *        Specifies the method request's HTTP method type.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * Specifies the method request's HTTP method type.
     * </p>
     * 
     * @return Specifies the method request's HTTP method type.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * Specifies the method request's HTTP method type.
     * </p>
     * 
     * @param httpMethod
     *        Specifies the method request's HTTP method type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for
     * using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code>
     * for using a Cognito user pool.
     * </p>
     * 
     * @param authorizationType
     *        The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code>
     *        for using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or
     *        <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     */

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for
     * using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code>
     * for using a Cognito user pool.
     * </p>
     * 
     * @return The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code>
     *         for using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or
     *         <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     */

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for
     * using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code>
     * for using a Cognito user pool.
     * </p>
     * 
     * @param authorizationType
     *        The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code>
     *        for using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or
     *        <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * <p>
     * Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * </p>
     * 
     * @param authorizerId
     *        Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     */

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * </p>
     * 
     * @return Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     */

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * <p>
     * Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * </p>
     * 
     * @param authorizerId
     *        Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether the method required a valid <a>ApiKey</a>.
     */

    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     * 
     * @return Specifies whether the method required a valid <a>ApiKey</a>.
     */

    public Boolean getApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether the method required a valid <a>ApiKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withApiKeyRequired(Boolean apiKeyRequired) {
        setApiKeyRequired(apiKeyRequired);
        return this;
    }

    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     * 
     * @return Specifies whether the method required a valid <a>ApiKey</a>.
     */

    public Boolean isApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     * href="http://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * </p>
     * 
     * @param operationName
     *        A human-friendly operation identifier for the method. For example, you can assign the
     *        <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     *        href="http://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     * href="http://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * </p>
     * 
     * @return A human-friendly operation identifier for the method. For example, you can assign the
     *         <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     *         href="http://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     * href="http://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * </p>
     * 
     * @param operationName
     *        A human-friendly operation identifier for the method. For example, you can assign the
     *        <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     *        href="http://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withOperationName(String operationName) {
        setOperationName(operationName);
        return this;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A
     * key defines a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>
     * , where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag
     * indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method
     * request parameter names defined here are available in <a>Integration</a> to be mapped to integration request
     * parameters or body-mapping templates.
     * </p>
     * 
     * @return A key-value map defining required or optional method request parameters that can be accepted by API
     *         Gateway. A key defines a method request parameter name matching the pattern of
     *         <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *         <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *         value associated with the key is a Boolean flag indicating whether the parameter is required (
     *         <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *         available in <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     */

    public java.util.Map<String, Boolean> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A
     * key defines a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>
     * , where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag
     * indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method
     * request parameter names defined here are available in <a>Integration</a> to be mapped to integration request
     * parameters or body-mapping templates.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map defining required or optional method request parameters that can be accepted by API
     *        Gateway. A key defines a method request parameter name matching the pattern of
     *        <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *        <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *        value associated with the key is a Boolean flag indicating whether the parameter is required (
     *        <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *        available in <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     */

    public void setRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A
     * key defines a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>
     * , where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag
     * indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method
     * request parameter names defined here are available in <a>Integration</a> to be mapped to integration request
     * parameters or body-mapping templates.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map defining required or optional method request parameters that can be accepted by API
     *        Gateway. A key defines a method request parameter name matching the pattern of
     *        <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *        <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *        value associated with the key is a Boolean flag indicating whether the parameter is required (
     *        <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *        available in <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public PutMethodRequest addRequestParametersEntry(String key, Boolean value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, Boolean>();
        }
        if (this.requestParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type. Request models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @return Specifies the <a>Model</a> resources used for the request's content type. Request models are represented
     *         as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     */

    public java.util.Map<String, String> getRequestModels() {
        return requestModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type. Request models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param requestModels
     *        Specifies the <a>Model</a> resources used for the request's content type. Request models are represented
     *        as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     */

    public void setRequestModels(java.util.Map<String, String> requestModels) {
        this.requestModels = requestModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type. Request models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param requestModels
     *        Specifies the <a>Model</a> resources used for the request's content type. Request models are represented
     *        as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withRequestModels(java.util.Map<String, String> requestModels) {
        setRequestModels(requestModels);
        return this;
    }

    public PutMethodRequest addRequestModelsEntry(String key, String value) {
        if (null == this.requestModels) {
            this.requestModels = new java.util.HashMap<String, String>();
        }
        if (this.requestModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest clearRequestModelsEntries() {
        this.requestModels = null;
        return this;
    }

    /**
     * <p>
     * The identifier of a <a>RequestValidator</a> for validating the method request.
     * </p>
     * 
     * @param requestValidatorId
     *        The identifier of a <a>RequestValidator</a> for validating the method request.
     */

    public void setRequestValidatorId(String requestValidatorId) {
        this.requestValidatorId = requestValidatorId;
    }

    /**
     * <p>
     * The identifier of a <a>RequestValidator</a> for validating the method request.
     * </p>
     * 
     * @return The identifier of a <a>RequestValidator</a> for validating the method request.
     */

    public String getRequestValidatorId() {
        return this.requestValidatorId;
    }

    /**
     * <p>
     * The identifier of a <a>RequestValidator</a> for validating the method request.
     * </p>
     * 
     * @param requestValidatorId
     *        The identifier of a <a>RequestValidator</a> for validating the method request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withRequestValidatorId(String requestValidatorId) {
        setRequestValidatorId(requestValidatorId);
        return this;
    }

    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by matching
     * the method scopes against the scopes parsed from the access token in the incoming request. The method invocation
     * is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not
     * authorized. When the method scope is configured, the client must provide an access token instead of an identity
     * token for authorization purposes.
     * </p>
     * 
     * @return A list of authorization scopes configured on the method. The scopes are used with a
     *         <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by
     *         matching the method scopes against the scopes parsed from the access token in the incoming request. The
     *         method invocation is authorized if any method scopes matches a claimed scope in the access token.
     *         Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide
     *         an access token instead of an identity token for authorization purposes.
     */

    public java.util.List<String> getAuthorizationScopes() {
        return authorizationScopes;
    }

    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by matching
     * the method scopes against the scopes parsed from the access token in the incoming request. The method invocation
     * is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not
     * authorized. When the method scope is configured, the client must provide an access token instead of an identity
     * token for authorization purposes.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on the method. The scopes are used with a
     *        <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by
     *        matching the method scopes against the scopes parsed from the access token in the incoming request. The
     *        method invocation is authorized if any method scopes matches a claimed scope in the access token.
     *        Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide
     *        an access token instead of an identity token for authorization purposes.
     */

    public void setAuthorizationScopes(java.util.Collection<String> authorizationScopes) {
        if (authorizationScopes == null) {
            this.authorizationScopes = null;
            return;
        }

        this.authorizationScopes = new java.util.ArrayList<String>(authorizationScopes);
    }

    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by matching
     * the method scopes against the scopes parsed from the access token in the incoming request. The method invocation
     * is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not
     * authorized. When the method scope is configured, the client must provide an access token instead of an identity
     * token for authorization purposes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizationScopes(java.util.Collection)} or {@link #withAuthorizationScopes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on the method. The scopes are used with a
     *        <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by
     *        matching the method scopes against the scopes parsed from the access token in the incoming request. The
     *        method invocation is authorized if any method scopes matches a claimed scope in the access token.
     *        Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide
     *        an access token instead of an identity token for authorization purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withAuthorizationScopes(String... authorizationScopes) {
        if (this.authorizationScopes == null) {
            setAuthorizationScopes(new java.util.ArrayList<String>(authorizationScopes.length));
        }
        for (String ele : authorizationScopes) {
            this.authorizationScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by matching
     * the method scopes against the scopes parsed from the access token in the incoming request. The method invocation
     * is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not
     * authorized. When the method scope is configured, the client must provide an access token instead of an identity
     * token for authorization purposes.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on the method. The scopes are used with a
     *        <code>COGNITO_USER_POOL</code> authorizer to authorize the method invocation. The authorization works by
     *        matching the method scopes against the scopes parsed from the access token in the incoming request. The
     *        method invocation is authorized if any method scopes matches a claimed scope in the access token.
     *        Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide
     *        an access token instead of an identity token for authorization purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withAuthorizationScopes(java.util.Collection<String> authorizationScopes) {
        setAuthorizationScopes(authorizationScopes);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: ").append(getAuthorizationType()).append(",");
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: ").append(getAuthorizerId()).append(",");
        if (getApiKeyRequired() != null)
            sb.append("ApiKeyRequired: ").append(getApiKeyRequired()).append(",");
        if (getOperationName() != null)
            sb.append("OperationName: ").append(getOperationName()).append(",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: ").append(getRequestParameters()).append(",");
        if (getRequestModels() != null)
            sb.append("RequestModels: ").append(getRequestModels()).append(",");
        if (getRequestValidatorId() != null)
            sb.append("RequestValidatorId: ").append(getRequestValidatorId()).append(",");
        if (getAuthorizationScopes() != null)
            sb.append("AuthorizationScopes: ").append(getAuthorizationScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMethodRequest == false)
            return false;
        PutMethodRequest other = (PutMethodRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        if (other.getApiKeyRequired() == null ^ this.getApiKeyRequired() == null)
            return false;
        if (other.getApiKeyRequired() != null && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false)
            return false;
        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRequestModels() == null ^ this.getRequestModels() == null)
            return false;
        if (other.getRequestModels() != null && other.getRequestModels().equals(this.getRequestModels()) == false)
            return false;
        if (other.getRequestValidatorId() == null ^ this.getRequestValidatorId() == null)
            return false;
        if (other.getRequestValidatorId() != null && other.getRequestValidatorId().equals(this.getRequestValidatorId()) == false)
            return false;
        if (other.getAuthorizationScopes() == null ^ this.getAuthorizationScopes() == null)
            return false;
        if (other.getAuthorizationScopes() != null && other.getAuthorizationScopes().equals(this.getAuthorizationScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        hashCode = prime * hashCode + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired().hashCode());
        hashCode = prime * hashCode + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestModels() == null) ? 0 : getRequestModels().hashCode());
        hashCode = prime * hashCode + ((getRequestValidatorId() == null) ? 0 : getRequestValidatorId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationScopes() == null) ? 0 : getAuthorizationScopes().hashCode());
        return hashCode;
    }

    @Override
    public PutMethodRequest clone() {
        return (PutMethodRequest) super.clone();
    }

}
