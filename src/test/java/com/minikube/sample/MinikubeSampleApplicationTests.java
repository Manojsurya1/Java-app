package com.minikube.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.kubernetes.client.KubernetesClientAutoConfiguration;
import org.springframework.cloud.kubernetes.discovery.KubernetesDiscoveryClientAutoConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {
    "spring.cloud.kubernetes.enabled=false",
    "spring.main.allow-bean-definition-overriding=true"
})
@ImportAutoConfiguration(exclude = {
    KubernetesClientAutoConfiguration.class,
    KubernetesDiscoveryClientAutoConfiguration.class
})
public class MinikubeSampleApplicationTests {

    @Test
    public void contextLoads() {
    }

}
