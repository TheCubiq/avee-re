package com.daaw;

import com.daaw.lm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class ym {
    public static final Charset d = Charset.forName("UTF-8");
    public static final int e = 15;
    public static final tm f = new tm();
    public static final Comparator<? super File> g = new Comparator() { // from class: com.daaw.wm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u;
            u = ym.u((File) obj, (File) obj2);
            return u;
        }
    };
    public static final FilenameFilter h = new FilenameFilter() { // from class: com.daaw.vm
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v;
            v = ym.v(file, str);
            return v;
        }
    };
    public final AtomicInteger a = new AtomicInteger(0);
    public final h10 b;
    public final zb1 c;

    public ym(h10 h10Var, zb1 zb1Var) {
        this.b = h10Var;
        this.c = zb1Var;
    }

    public static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void G(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int f(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            h10.s(file);
            size--;
        }
        return size;
    }

    public static long h(long j) {
        return j * 1000;
    }

    public static String m(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i));
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    public static String o(String str) {
        return str.substring(0, e);
    }

    public static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public final void B(File file, lm.d dVar, String str) {
        try {
            tm tmVar = f;
            F(this.b.g(str), tmVar.E(tmVar.D(A(file)).m(dVar)));
        } catch (IOException e2) {
            ml0 f2 = ml0.f();
            f2.l("Could not synthesize final native report file for " + file, e2);
        }
    }

    public final void C(String str, long j) {
        boolean z;
        List<File> p = this.b.p(str, h);
        if (p.isEmpty()) {
            ml0 f2 = ml0.f();
            f2.i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : p) {
                try {
                    arrayList.add(f.g(A(file)));
                } catch (IOException e2) {
                    ml0 f3 = ml0.f();
                    f3.l("Could not add event to report for " + file, e2);
                }
                if (z || s(file.getName())) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.b.o(str, "report"), arrayList, j, z, nq1.d(str, this.b));
            return;
        }
        ml0 f4 = ml0.f();
        f4.k("Could not parse event files for session " + str);
    }

    public final void D(File file, List<lm.e.d> list, long j, boolean z, String str) {
        try {
            tm tmVar = f;
            lm l = tmVar.D(A(file)).n(j, z, str).l(of0.d(list));
            lm.e j2 = l.j();
            if (j2 == null) {
                return;
            }
            F(z ? this.b.j(j2.h()) : this.b.l(j2.h()), tmVar.E(l));
        } catch (IOException e2) {
            ml0 f2 = ml0.f();
            f2.l("Could not synthesize final report file for " + file, e2);
        }
    }

    public final int E(String str, int i) {
        List<File> p = this.b.p(str, new FilenameFilter() { // from class: com.daaw.um
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t;
                t = ym.t(file, str2);
                return t;
            }
        });
        Collections.sort(p, new Comparator() { // from class: com.daaw.xm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x;
                x = ym.x((File) obj, (File) obj2);
                return x;
            }
        });
        return f(p, i);
    }

    public final SortedSet<String> e(String str) {
        this.b.b();
        SortedSet<String> p = p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String last = p.last();
            ml0 f2 = ml0.f();
            f2.b("Removing session over cap: " + last);
            this.b.c(last);
            p.remove(last);
        }
        return p;
    }

    public final void g() {
        int i = this.c.b().a.b;
        List<File> n = n();
        int size = n.size();
        if (size <= i) {
            return;
        }
        for (File file : n.subList(i, size)) {
            file.delete();
        }
    }

    public void i() {
        j(this.b.m());
        j(this.b.k());
        j(this.b.h());
    }

    public final void j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public void k(String str, long j) {
        for (String str2 : e(str)) {
            ml0 f2 = ml0.f();
            f2.i("Finalizing report for session " + str2);
            C(str2, j);
            this.b.c(str2);
        }
        g();
    }

    public void l(String str, lm.d dVar) {
        File o = this.b.o(str, "report");
        ml0 f2 = ml0.f();
        f2.b("Writing native session report for " + str + " to file: " + o);
        B(o, dVar, str);
    }

    public final List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.k());
        arrayList.addAll(this.b.h());
        Comparator<? super File> comparator = g;
        Collections.sort(arrayList, comparator);
        List<File> m = this.b.m();
        Collections.sort(m, comparator);
        arrayList.addAll(m);
        return arrayList;
    }

    public SortedSet<String> p() {
        return new TreeSet(this.b.d()).descendingSet();
    }

    public long q(String str) {
        return this.b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.b.m().isEmpty() && this.b.k().isEmpty() && this.b.h().isEmpty()) ? false : true;
    }

    public List<zm> w() {
        List<File> n = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n) {
            try {
                arrayList.add(zm.a(f.D(A(file)), file.getName(), file));
            } catch (IOException e2) {
                ml0 f2 = ml0.f();
                f2.l("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(lm.e.d dVar, String str, boolean z) {
        int i = this.c.b().a.a;
        try {
            F(this.b.o(str, m(this.a.getAndIncrement(), z)), f.h(dVar));
        } catch (IOException e2) {
            ml0 f2 = ml0.f();
            f2.l("Could not persist event for session " + str, e2);
        }
        E(str, i);
    }

    public void z(lm lmVar) {
        lm.e j = lmVar.j();
        if (j == null) {
            ml0.f().b("Could not get session for report");
            return;
        }
        String h2 = j.h();
        try {
            F(this.b.o(h2, "report"), f.E(lmVar));
            G(this.b.o(h2, "start-time"), "", j.k());
        } catch (IOException e2) {
            ml0 f2 = ml0.f();
            f2.c("Could not persist report for session " + h2, e2);
        }
    }
}
