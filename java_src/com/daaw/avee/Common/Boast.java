package com.daaw.avee.Common;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
/* loaded from: classes.dex */
public class Boast {
    private static volatile Boast globalBoast;
    private Toast internalToast;

    private Boast(Toast toast) {
        if (toast == null) {
            throw new NullPointerException("Boast.Boast(Toast) requires a non-null parameter.");
        }
        this.internalToast = toast;
    }

    public static Boast makeText(Context context, CharSequence charSequence, int i) {
        return new Boast(Toast.makeText(context, charSequence, i));
    }

    public static Boast makeText(Context context, int i, int i2) throws Resources.NotFoundException {
        return new Boast(Toast.makeText(context, i, i2));
    }

    public static Boast makeText(Context context, CharSequence charSequence) {
        return new Boast(Toast.makeText(context, charSequence, 0));
    }

    public static Boast makeText(Context context, int i) throws Resources.NotFoundException {
        return new Boast(Toast.makeText(context, i, 0));
    }

    public static void showText(Context context, CharSequence charSequence, int i) {
        makeText(context, charSequence, i).show();
    }

    public static void showText(Context context, int i, int i2) throws Resources.NotFoundException {
        makeText(context, i, i2).show();
    }

    public static void showText(Context context, CharSequence charSequence) {
        makeText(context, charSequence, 0).show();
    }

    public static void showText(Context context, int i) throws Resources.NotFoundException {
        makeText(context, i, 0).show();
    }

    public void cancel() {
        this.internalToast.cancel();
    }

    public void show() {
        show(true);
    }

    public void show(boolean z) {
        if (z && globalBoast != null) {
            globalBoast.cancel();
        }
        globalBoast = this;
        this.internalToast.show();
    }
}
