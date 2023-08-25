package com.daaw;

import android.content.Context;
import android.os.Handler;
import com.daaw.avee.comp.playback.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class or0 extends or {
    public e.b e;
    public ne0 f;
    public int g;

    public or0(e.b bVar, ne0 ne0Var, int i, Context context, int i2) {
        super(context, i2);
        this.e = bVar;
        this.f = ne0Var;
        this.g = i;
    }

    @Override // com.daaw.or
    public void c(Context context, yu<i40> yuVar, m7[] m7VarArr, Handler handler, n7 n7Var, int i, ArrayList<a41> arrayList) {
        arrayList.add(new nr0(this.f, this.g, new WeakReference(null), context, eo0.a, yuVar, true, handler, n7Var, g7.a(context), m7VarArr));
    }
}
