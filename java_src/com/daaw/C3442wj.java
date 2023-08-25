package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.wj */
/* loaded from: classes.dex */
public class C3442wj extends C2719qk {

    /* renamed from: com.daaw.wj$b */
    /* loaded from: classes.dex */
    public static class C3444b implements r40<AbstractC3711yj, er0<tx0, vd0>> {
        public C3444b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> mo5050a(AbstractC3711yj abstractC3711yj) {
            return er0.m23270m(C3442wj.m6054j0(dx0.m23837e(), abstractC3711yj.m3679I(), abstractC3711yj.m3678J()), null);
        }
    }

    public C3442wj(Context context, String str, String str2, int i, int i2) {
        super(context, new C3444b(), str, str2, i, i2, false);
    }

    /* renamed from: j0 */
    public static List<tx0> m6054j0(Context context, int i, sd0 sd0Var) {
        if (context == null) {
            return new ArrayList();
        }
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, null, null, dp0.m24111c(AbstractC3711yj.f33703s.m4425a(Integer.valueOf(i), sd0Var, null), 0));
        ArrayList arrayList = new ArrayList();
        if (m24109e != null) {
            dr1.m24060f(m24109e, arrayList);
        }
        return arrayList;
    }
}
