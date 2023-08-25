package com.daaw;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.dh0;
import com.daaw.gh0;
import com.daaw.n91;
import com.daaw.ts1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: com.daaw.zj */
/* loaded from: classes.dex */
public class C3845zj extends AbstractC3711yj implements ts1.InterfaceC3115a {

    /* renamed from: P */
    public static final String[] f35125P = {"_id", "_display_name", tx0.f28185e};

    /* renamed from: C */
    public AbstractC2004l0[] f35126C;

    /* renamed from: D */
    public String f35127D;

    /* renamed from: E */
    public int f35128E;

    /* renamed from: F */
    public File f35129F;

    /* renamed from: G */
    public String f35130G;

    /* renamed from: H */
    public String f35131H;

    /* renamed from: I */
    public String f35132I;

    /* renamed from: J */
    public boolean f35133J;

    /* renamed from: K */
    public List<C3864s> f35134K;

    /* renamed from: L */
    public AbstractC2004l0[] f35135L;

    /* renamed from: M */
    public AbstractC2004l0[] f35136M;

    /* renamed from: N */
    public WeakReference<oc0> f35137N;

    /* renamed from: O */
    public n91.InterfaceC2269b f35138O;

    /* renamed from: com.daaw.zj$a */
    /* loaded from: classes.dex */
    public class C3846a extends gh0.C1406c.AbstractC1407a {
        public C3846a() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            tx0 m2207h = ((C3865t) obj).f35165b.m2207h();
            if (m2207h == null) {
                return;
            }
            list.add(m2207h);
        }
    }

    /* renamed from: com.daaw.zj$b */
    /* loaded from: classes.dex */
    public class C3847b extends gh0.C1415h.AbstractC1416a {
        public C3847b() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            tx0 m2207h = ((C3865t) obj).f35165b.m2207h();
            if (m2207h == null) {
                return;
            }
            list.add(m2207h);
        }
    }

    /* renamed from: com.daaw.zj$c */
    /* loaded from: classes.dex */
    public class C3848c extends gh0.C1419j.AbstractC1420a {
        public C3848c() {
        }

        @Override // com.daaw.gh0.C1419j.AbstractC1420a
        /* renamed from: c */
        public gh0.C1408d mo2229c(Context context, Object obj) {
            tx0 m2207h = ((C3865t) obj).f35165b.m2207h();
            return m2207h == null ? new gh0.C1408d(null) : new gh0.C1408d(m2207h);
        }
    }

    /* renamed from: com.daaw.zj$d */
    /* loaded from: classes.dex */
    public class C3849d extends gh0.C1417i.AbstractC1418a {
        public C3849d() {
        }

        @Override // com.daaw.gh0.C1417i.AbstractC1418a
        /* renamed from: c */
        public void mo2228c(Context context, Object obj, List<tx0> list) {
            tx0 m2207h = ((C3865t) obj).f35165b.m2207h();
            if (m2207h == null) {
                return;
            }
            list.add(m2207h);
        }
    }

    /* renamed from: com.daaw.zj$e */
    /* loaded from: classes.dex */
    public class C3850e extends gh0.C1409e.AbstractC1410a {
        public C3850e() {
        }

        @Override // com.daaw.gh0.C1409e.AbstractC1410a
        /* renamed from: c */
        public mo1<Integer, be0, Boolean> mo2218c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var) {
            C3845zj.m2248b0(context, C3845zj.this.f35134K, list);
            return new mo1<>(0, (be0) C3845zj.this.m3678J(), Boolean.FALSE);
        }
    }

    /* renamed from: com.daaw.zj$f */
    /* loaded from: classes.dex */
    public class C3851f extends gh0.C1402a.AbstractC1403a {
        public C3851f() {
        }

        @Override // com.daaw.gh0.C1402a.AbstractC1403a
        /* renamed from: c */
        public void mo2227c(Context context, Object obj, List<tx0> list) {
            C3845zj.m2248b0(context, C3845zj.this.f35134K, list);
        }
    }

    /* renamed from: com.daaw.zj$g */
    /* loaded from: classes.dex */
    public class C3852g implements n91.InterfaceC2269b {
        public C3852g() {
        }

        @Override // com.daaw.n91.InterfaceC2269b
        /* renamed from: a */
        public void mo2226a(AsyncTask asyncTask, boolean z) {
            if (m2223d(asyncTask) && !C3845zj.this.m3683C("")) {
                C3845zj.this.m3674N(false, true);
                C3845zj.this.mo2264A();
            }
        }

        @Override // com.daaw.n91.InterfaceC2269b
        /* renamed from: b */
        public void mo2225b(AsyncTask asyncTask) {
            if (m2223d(asyncTask) && !C3845zj.this.m3683C("")) {
                C3845zj.this.m3674N(true, false);
                C3845zj.this.f35134K.clear();
                C3845zj.this.mo2264A();
            }
        }

        @Override // com.daaw.n91.InterfaceC2269b
        /* renamed from: c */
        public void mo2224c(AsyncTask asyncTask, C3864s c3864s) {
            if (m2223d(asyncTask) && !C3845zj.this.m3683C("")) {
                C3845zj.this.m2242f0(c3864s);
            }
        }

        /* renamed from: d */
        public boolean m2223d(AsyncTask asyncTask) {
            return AbstractC3711yj.f33709y.m4425a(asyncTask, Integer.valueOf(C3845zj.this.f35128E), Boolean.FALSE).booleanValue();
        }
    }

    /* renamed from: com.daaw.zj$h */
    /* loaded from: classes.dex */
    public class C3853h implements InterfaceC3863r {

        /* renamed from: a */
        public final /* synthetic */ int f35146a;

        /* renamed from: b */
        public final /* synthetic */ sd0 f35147b;

        public C3853h(int i, sd0 sd0Var) {
            this.f35146a = i;
            this.f35147b = sd0Var;
        }

        @Override // com.daaw.C3845zj.InterfaceC3863r
        /* renamed from: a */
        public boolean mo2215a(File file) {
            return AbstractC3711yj.f33704t.m3155a(Integer.valueOf(this.f35146a), this.f35147b, file, Boolean.TRUE).booleanValue();
        }
    }

    /* renamed from: com.daaw.zj$i */
    /* loaded from: classes.dex */
    public class C3854i extends gh0.C1413g.AbstractC1414a {
        public C3854i() {
        }

        @Override // com.daaw.gh0.C1413g.AbstractC1414a
        /* renamed from: c */
        public void mo2222c(Context context, Object obj, List<tx0> list) {
            int i = C3845zj.this.f35128E;
            sd0 m3678J = C3845zj.this.m3678J();
            C3845zj.m2247c0(context, i, m3678J, "" + ((C3865t) obj).m2204a(), list);
        }
    }

    /* renamed from: com.daaw.zj$j */
    /* loaded from: classes.dex */
    public class C3855j extends gh0.C1411f.AbstractC1412a {
        public C3855j() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            int i = C3845zj.this.f35128E;
            sd0 m3678J = C3845zj.this.m3678J();
            C3845zj.m2247c0(context, i, m3678J, "" + ((C3865t) obj).m2204a(), list);
        }
    }

    /* renamed from: com.daaw.zj$k */
    /* loaded from: classes.dex */
    public class C3856k extends gh0.C1404b.AbstractC1405a {
        public C3856k() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            int i = C3845zj.this.f35128E;
            sd0 m3678J = C3845zj.this.m3678J();
            C3845zj.m2247c0(context, i, m3678J, "" + ((C3865t) obj).m2204a(), list);
        }
    }

    /* renamed from: com.daaw.zj$l */
    /* loaded from: classes.dex */
    public class C3857l extends gh0.C1406c.AbstractC1407a {
        public C3857l() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            int i = C3845zj.this.f35128E;
            sd0 m3678J = C3845zj.this.m3678J();
            C3845zj.m2247c0(context, i, m3678J, "" + ((C3865t) obj).m2204a(), list);
        }
    }

    /* renamed from: com.daaw.zj$m */
    /* loaded from: classes.dex */
    public class C3858m extends gh0.C1415h.AbstractC1416a {
        public C3858m() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            int i = C3845zj.this.f35128E;
            sd0 m3678J = C3845zj.this.m3678J();
            C3845zj.m2247c0(context, i, m3678J, "" + ((C3865t) obj).m2204a(), list);
        }
    }

    /* renamed from: com.daaw.zj$n */
    /* loaded from: classes.dex */
    public class C3859n extends dh0.C1084a.AbstractC1085a {
        public C3859n() {
        }

        @Override // com.daaw.dh0.C1084a.AbstractC1085a
        /* renamed from: c */
        public void mo2219c(Context context, Object obj, List<String> list) {
            list.add(((C3865t) obj).m2204a());
        }
    }

    /* renamed from: com.daaw.zj$o */
    /* loaded from: classes.dex */
    public class C3860o extends gh0.C1409e.AbstractC1410a {
        public C3860o() {
        }

        @Override // com.daaw.gh0.C1409e.AbstractC1410a
        /* renamed from: c */
        public mo1<Integer, be0, Boolean> mo2218c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var) {
            int m24065a;
            C3865t c3865t = (C3865t) obj;
            be0 be0Var2 = (be0) C3845zj.this.m3678J();
            int i = 0;
            if (be0Var != null && be0Var.equals(C3845zj.this.m3678J())) {
                tx0 m2207h = c3865t.f35165b.m2207h();
                int m2254W = C3845zj.m2254W(C3845zj.this.f35134K, m2207h, 0);
                tx0 tx0Var = null;
                if (m2254W >= 0 && m2254W < er0Var.size()) {
                    tx0Var = er0Var.m23268o(m2254W);
                }
                if (m2207h != null && m2207h.equals(tx0Var)) {
                    return new mo1<>(Integer.valueOf(m2254W), be0Var2, Boolean.TRUE);
                }
            }
            int size = list.size();
            C3845zj.m2248b0(context, C3845zj.this.f35134K, list);
            tx0 m2207h2 = c3865t.f35165b.m2207h();
            if (m2207h2 != null && (m24065a = dr1.m24065a(list, m2207h2, size)) >= 0) {
                i = m24065a;
            }
            return new mo1<>(Integer.valueOf(i), be0Var2, Boolean.FALSE);
        }
    }

    /* renamed from: com.daaw.zj$p */
    /* loaded from: classes.dex */
    public class C3861p extends gh0.C1411f.AbstractC1412a {
        public C3861p() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            tx0 m2207h = ((C3865t) obj).f35165b.m2207h();
            if (m2207h == null) {
                return;
            }
            list.add(m2207h);
        }
    }

    /* renamed from: com.daaw.zj$q */
    /* loaded from: classes.dex */
    public class C3862q extends gh0.C1404b.AbstractC1405a {
        public C3862q() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            tx0 m2207h = ((C3865t) obj).f35165b.m2207h();
            if (m2207h == null) {
                return;
            }
            list.add(m2207h);
        }
    }

    /* renamed from: com.daaw.zj$r */
    /* loaded from: classes.dex */
    public interface InterfaceC3863r {
        /* renamed from: a */
        boolean mo2215a(File file);
    }

    /* renamed from: com.daaw.zj$s */
    /* loaded from: classes.dex */
    public static class C3864s implements Comparable<C3864s> {

        /* renamed from: p */
        public int f35157p;

        /* renamed from: q */
        public final tx0 f35158q;

        /* renamed from: r */
        public final boolean f35159r;

        /* renamed from: s */
        public final String f35160s;

        /* renamed from: t */
        public final long f35161t;

        /* renamed from: u */
        public final String f35162u;

        /* renamed from: v */
        public final long f35163v;

        public C3864s(boolean z, String str, long j, String str2, long j2) {
            this(z, str, j, str2, j2, null);
        }

        public C3864s(boolean z, String str, long j, String str2, long j2, tx0 tx0Var) {
            this.f35157p = 0;
            this.f35159r = z;
            this.f35160s = str;
            this.f35161t = j;
            this.f35162u = str2;
            this.f35163v = j2;
            this.f35158q = tx0Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(C3864s c3864s) {
            String str = this.f35160s;
            if (str != null) {
                return str.toLowerCase().compareTo(c3864s.m2209f().toLowerCase());
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: d */
        public long m2211d() {
            return this.f35161t;
        }

        /* renamed from: e */
        public long m2210e() {
            return this.f35163v;
        }

        /* renamed from: f */
        public String m2209f() {
            return this.f35160s;
        }

        /* renamed from: g */
        public String m2208g() {
            return this.f35162u;
        }

        /* renamed from: h */
        public tx0 m2207h() {
            return this.f35158q;
        }

        /* renamed from: i */
        public boolean m2206i() {
            return this.f35159r;
        }

        /* renamed from: j */
        public void m2205j(int i) {
            this.f35157p = i;
        }
    }

    /* renamed from: com.daaw.zj$t */
    /* loaded from: classes.dex */
    public static class C3865t {

        /* renamed from: a */
        public int f35164a;

        /* renamed from: b */
        public C3864s f35165b;

        public C3865t(C3864s c3864s, int i) {
            this.f35164a = i;
            this.f35165b = c3864s;
        }

        /* renamed from: a */
        public String m2204a() {
            return this.f35165b.m2208g();
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3865t) && this.f35164a == ((C3865t) obj).f35164a;
        }

        public int hashCode() {
            return this.f35164a;
        }
    }

    public C3845zj(Context context, File file, String str, int i) {
        super(context, str, new tr1(file.getName()), 0, i);
        this.f35126C = new AbstractC2004l0[]{new C3854i(), new C3855j(), new C3856k(), new C3857l(), new C3858m(), new C3859n()};
        this.f35127D = null;
        this.f35135L = new AbstractC2004l0[]{new C3860o(), new C3861p(), new C3862q(), new C3846a(), new C3847b(), new C3848c(), new C3849d()};
        this.f35136M = new AbstractC2004l0[]{new C3850e(), new C3851f()};
        this.f35137N = new WeakReference<>(null);
        this.f35138O = new C3852g();
        this.f35128E = i;
        this.f35129F = file;
        this.f35134K = new ArrayList();
        this.f35130G = this.f35129F.getName();
        this.f35131H = this.f35129F.getAbsolutePath();
        this.f35132I = this.f35129F.getPath();
        this.f35133J = this.f35129F.isDirectory();
        if (this.f35129F.isDirectory() && this.f35131H.length() > 0) {
            String str2 = this.f35131H;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f35131H += "/";
            }
        }
        mo2234o(context, AbstractC3711yj.f33702r.m4425a(Integer.valueOf(i), m3678J(), ""));
    }

    /* renamed from: W */
    public static int m2254W(List<C3864s> list, tx0 tx0Var, int i) {
        int i2 = 0;
        while (i < list.size()) {
            tx0 m2207h = list.get(i).m2207h();
            if (m2207h != null) {
                if (m2207h.m8748d(tx0Var)) {
                    return i2;
                }
                i2++;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a0 */
    public static void m2249a0(String str, List<C3864s> list, Uri uri) {
        Cursor query = dx0.m23839c().getContentResolver().query(uri, f35125P, "_data LIKE ? AND _data NOT LIKE ?", new String[]{str + "%", str + "/%/%"}, null);
        if (query == null) {
            return;
        }
        int columnIndex = query.getColumnIndex("_id");
        int columnIndex2 = query.getColumnIndex("_display_name");
        int columnIndex3 = query.getColumnIndex(tx0.f28185e);
        while (query.moveToNext()) {
            Uri withAppendedId = ContentUris.withAppendedId(uri, query.getLong(columnIndex));
            list.add(new C3864s(false, query.getString(columnIndex2), query.getLong(columnIndex3), withAppendedId.toString(), 0L, new tx0(withAppendedId)));
        }
        query.close();
    }

    /* renamed from: b0 */
    public static List<tx0> m2248b0(Context context, List<C3864s> list, List<tx0> list2) {
        if (list2 == null) {
            list2 = new ArrayList<>(list.size());
        }
        for (C3864s c3864s : list) {
            if (c3864s.m2207h() != null) {
                list2.add(c3864s.m2207h());
            }
        }
        return list2;
    }

    /* renamed from: c0 */
    public static List<tx0> m2247c0(Context context, int i, sd0 sd0Var, String str, List<tx0> list) {
        return m2245d0(context, i, sd0Var, str, false, list);
    }

    /* renamed from: d0 */
    public static List<tx0> m2245d0(Context context, int i, sd0 sd0Var, String str, boolean z, List<tx0> list) {
        return m2248b0(context, m2240g0(i, sd0Var, new File(str), true), list);
    }

    /* renamed from: g0 */
    public static List<C3864s> m2240g0(int i, sd0 sd0Var, File file, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m2239h0(arrayList, arrayList2, file, z, new C3853h(i, sd0Var));
        Collections.sort(arrayList);
        Comparator<C3864s> m22100b = g10.m22100b(AbstractC3711yj.f33703s.m4425a(Integer.valueOf(i), sd0Var, null), 0);
        if (m22100b != null) {
            Collections.sort(arrayList2, m22100b);
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((C3864s) arrayList2.get(i2)).f35157p = i2;
        }
        if (arrayList.size() > 0) {
            arrayList.addAll(arrayList2);
            return arrayList;
        }
        return arrayList2;
    }

    /* renamed from: h0 */
    public static void m2239h0(List<C3864s> list, List<C3864s> list2, File file, boolean z, InterfaceC3863r interfaceC3863r) {
        File[] listFiles;
        File[] listFiles2 = file.listFiles();
        m2249a0(file.getPath(), list2, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        m2249a0(file.getPath(), list2, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        try {
            for (File file2 : listFiles2) {
                if (file2.isDirectory() && !z) {
                    if (interfaceC3863r != null ? interfaceC3863r.mo2215a(file2) : true) {
                        list.add(new C3864s(true, file2.getName(), file2.listFiles() != null ? listFiles.length : 0, file2.getCanonicalPath(), file2.lastModified()));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: A */
    public boolean mo2264A() {
        if (m3684B(m2252Y(true).f17577b, false)) {
            return true;
        }
        lo1<List<C3864s>, String> m2252Y = m2252Y(false);
        List<C3864s> list = m2252Y.f17576a;
        if (list == null) {
            m2238i0(new ArrayList(), null);
        } else {
            m2238i0(list, m2252Y.f17577b);
        }
        return true;
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        return new ts1(new d90(this, this, 11, 1), this);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: H */
    public String mo2262H(int i) {
        C3864s m2251Z = m2251Z(i);
        return m2251Z.m2206i() ? m2251Z.m2209f() : "";
    }

    /* renamed from: X */
    public oc0 m2253X() {
        return this.f35137N.get();
    }

    /* renamed from: Y */
    public lo1<List<C3864s>, String> m2252Y(boolean z) {
        if (this.f35127D == null) {
            return z ? new lo1<>(null, "") : new lo1<>(m2240g0(this.f35128E, m3678J(), this.f35129F, false), "");
        }
        List<C3864s> list = z ? null : this.f35134K;
        return new lo1<>(list, this.f35127D + this.f35134K.size());
    }

    /* renamed from: Z */
    public C3864s m2251Z(int i) {
        return this.f35134K.get(i);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0, com.daaw.ts1.InterfaceC3115a
    /* renamed from: a */
    public int mo2250a() {
        return this.f35134K.size();
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        if (str.length() > 0) {
            C3845zj c3845zj = new C3845zj(context, new File(this.f35131H + str), mo3664p(str), this.f35128E);
            c3845zj.mo3663q(this.f33713c);
            return c3845zj.m3681F(context);
        }
        return null;
    }

    /* renamed from: e0 */
    public void m2244e0(C3864s c3864s, int i, C3223uk c3223uk) {
        tx0 m2207h = c3864s.m2207h();
        if (m2207h != null) {
            C2719qk.m12376f0(this, new C3865t(c3864s, i), m2207h, null, c3864s.f35157p, c3223uk, this.f35135L, 0);
            return;
        }
        c3223uk.m8086b0(this, new C3865t(c3864s, i), m3678J());
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, Boolean.FALSE).booleanValue());
        c3223uk.m8090X(this.f35126C, -1, this);
        c3223uk.f29122x.setVisibility(0);
        c3223uk.m8092V(this.f33719i);
        c3223uk.m8091W(R.drawable.ic_folder4);
        c3223uk.f29123y.setVisibility(8);
        c3223uk.f29124z.setText(c3864s.m2209f());
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(8);
        TextView textView = c3223uk.f29112B;
        textView.setText("" + c3864s.m2211d());
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: f */
    public void mo2243f(oc0 oc0Var) {
        this.f35137N = new WeakReference<>(oc0Var);
    }

    /* renamed from: f0 */
    public void m2242f0(C3864s c3864s) {
        this.f35134K.add(c3864s);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: g */
    public void mo2241g(C0645al c0645al, int i) {
        AbstractC2004l0[] abstractC2004l0Arr = this.f35136M;
        if (i < abstractC2004l0Arr.length) {
            abstractC2004l0Arr[i].m17274a(c0645al, null);
        }
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    public int getItemViewType(int i) {
        return 0;
    }

    /* renamed from: i0 */
    public void m2238i0(List<C3864s> list, String str) {
        if (m3684B(str, true)) {
            return;
        }
        this.f35134K = list;
        oc0 m2253X = m2253X();
        if (m2253X != null) {
            m2253X.mo8846a();
        }
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: j */
    public void mo2237j(int i, int i2, List<Integer> list) {
    }

    /* renamed from: j0 */
    public void m2236j0(Context context, String str) {
        n91 n91Var = new n91(context, this.f35129F, new q91(context), new WeakReference(this.f35138O));
        AbstractC3711yj.f33710z.m9795a(n91Var, Integer.valueOf(this.f35128E), str);
        n91Var.execute(str);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: k */
    public void mo2235k() {
    }

    @Override // com.daaw.wc0
    /* renamed from: o */
    public void mo2234o(Context context, String str) {
        if (str == null || str.isEmpty()) {
            this.f35127D = null;
            m3674N(false, true);
            mo2264A();
            return;
        }
        this.f35127D = str;
        m3674N(true, false);
        mo2264A();
        m2236j0(context, str);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: r */
    public RecyclerView.AbstractC0376c0 mo2233r(ViewGroup viewGroup, int i) {
        return gt1.m21239a(viewGroup.getContext(), viewGroup, i, this);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: t */
    public int mo2232t(int i) {
        return i;
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        C3864s m2251Z = m2251Z(i);
        C3223uk c3223uk = (C3223uk) abstractC0376c0;
        c3223uk.f29120v = i;
        m2244e0(m2251Z, i, c3223uk);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Folders_search);
        sd0VarArr[0] = m3678J();
    }
}
