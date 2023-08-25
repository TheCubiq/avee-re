package com.daaw;

import android.content.Context;
import android.content.Intent;
import com.daaw.v0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class w0 extends v0<String[], Map<String, Boolean>> {
    public static final a a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            ug0.f(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            ug0.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // com.daaw.v0
    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        ug0.f(context, "context");
        ug0.f(strArr, "input");
        return a.a(strArr);
    }

    @Override // com.daaw.v0
    /* renamed from: e */
    public v0.a<Map<String, Boolean>> b(Context context, String[] strArr) {
        ug0.f(context, "context");
        ug0.f(strArr, "input");
        boolean z = true;
        if (strArr.length == 0) {
            return new v0.a<>(bn0.d());
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(zk.a(context, strArr[i]) == 0)) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(f31.a(an0.a(strArr.length), 16));
            for (String str : strArr) {
                nv0 a2 = no1.a(str, Boolean.TRUE);
                linkedHashMap.put(a2.c(), a2.d());
            }
            return new v0.a<>(linkedHashMap);
        }
        return null;
    }

    @Override // com.daaw.v0
    /* renamed from: f */
    public Map<String, Boolean> c(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return bn0.d();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            return bn0.g(sg.q(o6.e(stringArrayExtra), arrayList));
        }
        return bn0.d();
    }
}
