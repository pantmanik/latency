package com.samsung.latency.service.policy;

public interface ExecutionPolicy {
    Boolean executePolicy(int routeNumber, Object request);
}
