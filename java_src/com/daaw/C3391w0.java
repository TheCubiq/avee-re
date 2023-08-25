package com.daaw;

import android.content.Context;
import android.content.Intent;
import com.daaw.AbstractC3274v0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.daaw.w0 */
/* loaded from: classes.dex */
public final class C3391w0 extends AbstractC3274v0<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final C3392a f30741a = new C3392a(null);

    /* renamed from: com.daaw.w0$a */
    /* loaded from: classes.dex */
    public static final class C3392a {
        public C3392a() {
        }

        public /* synthetic */ C3392a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: a */
        public final Intent m6619a(String[] strArr) {
            ug0.m8268f(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            ug0.m8269e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // com.daaw.AbstractC3274v0
    /* renamed from: d */
    public Intent mo5672a(Context context, String[] strArr) {
        ug0.m8268f(context, "context");
        ug0.m8268f(strArr, "input");
        return f30741a.m6619a(strArr);
    }

    @Override // com.daaw.AbstractC3274v0
    /* renamed from: e */
    public AbstractC3274v0.C3275a<Map<String, Boolean>> mo6623b(Context context, String[] strArr) {
        ug0.m8268f(context, "context");
        ug0.m8268f(strArr, "input");
        boolean z = true;
        if (strArr.length == 0) {
            return new AbstractC3274v0.C3275a<>(bn0.m25982d());
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(C3866zk.m2182a(context, strArr[i]) == 0)) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(f31.m22948a(an0.m27335a(strArr.length), 16));
            for (String str : strArr) {
                nv0 m14903a = no1.m14903a(str, Boolean.TRUE);
                linkedHashMap.put(m14903a.m14777c(), m14903a.m14776d());
            }
            return new AbstractC3274v0.C3275a<>(linkedHashMap);
        }
        return null;
    }

    @Override // com.daaw.AbstractC3274v0
    /* renamed from: f */
    public Map<String, Boolean> mo5671c(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return bn0.m25982d();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            return bn0.m25979g(C2937sg.m10374q(C2410o6.m14539e(stringArrayExtra), arrayList));
        }
        return bn0.m25982d();
    }
}
