package io.github.dpr.utils;

/**
 *
 * @author eleven
 * @date 2022年06月02日 4:10 PM
 * @see
 * @since
 */

public class EnvironmentUtils {

    public static String getResourceTailByOs(String osName) {
        if (osName == null || osName.isEmpty()) {
            throw new IllegalArgumentException("osName cannot be null or empty");
        }
        osName = osName.toLowerCase();
        if (osName.contains("windows")) return ".dll";
        if (osName.contains("linux")) {
            String osArch = System.getProperty("os.arch").toLowerCase();
            if ("aarch64".equals(osArch)) {
                return "_arm.so";
            }
            return ".so";
        }

        if (osName.contains("mac")) {
            String osArch = System.getProperty("os.arch").toLowerCase();
            if ("aarch64".equals(osArch)) {
                return "_arm.dylib";
            }
            return ".dylib";
        }
        throw new IllegalArgumentException("does not support os :" + osName);
    }

    private EnvironmentUtils() {}
}
