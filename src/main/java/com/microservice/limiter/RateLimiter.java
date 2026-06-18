package com.microservice.limiter;

import com.microservice.enums.RateLimitType;
import com.microservice.model.RateLimitConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter

public abstract class RateLimiter {
    protected final RateLimitConfig config;
    protected final RateLimitType type;

    public abstract boolean allowRequest(String userId);
}
