package io.github.throttle.simulator.monitor;

/**
 * Snapshot of system state at a point in time.
 */
public class SystemSnapshot {
    private final long timestamp;
    private final double cpuUsage;
    private final double memoryUsage;

    /**
     * Create a new system snapshot.
     *
     * @param timestamp the timestamp of the snapshot
     * @param cpuUsage the CPU usage percentage
     * @param memoryUsage the memory usage percentage
     */
    public SystemSnapshot(long timestamp, double cpuUsage, double memoryUsage) {
        this.timestamp = timestamp;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
    }

    /**
     * Get the timestamp of the snapshot.
     *
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Get the CPU usage percentage.
     *
     * @return the CPU usage
     */
    public double getCpuUsage() {
        return cpuUsage;
    }

    /**
     * Get the memory usage percentage.
     *
     * @return the memory usage
     */
    public double getMemoryUsage() {
        return memoryUsage;
    }

    @Override
    public String toString() {
        return String.format("SystemSnapshot{time=%d, cpu=%.1f%%, memory=%.1f%%}",
            timestamp, cpuUsage, memoryUsage);
    }
}
