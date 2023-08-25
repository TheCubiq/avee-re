package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C0507a;
import java.util.Collections;
import java.util.List;
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class dy1 {
    /* renamed from: d */
    public static dy1 m23814d(Context context) {
        return ey1.m23004k(context);
    }

    /* renamed from: e */
    public static void m23813e(Context context, C0507a c0507a) {
        ey1.m23010e(context, c0507a);
    }

    /* renamed from: a */
    public abstract qu0 mo23012a(String str);

    /* renamed from: b */
    public final qu0 m23815b(oy1 oy1Var) {
        return mo23011c(Collections.singletonList(oy1Var));
    }

    /* renamed from: c */
    public abstract qu0 mo23011c(List<? extends oy1> list);
}
