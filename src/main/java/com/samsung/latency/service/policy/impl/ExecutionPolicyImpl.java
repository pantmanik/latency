package com.samsung.latency.service.policy.impl;

import com.samsung.latency.config.PolicyConfig;
import com.samsung.latency.service.policy.ExecutionPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExecutionPolicyImpl implements ExecutionPolicy {
    @Autowired
    private PolicyConfig policyConfig;
    /**
     * @param routeNumber 
     * @param request
     * @return
     */
    @Override
    public Boolean executePolicy(int routeNumber, Object request) {
        return false;
    }
}
