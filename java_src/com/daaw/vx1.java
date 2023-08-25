package com.daaw;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class vx1 {
    public static final String a = ll0.f("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? b(context) : c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        File b2 = b(context);
        if (Build.VERSION.SDK_INT < 23 || !b2.exists()) {
            return;
        }
        ll0.c().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> f = f(context);
        for (File file : f.keySet()) {
            File file2 = f.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    ll0.c().h(a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                ll0.c().a(a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    public static Map<File, File> f(Context context) {
        File b2;
        File a2;
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(b(context), a(context));
            for (String str : b) {
                hashMap.put(new File(b2.getPath() + str), new File(a2.getPath() + str));
            }
        }
        return hashMap;
    }
}
