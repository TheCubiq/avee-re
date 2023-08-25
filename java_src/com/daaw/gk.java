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
/* loaded from: classes.dex */
public class gk extends on {
    public l0[] E;

    /* loaded from: classes.dex */
    public class a extends gh0.g.a {
        public a() {
        }

        @Override // com.daaw.gh0.g.a
        public void c(Context context, Object obj, List<tx0> list) {
            gk gkVar = gk.this;
            gk.Y(context, gkVar, "" + ((i) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class b extends gh0.f.a {
        public b() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            gk gkVar = gk.this;
            gk.Y(context, gkVar, "" + ((i) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class c extends gh0.b.a {
        public c() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            gk gkVar = gk.this;
            gk.Y(context, gkVar, "" + ((i) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class d extends gh0.c.a {
        public d() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            gk gkVar = gk.this;
            gk.Y(context, gkVar, "" + ((i) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class e extends gh0.h.a {
        public e() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            gk gkVar = gk.this;
            gk.Y(context, gkVar, "" + ((i) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class f extends eh0.c.a {
        public f() {
        }

        @Override // com.daaw.eh0.c.a
        public void c(Context context, Object obj, er0<Long, String> er0Var) {
            i iVar = (i) obj;
            er0Var.f(Long.valueOf(iVar.a), iVar.b);
        }
    }

    /* loaded from: classes.dex */
    public class g extends eh0.a.AbstractC0049a {
        public g() {
        }

        @Override // com.daaw.eh0.a.AbstractC0049a
        public void c(Context context, Object obj, er0<Long, String> er0Var) {
            i iVar = (i) obj;
            er0Var.f(Long.valueOf(iVar.a), iVar.b);
        }
    }

    /* loaded from: classes.dex */
    public static class h implements r40<yj, er0<tx0, vd0>> {
        public String a;

        public h(String str) {
            this.a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> a(yj yjVar) {
            return er0.m(gk.Y(dx0.e(), yjVar, this.a, null), null);
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public final long a;
        public final String b;

        public i(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public int hashCode() {
            return (int) this.a;
        }
    }

    public gk(Context context, String str, int i2) {
        super(context, str, context.getResources().getString(R.string.section_playlist_system), R.drawable.ic_playlist4, i2);
        this.E = new l0[]{new a(), new b(), new c(), new d(), new e(), new f(), new g()};
        V(context);
    }

    public static List<tx0> Y(Context context, yj yjVar, String str, List<tx0> list) {
        String c2 = dp0.c(yj.s.a(Integer.valueOf(yjVar.I()), yjVar.J(), null), 10);
        Cursor e2 = dp0.e(context.getContentResolver(), MediaStore.Audio.Playlists.Members.getContentUri("external", br1.y(str)), new String[]{"_id", "audio_id", "_data"}, "playlist_id=?", new String[]{str}, c2);
        if (e2 != null) {
            List<tx0> f2 = dr1.f(e2, list);
            e2.close();
            return f2;
        }
        return new ArrayList();
    }

    public static lo1<Cursor, String> a0(Context context, sd0 sd0Var, int i2) {
        String str;
        String[] strArr;
        ContentResolver contentResolver = context.getContentResolver();
        String a2 = yj.r.a(Integer.valueOf(i2), sd0Var, "");
        if (a2 == null || a2.isEmpty()) {
            str = null;
            strArr = null;
            a2 = "";
        } else {
            strArr = new String[]{"%" + a2 + "%"};
            str = "name LIKE ?";
        }
        String[] strArr2 = {"_id", "name", "_data"};
        return new lo1<>(dp0.f(contentResolver, MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, strArr2, str, strArr, strArr2[1]), a2);
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i2) {
        return new ts1(new d90(this, this, 6, 1), this);
    }

    @Override // com.daaw.yj
    public String H(int i2) {
        return U(i2).getString(0);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> P(Context context) {
        return a0(context, J(), this.l);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> Q(Context context, String str) {
        return a0(context, J(), this.l);
    }

    public void Z(Cursor cursor, int i2, uk ukVar) {
        ukVar.b0(this, new i(cursor.getLong(0), cursor.getString(1)), J());
        ukVar.w.setSelected(yj.x.a(ukVar.t, Boolean.FALSE).booleanValue());
        ukVar.X(this.E, -1, this);
        ukVar.x.setVisibility(0);
        ukVar.V(this.i);
        ukVar.W(R.drawable.ic_playlist4);
        ukVar.y.setVisibility(8);
        ukVar.z.setText(cursor.getString(1));
        ukVar.z.setTextColor(this.g);
        ukVar.d0(8);
        ukVar.c0("");
        ukVar.B.setText("");
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void c(boolean z) {
        yj.v.a(Boolean.valueOf(z), gk.class);
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        String str2;
        Cursor e2 = dp0.e(context.getContentResolver(), MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"name"}, "_id=?", new String[]{str}, null);
        if (e2 != null) {
            e2.moveToFirst();
            str2 = dp0.a(e2, 0);
            e2.close();
        } else {
            str2 = "";
        }
        qk qkVar = new qk(context, new h(str), p(str), str2, 0, this.l, false);
        qkVar.q(this.c);
        return qkVar.G(context, 0);
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i2) {
        return 0;
    }

    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i2) {
        Cursor U = U(i2);
        uk ukVar = (uk) c0Var;
        ukVar.v = i2;
        Z(U, i2, ukVar);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Playlists_search);
        sd0VarArr[0] = J();
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public boolean z() {
        return yj.u.a(gk.class, Boolean.FALSE).booleanValue();
    }
}
