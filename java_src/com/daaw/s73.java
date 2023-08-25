package com.daaw;

import android.os.Bundle;
import com.daaw.xb;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class s73 {
    public static xb a(Bundle bundle, String str, String str2) {
        String format;
        xb xbVar = uz2.j;
        if (bundle == null) {
            format = String.format("%s got null owned items list", str2);
        } else {
            int b = yx2.b(bundle, "BillingClient");
            String h = yx2.h(bundle, "BillingClient");
            xb.a c = xb.c();
            c.c(b);
            c.b(h);
            xb a = c.a();
            if (b != 0) {
                yx2.l("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(b)));
                return a;
            } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    format = String.format("Bundle returned from %s contains null SKUs list.", str2);
                } else if (stringArrayList2 == null) {
                    format = String.format("Bundle returned from %s contains null purchases list.", str2);
                } else if (stringArrayList3 != null) {
                    return uz2.l;
                } else {
                    format = String.format("Bundle returned from %s contains null signatures list.", str2);
                }
            } else {
                format = String.format("Bundle returned from %s doesn't contain required fields.", str2);
            }
        }
        yx2.l("BillingClient", format);
        return xbVar;
    }
}
