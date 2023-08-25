package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.ts1;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class on extends yj implements ts1.a {
    public WeakReference<oc0> C;
    public Cursor D;

    public on(Context context, String str, String str2, int i, int i2) {
        super(context, str, new tr1(str2), i, i2);
        this.C = new WeakReference<>(null);
    }

    public on(Context context, String str, String str2, int i, int i2, WeakReference<wc0.b> weakReference) {
        super(context, str, new tr1(str2), i, i2, weakReference);
        this.C = new WeakReference<>(null);
    }

    @Override // com.daaw.yj
    public boolean A() {
        oc0 T = T();
        if (T != null) {
            T.a();
            return false;
        }
        return false;
    }

    public abstract lo1<Cursor, String> P(Context context);

    public lo1<Cursor, String> Q(Context context, String str) {
        return P(context);
    }

    public int R(int i, String str) {
        this.D.moveToFirst();
        while (!this.D.isAfterLast()) {
            if (this.D.getString(i).equals(str)) {
                return this.D.getPosition();
            }
            this.D.moveToNext();
        }
        return -1;
    }

    public int S(String str, String str2) {
        return R(this.D.getColumnIndex(str), str2);
    }

    public oc0 T() {
        return this.C.get();
    }

    public Cursor U(int i) {
        this.D.moveToPosition(i);
        return this.D;
    }

    public void V(Context context) {
        lo1<Cursor, String> P = P(context);
        W(P.a, P.b);
    }

    public void W(Cursor cursor, String str) {
        if (B(str, true)) {
            return;
        }
        dp0.b(this.D);
        q6.f(cursor);
        this.D = cursor;
        oc0 T = T();
        if (T != null) {
            T.a();
        }
    }

    @Override // com.daaw.yj, com.daaw.wc0, com.daaw.ts1.a
    public int a() {
        return this.D.getCount();
    }

    @Override // com.daaw.ts1.a
    public void f(oc0 oc0Var) {
        this.C = new WeakReference<>(oc0Var);
    }

    @Override // com.daaw.ts1.a
    public void j(int i, int i2, List<Integer> list) {
    }

    @Override // com.daaw.ts1.a
    public void k() {
    }

    @Override // com.daaw.wc0
    public void o(Context context, String str) {
        lo1<Cursor, String> Q = Q(context, str);
        if (Q != null) {
            W(Q.a, Q.b);
        }
    }

    @Override // com.daaw.ts1.a
    public RecyclerView.c0 r(ViewGroup viewGroup, int i) {
        return gt1.a(viewGroup.getContext(), viewGroup, i, this);
    }

    @Override // com.daaw.ts1.a
    public int t(int i) {
        return i;
    }
}
