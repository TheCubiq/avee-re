package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class mt6 {
    /* renamed from: a */
    public static boolean m15773a(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m15772b(Context context, es6 es6Var) {
        String str;
        int i;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] listFiles = file.listFiles(new g47(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    bArr = new byte[20];
                } catch (IOException e) {
                    m15770d(null, e.toString(), context, es6Var);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] != 2) {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            fileInputStream.close();
                            i = 5;
                        } else if (s == 40) {
                            fileInputStream.close();
                            i = 3;
                        } else if (s == 62) {
                            fileInputStream.close();
                            i = 7;
                        } else if (s != 183) {
                            m15770d(bArr, null, context, es6Var);
                        } else {
                            fileInputStream.close();
                            i = 6;
                        }
                        if (i == 1000) {
                            String m15771c = m15771c(context, es6Var);
                            if (TextUtils.isEmpty(m15771c)) {
                                m15771c = "Empty dev arch";
                            } else if (m15771c.equalsIgnoreCase("i686") || m15771c.equalsIgnoreCase("x86")) {
                                i = 5;
                            } else if (m15771c.equalsIgnoreCase("x86_64")) {
                                i = 7;
                            } else if (m15771c.equalsIgnoreCase("arm64-v8a")) {
                                i = 6;
                            } else if (m15771c.equalsIgnoreCase("armeabi-v7a") || m15771c.equalsIgnoreCase("armv71")) {
                                i = 3;
                            }
                            m15770d(null, m15771c, context, es6Var);
                            i = 1;
                        }
                        es6Var.m23230b(5018, i != 1 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                        return i;
                    }
                    m15770d(bArr, null, context, es6Var);
                }
                fileInputStream.close();
                i = 1;
                if (i == 1000) {
                }
                es6Var.m23230b(5018, i != 1 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                return i;
            }
            str = "No .so";
        } else {
            str = "No lib/";
        }
        es6Var.m23230b(5017, str);
        i = 1000;
        if (i == 1000) {
        }
        es6Var.m23230b(5018, i != 1 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
        return i;
    }

    /* renamed from: c */
    public static final String m15771c(Context context, es6 es6Var) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String m21128a = gz6.OS_ARCH.m21128a();
        if (TextUtils.isEmpty(m21128a) || !hashSet.contains(m21128a)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                es6Var.m23229c(2024, 0L, e);
            }
            String str = Build.CPU_ABI;
            return str != null ? str : Build.CPU_ABI2;
        }
        return m21128a;
    }

    /* renamed from: d */
    public static final void m15770d(byte[] bArr, String str, Context context, es6 es6Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(gz6.OS_ARCH.m21128a());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        es6Var.m23230b(4007, sb.toString());
    }
}
