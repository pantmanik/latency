package com.samsung.latency.service.impl;

import com.samsung.latency.service.LatencyService;
import com.samsung.latency.service.policy.ExecutionPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LatencyServiceImpl implements LatencyService {

    @Autowired
    private ExecutionPolicy executionPolicy;
    /**
     * @param routeNumber
     * @param requestBody
     * @return
     */
    @Override
    public Boolean executeModel(int routeNumber, Object requestBody) {
        return executionPolicy.executePolicy(routeNumber, requestBody);
    }
}
