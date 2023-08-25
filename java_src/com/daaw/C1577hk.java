package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.eh0;
import com.daaw.gh0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.daaw.hk */
/* loaded from: classes.dex */
public class C1577hk extends AbstractC2454on {

    /* renamed from: E */
    public AbstractC2004l0[] f12614E;

    /* renamed from: com.daaw.hk$a */
    /* loaded from: classes.dex */
    public class C1578a extends gh0.C1413g.AbstractC1414a {
        public C1578a() {
        }

        @Override // com.daaw.gh0.C1413g.AbstractC1414a
        /* renamed from: c */
        public void mo2222c(Context context, Object obj, List<tx0> list) {
            C1577hk.m20664Y(context, C1577hk.this, ((C1585h) obj).f12623b, list);
        }
    }

    /* renamed from: com.daaw.hk$b */
    /* loaded from: classes.dex */
    public class C1579b extends gh0.C1411f.AbstractC1412a {
        public C1579b() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            C1577hk.m20664Y(context, C1577hk.this, ((C1585h) obj).f12623b, list);
        }
    }

    /* renamed from: com.daaw.hk$c */
    /* loaded from: classes.dex */
    public class C1580c extends gh0.C1404b.AbstractC1405a {
        public C1580c() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            C1577hk.m20664Y(context, C1577hk.this, ((C1585h) obj).f12623b, list);
        }
    }

    /* renamed from: com.daaw.hk$d */
    /* loaded from: classes.dex */
    public class C1581d extends gh0.C1406c.AbstractC1407a {
        public C1581d() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            C1577hk.m20664Y(context, C1577hk.this, ((C1585h) obj).f12623b, list);
        }
    }

    /* renamed from: com.daaw.hk$e */
    /* loaded from: classes.dex */
    public class C1582e extends gh0.C1415h.AbstractC1416a {
        public C1582e() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            C1577hk.m20664Y(context, C1577hk.this, ((C1585h) obj).f12623b, list);
        }
    }

    /* renamed from: com.daaw.hk$f */
    /* loaded from: classes.dex */
    public class C1583f extends eh0.C1187b.AbstractC1188a {
        public C1583f() {
        }

        @Override // com.daaw.eh0.C1187b.AbstractC1188a
        /* renamed from: c */
        public void mo20659c(Context context, Object obj, er0<String, String> er0Var) {
            C1585h c1585h = (C1585h) obj;
            er0Var.m23274f(c1585h.f12622a, c1585h.f12623b);
        }
    }

    /* renamed from: com.daaw.hk$g */
    /* loaded from: classes.dex */
    public static class C1584g implements r40<AbstractC3711yj, er0<tx0, vd0>> {

        /* renamed from: a */
        public String f12621a;

        public C1584g(String str) {
            this.f12621a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> mo5050a(AbstractC3711yj abstractC3711yj) {
            return er0.m23270m(C1577hk.m20664Y(dx0.m23837e(), abstractC3711yj, this.f12621a, null), null);
        }
    }

    /* renamed from: com.daaw.hk$h */
    /* loaded from: classes.dex */
    public static class C1585h {

        /* renamed from: a */
        public String f12622a;

        /* renamed from: b */
        public String f12623b;

        public C1585h(String str, String str2) {
            this.f12622a = str;
            this.f12623b = str2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1585h) && this.f12622a.equals(((C1585h) obj).f12622a);
        }

        public int hashCode() {
            return this.f12622a.hashCode();
        }
    }

    public C1577hk(Context context, String str, int i) {
        super(context, str, context.getResources().getString(R.string.section_playlist_standalone), R.drawable.ic_playlist4, i);
        this.f12614E = new AbstractC2004l0[]{new C1578a(), new C1579b(), new C1580c(), new C1581d(), new C1582e(), new C1583f()};
        m14147V(context);
    }

    /* renamed from: Y */
    public static List<tx0> m20664Y(Context context, AbstractC3711yj abstractC3711yj, String str, List<tx0> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        List<tx0> m16395e = lx0.m16392h().m16395e(str);
        if (m16395e != null) {
            m20660c0(abstractC3711yj, m16395e);
            list.addAll(m16395e);
        }
        return list;
    }

    /* renamed from: Z */
    public static String m20663Z(String str) {
        return cr1.m25068l(str);
    }

    /* renamed from: b0 */
    public static lo1<Cursor, String> m20661b0(Context context, sd0 sd0Var) {
        er0<String, String> m18955H = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18955H(context);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", ""});
        Iterator<lo1<String, String>> it = m18955H.iterator();
        while (it.hasNext()) {
            lo1<String, String> next = it.next();
            matrixCursor.addRow(new String[]{next.f17576a, next.f17577b});
        }
        return new lo1<>(matrixCursor, "");
    }

    /* renamed from: c0 */
    public static void m20660c0(AbstractC3711yj abstractC3711yj, List<tx0> list) {
        if (AbstractC3711yj.f33703s.m4425a(Integer.valueOf(abstractC3711yj.m3679I()), abstractC3711yj.m3678J(), null).f13561b) {
            Collections.reverse(list);
        }
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        return new ts1(new d90(this, this, 6, 1), this);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: H */
    public String mo2262H(int i) {
        return m14148U(i).getString(0);
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: P */
    public lo1<Cursor, String> mo5056P(Context context) {
        return m20661b0(context, m3678J());
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: Q */
    public lo1<Cursor, String> mo5055Q(Context context, String str) {
        return m20661b0(context, m3678J());
    }

    /* renamed from: a0 */
    public void m20662a0(Cursor cursor, int i, C3223uk c3223uk) {
        c3223uk.m8086b0(this, new C1585h(m14148U(i).getString(0), m14148U(i).getString(1)), m3678J());
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, Boolean.FALSE).booleanValue());
        c3223uk.m8090X(this.f12614E, -1, this);
        c3223uk.f29122x.setVisibility(0);
        c3223uk.m8092V(this.f33719i);
        c3223uk.m8091W(R.drawable.ic_playlist4_file);
        c3223uk.f29123y.setVisibility(8);
        String string = cursor.getString(1);
        c3223uk.f29124z.setText(m20663Z(string));
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(0);
        c3223uk.m8085c0(string);
        c3223uk.f29112B.setText("");
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: c */
    public void mo3671c(boolean z) {
        AbstractC3711yj.f33706v.m10862a(Boolean.valueOf(z), C1577hk.class);
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        int m14150S = m14150S("_id", str);
        String string = m14150S >= 0 ? m14148U(m14150S).getString(1) : "";
        if (string.length() > 0) {
            C2719qk c2719qk = new C2719qk(context, new C1584g(string), mo3664p(str), m20663Z(string), 0, this.f33722l, false);
            c2719qk.mo3663q(this.f33713c);
            return c2719qk.m3680G(context, 0);
        }
        return null;
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        Cursor m14148U = m14148U(i);
        C3223uk c3223uk = (C3223uk) abstractC0376c0;
        c3223uk.f29120v = i;
        m20662a0(m14148U, i, c3223uk);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: z */
    public boolean mo3658z() {
        return AbstractC3711yj.f33705u.m5753a(C1577hk.class, Boolean.FALSE).booleanValue();
    }
}
