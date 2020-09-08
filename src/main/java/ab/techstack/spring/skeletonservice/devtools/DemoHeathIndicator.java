package ab.techstack.spring.skeletonservice.devtools;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DemoHeathIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().withDetail("reason", "testing").build();
    }
}
