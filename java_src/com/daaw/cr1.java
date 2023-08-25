package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaScannerConnection;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class cr1 {

    /* renamed from: com.daaw.cr1$a */
    /* loaded from: classes.dex */
    public class C0991a implements MediaScannerConnection.OnScanCompletedListener {
        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
        }
    }

    /* renamed from: com.daaw.cr1$b */
    /* loaded from: classes.dex */
    public static class C0992b extends RuntimeException {
        public C0992b(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static void m25079a(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    fileOutputStream.close();
                    inputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static File m25078b(File file, String str) {
        String m25077c = m25077c(str);
        String m25076d = m25076d(str);
        File file2 = new File(file, str);
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(file, m25076d + " (" + i + ")" + m25077c);
        }
        return file2;
    }

    /* renamed from: c */
    public static String m25077c(String str) {
        if (str == null || str.lastIndexOf(46) == -1) {
            return null;
        }
        return str.substring(str.lastIndexOf(46));
    }

    /* renamed from: d */
    public static String m25076d(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(0, lastIndexOf) : str;
    }

    /* renamed from: e */
    public static void m25075e(Context context) {
        try {
            m25074f(context.getCacheDir());
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static boolean m25074f(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (File file2 : file.listFiles()) {
            if (!m25074f(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    /* renamed from: g */
    public static String m25073g(String str) {
        try {
            return str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: h */
    public static String m25072h(String str, char c) {
        try {
            return str.substring(Math.max(str.lastIndexOf(47), Math.max(str.lastIndexOf(92), str.lastIndexOf(c))) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: i */
    public static String m25071i(File file) {
        return m25070j(file.getName());
    }

    /* renamed from: j */
    public static String m25070j(String str) {
        if (str != null) {
            try {
                return str.substring(str.lastIndexOf(".") + 1).toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: k */
    public static String m25069k(String str) {
        String str2 = "";
        if (str != null) {
            try {
                str2 = str.substring(str.lastIndexOf("."));
            } catch (Exception unused) {
            }
            return str2.toLowerCase();
        }
        return "";
    }

    /* renamed from: l */
    public static String m25068l(String str) {
        try {
            str = str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf > 0) {
            try {
                return str.substring(0, lastIndexOf);
            } catch (Exception unused2) {
                return str;
            }
        }
        return str;
    }

    /* renamed from: m */
    public static boolean m25067m(String str) {
        return new File(str).exists();
    }

    /* renamed from: n */
    public static String m25066n(String str) {
        return str.replaceAll("[^a-zA-Z0-9(){}.-]", "_");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        r1 = new java.io.File(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.exists() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        r10 = r1.isFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r10.endsWith(r11) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r2.length == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r10 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        r10 = (r2.length - r6) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        r10 = r2.length - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r5 >= r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
        r0.append("..");
        r0.append(r11);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        r0.append(r9.substring(r4.length()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        return r0.toString();
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m25065o(String str, String str2, String str3) {
        String m25060t;
        String m25060t2;
        if (str3.equals("/")) {
            m25060t = m25061s(str);
            m25060t2 = m25061s(str2);
        } else if (!str3.equals("\\")) {
            throw new IllegalArgumentException("Unrecognised dir separator '" + str3 + "'");
        } else {
            m25060t = m25060t(str);
            m25060t2 = m25060t(str2);
        }
        String[] split = m25060t2.split(Pattern.quote(str3));
        String[] split2 = m25060t.split(Pattern.quote(str3));
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int i2 = 0;
        while (i2 < split2.length && i2 < split.length && split2[i2].equals(split[i2])) {
            stringBuffer.append(split2[i2] + str3);
            i2++;
        }
        throw new C0992b("No common path element found for '" + m25060t + "' and '" + m25060t2 + "'");
    }

    /* renamed from: p */
    public static String m25064p(InputStream inputStream) {
        try {
            char[] cArr = new char[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];
            StringBuilder sb = new StringBuilder(100000);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            while (true) {
                int read = inputStreamReader.read(cArr, 0, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
                if (read < 0) {
                    return sb.toString();
                }
                sb.append(cArr, 0, read);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static String m25063q(Resources resources, int i) {
        StringBuilder sb = new StringBuilder(128);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return sb.toString();
        }
    }

    /* renamed from: r */
    public static void m25062r(Context context, String str) {
        MediaScannerConnection.scanFile(context, new String[]{str}, null, new C0991a());
    }

    /* renamed from: s */
    public static String m25061s(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    /* renamed from: t */
    public static String m25060t(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }
}
