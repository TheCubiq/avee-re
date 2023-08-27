package com.AOSPutils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class UtilsFileSys {
    public static final Pattern DIR_SEPARATOR = Pattern.compile("/");
    public static boolean rootMode = false;

    public boolean checkStoragePermission() {
        return true;
    }

    public synchronized ArrayList<String> getStorageDirectories(Context context) {
        ArrayList<String> arrayList;
        String str;
        String[] extSdCardPathsForActivity;
        arrayList = new ArrayList<>();
        String str2 = System.getenv("EXTERNAL_STORAGE");
        String str3 = System.getenv("SECONDARY_STORAGE");
        String str4 = System.getenv("EMULATED_STORAGE_TARGET");
        if (TextUtils.isEmpty(str4)) {
            if (TextUtils.isEmpty(str2)) {
                arrayList.add("/storage/sdcard0");
            } else {
                arrayList.add(str2);
            }
        } else {
            if (Build.VERSION.SDK_INT < 17) {
                str = "";
            } else {
                String[] split = DIR_SEPARATOR.split(Environment.getExternalStorageDirectory().getAbsolutePath());
                boolean z = true;
                str = split[split.length - 1];
                try {
                    Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    z = false;
                }
                if (!z) {
                    str = "";
                }
            }
            if (TextUtils.isEmpty(str)) {
                arrayList.add(str4);
            } else {
                arrayList.add(str4 + File.separator + str);
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            Collections.addAll(arrayList, str3.split(File.pathSeparator));
        }
        if (Build.VERSION.SDK_INT >= 23 && checkStoragePermission()) {
            arrayList.clear();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            for (String str5 : getExtSdCardPathsForActivity(context)) {
                File file = new File(str5);
                if (!arrayList.contains(str5) && canListFiles(file)) {
                    arrayList.add(str5);
                }
            }
        }
        if (rootMode) {
            arrayList.add("/");
        }
        File usbDrive = getUsbDrive();
        if (usbDrive != null && !arrayList.contains(usbDrive.getPath())) {
            arrayList.add(usbDrive.getPath());
        }
        return arrayList;
    }

    public static String[] getExtSdCardPathsForActivity(Context context) {
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        for (File file : context.getExternalFilesDirs("external")) {
            if (file != null) {
                int lastIndexOf = file.getAbsolutePath().lastIndexOf("/Android/data");
                if (lastIndexOf < 0) {
                    Log.w("", "Unexpected external file dir: " + file.getAbsolutePath());
                } else {
                    String substring = file.getAbsolutePath().substring(0, lastIndexOf);
                    try {
                        substring = new File(substring).getCanonicalPath();
                    } catch (IOException unused) {
                    }
                    arrayList.add(substring);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("/storage/sdcard1");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean canListFiles(File file) {
        return file.canRead() && file.isDirectory();
    }

    public File getUsbDrive() {
        File[] listFiles;
        try {
            for (File file : new File("/storage").listFiles()) {
                if (file.exists() && file.getName().toLowerCase().contains("usb") && file.canExecute()) {
                    return file;
                }
            }
        } catch (Exception unused) {
        }
        File file2 = new File("/mnt/sdcard/usbStorage");
        if (file2.exists() && file2.canExecute()) {
            return file2;
        }
        File file3 = new File("/mnt/sdcard/usb_storage");
        if (file3.exists() && file3.canExecute()) {
            return file3;
        }
        return null;
    }
}
