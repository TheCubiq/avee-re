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
/* loaded from: classes.dex */
public class bk extends on {
    public l0[] E;

    /* loaded from: classes.dex */
    public class a extends gh0.g.a {
        public a() {
        }

        @Override // com.daaw.gh0.g.a
        public void c(Context context, Object obj, List<tx0> list) {
            bk bkVar = bk.this;
            bk.Y(context, bkVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class b extends gh0.f.a {
        public b() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            bk bkVar = bk.this;
            bk.Y(context, bkVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class c extends gh0.b.a {
        public c() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            bk bkVar = bk.this;
            bk.Y(context, bkVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class d extends gh0.c.a {
        public d() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            bk bkVar = bk.this;
            bk.Y(context, bkVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class e extends gh0.h.a {
        public e() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            bk bkVar = bk.this;
            bk.Y(context, bkVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements r40<yj, er0<tx0, vd0>> {
        public String a;

        public f(String str) {
            this.a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> a(yj yjVar) {
            return er0.m(bk.Y(dx0.e(), yjVar, this.a, null), null);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public long a;

        public g(long j) {
            this.a = j;
        }

        public boolean equals(Object obj) {
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public int hashCode() {
            return (int) this.a;
        }
    }

    public bk(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        this.E = new l0[]{new a(), new b(), new c(), new d(), new e()};
        V(context);
    }

    public static List<tx0> Y(Context context, yj yjVar, String str, List<tx0> list) {
        if (context == null) {
            return new ArrayList();
        }
        String c2 = dp0.c(yj.s.a(Integer.valueOf(yjVar.I()), yjVar.J(), null), 0);
        Cursor e2 = dp0.e(context.getContentResolver(), MediaStore.Audio.Genres.Members.getContentUri("external", br1.y(str)), new String[]{"_id", "audio_id", "_data"}, "genre_id=?", new String[]{str}, c2);
        if (e2 != null) {
            List<tx0> f2 = dr1.f(e2, list);
            e2.close();
            return f2;
        }
        return new ArrayList();
    }

    public static lo1<Cursor, String> a0(Context context, sd0 sd0Var, int i) {
        String str;
        String[] strArr;
        ContentResolver contentResolver = context.getContentResolver();
        String a2 = yj.r.a(Integer.valueOf(i), sd0Var, "");
        if (a2 == null || a2.isEmpty()) {
            str = null;
            strArr = null;
            a2 = "";
        } else {
            strArr = new String[]{"%" + a2 + "%"};
            str = "name LIKE ?";
        }
        return new lo1<>(dp0.f(contentResolver, MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, str, strArr, null), a2);
    }

    public static String b0(Context context, String str) {
        return (str == null || str.isEmpty()) ? context.getString(R.string.unnamed_title) : str;
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i) {
        return new ts1(new d90(this, this, 9, 1), this);
    }

    @Override // com.daaw.yj
    public String H(int i) {
        return U(i).getString(0);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> P(Context context) {
        return a0(context, J(), this.l);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> Q(Context context, String str) {
        return a0(context, J(), this.l);
    }

    public void Z(Cursor cursor, int i, uk ukVar) {
        ukVar.b0(this, new g(cursor.getLong(0)), J());
        ukVar.w.setSelected(yj.x.a(ukVar.t, Boolean.FALSE).booleanValue());
        ukVar.X(this.E, -1, this);
        ukVar.x.setVisibility(8);
        ukVar.U(null);
        ukVar.y.setVisibility(8);
        TextView textView = ukVar.z;
        textView.setText(b0(textView.getContext(), cursor.getString(1)));
        ukVar.z.setTextColor(this.g);
        ukVar.d0(8);
        ukVar.B.setText("");
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        String str2;
        Cursor e2 = dp0.e(context.getContentResolver(), MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, "_id=?", new String[]{str}, null);
        if (e2 != null) {
            e2.moveToFirst();
            str2 = dp0.a(e2, 1);
            e2.close();
        } else {
            str2 = "";
        }
        qk qkVar = new qk(context, new f(str), p(str), str2, 0, this.l, false);
        qkVar.q(this.c);
        return qkVar.G(context, 0);
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i) {
        Cursor U = U(i);
        uk ukVar = (uk) c0Var;
        ukVar.v = i;
        Z(U, i, ukVar);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Genres_search);
        sd0VarArr[0] = J();
    }
}
