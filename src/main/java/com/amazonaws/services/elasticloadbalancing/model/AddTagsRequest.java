/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#addTags(AddTagsRequest) AddTags operation}.
 * <p>
 * Adds one or more tags for the specified load balancer. Each load
 * balancer can have a maximum of 10 tags. Each tag consists of a key and
 * an optional value.
 * </p>
 * <p>
 * Tag keys must be unique for each load balancer. If a tag with the same
 * key is already associated with the load balancer, this action will
 * update the value of the key.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb"> Tagging </a>
 * in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#addTags(AddTagsRequest)
 */
public class AddTagsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the load balancer to tag. You can specify a maximum of one
     * load balancer name.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNames;

    /**
     * A list of tags for each load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name of the load balancer to tag. You can specify a maximum of one
     * load balancer name.
     *
     * @return The name of the load balancer to tag. You can specify a maximum of one
     *         load balancer name.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
              loadBalancerNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              loadBalancerNames.setAutoConstruct(true);
        }
        return loadBalancerNames;
    }
    
    /**
     * The name of the load balancer to tag. You can specify a maximum of one
     * load balancer name.
     *
     * @param loadBalancerNames The name of the load balancer to tag. You can specify a maximum of one
     *         load balancer name.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(loadBalancerNames.size());
        loadBalancerNamesCopy.addAll(loadBalancerNames);
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * The name of the load balancer to tag. You can specify a maximum of one
     * load balancer name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames The name of the load balancer to tag. You can specify a maximum of one
     *         load balancer name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) setLoadBalancerNames(new java.util.ArrayList<String>(loadBalancerNames.length));
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * The name of the load balancer to tag. You can specify a maximum of one
     * load balancer name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames The name of the load balancer to tag. You can specify a maximum of one
     *         load balancer name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(loadBalancerNames.size());
            loadBalancerNamesCopy.addAll(loadBalancerNames);
            this.loadBalancerNames = loadBalancerNamesCopy;
        }

        return this;
    }

    /**
     * A list of tags for each load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A list of tags for each load balancer.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for each load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param tags A list of tags for each load balancer.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for each load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param tags A list of tags for each load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for each load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param tags A list of tags for each load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoadBalancerNames() != null) sb.append("LoadBalancerNames: " + getLoadBalancerNames() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddTagsRequest == false) return false;
        AddTagsRequest other = (AddTagsRequest)obj;
        
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null) return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    