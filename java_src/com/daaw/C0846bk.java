package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.gh0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.bk */
/* loaded from: classes.dex */
public class C0846bk extends AbstractC2454on {

    /* renamed from: E */
    public AbstractC2004l0[] f4862E;

    /* renamed from: com.daaw.bk$a */
    /* loaded from: classes.dex */
    public class C0847a extends gh0.C1413g.AbstractC1414a {
        public C0847a() {
        }

        @Override // com.daaw.gh0.C1413g.AbstractC1414a
        /* renamed from: c */
        public void mo2222c(Context context, Object obj, List<tx0> list) {
            C0846bk c0846bk = C0846bk.this;
            C0846bk.m26102Y(context, c0846bk, "" + ((C0853g) obj).f4869a, list);
        }
    }

    /* renamed from: com.daaw.bk$b */
    /* loaded from: classes.dex */
    public class C0848b extends gh0.C1411f.AbstractC1412a {
        public C0848b() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            C0846bk c0846bk = C0846bk.this;
            C0846bk.m26102Y(context, c0846bk, "" + ((C0853g) obj).f4869a, list);
        }
    }

    /* renamed from: com.daaw.bk$c */
    /* loaded from: classes.dex */
    public class C0849c extends gh0.C1404b.AbstractC1405a {
        public C0849c() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            C0846bk c0846bk = C0846bk.this;
            C0846bk.m26102Y(context, c0846bk, "" + ((C0853g) obj).f4869a, list);
        }
    }

    /* renamed from: com.daaw.bk$d */
    /* loaded from: classes.dex */
    public class C0850d extends gh0.C1406c.AbstractC1407a {
        public C0850d() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            C0846bk c0846bk = C0846bk.this;
            C0846bk.m26102Y(context, c0846bk, "" + ((C0853g) obj).f4869a, list);
        }
    }

    /* renamed from: com.daaw.bk$e */
    /* loaded from: classes.dex */
    public class C0851e extends gh0.C1415h.AbstractC1416a {
        public C0851e() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            C0846bk c0846bk = C0846bk.this;
            C0846bk.m26102Y(context, c0846bk, "" + ((C0853g) obj).f4869a, list);
        }
    }

    /* renamed from: com.daaw.bk$f */
    /* loaded from: classes.dex */
    public static class C0852f implements r40<AbstractC3711yj, er0<tx0, vd0>> {

        /* renamed from: a */
        public String f4868a;

        public C0852f(String str) {
            this.f4868a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> mo5050a(AbstractC3711yj abstractC3711yj) {
            return er0.m23270m(C0846bk.m26102Y(dx0.m23837e(), abstractC3711yj, this.f4868a, null), null);
        }
    }

    /* renamed from: com.daaw.bk$g */
    /* loaded from: classes.dex */
    public static class C0853g {

        /* renamed from: a */
        public long f4869a;

        public C0853g(long j) {
            this.f4869a = j;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0853g) && this.f4869a == ((C0853g) obj).f4869a;
        }

        public int hashCode() {
            return (int) this.f4869a;
        }
    }

    public C0846bk(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        this.f4862E = new AbstractC2004l0[]{new C0847a(), new C0848b(), new C0849c(), new C0850d(), new C0851e()};
        m14147V(context);
    }

    /* renamed from: Y */
    public static List<tx0> m26102Y(Context context, AbstractC3711yj abstractC3711yj, String str, List<tx0> list) {
        if (context == null) {
            return new ArrayList();
        }
        String m24111c = dp0.m24111c(AbstractC3711yj.f33703s.m4425a(Integer.valueOf(abstractC3711yj.m3679I()), abstractC3711yj.m3678J(), null), 0);
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Genres.Members.getContentUri("external", br1.m25884y(str)), new String[]{"_id", "audio_id", "_data"}, "genre_id=?", new String[]{str}, m24111c);
        if (m24109e != null) {
            List<tx0> m24060f = dr1.m24060f(m24109e, list);
            m24109e.close();
            return m24060f;
        }
        return new ArrayList();
    }

    /* renamed from: a0 */
    public static lo1<Cursor, String> m26100a0(Context context, sd0 sd0Var, int i) {
        String str;
        String[] strArr;
        ContentResolver contentResolver = context.getContentResolver();
        String m4425a = AbstractC3711yj.f33702r.m4425a(Integer.valueOf(i), sd0Var, "");
        if (m4425a == null || m4425a.isEmpty()) {
            str = null;
            strArr = null;
            m4425a = "";
        } else {
            strArr = new String[]{"%" + m4425a + "%"};
            str = "name LIKE ?";
        }
        return new lo1<>(dp0.m24108f(contentResolver, MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, str, strArr, null), m4425a);
    }

    /* renamed from: b0 */
    public static String m26099b0(Context context, String str) {
        return (str == null || str.isEmpty()) ? context.getString(R.string.unnamed_title) : str;
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        return new ts1(new d90(this, this, 9, 1), this);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: H */
    public String mo2262H(int i) {
        return m14148U(i).getString(0);
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: P */
    public lo1<Cursor, String> mo5056P(Context context) {
        return m26100a0(context, m3678J(), this.f33722l);
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: Q */
    public lo1<Cursor, String> mo5055Q(Context context, String str) {
        return m26100a0(context, m3678J(), this.f33722l);
    }

    /* renamed from: Z */
    public void m26101Z(Cursor cursor, int i, C3223uk c3223uk) {
        c3223uk.m8086b0(this, new C0853g(cursor.getLong(0)), m3678J());
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, Boolean.FALSE).booleanValue());
        c3223uk.m8090X(this.f4862E, -1, this);
        c3223uk.f29122x.setVisibility(8);
        c3223uk.m8093U(null);
        c3223uk.f29123y.setVisibility(8);
        TextView textView = c3223uk.f29124z;
        textView.setText(m26099b0(textView.getContext(), cursor.getString(1)));
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(8);
        c3223uk.f29112B.setText("");
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        String str2;
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, "_id=?", new String[]{str}, null);
        if (m24109e != null) {
            m24109e.moveToFirst();
            str2 = dp0.m24113a(m24109e, 1);
            m24109e.close();
        } else {
            str2 = "";
        }
        C2719qk c2719qk = new C2719qk(context, new C0852f(str), mo3664p(str), str2, 0, this.f33722l, false);
        c2719qk.mo3663q(this.f33713c);
        return c2719qk.m3680G(context, 0);
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
        m26101Z(m14148U, i, c3223uk);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Genres_search);
        sd0VarArr[0] = m3678J();
    }
}
