package com.daaw;

import android.os.Bundle;
import com.daaw.C3518xb;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class s73 {
    /* renamed from: a */
    public static C3518xb m10596a(Bundle bundle, String str, String str2) {
        String format;
        C3518xb c3518xb = uz2.f29676j;
        if (bundle == null) {
            format = String.format("%s got null owned items list", str2);
        } else {
            int m3104b = yx2.m3104b(bundle, "BillingClient");
            String m3098h = yx2.m3098h(bundle, "BillingClient");
            C3518xb.C3519a m5323c = C3518xb.m5323c();
            m5323c.m5318c(m3104b);
            m5323c.m5319b(m3098h);
            C3518xb m5320a = m5323c.m5320a();
            if (m3104b != 0) {
                yx2.m3094l("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(m3104b)));
                return m5320a;
            } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    format = String.format("Bundle returned from %s contains null SKUs list.", str2);
                } else if (stringArrayList2 == null) {
                    format = String.format("Bundle returned from %s contains null purchases list.", str2);
                } else if (stringArrayList3 != null) {
                    return uz2.f29678l;
                } else {
                    format = String.format("Bundle returned from %s contains null signatures list.", str2);
                }
            } else {
                format = String.format("Bundle returned from %s doesn't contain required fields.", str2);
            }
        }
        yx2.m3094l("BillingClient", format);
        return c3518xb;
    }
}
