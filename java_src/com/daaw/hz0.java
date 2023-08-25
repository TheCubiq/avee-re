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
    public static String a;
    public static int b;

    public static String a() {
        BufferedReader bufferedReader;
        if (a == null) {
            int i = b;
            if (i == 0) {
                i = Process.myPid();
                b = i;
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
                            ry0.j(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            xd0.a(bufferedReader2);
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
                xd0.a(bufferedReader);
            }
            a = str;
        }
        return a;
    }
}
