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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output for DescribeImportImageTasks.
 * </p>
 */
public class DescribeImportImageTasksResult implements Serializable {

    /**
     * A list of zero or more import image tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ImportImageTask> importImageTasks;

    /**
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * A list of zero or more import image tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     *
     * @return A list of zero or more import image tasks that are currently active or
     *         were completed or canceled in the previous 7 days.
     */
    public java.util.List<ImportImageTask> getImportImageTasks() {
        if (importImageTasks == null) {
              importImageTasks = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportImageTask>();
              importImageTasks.setAutoConstruct(true);
        }
        return importImageTasks;
    }
    
    /**
     * A list of zero or more import image tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     *
     * @param importImageTasks A list of zero or more import image tasks that are currently active or
     *         were completed or canceled in the previous 7 days.
     */
    public void setImportImageTasks(java.util.Collection<ImportImageTask> importImageTasks) {
        if (importImageTasks == null) {
            this.importImageTasks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ImportImageTask> importImageTasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportImageTask>(importImageTasks.size());
        importImageTasksCopy.addAll(importImageTasks);
        this.importImageTasks = importImageTasksCopy;
    }
    
    /**
     * A list of zero or more import image tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importImageTasks A list of zero or more import image tasks that are currently active or
     *         were completed or canceled in the previous 7 days.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksResult withImportImageTasks(ImportImageTask... importImageTasks) {
        if (getImportImageTasks() == null) setImportImageTasks(new java.util.ArrayList<ImportImageTask>(importImageTasks.length));
        for (ImportImageTask value : importImageTasks) {
            getImportImageTasks().add(value);
        }
        return this;
    }
    
    /**
     * A list of zero or more import image tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importImageTasks A list of zero or more import image tasks that are currently active or
     *         were completed or canceled in the previous 7 days.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksResult withImportImageTasks(java.util.Collection<ImportImageTask> importImageTasks) {
        if (importImageTasks == null) {
            this.importImageTasks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ImportImageTask> importImageTasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportImageTask>(importImageTasks.size());
            importImageTasksCopy.addAll(importImageTasks);
            this.importImageTasks = importImageTasksCopy;
        }

        return this;
    }

    /**
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token to use to get the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token to use to get the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to get the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getImportImageTasks() != null) sb.append("ImportImageTasks: " + getImportImageTasks() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImportImageTasks() == null) ? 0 : getImportImageTasks().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeImportImageTasksResult == false) return false;
        DescribeImportImageTasksResult other = (DescribeImportImageTasksResult)obj;
        
        if (other.getImportImageTasks() == null ^ this.getImportImageTasks() == null) return false;
        if (other.getImportImageTasks() != null && other.getImportImageTasks().equals(this.getImportImageTasks()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    