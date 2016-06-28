/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#terminateInstanceInAutoScalingGroup(TerminateInstanceInAutoScalingGroupRequest) TerminateInstanceInAutoScalingGroup operation}.
 * <p>
 * Terminates the specified instance and optionally adjusts the desired
 * group size.
 * </p>
 * <p>
 * This call simply makes a termination request. The instance is not
 * terminated immediately.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#terminateInstanceInAutoScalingGroup(TerminateInstanceInAutoScalingGroupRequest)
 */
public class TerminateInstanceInAutoScalingGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * If <code>true</code>, terminating the instance also decrements the
     * size of the Auto Scaling group.
     */
    private Boolean shouldDecrementDesiredCapacity;

    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TerminateInstanceInAutoScalingGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * If <code>true</code>, terminating the instance also decrements the
     * size of the Auto Scaling group.
     *
     * @return If <code>true</code>, terminating the instance also decrements the
     *         size of the Auto Scaling group.
     */
    public Boolean isShouldDecrementDesiredCapacity() {
        return shouldDecrementDesiredCapacity;
    }
    
    /**
     * If <code>true</code>, terminating the instance also decrements the
     * size of the Auto Scaling group.
     *
     * @param shouldDecrementDesiredCapacity If <code>true</code>, terminating the instance also decrements the
     *         size of the Auto Scaling group.
     */
    public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
    }
    
    /**
     * If <code>true</code>, terminating the instance also decrements the
     * size of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shouldDecrementDesiredCapacity If <code>true</code>, terminating the instance also decrements the
     *         size of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TerminateInstanceInAutoScalingGroupRequest withShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
        return this;
    }

    /**
     * If <code>true</code>, terminating the instance also decrements the
     * size of the Auto Scaling group.
     *
     * @return If <code>true</code>, terminating the instance also decrements the
     *         size of the Auto Scaling group.
     */
    public Boolean getShouldDecrementDesiredCapacity() {
        return shouldDecrementDesiredCapacity;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (isShouldDecrementDesiredCapacity() != null) sb.append("ShouldDecrementDesiredCapacity: " + isShouldDecrementDesiredCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((isShouldDecrementDesiredCapacity() == null) ? 0 : isShouldDecrementDesiredCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TerminateInstanceInAutoScalingGroupRequest == false) return false;
        TerminateInstanceInAutoScalingGroupRequest other = (TerminateInstanceInAutoScalingGroupRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.isShouldDecrementDesiredCapacity() == null ^ this.isShouldDecrementDesiredCapacity() == null) return false;
        if (other.isShouldDecrementDesiredCapacity() != null && other.isShouldDecrementDesiredCapacity().equals(this.isShouldDecrementDesiredCapacity()) == false) return false; 
        return true;
    }
    
}
    