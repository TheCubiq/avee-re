package com.daaw.avee;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;
/* loaded from: classes.dex */
public class AppPermissions {
    public static int REQUEST_RECORD_AUDIO = 2;
    public static int REQUEST_STORAGE = 1;
    public static int REQUEST_STORAGE_AND_AUDIO = 4;
    public static int REQUEST_WRITE_SETTINGS = 3;

    public static boolean isPermissionsGranted(Context context, Activity activity) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z = context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
            boolean z2 = context.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
            String[] strArr = null;
            if (!z && !z2) {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"};
                i = REQUEST_STORAGE_AND_AUDIO;
            } else if (!z) {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
                i = REQUEST_STORAGE;
            } else if (z2) {
                i = 0;
            } else {
                strArr = new String[]{"android.permission.RECORD_AUDIO"};
                i = REQUEST_RECORD_AUDIO;
            }
            if (strArr != null) {
                if (activity != null) {
                    ActivityCompat.requestPermissions(activity, strArr, i);
                }
                return false;
            }
        }
        return true;
    }

    public static boolean isStoragePermissionGranted(Context context, Activity activity) {
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        if (activity != null) {
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, REQUEST_STORAGE);
        }
        return false;
    }

    public static boolean is_RecordAudio_PermissionGranted(Context context, Activity activity) {
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        if (activity != null) {
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.RECORD_AUDIO"}, REQUEST_RECORD_AUDIO);
        }
        return false;
    }

    public static boolean is_WRITE_SETTINGS_PermissionGranted(Context context, Activity activity) {
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.WRITE_SETTINGS") == 0) {
            return true;
        }
        if (activity != null) {
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.WRITE_SETTINGS"}, REQUEST_WRITE_SETTINGS);
        }
        return false;
    }
}
