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
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class cr1 {

    /* loaded from: classes.dex */
    public class a implements MediaScannerConnection.OnScanCompletedListener {
        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public static void a(InputStream inputStream, File file) {
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

    public static File b(File file, String str) {
        String c = c(str);
        String d = d(str);
        File file2 = new File(file, str);
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(file, d + " (" + i + ")" + c);
        }
        return file2;
    }

    public static String c(String str) {
        if (str == null || str.lastIndexOf(46) == -1) {
            return null;
        }
        return str.substring(str.lastIndexOf(46));
    }

    public static String d(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(0, lastIndexOf) : str;
    }

    public static void e(Context context) {
        try {
            f(context.getCacheDir());
        } catch (Exception unused) {
        }
    }

    public static boolean f(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (File file2 : file.listFiles()) {
            if (!f(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static String g(String str) {
        try {
            return str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String h(String str, char c) {
        try {
            return str.substring(Math.max(str.lastIndexOf(47), Math.max(str.lastIndexOf(92), str.lastIndexOf(c))) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String i(File file) {
        return j(file.getName());
    }

    public static String j(String str) {
        if (str != null) {
            try {
                return str.substring(str.lastIndexOf(".") + 1).toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static String k(String str) {
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

    public static String l(String str) {
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

    public static boolean m(String str) {
        return new File(str).exists();
    }

    public static String n(String str) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String o(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "/"
            boolean r0 = r11.equals(r0)
            java.lang.String r1 = "'"
            if (r0 == 0) goto L13
            java.lang.String r9 = s(r9)
            java.lang.String r0 = s(r10)
            goto L23
        L13:
            java.lang.String r0 = "\\"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto Lcc
            java.lang.String r9 = t(r9)
            java.lang.String r0 = t(r10)
        L23:
            java.lang.String r2 = java.util.regex.Pattern.quote(r11)
            java.lang.String[] r2 = r0.split(r2)
            java.lang.String r3 = java.util.regex.Pattern.quote(r11)
            java.lang.String[] r3 = r9.split(r3)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r5 = 0
            r6 = 0
        L3a:
            int r7 = r3.length
            if (r6 >= r7) goto L61
            int r7 = r2.length
            if (r6 >= r7) goto L61
            r7 = r3[r6]
            r8 = r2[r6]
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L61
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r3[r6]
            r7.append(r8)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            r4.append(r7)
            int r6 = r6 + 1
            goto L3a
        L61:
            if (r6 == 0) goto Laa
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            r3 = 1
            if (r0 == 0) goto L74
            boolean r10 = r1.isFile()
            goto L7d
        L74:
            boolean r10 = r10.endsWith(r11)
            if (r10 == 0) goto L7c
            r10 = 0
            goto L7d
        L7c:
            r10 = 1
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.length
            if (r1 == r6) goto L9a
            if (r10 == 0) goto L8b
            int r10 = r2.length
            int r10 = r10 - r6
            int r10 = r10 - r3
            goto L8d
        L8b:
            int r10 = r2.length
            int r10 = r10 - r6
        L8d:
            if (r5 >= r10) goto L9a
            java.lang.String r1 = ".."
            r0.append(r1)
            r0.append(r11)
            int r5 = r5 + 1
            goto L8d
        L9a:
            int r10 = r4.length()
            java.lang.String r9 = r9.substring(r10)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        Laa:
            com.daaw.cr1$b r10 = new com.daaw.cr1$b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "No common path element found for '"
            r11.append(r2)
            r11.append(r9)
            java.lang.String r9 = "' and '"
            r11.append(r9)
            r11.append(r0)
            r11.append(r1)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        Lcc:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Unrecognised dir separator '"
            r10.append(r0)
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            goto Le7
        Le6:
            throw r9
        Le7:
            goto Le6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.cr1.o(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String p(InputStream inputStream) {
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

    public static String q(Resources resources, int i) {
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

    public static void r(Context context, String str) {
        MediaScannerConnection.scanFile(context, new String[]{str}, null, new a());
    }

    public static String s(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String t(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }
}
