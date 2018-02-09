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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the build input source code for the build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This is
     * because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the build spec (for example,
     * <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file that
     * contains the source code (for example,
     * <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * build spec. Also, you must connect your AWS account to your GitHub account. To do this, use the AWS CodeBuild
     * console to begin creating a build project. When you use the console to connect (or reconnect) with GitHub, on the
     * GitHub <b>Authorize application</b> page that displays, for <b>Organization access</b>, choose <b>Request
     * access</b> next to each repository you want to allow AWS CodeBuild to have access to. Then choose <b>Authorize
     * application</b>. (After you have connected to your GitHub account, you do not need to finish creating the build
     * project, and you may then leave the AWS CodeBuild console.) To instruct AWS CodeBuild to then use this
     * connection, in the <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to
     * <code>OAUTH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * build spec. Also, you must connect your AWS account to your Bitbucket account. To do this, use the AWS CodeBuild
     * console to begin creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on
     * the Bitbucket <b>Confirm access to your account</b> page that displays, choose <b>Grant access</b>. (After you
     * have connected to your Bitbucket account, you do not need to finish creating the build project, and you may then
     * leave the AWS CodeBuild console.) To instruct AWS CodeBuild to then use this connection, in the
     * <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String location;
    /**
     * <p>
     * The build spec declaration to use for the builds in this build project.
     * </p>
     * <p>
     * If this value is not specified, a build spec must be included along with the source code to be built.
     * </p>
     */
    private String buildspec;
    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
     * directly (unless the build project's source <code>type</code> value is <code>BITBUCKET</code> or
     * <code>GITHUB</code>).
     * </p>
     */
    private SourceAuth auth;

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of repository that contains the source code to be built. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *         AWS CodePipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GITHUB</code>: The source code is in a GitHub repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *         </p>
     *         </li>
     * @see SourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ProjectSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setType(SourceType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ProjectSource withType(SourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This is
     * because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the build spec (for example,
     * <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file that
     * contains the source code (for example,
     * <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * build spec. Also, you must connect your AWS account to your GitHub account. To do this, use the AWS CodeBuild
     * console to begin creating a build project. When you use the console to connect (or reconnect) with GitHub, on the
     * GitHub <b>Authorize application</b> page that displays, for <b>Organization access</b>, choose <b>Request
     * access</b> next to each repository you want to allow AWS CodeBuild to have access to. Then choose <b>Authorize
     * application</b>. (After you have connected to your GitHub account, you do not need to finish creating the build
     * project, and you may then leave the AWS CodeBuild console.) To instruct AWS CodeBuild to then use this
     * connection, in the <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to
     * <code>OAUTH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * build spec. Also, you must connect your AWS account to your Bitbucket account. To do this, use the AWS CodeBuild
     * console to begin creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on
     * the Bitbucket <b>Confirm access to your account</b> page that displays, choose <b>Grant access</b>. (After you
     * have connected to your Bitbucket account, you do not need to finish creating the build project, and you may then
     * leave the AWS CodeBuild console.) To instruct AWS CodeBuild to then use this connection, in the
     * <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the location of the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *        <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This
     *        is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *        source code and the build spec (for example,
     *        <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file
     *        that contains the source code (for example,
     *        <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and
     *        the build spec. Also, you must connect your AWS account to your GitHub account. To do this, use the AWS
     *        CodeBuild console to begin creating a build project. When you use the console to connect (or reconnect)
     *        with GitHub, on the GitHub <b>Authorize application</b> page that displays, for <b>Organization
     *        access</b>, choose <b>Request access</b> next to each repository you want to allow AWS CodeBuild to have
     *        access to. Then choose <b>Authorize application</b>. (After you have connected to your GitHub account, you
     *        do not need to finish creating the build project, and you may then leave the AWS CodeBuild console.) To
     *        instruct AWS CodeBuild to then use this connection, in the <code>source</code> object, set the
     *        <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *        and the build spec. Also, you must connect your AWS account to your Bitbucket account. To do this, use the
     *        AWS CodeBuild console to begin creating a build project. When you use the console to connect (or
     *        reconnect) with Bitbucket, on the Bitbucket <b>Confirm access to your account</b> page that displays,
     *        choose <b>Grant access</b>. (After you have connected to your Bitbucket account, you do not need to finish
     *        creating the build project, and you may then leave the AWS CodeBuild console.) To instruct AWS CodeBuild
     *        to then use this connection, in the <code>source</code> object, set the <code>auth</code> object's
     *        <code>type</code> value to <code>OAUTH</code>.
     *        </p>
     *        </li>
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This is
     * because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the build spec (for example,
     * <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file that
     * contains the source code (for example,
     * <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * build spec. Also, you must connect your AWS account to your GitHub account. To do this, use the AWS CodeBuild
     * console to begin creating a build project. When you use the console to connect (or reconnect) with GitHub, on the
     * GitHub <b>Authorize application</b> page that displays, for <b>Organization access</b>, choose <b>Request
     * access</b> next to each repository you want to allow AWS CodeBuild to have access to. Then choose <b>Authorize
     * application</b>. (After you have connected to your GitHub account, you do not need to finish creating the build
     * project, and you may then leave the AWS CodeBuild console.) To instruct AWS CodeBuild to then use this
     * connection, in the <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to
     * <code>OAUTH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * build spec. Also, you must connect your AWS account to your Bitbucket account. To do this, use the AWS CodeBuild
     * console to begin creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on
     * the Bitbucket <b>Confirm access to your account</b> page that displays, choose <b>Grant access</b>. (After you
     * have connected to your Bitbucket account, you do not need to finish creating the build project, and you may then
     * leave the AWS CodeBuild console.) To instruct AWS CodeBuild to then use this connection, in the
     * <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the location of the source code to be built. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *         <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This
     *         is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *         source code and the build spec (for example,
     *         <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file
     *         that contains the source code (for example,
     *         <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source
     *         and the build spec. Also, you must connect your AWS account to your GitHub account. To do this, use the
     *         AWS CodeBuild console to begin creating a build project. When you use the console to connect (or
     *         reconnect) with GitHub, on the GitHub <b>Authorize application</b> page that displays, for
     *         <b>Organization access</b>, choose <b>Request access</b> next to each repository you want to allow AWS
     *         CodeBuild to have access to. Then choose <b>Authorize application</b>. (After you have connected to your
     *         GitHub account, you do not need to finish creating the build project, and you may then leave the AWS
     *         CodeBuild console.) To instruct AWS CodeBuild to then use this connection, in the <code>source</code>
     *         object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *         and the build spec. Also, you must connect your AWS account to your Bitbucket account. To do this, use
     *         the AWS CodeBuild console to begin creating a build project. When you use the console to connect (or
     *         reconnect) with Bitbucket, on the Bitbucket <b>Confirm access to your account</b> page that displays,
     *         choose <b>Grant access</b>. (After you have connected to your Bitbucket account, you do not need to
     *         finish creating the build project, and you may then leave the AWS CodeBuild console.) To instruct AWS
     *         CodeBuild to then use this connection, in the <code>source</code> object, set the <code>auth</code>
     *         object's <code>type</code> value to <code>OAUTH</code>.
     *         </p>
     *         </li>
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This is
     * because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the build spec (for example,
     * <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file that
     * contains the source code (for example,
     * <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * build spec. Also, you must connect your AWS account to your GitHub account. To do this, use the AWS CodeBuild
     * console to begin creating a build project. When you use the console to connect (or reconnect) with GitHub, on the
     * GitHub <b>Authorize application</b> page that displays, for <b>Organization access</b>, choose <b>Request
     * access</b> next to each repository you want to allow AWS CodeBuild to have access to. Then choose <b>Authorize
     * application</b>. (After you have connected to your GitHub account, you do not need to finish creating the build
     * project, and you may then leave the AWS CodeBuild console.) To instruct AWS CodeBuild to then use this
     * connection, in the <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to
     * <code>OAUTH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * build spec. Also, you must connect your AWS account to your Bitbucket account. To do this, use the AWS CodeBuild
     * console to begin creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on
     * the Bitbucket <b>Confirm access to your account</b> page that displays, choose <b>Grant access</b>. (After you
     * have connected to your Bitbucket account, you do not need to finish creating the build project, and you may then
     * leave the AWS CodeBuild console.) To instruct AWS CodeBuild to then use this connection, in the
     * <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the location of the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *        <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This
     *        is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *        source code and the build spec (for example,
     *        <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file
     *        that contains the source code (for example,
     *        <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and
     *        the build spec. Also, you must connect your AWS account to your GitHub account. To do this, use the AWS
     *        CodeBuild console to begin creating a build project. When you use the console to connect (or reconnect)
     *        with GitHub, on the GitHub <b>Authorize application</b> page that displays, for <b>Organization
     *        access</b>, choose <b>Request access</b> next to each repository you want to allow AWS CodeBuild to have
     *        access to. Then choose <b>Authorize application</b>. (After you have connected to your GitHub account, you
     *        do not need to finish creating the build project, and you may then leave the AWS CodeBuild console.) To
     *        instruct AWS CodeBuild to then use this connection, in the <code>source</code> object, set the
     *        <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *        and the build spec. Also, you must connect your AWS account to your Bitbucket account. To do this, use the
     *        AWS CodeBuild console to begin creating a build project. When you use the console to connect (or
     *        reconnect) with Bitbucket, on the Bitbucket <b>Confirm access to your account</b> page that displays,
     *        choose <b>Grant access</b>. (After you have connected to your Bitbucket account, you do not need to finish
     *        creating the build project, and you may then leave the AWS CodeBuild console.) To instruct AWS CodeBuild
     *        to then use this connection, in the <code>source</code> object, set the <code>auth</code> object's
     *        <code>type</code> value to <code>OAUTH</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The build spec declaration to use for the builds in this build project.
     * </p>
     * <p>
     * If this value is not specified, a build spec must be included along with the source code to be built.
     * </p>
     * 
     * @param buildspec
     *        The build spec declaration to use for the builds in this build project.</p>
     *        <p>
     *        If this value is not specified, a build spec must be included along with the source code to be built.
     */

    public void setBuildspec(String buildspec) {
        this.buildspec = buildspec;
    }

    /**
     * <p>
     * The build spec declaration to use for the builds in this build project.
     * </p>
     * <p>
     * If this value is not specified, a build spec must be included along with the source code to be built.
     * </p>
     * 
     * @return The build spec declaration to use for the builds in this build project.</p>
     *         <p>
     *         If this value is not specified, a build spec must be included along with the source code to be built.
     */

    public String getBuildspec() {
        return this.buildspec;
    }

    /**
     * <p>
     * The build spec declaration to use for the builds in this build project.
     * </p>
     * <p>
     * If this value is not specified, a build spec must be included along with the source code to be built.
     * </p>
     * 
     * @param buildspec
     *        The build spec declaration to use for the builds in this build project.</p>
     *        <p>
     *        If this value is not specified, a build spec must be included along with the source code to be built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withBuildspec(String buildspec) {
        setBuildspec(buildspec);
        return this;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
     * directly (unless the build project's source <code>type</code> value is <code>BITBUCKET</code> or
     * <code>GITHUB</code>).
     * </p>
     * 
     * @param auth
     *        Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *        <p>
     *        This information is for the AWS CodeBuild console's use only. Your code should not get or set this
     *        information directly (unless the build project's source <code>type</code> value is <code>BITBUCKET</code>
     *        or <code>GITHUB</code>).
     */

    public void setAuth(SourceAuth auth) {
        this.auth = auth;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
     * directly (unless the build project's source <code>type</code> value is <code>BITBUCKET</code> or
     * <code>GITHUB</code>).
     * </p>
     * 
     * @return Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *         <p>
     *         This information is for the AWS CodeBuild console's use only. Your code should not get or set this
     *         information directly (unless the build project's source <code>type</code> value is <code>BITBUCKET</code>
     *         or <code>GITHUB</code>).
     */

    public SourceAuth getAuth() {
        return this.auth;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
     * directly (unless the build project's source <code>type</code> value is <code>BITBUCKET</code> or
     * <code>GITHUB</code>).
     * </p>
     * 
     * @param auth
     *        Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *        <p>
     *        This information is for the AWS CodeBuild console's use only. Your code should not get or set this
     *        information directly (unless the build project's source <code>type</code> value is <code>BITBUCKET</code>
     *        or <code>GITHUB</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withAuth(SourceAuth auth) {
        setAuth(auth);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getBuildspec() != null)
            sb.append("Buildspec: ").append(getBuildspec()).append(",");
        if (getAuth() != null)
            sb.append("Auth: ").append(getAuth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectSource == false)
            return false;
        ProjectSource other = (ProjectSource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBuildspec() == null ^ this.getBuildspec() == null)
            return false;
        if (other.getBuildspec() != null && other.getBuildspec().equals(this.getBuildspec()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBuildspec() == null) ? 0 : getBuildspec().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        return hashCode;
    }

    @Override
    public ProjectSource clone() {
        try {
            return (ProjectSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
