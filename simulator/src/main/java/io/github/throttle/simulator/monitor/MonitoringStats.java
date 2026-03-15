package io.github.throttle.simulator.monitor;

/**
 * Statistics from monitoring session.
 */
public class MonitoringStats {
    private final int sampleCount;
    private final double minCpu;
    private final double maxCpu;
    private final double avgCpu;
    private final double minMemory;
    private final double maxMemory;
    private final double avgMemory;

    /**
     * Create monitoring statistics with the given values.
     *
     * @param sampleCount the number of samples
     * @param minCpu the minimum CPU usage
     * @param maxCpu the maximum CPU usage
     * @param avgCpu the average CPU usage
     * @param minMemory the minimum memory usage
     * @param maxMemory the maximum memory usage
     * @param avgMemory the average memory usage
     */
    public MonitoringStats(int sampleCount, double minCpu, double maxCpu, double avgCpu,
                          double minMemory, double maxMemory, double avgMemory) {
        this.sampleCount = sampleCount;
        this.minCpu = minCpu;
        this.maxCpu = maxCpu;
        this.avgCpu = avgCpu;
        this.minMemory = minMemory;
        this.maxMemory = maxMemory;
        this.avgMemory = avgMemory;
    }

    /**
     * Get the number of samples.
     *
     * @return the number of samples
     */
    public int getSampleCount() { return sampleCount; }

    /**
     * Get the minimum CPU usage.
     *
     * @return the minimum CPU usage
     */
    public double getMinCpu() { return minCpu; }

    /**
     * Get the maximum CPU usage.
     *
     * @return the maximum CPU usage
     */
    public double getMaxCpu() { return maxCpu; }

    /**
     * Get the average CPU usage.
     *
     * @return the average CPU usage
     */
    public double getAvgCpu() { return avgCpu; }

    /**
     * Get the minimum memory usage.
     *
     * @return the minimum memory usage
     */
    public double getMinMemory() { return minMemory; }

    /**
     * Get the maximum memory usage.
     *
     * @return the maximum memory usage
     */
    public double getMaxMemory() { return maxMemory; }

    /**
     * Get the average memory usage.
     *
     * @return the average memory usage
     */
    public double getAvgMemory() { return avgMemory; }

    @Override
    public String toString() {
        return String.format(
            "MonitoringStats{samples=%d, CPU[min=%.1f%%, max=%.1f%%, avg=%.1f%%], " +
            "Memory[min=%.1f%%, max=%.1f%%, avg=%.1f%%]}",
            sampleCount, minCpu, maxCpu, avgCpu, minMemory, maxMemory, avgMemory);
    }
}
