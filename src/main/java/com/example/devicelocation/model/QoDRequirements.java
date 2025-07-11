package com.example.devicelocation.model;

public class QoDRequirements {
    private String latency;
    private String throughput;
    private String jitter;

    public String getLatency() { return latency; }
    public void setLatency(String latency) { this.latency = latency; }

    public String getThroughput() { return throughput; }
    public void setThroughput(String throughput) { this.throughput = throughput; }

    public String getJitter() { return jitter; }
    public void setJitter(String jitter) { this.jitter = jitter; }
}
