package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.daaw.avee.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* renamed from: com.daaw.dl */
/* loaded from: classes.dex */
public class C1100dl {

    /* renamed from: a */
    public static String[] f7221a = {"/storage/sdcard1", "/storage/extsdcard", "/storage/sdcard0/external_sdcard", "/mnt/extsdcard", "/mnt/sdcard/external_sd", "/mnt/external_sd", "/mnt/media_rw/sdcard1", "/removable/microsd", "/mnt/emmc", "/storage/external_SD", "/storage/ext_sd", "/storage/removable/sdcard1", "/data/sdext", "/data/sdext2", "/data/sdext3", "/data/sdext4", "/sdcard1", "/sdcard2", "/storage/usbdisk0", "/storage/usbdisk1", "/storage/usbdisk2"};

    @TargetApi(19)
    /* renamed from: a */
    public static void m24293a(Context context, List<String> list) {
        File[] externalFilesDirs;
        for (File file : context.getExternalFilesDirs("external")) {
            if (file != null) {
                int lastIndexOf = file.getAbsolutePath().lastIndexOf("/Android/data");
                if (lastIndexOf < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected external file dir: ");
                    sb.append(file.getAbsolutePath());
                } else {
                    String substring = file.getAbsolutePath().substring(0, lastIndexOf);
                    try {
                        substring = new File(substring).getCanonicalPath();
                    } catch (IOException unused) {
                    }
                    list.add(substring);
                }
            }
        }
        if (list.isEmpty()) {
            list.add("/storage/sdcard1");
        }
    }

    /* renamed from: b */
    public static String m24292b() {
        return m24287g(Environment.getExternalStorageDirectory().getAbsolutePath(), '/');
    }

    /* renamed from: c */
    public static String m24291c(String str, String str2, Context context) {
        int i;
        if (context != null && str != null) {
            if ("-03".equals(str)) {
                i = R.string.directory_internal;
            } else if (str.startsWith("-02")) {
                i = R.string.directory_sdcard;
            }
            return context.getString(i);
        }
        if (str2 == null) {
            return "<unnamed>";
        }
        try {
            return str2.substring(str2.lastIndexOf("/") + 1);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: d */
    public static String m24290d(Context context) {
        List<String> m24289e = m24289e(context);
        String lowerCase = m24292b().toLowerCase();
        ArrayList<String> arrayList = new ArrayList(m24289e.size());
        for (String str : m24289e) {
            String lowerCase2 = m24287g(str, '/').toLowerCase();
            if (!lowerCase.equals(lowerCase2)) {
                arrayList.add(lowerCase2);
            }
        }
        List asList = Arrays.asList(f7221a);
        String str2 = "";
        for (String str3 : arrayList) {
            if (!asList.contains(str3)) {
                str2 = str3;
            }
        }
        if (m24287g(str2, '/').isEmpty()) {
            File file = new File("/storage/sdcard1");
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            if (arrayList.size() > 0) {
                str2 = (String) arrayList.get(0);
            }
        }
        return m24287g(str2, '/');
    }

    /* renamed from: e */
    public static List<String> m24289e(Context context) {
        ArrayList arrayList = new ArrayList();
        String str = System.getenv("EXTERNAL_STORAGE");
        String str2 = System.getenv("SECONDARY_STORAGE");
        String str3 = System.getenv("EMULATED_STORAGE_TARGET");
        if (!TextUtils.isEmpty(str3)) {
            String[] split = Pattern.compile("/").split(Environment.getExternalStorageDirectory().getAbsolutePath());
            boolean z = true;
            String str4 = split[split.length - 1];
            try {
                Integer.valueOf(str4);
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                str4 = "";
            }
            if (TextUtils.isEmpty(str4)) {
                arrayList.add(str3);
            } else {
                arrayList.add(str3 + File.separator + str4);
            }
        } else if (m24288f()) {
            m24293a(context, arrayList);
        } else if (TextUtils.isEmpty(str)) {
            Collections.addAll(arrayList, f7221a);
        } else {
            arrayList.add(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            Collections.addAll(arrayList, str2.split(File.pathSeparator));
        }
        return arrayList;
    }

    /* renamed from: f */
    public static boolean m24288f() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: g */
    public static String m24287g(String str, char c) {
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) == c) {
            length--;
        }
        return str.substring(0, length);
    }
}
