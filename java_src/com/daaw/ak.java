package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.dh0;
import com.daaw.gh0;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ak extends on {
    public l0[] E;
    public l0[] F;

    /* loaded from: classes.dex */
    public class a extends gh0.g.a {
        public a() {
        }

        @Override // com.daaw.gh0.g.a
        public void c(Context context, Object obj, List<tx0> list) {
            ak.this.Y(context, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class b extends gh0.f.a {
        public b() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            ak.this.Y(context, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class c extends gh0.b.a {
        public c() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            ak.this.Y(context, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class d extends gh0.c.a {
        public d() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            ak.this.Y(context, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class e extends gh0.h.a {
        public e() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            ak.this.Y(context, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class f extends dh0.b.a {
        public f() {
        }

        @Override // com.daaw.dh0.b.a
        public void c(Context context, Object obj, er0<String, String> er0Var) {
            h hVar = (h) obj;
            er0Var.f(hVar.a, hVar.b);
        }
    }

    /* loaded from: classes.dex */
    public class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j5.e().d();
            ak.this.W(ak.b0(context, null).a, null);
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public final String a;
        public final String b;

        public h(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public ak(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        l0[] l0VarArr = {new a(), new b(), new c(), new d(), new e(), new f()};
        this.E = l0VarArr;
        this.F = (l0[]) Arrays.copyOf(l0VarArr, l0VarArr.length - 1);
        V(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addDataScheme("file");
        context.registerReceiver(new g(), intentFilter);
    }

    public static int Z(String str) {
        return str != null ? !str.equals("-01") ? !str.equals("-03") ? str.startsWith("-02") ? R.drawable.ic_sd_card : R.drawable.ic_folder4 : R.drawable.ic_phone : R.drawable.ic_usb : R.drawable.ic_folder4;
    }

    public static lo1<Cursor, String> b0(Context context, sd0 sd0Var) {
        er0<String, String> G = j5.e().G(context);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "path", "icon", "name"});
        Iterator<lo1<String, String>> it = G.iterator();
        while (it.hasNext()) {
            lo1<String, String> next = it.next();
            String[] split = next.b.split(":");
            String[] strArr = new String[4];
            strArr[0] = next.a;
            strArr[1] = split[0];
            strArr[2] = "" + Z(next.a);
            strArr[3] = split.length > 1 ? split[1] : null;
            matrixCursor.addRow(strArr);
        }
        return new lo1<>(matrixCursor, "");
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i) {
        return new ts1(new d90(this, this, 5, 1), this);
    }

    @Override // com.daaw.yj
    public String H(int i) {
        return U(i).getString(0);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> P(Context context) {
        return b0(context, J());
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> Q(Context context, String str) {
        return b0(context, J());
    }

    public List<tx0> Y(Context context, String str, List<tx0> list) {
        return zj.c0(context, this.l, J(), str, list);
    }

    public void a0(Cursor cursor, int i, uk ukVar) {
        ukVar.b0(this, new h(U(i).getString(0), U(i).getString(1)), J());
        String string = cursor.getString(0);
        boolean startsWith = string.startsWith("-");
        ukVar.w.setSelected(yj.x.a(ukVar.t, Boolean.FALSE).booleanValue());
        ukVar.X(startsWith ? this.F : this.E, -1, this);
        ukVar.x.setVisibility(0);
        ukVar.V(this.i);
        ukVar.W(cursor.getInt(2));
        ukVar.y.setVisibility(8);
        String string2 = cursor.getString(1);
        ukVar.z.setText(cursor.isNull(3) ? dl.c(string, string2, ukVar.a.getContext()) : cursor.getString(3));
        ukVar.z.setTextColor(this.g);
        ukVar.d0(0);
        ukVar.c0(string2);
        ukVar.B.setText("");
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        int S = S("_id", str);
        String string = S >= 0 ? U(S).getString(1) : "";
        if (string.length() > 0) {
            zj zjVar = new zj(context, new File(string), p(str), this.l);
            zjVar.q(this.c);
            return zjVar.F(context);
        }
        return null;
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
}
