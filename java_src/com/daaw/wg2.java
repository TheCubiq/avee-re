package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class wg2 extends eg2 {
    public wg2(vg2 vg2Var, SSLSocketFactory sSLSocketFactory) {
    }

    public static List a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new ef2((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }
}
