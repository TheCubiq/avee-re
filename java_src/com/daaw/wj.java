package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class wj extends qk {

    /* loaded from: classes.dex */
    public static class b implements r40<yj, er0<tx0, vd0>> {
        public b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> a(yj yjVar) {
            return er0.m(wj.j0(dx0.e(), yjVar.I(), yjVar.J()), null);
        }
    }

    public wj(Context context, String str, String str2, int i, int i2) {
        super(context, new b(), str, str2, i, i2, false);
    }

    public static List<tx0> j0(Context context, int i, sd0 sd0Var) {
        if (context == null) {
            return new ArrayList();
        }
        Cursor e = dp0.e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, null, null, dp0.c(yj.s.a(Integer.valueOf(i), sd0Var, null), 0));
        ArrayList arrayList = new ArrayList();
        if (e != null) {
            dr1.f(e, arrayList);
        }
        return arrayList;
    }
}
