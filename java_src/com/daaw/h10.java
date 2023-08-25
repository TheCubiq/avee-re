package com.daaw;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class h10 {

    /* renamed from: a */
    public final File f11944a;

    /* renamed from: b */
    public final File f11945b;

    /* renamed from: c */
    public final File f11946c;

    /* renamed from: d */
    public final File f11947d;

    /* renamed from: e */
    public final File f11948e;

    /* renamed from: f */
    public final File f11949f;

    public h10(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f11944a = filesDir;
        if (m21090v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m21091u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File m21095q = m21095q(new File(filesDir, str));
        this.f11945b = m21095q;
        this.f11946c = m21095q(new File(m21095q, "open-sessions"));
        this.f11947d = m21095q(new File(m21095q, "reports"));
        this.f11948e = m21095q(new File(m21095q, "priority-reports"));
        this.f11949f = m21095q(new File(m21095q, "native-reports"));
    }

    /* renamed from: q */
    public static synchronized File m21095q(File file) {
        synchronized (h10.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                ml0 m15976f = ml0.m15976f();
                m15976f.m15980b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                ml0 m15976f2 = ml0.m15976f();
                m15976f2.m15978d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    /* renamed from: r */
    public static File m21094r(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    public static boolean m21093s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m21093s(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    public static <T> List<T> m21092t(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: u */
    public static String m21091u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: v */
    public static boolean m21090v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    public final void m21111a(File file) {
        if (file.exists() && m21093s(file)) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15980b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: b */
    public void m21110b() {
        m21111a(new File(this.f11944a, ".com.google.firebase.crashlytics"));
        m21111a(new File(this.f11944a, ".com.google.firebase.crashlytics-ndk"));
        if (m21090v()) {
            m21111a(new File(this.f11944a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean m21109c(String str) {
        return m21093s(new File(this.f11946c, str));
    }

    /* renamed from: d */
    public List<String> m21108d() {
        return m21092t(this.f11946c.list());
    }

    /* renamed from: e */
    public File m21107e(String str) {
        return new File(this.f11945b, str);
    }

    /* renamed from: f */
    public List<File> m21106f(FilenameFilter filenameFilter) {
        return m21092t(this.f11945b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File m21105g(String str) {
        return new File(this.f11949f, str);
    }

    /* renamed from: h */
    public List<File> m21104h() {
        return m21092t(this.f11949f.listFiles());
    }

    /* renamed from: i */
    public File m21103i(String str) {
        return m21094r(new File(m21098n(str), "native"));
    }

    /* renamed from: j */
    public File m21102j(String str) {
        return new File(this.f11948e, str);
    }

    /* renamed from: k */
    public List<File> m21101k() {
        return m21092t(this.f11948e.listFiles());
    }

    /* renamed from: l */
    public File m21100l(String str) {
        return new File(this.f11947d, str);
    }

    /* renamed from: m */
    public List<File> m21099m() {
        return m21092t(this.f11947d.listFiles());
    }

    /* renamed from: n */
    public final File m21098n(String str) {
        return m21094r(new File(this.f11946c, str));
    }

    /* renamed from: o */
    public File m21097o(String str, String str2) {
        return new File(m21098n(str), str2);
    }

    /* renamed from: p */
    public List<File> m21096p(String str, FilenameFilter filenameFilter) {
        return m21092t(m21098n(str).listFiles(filenameFilter));
    }
}
