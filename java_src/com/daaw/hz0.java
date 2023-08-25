package com.daaw;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class hz0 {
    @Nullable

    /* renamed from: a */
    public static String f13067a;

    /* renamed from: b */
    public static int f13068b;

    /* renamed from: a */
    public static String m20322a() {
        BufferedReader bufferedReader;
        if (f13067a == null) {
            int i = f13068b;
            if (i == 0) {
                i = Process.myPid();
                f13068b = i;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i > 0) {
                try {
                    String str2 = "/proc/" + i + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                        try {
                            String readLine = bufferedReader.readLine();
                            ry0.m10830j(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            xd0.m5227a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                xd0.m5227a(bufferedReader);
            }
            f13067a = str;
        }
        return f13067a;
    }
}
