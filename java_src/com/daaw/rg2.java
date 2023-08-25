package com.daaw;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class rg2 implements we2 {
    public final lg2 c;
    public final Map a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 5242880;

    public rg2(lg2 lg2Var, int i) {
        this.c = lg2Var;
    }

    public rg2(File file, int i) {
        this.c = new ig2(this, file);
    }

    public static int c(InputStream inputStream) {
        return (l(inputStream) << 24) | l(inputStream) | (l(inputStream) << 8) | (l(inputStream) << 16);
    }

    public static long d(InputStream inputStream) {
        return (l(inputStream) & 255) | ((l(inputStream) & 255) << 8) | ((l(inputStream) & 255) << 16) | ((l(inputStream) & 255) << 24) | ((l(inputStream) & 255) << 32) | ((l(inputStream) & 255) << 40) | ((l(inputStream) & 255) << 48) | ((255 & l(inputStream)) << 56);
    }

    public static String f(kg2 kg2Var) {
        return new String(k(kg2Var, d(kg2Var)), "UTF-8");
    }

    public static void h(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void i(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void j(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] k(kg2 kg2Var, long j) {
        long d = kg2Var.d();
        if (j >= 0 && j <= d) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(kg2Var).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + d);
    }

    public static int l(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.daaw.we2
    public final synchronized void a(String str, ve2 ve2Var) {
        long j;
        long j2 = this.b;
        int length = ve2Var.a.length;
        int i = this.d;
        if (j2 + length <= i || length <= i * 0.9f) {
            File e = e(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
                jg2 jg2Var = new jg2(str, ve2Var);
                try {
                    h(bufferedOutputStream, 538247942);
                    j(bufferedOutputStream, jg2Var.b);
                    String str2 = jg2Var.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    j(bufferedOutputStream, str2);
                    i(bufferedOutputStream, jg2Var.d);
                    i(bufferedOutputStream, jg2Var.e);
                    i(bufferedOutputStream, jg2Var.f);
                    i(bufferedOutputStream, jg2Var.g);
                    List<ef2> list = jg2Var.h;
                    if (list != null) {
                        h(bufferedOutputStream, list.size());
                        for (ef2 ef2Var : list) {
                            j(bufferedOutputStream, ef2Var.a());
                            j(bufferedOutputStream, ef2Var.b());
                        }
                    } else {
                        h(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(ve2Var.a);
                    bufferedOutputStream.close();
                    jg2Var.a = e.length();
                    m(str, jg2Var);
                    if (this.b >= this.d) {
                        if (cg2.a) {
                            cg2.d("Pruning old cache entries.", new Object[0]);
                        }
                        long j3 = this.b;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.a.entrySet().iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j = elapsedRealtime;
                                break;
                            }
                            jg2 jg2Var2 = (jg2) ((Map.Entry) it.next()).getValue();
                            if (e(jg2Var2.b).delete()) {
                                j = elapsedRealtime;
                                this.b -= jg2Var2.a;
                            } else {
                                j = elapsedRealtime;
                                String str3 = jg2Var2.b;
                                cg2.a("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                            }
                            it.remove();
                            i2++;
                            if (((float) this.b) < this.d * 0.9f) {
                                break;
                            }
                            elapsedRealtime = j;
                        }
                        if (cg2.a) {
                            cg2.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j3), Long.valueOf(SystemClock.elapsedRealtime() - j));
                        }
                    }
                } catch (IOException e2) {
                    cg2.a("%s", e2.toString());
                    bufferedOutputStream.close();
                    cg2.a("Failed to write header for %s", e.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!e.delete()) {
                    cg2.a("Could not clean up file %s", e.getAbsolutePath());
                }
                if (!this.c.zza().exists()) {
                    cg2.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.a.clear();
                    this.b = 0L;
                    zzb();
                }
            }
        }
    }

    @Override // com.daaw.we2
    public final synchronized void b(String str, boolean z) {
        ve2 zza = zza(str);
        if (zza != null) {
            zza.f = 0L;
            zza.e = 0L;
            a(str, zza);
        }
    }

    public final File e(String str) {
        return new File(this.c.zza(), o(str));
    }

    public final synchronized void g(String str) {
        boolean delete = e(str).delete();
        n(str);
        if (delete) {
            return;
        }
        cg2.a("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    public final void m(String str, jg2 jg2Var) {
        if (this.a.containsKey(str)) {
            this.b += jg2Var.a - ((jg2) this.a.get(str)).a;
        } else {
            this.b += jg2Var.a;
        }
        this.a.put(str, jg2Var);
    }

    public final void n(String str) {
        jg2 jg2Var = (jg2) this.a.remove(str);
        if (jg2Var != null) {
            this.b -= jg2Var.a;
        }
    }

    @Override // com.daaw.we2
    public final synchronized ve2 zza(String str) {
        jg2 jg2Var = (jg2) this.a.get(str);
        if (jg2Var == null) {
            return null;
        }
        File e = e(str);
        try {
            kg2 kg2Var = new kg2(new BufferedInputStream(new FileInputStream(e)), e.length());
            try {
                jg2 a = jg2.a(kg2Var);
                if (!TextUtils.equals(str, a.b)) {
                    cg2.a("%s: key=%s, found=%s", e.getAbsolutePath(), str, a.b);
                    n(str);
                    return null;
                }
                byte[] k = k(kg2Var, kg2Var.d());
                ve2 ve2Var = new ve2();
                ve2Var.a = k;
                ve2Var.b = jg2Var.c;
                ve2Var.c = jg2Var.d;
                ve2Var.d = jg2Var.e;
                ve2Var.e = jg2Var.f;
                ve2Var.f = jg2Var.g;
                List<ef2> list = jg2Var.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (ef2 ef2Var : list) {
                    treeMap.put(ef2Var.a(), ef2Var.b());
                }
                ve2Var.g = treeMap;
                ve2Var.h = Collections.unmodifiableList(jg2Var.h);
                return ve2Var;
            } finally {
                kg2Var.close();
            }
        } catch (IOException e2) {
            cg2.a("%s: %s", e.getAbsolutePath(), e2.toString());
            g(str);
            return null;
        }
    }

    @Override // com.daaw.we2
    public final synchronized void zzb() {
        long length;
        kg2 kg2Var;
        File zza = this.c.zza();
        if (!zza.exists()) {
            if (zza.mkdirs()) {
                return;
            }
            cg2.b("Unable to create cache dir %s", zza.getAbsolutePath());
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                kg2Var = new kg2(new BufferedInputStream(new FileInputStream(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                jg2 a = jg2.a(kg2Var);
                a.a = length;
                m(a.b, a);
                kg2Var.close();
            } catch (Throwable th) {
                kg2Var.close();
                throw th;
                break;
            }
        }
    }
}
