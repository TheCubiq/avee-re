package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.ik */
/* loaded from: classes.dex */
public class C1713ik extends C2719qk {

    /* renamed from: com.daaw.ik$b */
    /* loaded from: classes.dex */
    public static class C1715b implements r40<AbstractC3711yj, er0<tx0, vd0>> {
        public C1715b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> mo5050a(AbstractC3711yj abstractC3711yj) {
            return er0.m23270m(C1713ik.m19744j0(dx0.m23837e(), abstractC3711yj.m3679I(), abstractC3711yj.m3678J()), null);
        }
    }

    public C1713ik(Context context, String str, String str2, int i, int i2) {
        super(context, new C1715b(), str, str2, i, i2, false);
    }

    /* renamed from: j0 */
    public static List<tx0> m19744j0(Context context, int i, sd0 sd0Var) {
        Cursor m24109e;
        int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14272H);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] strArr = {"_id", "_data"};
        String m24111c = dp0.m24111c(AbstractC3711yj.f33703s.m4425a(Integer.valueOf(i), sd0Var, null), 4);
        while (true) {
            m24109e = dp0.m24109e(contentResolver, uri, strArr, "date_added>" + ((System.currentTimeMillis() / 1000) - (604800 * m18916k)), null, m24111c);
            m18916k++;
            if (m18916k <= 8 && (m24109e == null || m24109e.getCount() <= 0)) {
            }
        }
        if (m24109e != null) {
            List<tx0> m24061e = dr1.m24061e(m24109e);
            m24109e.close();
            return m24061e;
        }
        return new ArrayList();
    }
}
