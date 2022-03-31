package com.google.mlkit.vision.demo.preference;

import android.content.Context;

import com.google.mlkit.vision.pose.PoseDetectorOptionsBase;
import com.google.mlkit.vision.pose.accurate.AccuratePoseDetectorOptions;

// TODO : CRS - Twist
public class PreferenceUtils {

    public static PoseDetectorOptionsBase getPoseDetectorOptionsForLivePreview(Context context) {

        AccuratePoseDetectorOptions.Builder builder = new AccuratePoseDetectorOptions.Builder()
                .setDetectorMode(AccuratePoseDetectorOptions.STREAM_MODE)
                .setPreferredHardwareConfigs(AccuratePoseDetectorOptions.CPU_GPU);
        return builder.build();
    }

    public static boolean isCameraLiveViewportEnabled(Context context) {

        return false;
    }

    public static boolean shouldHideDetectionInfo(Context context) {
        return false;
    }

    public static boolean shouldShowPoseDetectionInFrameLikelihoodLivePreview(Context context) {
        return true;
    }

    public static boolean shouldPoseDetectionVisualizeZ(Context context) {
        return true;
    }

    public static boolean shouldPoseDetectionRescaleZForVisualization(Context context) {
        return true;
    }

    public static boolean shouldPoseDetectionRunClassification(Context context) {
        return false;
    }
}
