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

    /* renamed from: c */
    public final lg2 f25269c;

    /* renamed from: a */
    public final Map f25267a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    public long f25268b = 0;

    /* renamed from: d */
    public final int f25270d = 5242880;

    public rg2(lg2 lg2Var, int i) {
        this.f25269c = lg2Var;
    }

    public rg2(File file, int i) {
        this.f25269c = new ig2(this, file);
    }

    /* renamed from: c */
    public static int m11341c(InputStream inputStream) {
        return (m11332l(inputStream) << 24) | m11332l(inputStream) | (m11332l(inputStream) << 8) | (m11332l(inputStream) << 16);
    }

    /* renamed from: d */
    public static long m11340d(InputStream inputStream) {
        return (m11332l(inputStream) & 255) | ((m11332l(inputStream) & 255) << 8) | ((m11332l(inputStream) & 255) << 16) | ((m11332l(inputStream) & 255) << 24) | ((m11332l(inputStream) & 255) << 32) | ((m11332l(inputStream) & 255) << 40) | ((m11332l(inputStream) & 255) << 48) | ((255 & m11332l(inputStream)) << 56);
    }

    /* renamed from: f */
    public static String m11338f(kg2 kg2Var) {
        return new String(m11333k(kg2Var, m11340d(kg2Var)), "UTF-8");
    }

    /* renamed from: h */
    public static void m11336h(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: i */
    public static void m11335i(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* renamed from: j */
    public static void m11334j(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m11335i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    /* renamed from: k */
    public static byte[] m11333k(kg2 kg2Var, long j) {
        long m17755d = kg2Var.m17755d();
        if (j >= 0 && j <= m17755d) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(kg2Var).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + m17755d);
    }

    /* renamed from: l */
    public static int m11332l(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: o */
    public static final String m11329o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.daaw.we2
    /* renamed from: a */
    public final synchronized void mo6132a(String str, ve2 ve2Var) {
        long j;
        long j2 = this.f25268b;
        int length = ve2Var.f30176a.length;
        int i = this.f25270d;
        if (j2 + length <= i || length <= i * 0.9f) {
            File m11339e = m11339e(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m11339e));
                jg2 jg2Var = new jg2(str, ve2Var);
                try {
                    m11336h(bufferedOutputStream, 538247942);
                    m11334j(bufferedOutputStream, jg2Var.f15084b);
                    String str2 = jg2Var.f15085c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    m11334j(bufferedOutputStream, str2);
                    m11335i(bufferedOutputStream, jg2Var.f15086d);
                    m11335i(bufferedOutputStream, jg2Var.f15087e);
                    m11335i(bufferedOutputStream, jg2Var.f15088f);
                    m11335i(bufferedOutputStream, jg2Var.f15089g);
                    List<ef2> list = jg2Var.f15090h;
                    if (list != null) {
                        m11336h(bufferedOutputStream, list.size());
                        for (ef2 ef2Var : list) {
                            m11334j(bufferedOutputStream, ef2Var.m23524a());
                            m11334j(bufferedOutputStream, ef2Var.m23523b());
                        }
                    } else {
                        m11336h(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(ve2Var.f30176a);
                    bufferedOutputStream.close();
                    jg2Var.f15083a = m11339e.length();
                    m11331m(str, jg2Var);
                    if (this.f25268b >= this.f25270d) {
                        if (cg2.f5792a) {
                            cg2.m25389d("Pruning old cache entries.", new Object[0]);
                        }
                        long j3 = this.f25268b;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.f25267a.entrySet().iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j = elapsedRealtime;
                                break;
                            }
                            jg2 jg2Var2 = (jg2) ((Map.Entry) it.next()).getValue();
                            if (m11339e(jg2Var2.f15084b).delete()) {
                                j = elapsedRealtime;
                                this.f25268b -= jg2Var2.f15083a;
                            } else {
                                j = elapsedRealtime;
                                String str3 = jg2Var2.f15084b;
                                cg2.m25392a("Could not delete cache entry for key=%s, filename=%s", str3, m11329o(str3));
                            }
                            it.remove();
                            i2++;
                            if (((float) this.f25268b) < this.f25270d * 0.9f) {
                                break;
                            }
                            elapsedRealtime = j;
                        }
                        if (cg2.f5792a) {
                            cg2.m25389d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f25268b - j3), Long.valueOf(SystemClock.elapsedRealtime() - j));
                        }
                    }
                } catch (IOException e) {
                    cg2.m25392a("%s", e.toString());
                    bufferedOutputStream.close();
                    cg2.m25392a("Failed to write header for %s", m11339e.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!m11339e.delete()) {
                    cg2.m25392a("Could not clean up file %s", m11339e.getAbsolutePath());
                }
                if (!this.f25269c.zza().exists()) {
                    cg2.m25392a("Re-initializing cache after external clearing.", new Object[0]);
                    this.f25267a.clear();
                    this.f25268b = 0L;
                    zzb();
                }
            }
        }
    }

    @Override // com.daaw.we2
    /* renamed from: b */
    public final synchronized void mo6131b(String str, boolean z) {
        ve2 zza = zza(str);
        if (zza != null) {
            zza.f30181f = 0L;
            zza.f30180e = 0L;
            mo6132a(str, zza);
        }
    }

    /* renamed from: e */
    public final File m11339e(String str) {
        return new File(this.f25269c.zza(), m11329o(str));
    }

    /* renamed from: g */
    public final synchronized void m11337g(String str) {
        boolean delete = m11339e(str).delete();
        m11330n(str);
        if (delete) {
            return;
        }
        cg2.m25392a("Could not delete cache entry for key=%s, filename=%s", str, m11329o(str));
    }

    /* renamed from: m */
    public final void m11331m(String str, jg2 jg2Var) {
        if (this.f25267a.containsKey(str)) {
            this.f25268b += jg2Var.f15083a - ((jg2) this.f25267a.get(str)).f15083a;
        } else {
            this.f25268b += jg2Var.f15083a;
        }
        this.f25267a.put(str, jg2Var);
    }

    /* renamed from: n */
    public final void m11330n(String str) {
        jg2 jg2Var = (jg2) this.f25267a.remove(str);
        if (jg2Var != null) {
            this.f25268b -= jg2Var.f15083a;
        }
    }

    @Override // com.daaw.we2
    public final synchronized ve2 zza(String str) {
        jg2 jg2Var = (jg2) this.f25267a.get(str);
        if (jg2Var == null) {
            return null;
        }
        File m11339e = m11339e(str);
        try {
            kg2 kg2Var = new kg2(new BufferedInputStream(new FileInputStream(m11339e)), m11339e.length());
            try {
                jg2 m18527a = jg2.m18527a(kg2Var);
                if (!TextUtils.equals(str, m18527a.f15084b)) {
                    cg2.m25392a("%s: key=%s, found=%s", m11339e.getAbsolutePath(), str, m18527a.f15084b);
                    m11330n(str);
                    return null;
                }
                byte[] m11333k = m11333k(kg2Var, kg2Var.m17755d());
                ve2 ve2Var = new ve2();
                ve2Var.f30176a = m11333k;
                ve2Var.f30177b = jg2Var.f15085c;
                ve2Var.f30178c = jg2Var.f15086d;
                ve2Var.f30179d = jg2Var.f15087e;
                ve2Var.f30180e = jg2Var.f15088f;
                ve2Var.f30181f = jg2Var.f15089g;
                List<ef2> list = jg2Var.f15090h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (ef2 ef2Var : list) {
                    treeMap.put(ef2Var.m23524a(), ef2Var.m23523b());
                }
                ve2Var.f30182g = treeMap;
                ve2Var.f30183h = Collections.unmodifiableList(jg2Var.f15090h);
                return ve2Var;
            } finally {
                kg2Var.close();
            }
        } catch (IOException e) {
            cg2.m25392a("%s: %s", m11339e.getAbsolutePath(), e.toString());
            m11337g(str);
            return null;
        }
    }

    @Override // com.daaw.we2
    public final synchronized void zzb() {
        long length;
        kg2 kg2Var;
        File zza = this.f25269c.zza();
        if (!zza.exists()) {
            if (zza.mkdirs()) {
                return;
            }
            cg2.m25391b("Unable to create cache dir %s", zza.getAbsolutePath());
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
                jg2 m18527a = jg2.m18527a(kg2Var);
                m18527a.f15083a = length;
                m11331m(m18527a.f15084b, m18527a);
                kg2Var.close();
            } catch (Throwable th) {
                kg2Var.close();
                throw th;
                break;
            }
        }
    }
}
