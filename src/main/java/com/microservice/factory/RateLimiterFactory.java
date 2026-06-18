package com.microservice.factory;


import com.microservice.enums.RateLimitType;
import com.microservice.limiter.FixedWindowRateLimiter;
import com.microservice.limiter.RateLimiter;
import com.microservice.limiter.SlidingWindowLogRateLimiter;
import com.microservice.limiter.TokenBucketRateLimiter;
import com.microservice.model.RateLimitConfig;

public class RateLimiterFactory {
    public static RateLimiter createRateLimiter(RateLimitType algo, RateLimitConfig config) {
        return switch (algo) {
            case TOKEN_BUCKET -> new TokenBucketRateLimiter(config);
            case FIXED_WINDOW -> new FixedWindowRateLimiter(config);
            case SLIDING_WINDOW_LOG -> new SlidingWindowLogRateLimiter(config);
            default -> throw new IllegalArgumentException("Unknown algorithm: " + algo);
        };
    }
}