package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class oy0 {

    /* renamed from: a */
    public static final vw1<Boolean> f22097a = new vw1<>();

    /* renamed from: b */
    public static final ww1<Integer, Boolean> f22098b = new ww1<>();

    /* renamed from: c */
    public static final ww1<Integer, Boolean> f22099c = new ww1<>();

    /* renamed from: d */
    public static final ww1<Integer, Boolean> f22100d = new ww1<>();

    /* renamed from: e */
    public static final vw1<Boolean> f22101e = new vw1<>();

    /* renamed from: f */
    public static Drawable f22102f = null;

    /* renamed from: a */
    public static Drawable m13871a() {
        Context m23837e;
        if (f22097a.m6692a(Boolean.FALSE).booleanValue()) {
            return null;
        }
        if (f22102f == null && (m23837e = dx0.m23837e()) != null) {
            f22102f = C3866zk.m2178e(m23837e, R.drawable.coinb3_s);
        }
        return f22102f;
    }
}
