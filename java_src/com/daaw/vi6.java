package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class vi6 {
    public static zzq a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uh6 uh6Var = (uh6) it.next();
            if (uh6Var.c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(uh6Var.a, uh6Var.b));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static uh6 b(List list, uh6 uh6Var) {
        return (uh6) list.get(0);
    }

    public static uh6 c(zzq zzqVar) {
        return zzqVar.zzi ? new uh6(-3, 0, true) : new uh6(zzqVar.zze, zzqVar.zzb, false);
    }
}
