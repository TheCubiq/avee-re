package com.daaw;

import com.daaw.AbstractC2057lm;
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
/* renamed from: com.daaw.ym */
/* loaded from: classes2.dex */
public class C3717ym {

    /* renamed from: d */
    public static final Charset f33789d = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final int f33790e = 15;

    /* renamed from: f */
    public static final C3095tm f33791f = new C3095tm();

    /* renamed from: g */
    public static final Comparator<? super File> f33792g = new Comparator() { // from class: com.daaw.wm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m3541u;
            m3541u = C3717ym.m3541u((File) obj, (File) obj2);
            return m3541u;
        }
    };

    /* renamed from: h */
    public static final FilenameFilter f33793h = new FilenameFilter() { // from class: com.daaw.vm
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m3540v;
            m3540v = C3717ym.m3540v(file, str);
            return m3540v;
        }
    };

    /* renamed from: a */
    public final AtomicInteger f33794a = new AtomicInteger(0);

    /* renamed from: b */
    public final h10 f33795b;

    /* renamed from: c */
    public final zb1 f33796c;

    public C3717ym(h10 h10Var, zb1 zb1Var) {
        this.f33795b = h10Var;
        this.f33796c = zb1Var;
    }

    /* renamed from: A */
    public static String m3568A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f33789d);
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

    /* renamed from: F */
    public static void m3563F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f33789d);
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

    /* renamed from: G */
    public static void m3562G(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f33789d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m3554h(j));
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

    /* renamed from: f */
    public static int m3556f(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            h10.m21093s(file);
            size--;
        }
        return size;
    }

    /* renamed from: h */
    public static long m3554h(long j) {
        return j * 1000;
    }

    /* renamed from: m */
    public static String m3549m(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i));
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    /* renamed from: o */
    public static String m3547o(String str) {
        return str.substring(0, f33790e);
    }

    /* renamed from: s */
    public static boolean m3543s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* renamed from: t */
    public static boolean m3542t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* renamed from: u */
    public static /* synthetic */ int m3541u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m3540v(File file, String str) {
        return str.startsWith("event");
    }

    /* renamed from: x */
    public static int m3538x(File file, File file2) {
        return m3547o(file.getName()).compareTo(m3547o(file2.getName()));
    }

    /* renamed from: B */
    public final void m3567B(File file, AbstractC2057lm.AbstractC2063d abstractC2063d, String str) {
        try {
            C3095tm c3095tm = f33791f;
            m3563F(this.f33795b.m21105g(str), c3095tm.m8997E(c3095tm.m8998D(m3568A(file)).m16836m(abstractC2063d)));
        } catch (IOException e) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15970l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: C */
    public final void m3566C(String str, long j) {
        boolean z;
        List<File> m21096p = this.f33795b.m21096p(str, f33793h);
        if (m21096p.isEmpty()) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15973i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(m21096p);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : m21096p) {
                try {
                    arrayList.add(f33791f.m8990g(m3568A(file)));
                } catch (IOException e) {
                    ml0 m15976f2 = ml0.m15976f();
                    m15976f2.m15970l("Could not add event to report for " + file, e);
                }
                if (z || m3543s(file.getName())) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m3565D(this.f33795b.m21097o(str, "report"), arrayList, j, z, nq1.m14884d(str, this.f33795b));
            return;
        }
        ml0 m15976f3 = ml0.m15976f();
        m15976f3.m15971k("Could not parse event files for session " + str);
    }

    /* renamed from: D */
    public final void m3565D(File file, List<AbstractC2057lm.AbstractC2067e.AbstractC2074d> list, long j, boolean z, String str) {
        try {
            C3095tm c3095tm = f33791f;
            AbstractC2057lm m16837l = c3095tm.m8998D(m3568A(file)).m16835n(j, z, str).m16837l(of0.m14316d(list));
            AbstractC2057lm.AbstractC2067e mo16839j = m16837l.mo16839j();
            if (mo16839j == null) {
                return;
            }
            m3563F(z ? this.f33795b.m21102j(mo16839j.mo16782h()) : this.f33795b.m21100l(mo16839j.mo16782h()), c3095tm.m8997E(m16837l));
        } catch (IOException e) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15970l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: E */
    public final int m3564E(String str, int i) {
        List<File> m21096p = this.f33795b.m21096p(str, new FilenameFilter() { // from class: com.daaw.um
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean m3542t;
                m3542t = C3717ym.m3542t(file, str2);
                return m3542t;
            }
        });
        Collections.sort(m21096p, new Comparator() { // from class: com.daaw.xm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m3538x;
                m3538x = C3717ym.m3538x((File) obj, (File) obj2);
                return m3538x;
            }
        });
        return m3556f(m21096p, i);
    }

    /* renamed from: e */
    public final SortedSet<String> m3557e(String str) {
        this.f33795b.m21110b();
        SortedSet<String> m3546p = m3546p();
        if (str != null) {
            m3546p.remove(str);
        }
        if (m3546p.size() <= 8) {
            return m3546p;
        }
        while (m3546p.size() > 8) {
            String last = m3546p.last();
            ml0 m15976f = ml0.m15976f();
            m15976f.m15980b("Removing session over cap: " + last);
            this.f33795b.m21109c(last);
            m3546p.remove(last);
        }
        return m3546p;
    }

    /* renamed from: g */
    public final void m3555g() {
        int i = this.f33796c.mo2554b().f27199a.f27210b;
        List<File> m3548n = m3548n();
        int size = m3548n.size();
        if (size <= i) {
            return;
        }
        for (File file : m3548n.subList(i, size)) {
            file.delete();
        }
    }

    /* renamed from: i */
    public void m3553i() {
        m3552j(this.f33795b.m21099m());
        m3552j(this.f33795b.m21101k());
        m3552j(this.f33795b.m21104h());
    }

    /* renamed from: j */
    public final void m3552j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* renamed from: k */
    public void m3551k(String str, long j) {
        for (String str2 : m3557e(str)) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15973i("Finalizing report for session " + str2);
            m3566C(str2, j);
            this.f33795b.m21109c(str2);
        }
        m3555g();
    }

    /* renamed from: l */
    public void m3550l(String str, AbstractC2057lm.AbstractC2063d abstractC2063d) {
        File m21097o = this.f33795b.m21097o(str, "report");
        ml0 m15976f = ml0.m15976f();
        m15976f.m15980b("Writing native session report for " + str + " to file: " + m21097o);
        m3567B(m21097o, abstractC2063d, str);
    }

    /* renamed from: n */
    public final List<File> m3548n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f33795b.m21101k());
        arrayList.addAll(this.f33795b.m21104h());
        Comparator<? super File> comparator = f33792g;
        Collections.sort(arrayList, comparator);
        List<File> m21099m = this.f33795b.m21099m();
        Collections.sort(m21099m, comparator);
        arrayList.addAll(m21099m);
        return arrayList;
    }

    /* renamed from: p */
    public SortedSet<String> m3546p() {
        return new TreeSet(this.f33795b.m21108d()).descendingSet();
    }

    /* renamed from: q */
    public long m3545q(String str) {
        return this.f33795b.m21097o(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean m3544r() {
        return (this.f33795b.m21099m().isEmpty() && this.f33795b.m21101k().isEmpty() && this.f33795b.m21104h().isEmpty()) ? false : true;
    }

    /* renamed from: w */
    public List<AbstractC3878zm> m3539w() {
        List<File> m3548n = m3548n();
        ArrayList arrayList = new ArrayList();
        for (File file : m3548n) {
            try {
                arrayList.add(AbstractC3878zm.m2119a(f33791f.m8998D(m3568A(file)), file.getName(), file));
            } catch (IOException e) {
                ml0 m15976f = ml0.m15976f();
                m15976f.m15970l("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void m3537y(AbstractC2057lm.AbstractC2067e.AbstractC2074d abstractC2074d, String str, boolean z) {
        int i = this.f33796c.mo2554b().f27199a.f27209a;
        try {
            m3563F(this.f33795b.m21097o(str, m3549m(this.f33794a.getAndIncrement(), z)), f33791f.m8989h(abstractC2074d));
        } catch (IOException e) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15970l("Could not persist event for session " + str, e);
        }
        m3564E(str, i);
    }

    /* renamed from: z */
    public void m3536z(AbstractC2057lm abstractC2057lm) {
        AbstractC2057lm.AbstractC2067e mo16839j = abstractC2057lm.mo16839j();
        if (mo16839j == null) {
            ml0.m15976f().m15980b("Could not get session for report");
            return;
        }
        String mo16782h = mo16839j.mo16782h();
        try {
            m3563F(this.f33795b.m21097o(mo16782h, "report"), f33791f.m8997E(abstractC2057lm));
            m3562G(this.f33795b.m21097o(mo16782h, "start-time"), "", mo16839j.mo16779k());
        } catch (IOException e) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15979c("Could not persist report for session " + mo16782h, e);
        }
    }
}
