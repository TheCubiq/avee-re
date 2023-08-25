package com.daaw;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class vx1 {

    /* renamed from: a */
    public static final String f30696a = ll0.m16883f("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f30697b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m6680a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? m6679b(context) : m6678c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m6679b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    public static File m6678c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m6677d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m6676e(Context context) {
        File m6679b = m6679b(context);
        if (Build.VERSION.SDK_INT < 23 || !m6679b.exists()) {
            return;
        }
        ll0.m16885c().mo16882a(f30696a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> m6675f = m6675f(context);
        for (File file : m6675f.keySet()) {
            File file2 = m6675f.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    ll0.m16885c().mo16878h(f30696a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                ll0.m16885c().mo16882a(f30696a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m6675f(Context context) {
        File m6679b;
        File m6680a;
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(m6679b(context), m6680a(context));
            for (String str : f30697b) {
                hashMap.put(new File(m6679b.getPath() + str), new File(m6680a.getPath() + str));
            }
        }
        return hashMap;
    }
}
