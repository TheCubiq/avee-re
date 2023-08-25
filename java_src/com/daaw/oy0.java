package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class oy0 {
    public static final vw1<Boolean> a = new vw1<>();
    public static final ww1<Integer, Boolean> b = new ww1<>();
    public static final ww1<Integer, Boolean> c = new ww1<>();
    public static final ww1<Integer, Boolean> d = new ww1<>();
    public static final vw1<Boolean> e = new vw1<>();
    public static Drawable f = null;

    public static Drawable a() {
        Context e2;
        if (a.a(Boolean.FALSE).booleanValue()) {
            return null;
        }
        if (f == null && (e2 = dx0.e()) != null) {
            f = zk.e(e2, R.drawable.coinb3_s);
        }
        return f;
    }
}
