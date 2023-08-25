package com.daaw;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.gh0;
import com.daaw.jh0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.vj */
/* loaded from: classes.dex */
public class C3334vj extends AbstractC2454on {

    /* renamed from: E */
    public AbstractC2004l0[] f30249E;

    /* renamed from: com.daaw.vj$a */
    /* loaded from: classes.dex */
    public class C3335a extends gh0.C1413g.AbstractC1414a {
        public C3335a() {
        }

        @Override // com.daaw.gh0.C1413g.AbstractC1414a
        /* renamed from: c */
        public void mo2222c(Context context, Object obj, List<tx0> list) {
            C3334vj c3334vj = C3334vj.this;
            C3334vj.m7126Z(context, c3334vj, "" + ((C3341g) obj).f30256a, list);
        }
    }

    /* renamed from: com.daaw.vj$b */
    /* loaded from: classes.dex */
    public class C3336b extends gh0.C1411f.AbstractC1412a {
        public C3336b() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            C3334vj c3334vj = C3334vj.this;
            C3334vj.m7126Z(context, c3334vj, "" + ((C3341g) obj).f30256a, list);
        }
    }

    /* renamed from: com.daaw.vj$c */
    /* loaded from: classes.dex */
    public class C3337c extends gh0.C1404b.AbstractC1405a {
        public C3337c() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            C3334vj c3334vj = C3334vj.this;
            C3334vj.m7126Z(context, c3334vj, "" + ((C3341g) obj).f30256a, list);
        }
    }

    /* renamed from: com.daaw.vj$d */
    /* loaded from: classes.dex */
    public class C3338d extends gh0.C1406c.AbstractC1407a {
        public C3338d() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            C3334vj c3334vj = C3334vj.this;
            C3334vj.m7126Z(context, c3334vj, "" + ((C3341g) obj).f30256a, list);
        }
    }

    /* renamed from: com.daaw.vj$e */
    /* loaded from: classes.dex */
    public class C3339e extends gh0.C1415h.AbstractC1416a {
        public C3339e() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            C3334vj c3334vj = C3334vj.this;
            C3334vj.m7126Z(context, c3334vj, "" + ((C3341g) obj).f30256a, list);
        }
    }

    /* renamed from: com.daaw.vj$f */
    /* loaded from: classes.dex */
    public static class C3340f implements r40<AbstractC3711yj, er0<tx0, vd0>> {

        /* renamed from: a */
        public String f30255a;

        public C3340f(String str) {
            this.f30255a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> mo5050a(AbstractC3711yj abstractC3711yj) {
            return er0.m23270m(C3334vj.m7126Z(dx0.m23837e(), abstractC3711yj, this.f30255a, null), null);
        }
    }

    /* renamed from: com.daaw.vj$g */
    /* loaded from: classes.dex */
    public static class C3341g {

        /* renamed from: a */
        public final long f30256a;

        public C3341g(long j) {
            this.f30256a = j;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3341g) && this.f30256a == ((C3341g) obj).f30256a;
        }

        public int hashCode() {
            return (int) this.f30256a;
        }
    }

    public C3334vj(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        this.f30249E = new AbstractC2004l0[]{new C3335a(), new C3336b(), new C3337c(), new C3338d(), new C3339e()};
        m14147V(context);
    }

    /* renamed from: Z */
    public static List<tx0> m7126Z(Context context, AbstractC3711yj abstractC3711yj, String str, List<tx0> list) {
        if (context == null) {
            return new ArrayList();
        }
        String m24111c = dp0.m24111c(AbstractC3711yj.f33703s.m4425a(Integer.valueOf(abstractC3711yj.m3679I()), abstractC3711yj.m3678J(), null), 0);
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "album_id=?", new String[]{str}, m24111c);
        if (m24109e != null) {
            List<tx0> m24060f = dr1.m24060f(m24109e, list);
            m24109e.close();
            return m24060f;
        }
        return new ArrayList();
    }

    /* renamed from: b0 */
    public static lo1<Cursor, String> m7124b0(Context context, sd0 sd0Var, int i) {
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
            str = "album LIKE ?";
        }
        return new lo1<>(dp0.m24108f(contentResolver, MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album", "numsongs", "album_art", "artist"}, str, strArr, null), m4425a);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        return new ts1(new d90(this, this, 7, 1), this);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: H */
    public String mo2262H(int i) {
        return m14148U(i).getString(0);
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: P */
    public lo1<Cursor, String> mo5056P(Context context) {
        return m7124b0(context, m3678J(), this.f33722l);
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: Q */
    public lo1<Cursor, String> mo5055Q(Context context, String str) {
        return m7124b0(context, m3678J(), this.f33722l);
    }

    /* renamed from: Y */
    public final Uri m7127Y(long j, Context context) {
        if (C1354g2.f10157a) {
            Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "album_id=?", new String[]{j + ""}, null);
            return (m24109e == null || !m24109e.moveToFirst()) ? Uri.EMPTY : ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, m24109e.getLong(0));
        }
        return Uri.EMPTY;
    }

    /* renamed from: a0 */
    public void m7125a0(Cursor cursor, int i, C3223uk c3223uk) {
        long j = cursor.getLong(0);
        c3223uk.m8086b0(this, new C3341g(j), m3678J());
        ww1<jh0.C1829a, Boolean> ww1Var = AbstractC3711yj.f33708x;
        jh0.C1829a<Object> c1829a = c3223uk.f29118t;
        Boolean bool = Boolean.FALSE;
        c3223uk.f29121w.setSelected(ww1Var.m5753a(c1829a, bool).booleanValue());
        c3223uk.m8090X(this.f30249E, -1, this);
        c3223uk.f29122x.setVisibility(0);
        c3223uk.m8092V(-1);
        Uri m7127Y = m7127Y(j, c3223uk.f1947a.getContext());
        String string = cursor.getString(3);
        if (C1354g2.f10157a || string != null) {
            AbstractC3711yj.f33700p.m8756a(new C1652i2(m7127Y, string, null), c3223uk.f29122x, Boolean.TRUE, bool);
        } else {
            c3223uk.m8091W(R.drawable.placeholderart4);
        }
        c3223uk.f29123y.setVisibility(8);
        c3223uk.f29124z.setText(cursor.getString(1));
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(0);
        c3223uk.m8085c0(cursor.getString(3));
        c3223uk.f29112B.setText(cursor.getString(2));
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        String str2;
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album"}, "_id=?", new String[]{str}, null);
        if (m24109e != null) {
            m24109e.moveToFirst();
            str2 = dp0.m24113a(m24109e, 1);
            m24109e.close();
        } else {
            str2 = "";
        }
        C2719qk c2719qk = new C2719qk(context, new C3340f(str), mo3664p(str), str2, 0, this.f33722l, false);
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
        m7125a0(m14148U, i, c3223uk);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Albums_search);
        sd0VarArr[0] = m3678J();
    }
}
