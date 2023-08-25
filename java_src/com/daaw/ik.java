package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ik extends qk {

    /* loaded from: classes.dex */
    public static class b implements r40<yj, er0<tx0, vd0>> {
        public b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> a(yj yjVar) {
            return er0.m(ik.j0(dx0.e(), yjVar.I(), yjVar.J()), null);
        }
    }

    public ik(Context context, String str, String str2, int i, int i2) {
        super(context, new b(), str, str2, i, i2, false);
    }

    public static List<tx0> j0(Context context, int i, sd0 sd0Var) {
        Cursor e;
        int k = j5.e().k(j5.H);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] strArr = {"_id", "_data"};
        String c = dp0.c(yj.s.a(Integer.valueOf(i), sd0Var, null), 4);
        while (true) {
            e = dp0.e(contentResolver, uri, strArr, "date_added>" + ((System.currentTimeMillis() / 1000) - (604800 * k)), null, c);
            k++;
            if (k <= 8 && (e == null || e.getCount() <= 0)) {
            }
        }
        if (e != null) {
            List<tx0> e2 = dr1.e(e);
            e.close();
            return e2;
        }
        return new ArrayList();
    }
}
