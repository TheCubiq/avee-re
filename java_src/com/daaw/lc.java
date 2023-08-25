package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;
import java.util.Objects;
/* loaded from: classes.dex */
public class lc {
    public static volatile lc b;
    public Toast a;

    public lc(Toast toast) {
        Objects.requireNonNull(toast, "Boast.Boast(Toast) requires a non-null parameter.");
        this.a = toast;
    }

    @SuppressLint({"ShowToast"})
    public static lc b(Context context, int i) {
        return new lc(Toast.makeText(context, i, 0));
    }

    @SuppressLint({"ShowToast"})
    public static lc c(Context context, CharSequence charSequence) {
        return new lc(Toast.makeText(context, charSequence, 0));
    }

    @SuppressLint({"ShowToast"})
    public static lc d(Context context, CharSequence charSequence, int i) {
        return new lc(Toast.makeText(context, charSequence, i));
    }

    public void a() {
        this.a.cancel();
    }

    public void e() {
        f(true);
    }

    public void f(boolean z) {
        if (z && b != null) {
            b.a();
        }
        b = this;
        this.a.show();
    }
}
