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
/* loaded from: classes.dex */
public class vj extends on {
    public l0[] E;

    /* loaded from: classes.dex */
    public class a extends gh0.g.a {
        public a() {
        }

        @Override // com.daaw.gh0.g.a
        public void c(Context context, Object obj, List<tx0> list) {
            vj vjVar = vj.this;
            vj.Z(context, vjVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class b extends gh0.f.a {
        public b() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            vj vjVar = vj.this;
            vj.Z(context, vjVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class c extends gh0.b.a {
        public c() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            vj vjVar = vj.this;
            vj.Z(context, vjVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class d extends gh0.c.a {
        public d() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            vj vjVar = vj.this;
            vj.Z(context, vjVar, "" + ((g) obj).a, list);
        }
    }

    /* loaded from: classes.dex */
    public class e extends gh0.h.a {
        public e() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            vj vjVar = vj.this;
            vj.Z(context, vjVar, "" + ((g) obj).a, list);
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
            return er0.m(vj.Z(dx0.e(), yjVar, this.a, null), null);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public final long a;

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

    public vj(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        this.E = new l0[]{new a(), new b(), new c(), new d(), new e()};
        V(context);
    }

    public static List<tx0> Z(Context context, yj yjVar, String str, List<tx0> list) {
        if (context == null) {
            return new ArrayList();
        }
        String c2 = dp0.c(yj.s.a(Integer.valueOf(yjVar.I()), yjVar.J(), null), 0);
        Cursor e2 = dp0.e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "album_id=?", new String[]{str}, c2);
        if (e2 != null) {
            List<tx0> f2 = dr1.f(e2, list);
            e2.close();
            return f2;
        }
        return new ArrayList();
    }

    public static lo1<Cursor, String> b0(Context context, sd0 sd0Var, int i) {
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
            str = "album LIKE ?";
        }
        return new lo1<>(dp0.f(contentResolver, MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album", "numsongs", "album_art", "artist"}, str, strArr, null), a2);
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i) {
        return new ts1(new d90(this, this, 7, 1), this);
    }

    @Override // com.daaw.yj
    public String H(int i) {
        return U(i).getString(0);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> P(Context context) {
        return b0(context, J(), this.l);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> Q(Context context, String str) {
        return b0(context, J(), this.l);
    }

    public final Uri Y(long j, Context context) {
        if (g2.a) {
            Cursor e2 = dp0.e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "album_id=?", new String[]{j + ""}, null);
            return (e2 == null || !e2.moveToFirst()) ? Uri.EMPTY : ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, e2.getLong(0));
        }
        return Uri.EMPTY;
    }

    public void a0(Cursor cursor, int i, uk ukVar) {
        long j = cursor.getLong(0);
        ukVar.b0(this, new g(j), J());
        ww1<jh0.a, Boolean> ww1Var = yj.x;
        jh0.a<Object> aVar = ukVar.t;
        Boolean bool = Boolean.FALSE;
        ukVar.w.setSelected(ww1Var.a(aVar, bool).booleanValue());
        ukVar.X(this.E, -1, this);
        ukVar.x.setVisibility(0);
        ukVar.V(-1);
        Uri Y = Y(j, ukVar.a.getContext());
        String string = cursor.getString(3);
        if (g2.a || string != null) {
            yj.p.a(new i2(Y, string, null), ukVar.x, Boolean.TRUE, bool);
        } else {
            ukVar.W(R.drawable.placeholderart4);
        }
        ukVar.y.setVisibility(8);
        ukVar.z.setText(cursor.getString(1));
        ukVar.z.setTextColor(this.g);
        ukVar.d0(0);
        ukVar.c0(cursor.getString(3));
        ukVar.B.setText(cursor.getString(2));
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        String str2;
        Cursor e2 = dp0.e(context.getContentResolver(), MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album"}, "_id=?", new String[]{str}, null);
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
        a0(U, i, ukVar);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Albums_search);
        sd0VarArr[0] = J();
    }
}
