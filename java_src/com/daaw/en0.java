package com.daaw;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes2.dex */
public class en0 {
    /* renamed from: a */
    public static TypedValue m23358a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m23357b(Context context, int i, boolean z) {
        TypedValue m23358a = m23358a(context, i);
        return (m23358a == null || m23358a.type != 18) ? z : m23358a.data != 0;
    }

    /* renamed from: c */
    public static int m23356c(Context context, int i, String str) {
        TypedValue m23358a = m23358a(context, i);
        if (m23358a != null) {
            return m23358a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static int m23355d(View view, int i) {
        return m23356c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
