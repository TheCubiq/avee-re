package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class n18 {
    @GuardedBy("CachingReader.class")

    /* renamed from: a */
    public static volatile y38 f19347a;

    /* JADX WARN: Can't wrap try/catch for region: R(17:6|(3:10|11|12)|18|(1:22)|23|24|25|26|27|28|(6:30|31|(10:33|34|35|36|37|38|(2:39|(3:41|(3:56|57|58)(7:43|44|(2:46|(1:49))|50|(1:52)|53|54)|55)(1:59))|60|61|62)(1:79)|63|11|12)|80|31|(0)(0)|63|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0013, B:15:0x002c, B:66:0x014e, B:10:0x001b, B:12:0x0023, B:17:0x0033, B:19:0x0039, B:21:0x003f, B:22:0x0043, B:65:0x0149, B:70:0x0156, B:23:0x0047, B:25:0x004b, B:26:0x0058, B:28:0x005e, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:52:0x011a, B:53:0x011d, B:60:0x013d, B:59:0x0128, B:62:0x013f, B:63:0x0144, B:64:0x0145, B:29:0x0063), top: B:87:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145 A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0013, B:15:0x002c, B:66:0x014e, B:10:0x001b, B:12:0x0023, B:17:0x0033, B:19:0x0039, B:21:0x003f, B:22:0x0043, B:65:0x0149, B:70:0x0156, B:23:0x0047, B:25:0x004b, B:26:0x0058, B:28:0x005e, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:52:0x011a, B:53:0x011d, B:60:0x013d, B:59:0x0128, B:62:0x013f, B:63:0x0144, B:64:0x0145, B:29:0x0063), top: B:87:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y38 m15585a(Context context) {
        y38 y38Var;
        y38 m4137c;
        y38 m4137c2;
        synchronized (n18.class) {
            y38Var = f19347a;
            if (y38Var == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                    m4137c2 = y38.m4137c();
                    y38Var = m4137c2;
                    f19347a = y38Var;
                }
                if (wv7.m5758b() && !context.isDeviceProtectedStorage()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (file.exists()) {
                    m4137c = y38.m4136d(file);
                    if (m4137c.mo4138b()) {
                        m4137c2 = y38.m4137c();
                    } else {
                        File file2 = (File) m4137c.mo4139a();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                cd1 cd1Var = new cd1();
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Invalid: ");
                                        sb.append(readLine);
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        if (!cd1Var.containsKey(str3)) {
                                            cd1Var.put(str3, new cd1());
                                        }
                                        ((cd1) cd1Var.get(str3)).put(decode, str4);
                                    }
                                }
                                String obj = file2.toString();
                                String packageName = context.getPackageName();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Parsed ");
                                sb2.append(obj);
                                sb2.append(" for Android package ");
                                sb2.append(packageName);
                                s08 s08Var = new s08(cd1Var);
                                bufferedReader.close();
                                m4137c2 = y38.m4136d(s08Var);
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    y38Var = m4137c2;
                    f19347a = y38Var;
                }
                m4137c = y38.m4137c();
                if (m4137c.mo4138b()) {
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                y38Var = m4137c2;
                f19347a = y38Var;
            }
        }
        return y38Var;
    }
}
