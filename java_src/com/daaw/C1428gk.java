package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.eh0;
import com.daaw.gh0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.gk */
/* loaded from: classes.dex */
public class C1428gk extends AbstractC2454on {

    /* renamed from: E */
    public AbstractC2004l0[] f11368E;

    /* renamed from: com.daaw.gk$a */
    /* loaded from: classes.dex */
    public class C1429a extends gh0.C1413g.AbstractC1414a {
        public C1429a() {
        }

        @Override // com.daaw.gh0.C1413g.AbstractC1414a
        /* renamed from: c */
        public void mo2222c(Context context, Object obj, List<tx0> list) {
            C1428gk c1428gk = C1428gk.this;
            C1428gk.m21551Y(context, c1428gk, "" + ((C1437i) obj).f11377a, list);
        }
    }

    /* renamed from: com.daaw.gk$b */
    /* loaded from: classes.dex */
    public class C1430b extends gh0.C1411f.AbstractC1412a {
        public C1430b() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            C1428gk c1428gk = C1428gk.this;
            C1428gk.m21551Y(context, c1428gk, "" + ((C1437i) obj).f11377a, list);
        }
    }

    /* renamed from: com.daaw.gk$c */
    /* loaded from: classes.dex */
    public class C1431c extends gh0.C1404b.AbstractC1405a {
        public C1431c() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            C1428gk c1428gk = C1428gk.this;
            C1428gk.m21551Y(context, c1428gk, "" + ((C1437i) obj).f11377a, list);
        }
    }

    /* renamed from: com.daaw.gk$d */
    /* loaded from: classes.dex */
    public class C1432d extends gh0.C1406c.AbstractC1407a {
        public C1432d() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            C1428gk c1428gk = C1428gk.this;
            C1428gk.m21551Y(context, c1428gk, "" + ((C1437i) obj).f11377a, list);
        }
    }

    /* renamed from: com.daaw.gk$e */
    /* loaded from: classes.dex */
    public class C1433e extends gh0.C1415h.AbstractC1416a {
        public C1433e() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            C1428gk c1428gk = C1428gk.this;
            C1428gk.m21551Y(context, c1428gk, "" + ((C1437i) obj).f11377a, list);
        }
    }

    /* renamed from: com.daaw.gk$f */
    /* loaded from: classes.dex */
    public class C1434f extends eh0.C1189c.AbstractC1190a {
        public C1434f() {
        }

        @Override // com.daaw.eh0.C1189c.AbstractC1190a
        /* renamed from: c */
        public void mo21548c(Context context, Object obj, er0<Long, String> er0Var) {
            C1437i c1437i = (C1437i) obj;
            er0Var.m23274f(Long.valueOf(c1437i.f11377a), c1437i.f11378b);
        }
    }

    /* renamed from: com.daaw.gk$g */
    /* loaded from: classes.dex */
    public class C1435g extends eh0.C1185a.AbstractC1186a {
        public C1435g() {
        }

        @Override // com.daaw.eh0.C1185a.AbstractC1186a
        /* renamed from: c */
        public void mo21547c(Context context, Object obj, er0<Long, String> er0Var) {
            C1437i c1437i = (C1437i) obj;
            er0Var.m23274f(Long.valueOf(c1437i.f11377a), c1437i.f11378b);
        }
    }

    /* renamed from: com.daaw.gk$h */
    /* loaded from: classes.dex */
    public static class C1436h implements r40<AbstractC3711yj, er0<tx0, vd0>> {

        /* renamed from: a */
        public String f11376a;

        public C1436h(String str) {
            this.f11376a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> mo5050a(AbstractC3711yj abstractC3711yj) {
            return er0.m23270m(C1428gk.m21551Y(dx0.m23837e(), abstractC3711yj, this.f11376a, null), null);
        }
    }

    /* renamed from: com.daaw.gk$i */
    /* loaded from: classes.dex */
    public static class C1437i {

        /* renamed from: a */
        public final long f11377a;

        /* renamed from: b */
        public final String f11378b;

        public C1437i(long j, String str) {
            this.f11377a = j;
            this.f11378b = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1437i) && this.f11377a == ((C1437i) obj).f11377a;
        }

        public int hashCode() {
            return (int) this.f11377a;
        }
    }

    public C1428gk(Context context, String str, int i) {
        super(context, str, context.getResources().getString(R.string.section_playlist_system), R.drawable.ic_playlist4, i);
        this.f11368E = new AbstractC2004l0[]{new C1429a(), new C1430b(), new C1431c(), new C1432d(), new C1433e(), new C1434f(), new C1435g()};
        m14147V(context);
    }

    /* renamed from: Y */
    public static List<tx0> m21551Y(Context context, AbstractC3711yj abstractC3711yj, String str, List<tx0> list) {
        String m24111c = dp0.m24111c(AbstractC3711yj.f33703s.m4425a(Integer.valueOf(abstractC3711yj.m3679I()), abstractC3711yj.m3678J(), null), 10);
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Playlists.Members.getContentUri("external", br1.m25884y(str)), new String[]{"_id", "audio_id", "_data"}, "playlist_id=?", new String[]{str}, m24111c);
        if (m24109e != null) {
            List<tx0> m24060f = dr1.m24060f(m24109e, list);
            m24109e.close();
            return m24060f;
        }
        return new ArrayList();
    }

    /* renamed from: a0 */
    public static lo1<Cursor, String> m21549a0(Context context, sd0 sd0Var, int i) {
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
        String[] strArr2 = {"_id", "name", "_data"};
        return new lo1<>(dp0.m24108f(contentResolver, MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, strArr2, str, strArr, strArr2[1]), m4425a);
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
        return m21549a0(context, m3678J(), this.f33722l);
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: Q */
    public lo1<Cursor, String> mo5055Q(Context context, String str) {
        return m21549a0(context, m3678J(), this.f33722l);
    }

    /* renamed from: Z */
    public void m21550Z(Cursor cursor, int i, C3223uk c3223uk) {
        c3223uk.m8086b0(this, new C1437i(cursor.getLong(0), cursor.getString(1)), m3678J());
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, Boolean.FALSE).booleanValue());
        c3223uk.m8090X(this.f11368E, -1, this);
        c3223uk.f29122x.setVisibility(0);
        c3223uk.m8092V(this.f33719i);
        c3223uk.m8091W(R.drawable.ic_playlist4);
        c3223uk.f29123y.setVisibility(8);
        c3223uk.f29124z.setText(cursor.getString(1));
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(8);
        c3223uk.m8085c0("");
        c3223uk.f29112B.setText("");
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: c */
    public void mo3671c(boolean z) {
        AbstractC3711yj.f33706v.m10862a(Boolean.valueOf(z), C1428gk.class);
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        String str2;
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"name"}, "_id=?", new String[]{str}, null);
        if (m24109e != null) {
            m24109e.moveToFirst();
            str2 = dp0.m24113a(m24109e, 0);
            m24109e.close();
        } else {
            str2 = "";
        }
        C2719qk c2719qk = new C2719qk(context, new C1436h(str), mo3664p(str), str2, 0, this.f33722l, false);
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
        m21550Z(m14148U, i, c3223uk);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Playlists_search);
        sd0VarArr[0] = m3678J();
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: z */
    public boolean mo3658z() {
        return AbstractC3711yj.f33705u.m5753a(C1428gk.class, Boolean.FALSE).booleanValue();
    }
}
