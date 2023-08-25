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
/* loaded from: classes.dex */
public final class yt implements Closeable {
    public final File p;
    public final File q;
    public final File r;
    public final File s;
    public final int t;
    public long u;
    public final int v;
    public Writer x;
    public int z;
    public long w = 0;
    public final LinkedHashMap<String, c> y = new LinkedHashMap<>(0, 0.75f, true);
    public long A = 0;
    public final ThreadPoolExecutor B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable<Void> C = new a();

    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (yt.this) {
                if (yt.this.x == null) {
                    return null;
                }
                yt.this.e0();
                if (yt.this.W()) {
                    yt.this.b0();
                    yt.this.z = 0;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b {
        public final c a;
        public final boolean[] b;
        public boolean c;

        public b(c cVar) {
            this.a = cVar;
            this.b = cVar.e ? null : new boolean[yt.this.v];
        }

        public /* synthetic */ b(yt ytVar, c cVar, a aVar) {
            this(cVar);
        }

        public void a() {
            yt.this.M(this, false);
        }

        public void b() {
            if (this.c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            yt.this.M(this, true);
            this.c = true;
        }

        public File f(int i) {
            File k;
            synchronized (yt.this) {
                if (this.a.f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.e) {
                    this.b[i] = true;
                }
                k = this.a.k(i);
                if (!yt.this.p.exists()) {
                    yt.this.p.mkdirs();
                }
            }
            return k;
        }
    }

    /* loaded from: classes.dex */
    public final class c {
        public final String a;
        public final long[] b;
        public File[] c;
        public File[] d;
        public boolean e;
        public b f;
        public long g;

        public c(String str) {
            this.a = str;
            this.b = new long[yt.this.v];
            this.c = new File[yt.this.v];
            this.d = new File[yt.this.v];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < yt.this.v; i++) {
                sb.append(i);
                this.c[i] = new File(yt.this.p, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(yt.this.p, sb.toString());
                sb.setLength(length);
            }
        }

        public /* synthetic */ c(yt ytVar, String str, a aVar) {
            this(str);
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) {
            if (strArr.length != yt.this.v) {
                throw m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d {
        public final String a;
        public final long b;
        public final long[] c;
        public final File[] d;

        public d(String str, long j, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.d = fileArr;
            this.c = jArr;
        }

        public /* synthetic */ d(yt ytVar, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.d[i];
        }
    }

    public yt(File file, int i, int i2, long j) {
        this.p = file;
        this.t = i;
        this.q = new File(file, "journal");
        this.r = new File(file, "journal.tmp");
        this.s = new File(file, "journal.bkp");
        this.v = i2;
        this.u = j;
    }

    public static void Q(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static yt X(File file, int i, int i2, long j) {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        d0(file2, file3, false);
                    }
                }
                yt ytVar = new yt(file, i, i2, j);
                if (ytVar.q.exists()) {
                    try {
                        ytVar.Z();
                        ytVar.Y();
                        return ytVar;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        ytVar.P();
                    }
                }
                file.mkdirs();
                yt ytVar2 = new yt(file, i, i2, j);
                ytVar2.b0();
                return ytVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void d0(File file, File file2, boolean z) {
        if (z) {
            Q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void L() {
        if (this.x == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void M(b bVar, boolean z) {
        c cVar = bVar.a;
        if (cVar.f != bVar) {
            throw new IllegalStateException();
        }
        if (z && !cVar.e) {
            for (int i = 0; i < this.v; i++) {
                if (!bVar.b[i]) {
                    bVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!cVar.k(i).exists()) {
                    bVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.v; i2++) {
            File k = cVar.k(i2);
            if (!z) {
                Q(k);
            } else if (k.exists()) {
                File j = cVar.j(i2);
                k.renameTo(j);
                long j2 = cVar.b[i2];
                long length = j.length();
                cVar.b[i2] = length;
                this.w = (this.w - j2) + length;
            }
        }
        this.z++;
        cVar.f = null;
        if (cVar.e || z) {
            cVar.e = true;
            this.x.append((CharSequence) "CLEAN");
            this.x.append(' ');
            this.x.append((CharSequence) cVar.a);
            this.x.append((CharSequence) cVar.l());
            this.x.append('\n');
            if (z) {
                long j3 = this.A;
                this.A = 1 + j3;
                cVar.g = j3;
            }
        } else {
            this.y.remove(cVar.a);
            this.x.append((CharSequence) "REMOVE");
            this.x.append(' ');
            this.x.append((CharSequence) cVar.a);
            this.x.append('\n');
        }
        this.x.flush();
        if (this.w > this.u || W()) {
            this.B.submit(this.C);
        }
    }

    public void P() {
        close();
        uq1.b(this.p);
    }

    public b T(String str) {
        return U(str, -1L);
    }

    public final synchronized b U(String str, long j) {
        L();
        c cVar = this.y.get(str);
        if (j == -1 || (cVar != null && cVar.g == j)) {
            if (cVar == null) {
                cVar = new c(this, str, null);
                this.y.put(str, cVar);
            } else if (cVar.f != null) {
                return null;
            }
            b bVar = new b(this, cVar, null);
            cVar.f = bVar;
            this.x.append((CharSequence) "DIRTY");
            this.x.append(' ');
            this.x.append((CharSequence) str);
            this.x.append('\n');
            this.x.flush();
            return bVar;
        }
        return null;
    }

    public synchronized d V(String str) {
        L();
        c cVar = this.y.get(str);
        if (cVar == null) {
            return null;
        }
        if (cVar.e) {
            for (File file : cVar.c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.z++;
            this.x.append((CharSequence) "READ");
            this.x.append(' ');
            this.x.append((CharSequence) str);
            this.x.append('\n');
            if (W()) {
                this.B.submit(this.C);
            }
            return new d(this, str, cVar.g, cVar.c, cVar.b, null);
        }
        return null;
    }

    public final boolean W() {
        int i = this.z;
        return i >= 2000 && i >= this.y.size();
    }

    public final void Y() {
        Q(this.r);
        Iterator<c> it = this.y.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.v) {
                    this.w += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.v) {
                    Q(next.j(i));
                    Q(next.k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void Z() {
        xg1 xg1Var = new xg1(new FileInputStream(this.q), uq1.a);
        try {
            String u = xg1Var.u();
            String u2 = xg1Var.u();
            String u3 = xg1Var.u();
            String u4 = xg1Var.u();
            String u5 = xg1Var.u();
            if (!"libcore.io.DiskLruCache".equals(u) || !"1".equals(u2) || !Integer.toString(this.t).equals(u3) || !Integer.toString(this.v).equals(u4) || !"".equals(u5)) {
                throw new IOException("unexpected journal header: [" + u + ", " + u2 + ", " + u4 + ", " + u5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    a0(xg1Var.u());
                    i++;
                } catch (EOFException unused) {
                    this.z = i - this.y.size();
                    if (xg1Var.q()) {
                        b0();
                    } else {
                        this.x = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.q, true), uq1.a));
                    }
                    uq1.a(xg1Var);
                    return;
                }
            }
        } catch (Throwable th) {
            uq1.a(xg1Var);
            throw th;
        }
    }

    public final void a0(String str) {
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
                this.y.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        c cVar = this.y.get(substring);
        if (cVar == null) {
            cVar = new c(this, substring, null);
            this.y.put(substring, cVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            cVar.e = true;
            cVar.f = null;
            cVar.n(split);
        } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            cVar.f = new b(this, cVar, null);
        } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    public final synchronized void b0() {
        Writer writer = this.x;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.r), uq1.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.t));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.v));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (c cVar : this.y.values()) {
            bufferedWriter.write(cVar.f != null ? "DIRTY " + cVar.a + '\n' : "CLEAN " + cVar.a + cVar.l() + '\n');
        }
        bufferedWriter.close();
        if (this.q.exists()) {
            d0(this.q, this.s, true);
        }
        d0(this.r, this.q, false);
        this.s.delete();
        this.x = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.q, true), uq1.a));
    }

    public synchronized boolean c0(String str) {
        L();
        c cVar = this.y.get(str);
        if (cVar != null && cVar.f == null) {
            for (int i = 0; i < this.v; i++) {
                File j = cVar.j(i);
                if (j.exists() && !j.delete()) {
                    throw new IOException("failed to delete " + j);
                }
                this.w -= cVar.b[i];
                cVar.b[i] = 0;
            }
            this.z++;
            this.x.append((CharSequence) "REMOVE");
            this.x.append(' ');
            this.x.append((CharSequence) str);
            this.x.append('\n');
            this.y.remove(str);
            if (W()) {
                this.B.submit(this.C);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.x == null) {
            return;
        }
        Iterator it = new ArrayList(this.y.values()).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f != null) {
                cVar.f.a();
            }
        }
        e0();
        this.x.close();
        this.x = null;
    }

    public final void e0() {
        while (this.w > this.u) {
            c0(this.y.entrySet().iterator().next().getKey());
        }
    }
}
