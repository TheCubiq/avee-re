package com.daaw;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.daaw.yt */
/* loaded from: classes.dex */
public final class C3741yt implements Closeable {

    /* renamed from: p */
    public final File f34057p;

    /* renamed from: q */
    public final File f34058q;

    /* renamed from: r */
    public final File f34059r;

    /* renamed from: s */
    public final File f34060s;

    /* renamed from: t */
    public final int f34061t;

    /* renamed from: u */
    public long f34062u;

    /* renamed from: v */
    public final int f34063v;

    /* renamed from: x */
    public Writer f34065x;

    /* renamed from: z */
    public int f34067z;

    /* renamed from: w */
    public long f34064w = 0;

    /* renamed from: y */
    public final LinkedHashMap<String, C3744c> f34066y = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: A */
    public long f34054A = 0;

    /* renamed from: B */
    public final ThreadPoolExecutor f34055B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: C */
    public final Callable<Void> f34056C = new CallableC3742a();

    /* renamed from: com.daaw.yt$a */
    /* loaded from: classes.dex */
    public class CallableC3742a implements Callable<Void> {
        public CallableC3742a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (C3741yt.this) {
                if (C3741yt.this.f34065x == null) {
                    return null;
                }
                C3741yt.this.m3260e0();
                if (C3741yt.this.m3269W()) {
                    C3741yt.this.m3264b0();
                    C3741yt.this.f34067z = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: com.daaw.yt$b */
    /* loaded from: classes.dex */
    public final class C3743b {

        /* renamed from: a */
        public final C3744c f34069a;

        /* renamed from: b */
        public final boolean[] f34070b;

        /* renamed from: c */
        public boolean f34071c;

        public C3743b(C3744c c3744c) {
            this.f34069a = c3744c;
            this.f34070b = c3744c.f34077e ? null : new boolean[C3741yt.this.f34063v];
        }

        public /* synthetic */ C3743b(C3741yt c3741yt, C3744c c3744c, CallableC3742a callableC3742a) {
            this(c3744c);
        }

        /* renamed from: a */
        public void m3254a() {
            C3741yt.this.m3275M(this, false);
        }

        /* renamed from: b */
        public void m3253b() {
            if (this.f34071c) {
                return;
            }
            try {
                m3254a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m3250e() {
            C3741yt.this.m3275M(this, true);
            this.f34071c = true;
        }

        /* renamed from: f */
        public File m3249f(int i) {
            File m3238k;
            synchronized (C3741yt.this) {
                if (this.f34069a.f34078f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f34069a.f34077e) {
                    this.f34070b[i] = true;
                }
                m3238k = this.f34069a.m3238k(i);
                if (!C3741yt.this.f34057p.exists()) {
                    C3741yt.this.f34057p.mkdirs();
                }
            }
            return m3238k;
        }
    }

    /* renamed from: com.daaw.yt$c */
    /* loaded from: classes.dex */
    public final class C3744c {

        /* renamed from: a */
        public final String f34073a;

        /* renamed from: b */
        public final long[] f34074b;

        /* renamed from: c */
        public File[] f34075c;

        /* renamed from: d */
        public File[] f34076d;

        /* renamed from: e */
        public boolean f34077e;

        /* renamed from: f */
        public C3743b f34078f;

        /* renamed from: g */
        public long f34079g;

        public C3744c(String str) {
            this.f34073a = str;
            this.f34074b = new long[C3741yt.this.f34063v];
            this.f34075c = new File[C3741yt.this.f34063v];
            this.f34076d = new File[C3741yt.this.f34063v];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C3741yt.this.f34063v; i++) {
                sb.append(i);
                this.f34075c[i] = new File(C3741yt.this.f34057p, sb.toString());
                sb.append(".tmp");
                this.f34076d[i] = new File(C3741yt.this.f34057p, sb.toString());
                sb.setLength(length);
            }
        }

        public /* synthetic */ C3744c(C3741yt c3741yt, String str, CallableC3742a callableC3742a) {
            this(str);
        }

        /* renamed from: j */
        public File m3239j(int i) {
            return this.f34075c[i];
        }

        /* renamed from: k */
        public File m3238k(int i) {
            return this.f34076d[i];
        }

        /* renamed from: l */
        public String m3237l() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f34074b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m3236m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m3235n(String[] strArr) {
            if (strArr.length != C3741yt.this.f34063v) {
                throw m3236m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f34074b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m3236m(strArr);
                }
            }
        }
    }

    /* renamed from: com.daaw.yt$d */
    /* loaded from: classes.dex */
    public final class C3745d {

        /* renamed from: a */
        public final String f34081a;

        /* renamed from: b */
        public final long f34082b;

        /* renamed from: c */
        public final long[] f34083c;

        /* renamed from: d */
        public final File[] f34084d;

        public C3745d(String str, long j, File[] fileArr, long[] jArr) {
            this.f34081a = str;
            this.f34082b = j;
            this.f34084d = fileArr;
            this.f34083c = jArr;
        }

        public /* synthetic */ C3745d(C3741yt c3741yt, String str, long j, File[] fileArr, long[] jArr, CallableC3742a callableC3742a) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File m3234a(int i) {
            return this.f34084d[i];
        }
    }

    public C3741yt(File file, int i, int i2, long j) {
        this.f34057p = file;
        this.f34061t = i;
        this.f34058q = new File(file, "journal");
        this.f34059r = new File(file, "journal.tmp");
        this.f34060s = new File(file, "journal.bkp");
        this.f34063v = i2;
        this.f34062u = j;
    }

    /* renamed from: Q */
    public static void m3273Q(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: X */
    public static C3741yt m3268X(File file, int i, int i2, long j) {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m3261d0(file2, file3, false);
                    }
                }
                C3741yt c3741yt = new C3741yt(file, i, i2, j);
                if (c3741yt.f34058q.exists()) {
                    try {
                        c3741yt.m3266Z();
                        c3741yt.m3267Y();
                        return c3741yt;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        c3741yt.m3274P();
                    }
                }
                file.mkdirs();
                C3741yt c3741yt2 = new C3741yt(file, i, i2, j);
                c3741yt2.m3264b0();
                return c3741yt2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: d0 */
    public static void m3261d0(File file, File file2, boolean z) {
        if (z) {
            m3273Q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: L */
    public final void m3276L() {
        if (this.f34065x == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: M */
    public final synchronized void m3275M(C3743b c3743b, boolean z) {
        C3744c c3744c = c3743b.f34069a;
        if (c3744c.f34078f != c3743b) {
            throw new IllegalStateException();
        }
        if (z && !c3744c.f34077e) {
            for (int i = 0; i < this.f34063v; i++) {
                if (!c3743b.f34070b[i]) {
                    c3743b.m3254a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!c3744c.m3238k(i).exists()) {
                    c3743b.m3254a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f34063v; i2++) {
            File m3238k = c3744c.m3238k(i2);
            if (!z) {
                m3273Q(m3238k);
            } else if (m3238k.exists()) {
                File m3239j = c3744c.m3239j(i2);
                m3238k.renameTo(m3239j);
                long j = c3744c.f34074b[i2];
                long length = m3239j.length();
                c3744c.f34074b[i2] = length;
                this.f34064w = (this.f34064w - j) + length;
            }
        }
        this.f34067z++;
        c3744c.f34078f = null;
        if (c3744c.f34077e || z) {
            c3744c.f34077e = true;
            this.f34065x.append((CharSequence) "CLEAN");
            this.f34065x.append(' ');
            this.f34065x.append((CharSequence) c3744c.f34073a);
            this.f34065x.append((CharSequence) c3744c.m3237l());
            this.f34065x.append('\n');
            if (z) {
                long j2 = this.f34054A;
                this.f34054A = 1 + j2;
                c3744c.f34079g = j2;
            }
        } else {
            this.f34066y.remove(c3744c.f34073a);
            this.f34065x.append((CharSequence) "REMOVE");
            this.f34065x.append(' ');
            this.f34065x.append((CharSequence) c3744c.f34073a);
            this.f34065x.append('\n');
        }
        this.f34065x.flush();
        if (this.f34064w > this.f34062u || m3269W()) {
            this.f34055B.submit(this.f34056C);
        }
    }

    /* renamed from: P */
    public void m3274P() {
        close();
        uq1.m7810b(this.f34057p);
    }

    /* renamed from: T */
    public C3743b m3272T(String str) {
        return m3271U(str, -1L);
    }

    /* renamed from: U */
    public final synchronized C3743b m3271U(String str, long j) {
        m3276L();
        C3744c c3744c = this.f34066y.get(str);
        if (j == -1 || (c3744c != null && c3744c.f34079g == j)) {
            if (c3744c == null) {
                c3744c = new C3744c(this, str, null);
                this.f34066y.put(str, c3744c);
            } else if (c3744c.f34078f != null) {
                return null;
            }
            C3743b c3743b = new C3743b(this, c3744c, null);
            c3744c.f34078f = c3743b;
            this.f34065x.append((CharSequence) "DIRTY");
            this.f34065x.append(' ');
            this.f34065x.append((CharSequence) str);
            this.f34065x.append('\n');
            this.f34065x.flush();
            return c3743b;
        }
        return null;
    }

    /* renamed from: V */
    public synchronized C3745d m3270V(String str) {
        m3276L();
        C3744c c3744c = this.f34066y.get(str);
        if (c3744c == null) {
            return null;
        }
        if (c3744c.f34077e) {
            for (File file : c3744c.f34075c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f34067z++;
            this.f34065x.append((CharSequence) "READ");
            this.f34065x.append(' ');
            this.f34065x.append((CharSequence) str);
            this.f34065x.append('\n');
            if (m3269W()) {
                this.f34055B.submit(this.f34056C);
            }
            return new C3745d(this, str, c3744c.f34079g, c3744c.f34075c, c3744c.f34074b, null);
        }
        return null;
    }

    /* renamed from: W */
    public final boolean m3269W() {
        int i = this.f34067z;
        return i >= 2000 && i >= this.f34066y.size();
    }

    /* renamed from: Y */
    public final void m3267Y() {
        m3273Q(this.f34059r);
        Iterator<C3744c> it = this.f34066y.values().iterator();
        while (it.hasNext()) {
            C3744c next = it.next();
            int i = 0;
            if (next.f34078f == null) {
                while (i < this.f34063v) {
                    this.f34064w += next.f34074b[i];
                    i++;
                }
            } else {
                next.f34078f = null;
                while (i < this.f34063v) {
                    m3273Q(next.m3239j(i));
                    m3273Q(next.m3238k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: Z */
    public final void m3266Z() {
        xg1 xg1Var = new xg1(new FileInputStream(this.f34058q), uq1.f29445a);
        try {
            String m5137u = xg1Var.m5137u();
            String m5137u2 = xg1Var.m5137u();
            String m5137u3 = xg1Var.m5137u();
            String m5137u4 = xg1Var.m5137u();
            String m5137u5 = xg1Var.m5137u();
            if (!"libcore.io.DiskLruCache".equals(m5137u) || !"1".equals(m5137u2) || !Integer.toString(this.f34061t).equals(m5137u3) || !Integer.toString(this.f34063v).equals(m5137u4) || !"".equals(m5137u5)) {
                throw new IOException("unexpected journal header: [" + m5137u + ", " + m5137u2 + ", " + m5137u4 + ", " + m5137u5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m3265a0(xg1Var.m5137u());
                    i++;
                } catch (EOFException unused) {
                    this.f34067z = i - this.f34066y.size();
                    if (xg1Var.m5138q()) {
                        m3264b0();
                    } else {
                        this.f34065x = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34058q, true), uq1.f29445a));
                    }
                    uq1.m7811a(xg1Var);
                    return;
                }
            }
        } catch (Throwable th) {
            uq1.m7811a(xg1Var);
            throw th;
        }
    }

    /* renamed from: a0 */
    public final void m3265a0(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f34066y.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        C3744c c3744c = this.f34066y.get(substring);
        if (c3744c == null) {
            c3744c = new C3744c(this, substring, null);
            this.f34066y.put(substring, c3744c);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            c3744c.f34077e = true;
            c3744c.f34078f = null;
            c3744c.m3235n(split);
        } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            c3744c.f34078f = new C3743b(this, c3744c, null);
        } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: b0 */
    public final synchronized void m3264b0() {
        Writer writer = this.f34065x;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34059r), uq1.f29445a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f34061t));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f34063v));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C3744c c3744c : this.f34066y.values()) {
            bufferedWriter.write(c3744c.f34078f != null ? "DIRTY " + c3744c.f34073a + '\n' : "CLEAN " + c3744c.f34073a + c3744c.m3237l() + '\n');
        }
        bufferedWriter.close();
        if (this.f34058q.exists()) {
            m3261d0(this.f34058q, this.f34060s, true);
        }
        m3261d0(this.f34059r, this.f34058q, false);
        this.f34060s.delete();
        this.f34065x = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34058q, true), uq1.f29445a));
    }

    /* renamed from: c0 */
    public synchronized boolean m3263c0(String str) {
        m3276L();
        C3744c c3744c = this.f34066y.get(str);
        if (c3744c != null && c3744c.f34078f == null) {
            for (int i = 0; i < this.f34063v; i++) {
                File m3239j = c3744c.m3239j(i);
                if (m3239j.exists() && !m3239j.delete()) {
                    throw new IOException("failed to delete " + m3239j);
                }
                this.f34064w -= c3744c.f34074b[i];
                c3744c.f34074b[i] = 0;
            }
            this.f34067z++;
            this.f34065x.append((CharSequence) "REMOVE");
            this.f34065x.append(' ');
            this.f34065x.append((CharSequence) str);
            this.f34065x.append('\n');
            this.f34066y.remove(str);
            if (m3269W()) {
                this.f34055B.submit(this.f34056C);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f34065x == null) {
            return;
        }
        Iterator it = new ArrayList(this.f34066y.values()).iterator();
        while (it.hasNext()) {
            C3744c c3744c = (C3744c) it.next();
            if (c3744c.f34078f != null) {
                c3744c.f34078f.m3254a();
            }
        }
        m3260e0();
        this.f34065x.close();
        this.f34065x = null;
    }

    /* renamed from: e0 */
    public final void m3260e0() {
        while (this.f34064w > this.f34062u) {
            m3263c0(this.f34066y.entrySet().iterator().next().getKey());
        }
    }
}
