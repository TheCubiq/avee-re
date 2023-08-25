package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class dy1 {
    public static dy1 d(Context context) {
        return ey1.k(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        ey1.e(context, aVar);
    }

    public abstract qu0 a(String str);

    public final qu0 b(oy1 oy1Var) {
        return c(Collections.singletonList(oy1Var));
    }

    public abstract qu0 c(List<? extends oy1> list);
}
