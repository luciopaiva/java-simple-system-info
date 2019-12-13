package com.luciopaiva;

import static com.luciopaiva.Utils.bytesToHumanReadableValue;

@SuppressWarnings("InfiniteLoopStatement")
public class Main {

    public static void main(String[] args) throws InterruptedException {
        SimpleSystemInfo info = SimpleSystemInfo.getInstance();

        System.out.println(String.format("%s %s %s", info.getName(), info.getArch(), info.getVersion()));
        System.out.println("Available processors: " + info.getAvailableProcessors());

        while (true) {
            showCpuInfo(info);
            showMemoryInfo(info);
            Thread.sleep(1000);
        }
    }

    private static void showCpuInfo(SimpleSystemInfo info) {
        double processCpu = 100 * info.getProcessCpuLoad();
        double systemCpu = 100 * info.getSystemCpuLoad();
        double avgLoad = info.getSystemLoadAverage();

        System.out.println(String.format("CPU: %4.1f%% (process), %4.1f%% (system total), avg. load: %.2f",
                processCpu, systemCpu, avgLoad));
    }

    private static void showMemoryInfo(SimpleSystemInfo info) {
        String usedMem = bytesToHumanReadableValue(info.getProcessAllocatedMemory());
        String totalMem = bytesToHumanReadableValue(info.getProcessTotalMemory());
        float memoryLoad = 100 * info.getProcessMemoryLoad();
        System.out.println(String.format("Process memory: %s used (%.1f%%), %s total", usedMem, memoryLoad, totalMem));
    }
}
