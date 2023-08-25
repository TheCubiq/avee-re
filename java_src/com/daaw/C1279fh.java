package com.daaw;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.conscrypt.EvpMdRef;
import org.conscrypt.NativeConstants;
/* renamed from: com.daaw.fh */
/* loaded from: classes2.dex */
public class C1279fh {

    /* renamed from: a */
    public static final char[] f9582a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static long f9583b = -1;

    /* renamed from: com.daaw.fh$a */
    /* loaded from: classes2.dex */
    public enum EnumC1280a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: z */
        public static final Map<String, EnumC1280a> f9595z;

        static {
            EnumC1280a enumC1280a = X86_32;
            EnumC1280a enumC1280a2 = ARMV6;
            EnumC1280a enumC1280a3 = ARMV7;
            EnumC1280a enumC1280a4 = ARM64;
            HashMap hashMap = new HashMap(4);
            f9595z = hashMap;
            hashMap.put("armeabi-v7a", enumC1280a3);
            hashMap.put("armeabi", enumC1280a2);
            hashMap.put("arm64-v8a", enumC1280a4);
            hashMap.put("x86", enumC1280a);
        }

        /* renamed from: a */
        public static EnumC1280a m22640a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                ml0.m15976f().m15973i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            EnumC1280a enumC1280a = f9595z.get(str.toLowerCase(Locale.US));
            return enumC1280a == null ? UNKNOWN : enumC1280a;
        }
    }

    /* renamed from: A */
    public static String m22667A(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: a */
    public static long m22666a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m22665b(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static boolean m22664c(Context context) {
        if (m22663d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m22663d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m22662e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ml0.m15976f().m15977e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m22661f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static long m22660g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * i;
    }

    /* renamed from: h */
    public static String m22659h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            sb.append(str2);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m22641z(sb2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r3[1];
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m22658i(File file, String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        str2 = null;
        str2 = null;
        BufferedReader bufferedReader2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                            if (split.length > 1 && split[0].equals(str)) {
                                break;
                            }
                        } catch (Exception e) {
                            e = e;
                            ml0.m15976f().m15977e("Error parsing " + file, e);
                            m22662e(bufferedReader, "Failed to close system file reader.");
                            return str2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        m22662e(bufferedReader2, "Failed to close system file reader.");
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                m22662e(bufferedReader2, "Failed to close system file reader.");
                throw th;
            }
            m22662e(bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m22657j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m22656k(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int m22650q = m22650q(context, str, "bool");
            if (m22650q > 0) {
                return resources.getBoolean(m22650q);
            }
            int m22650q2 = m22650q(context, str, "string");
            if (m22650q2 > 0) {
                return Boolean.parseBoolean(context.getString(m22650q2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static int m22655l() {
        return EnumC1280a.m22640a().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: m */
    public static int m22654m() {
        boolean m22643x = m22643x();
        ?? r0 = m22643x;
        if (m22642y()) {
            r0 = (m22643x ? 1 : 0) | true;
        }
        return m22644w() ? r0 | 4 : r0;
    }

    /* renamed from: n */
    public static String m22653n(Context context) {
        int m22650q = m22650q(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (m22650q == 0) {
            m22650q = m22650q(context, "com.crashlytics.android.build_id", "string");
        }
        if (m22650q != 0) {
            return context.getResources().getString(m22650q);
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m22652o(Context context) {
        return (m22643x() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    /* renamed from: p */
    public static String m22651p(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    /* renamed from: q */
    public static int m22650q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m22651p(context));
    }

    /* renamed from: r */
    public static SharedPreferences m22649r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: s */
    public static synchronized long m22648s() {
        long j;
        synchronized (C1279fh.class) {
            if (f9583b == -1) {
                long j2 = 0;
                String m22658i = m22658i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(m22658i)) {
                    String upperCase = m22658i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m22660g(upperCase, "KB", NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m22660g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m22660g(upperCase, "GB", 1073741824);
                        } else {
                            ml0 m15976f = ml0.m15976f();
                            m15976f.m15971k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        ml0 m15976f2 = ml0.m15976f();
                        m15976f2.m15977e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f9583b = j2;
            }
            j = f9583b;
        }
        return j;
    }

    /* renamed from: t */
    public static String m22647t(String str, String str2) {
        return m22646u(str.getBytes(), str2);
    }

    /* renamed from: u */
    public static String m22646u(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return m22645v(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15977e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: v */
    public static String m22645v(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f9582a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: w */
    public static boolean m22644w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: x */
    public static boolean m22643x() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m22642y() {
        boolean m22643x = m22643x();
        String str = Build.TAGS;
        if ((m22643x || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !m22643x && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* renamed from: z */
    public static String m22641z(String str) {
        return m22647t(str, EvpMdRef.SHA1.JCA_NAME);
    }
}
