package com.qubole.qds.sdk.java.api;

public interface ClusterSpotInstanceConfigBuilder
{
    public ClusterConfigBuilder maximum_bid_price_percentage(String maximum_bid_price_percentage);
    public ClusterConfigBuilder timeout_for_request(int timeout_for_request);
    public ClusterConfigBuilder maximum_spot_instance_percentage(int maximum_spot_instance_percentage);
}
