package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;
import java.util.Objects;
/* renamed from: com.daaw.lc */
/* loaded from: classes.dex */
public class C2026lc {

    /* renamed from: b */
    public static volatile C2026lc f17236b;

    /* renamed from: a */
    public Toast f17237a;

    public C2026lc(Toast toast) {
        Objects.requireNonNull(toast, "Boast.Boast(Toast) requires a non-null parameter.");
        this.f17237a = toast;
    }

    @SuppressLint({"ShowToast"})
    /* renamed from: b */
    public static C2026lc m17057b(Context context, int i) {
        return new C2026lc(Toast.makeText(context, i, 0));
    }

    @SuppressLint({"ShowToast"})
    /* renamed from: c */
    public static C2026lc m17056c(Context context, CharSequence charSequence) {
        return new C2026lc(Toast.makeText(context, charSequence, 0));
    }

    @SuppressLint({"ShowToast"})
    /* renamed from: d */
    public static C2026lc m17055d(Context context, CharSequence charSequence, int i) {
        return new C2026lc(Toast.makeText(context, charSequence, i));
    }

    /* renamed from: a */
    public void m17058a() {
        this.f17237a.cancel();
    }

    /* renamed from: e */
    public void m17054e() {
        m17053f(true);
    }

    /* renamed from: f */
    public void m17053f(boolean z) {
        if (z && f17236b != null) {
            f17236b.m17058a();
        }
        f17236b = this;
        this.f17237a.show();
    }
}
