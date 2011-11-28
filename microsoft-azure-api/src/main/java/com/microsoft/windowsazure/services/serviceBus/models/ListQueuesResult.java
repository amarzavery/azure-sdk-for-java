package com.microsoft.windowsazure.services.serviceBus.models;

import java.util.List;

/**
 * Represents the result of a <code>listQueues</code> operation.
 */
public class ListQueuesResult {

    private List<QueueInfo> items;

    /**
     * Returns the items in the result list.
     * 
     * @return A <code>List</code> of {@link QueueInfo} objects that represent the
     *         items in the result list.
     */
    public List<QueueInfo> getItems() {
        return items;
    }

    /**
     * Specfies the items in the result list.
     * 
     * @param value
     *            A <code>List</code> object that contains the {@link QueueInfo} objects assigned as the value of the
     *            result.
     */
    public void setItems(List<QueueInfo> items) {
        this.items = items;
    }
}
