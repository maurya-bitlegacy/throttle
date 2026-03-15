package io.github.throttle.simulator.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Simple service to control and report load generator status.
 */
@Service
public class LoadControlService {

    /**
     * Container for load control status information.
     */
    public static class LoadControlStatus {
        private final boolean cpuLoadActive;
        private final boolean memoryLoadActive;

        /**
         * Create a new load control status.
         *
         * @param cpuLoadActive true if CPU load is active, false otherwise
         * @param memoryLoadActive true if memory load is active, false otherwise
         */
        public LoadControlStatus(boolean cpuLoadActive, boolean memoryLoadActive) {
            this.cpuLoadActive = cpuLoadActive;
            this.memoryLoadActive = memoryLoadActive;
        }

        /**
         * Check if CPU load is active.
         *
         * @return true if CPU load is active, false otherwise
         */
        public boolean isCpuLoadActive() { return cpuLoadActive; }

        /**
         * Check if memory load is active.
         *
         * @return true if memory load is active, false otherwise
         */
        public boolean isMemoryLoadActive() { return memoryLoadActive; }
    }

    private final AtomicBoolean cpuActive = new AtomicBoolean(false);
    private final AtomicBoolean memoryActive = new AtomicBoolean(false);

    /**
     * Get the current load control status.
     *
     * @return the current load control status
     */
    public LoadControlStatus getStatus() {
        return new LoadControlStatus(cpuActive.get(), memoryActive.get());
    }

    /**
     * Set the CPU active state.
     *
     * @param active true to set CPU as active, false otherwise
     */
    public void setCpuActive(boolean active) { cpuActive.set(active); }

    /**
     * Set the memory active state.
     *
     * @param active true to set memory as active, false otherwise
     */
    public void setMemoryActive(boolean active) { memoryActive.set(active); }

    /**
     * Check if CPU is active.
     *
     * @return true if CPU is active, false otherwise
     */
    public boolean isCpuActive() { return cpuActive.get(); }

    /**
     * Check if memory is active.
     *
     * @return true if memory is active, false otherwise
     */
    public boolean isMemoryActive() { return memoryActive.get(); }
}
