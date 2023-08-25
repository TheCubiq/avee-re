package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.ih0;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class lk extends n10<sc1, List<sc1>> {
    public static kw1<uk, sc1, Boolean> L = new kw1<>();
    public l0[] K;

    /* loaded from: classes.dex */
    public class a extends ih0.a.b {
        public a() {
        }

        @Override // com.daaw.ih0.a.b
        public ir1<List<tx0>> c(Context context, Object obj) {
            b bVar = (b) obj;
            return tc1.e().j(bVar.b.c(), bVar.b.d());
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public sc1 b;

        public b(sc1 sc1Var, int i) {
            this.a = i;
            this.b = sc1Var;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public lk(Context context, r40<yj, List<sc1>> r40Var, String str, me0<String> me0Var, int i, int i2) {
        super(context, r40Var, new f6(), str, me0Var, i, new r91(context), i2);
        this.K = new l0[]{new a()};
    }

    public static /* synthetic */ void Y(uk ukVar) {
    }

    public static void Z(yj yjVar, er0<tx0, sc1> er0Var) {
        Comparator d = tf1.d(yj.s.a(Integer.valueOf(yjVar.I()), yjVar.J(), null), 10);
        if (d != null) {
            try {
                Collections.sort(er0Var, d);
            } catch (Exception unused) {
                lz1.c("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
            }
        }
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i) {
        return new ts1(new d90(this, this, 14, 15), this);
    }

    @Override // com.daaw.yj
    public String H(int i) {
        return "";
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        return null;
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void g(al alVar, int i) {
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.wc0
    public void o(Context context, String str) {
        W(context, str, new r91(context));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i) {
        sc1 sc1Var = (sc1) S().get(i);
        uk ukVar = (uk) c0Var;
        ukVar.v = i;
        vw1<Boolean> vw1Var = yj.q;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = vw1Var.a(bool).booleanValue();
        ukVar.b0(this, new b(sc1Var, i), J());
        ukVar.u = sc1Var.b;
        ukVar.w.setSelected(yj.x.a(ukVar.t, bool).booleanValue());
        ukVar.Y(this.K, 0, this, false, false, new e0() { // from class: com.daaw.kk
            @Override // com.daaw.e0
            public final void a(Object obj) {
                lk.Y((uk) obj);
            }
        });
        TextView textView = ukVar.y;
        if (booleanValue) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            ukVar.y.setText(String.format(Locale.getDefault(), "%d.", Integer.valueOf(1 + i)));
        }
        ukVar.x.setVisibility(0);
        ukVar.V(-1);
        i2 i2Var = new i2(Uri.parse(sc1Var.b), "abc", sc1Var.a);
        new g2().t(i2Var.a, i2Var.b, i2Var.c, ukVar.x, true);
        ukVar.z.setText(sc1Var.a);
        ukVar.d0(0);
        ukVar.c0(sc1Var.b());
        ukVar.B.setText("");
        ukVar.R();
        L.a(ukVar, sc1Var, Boolean.valueOf(booleanValue));
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        sd0VarArr[0] = J();
    }
}
