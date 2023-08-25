package com.daaw;

import android.content.Context;
import android.os.Process;
/* loaded from: classes.dex */
public final class hw0 {
    /* renamed from: a */
    public static int m20365a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m21030c = C1502h5.m21030c(str);
        if (m21030c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i2 && pt0.m13160a(context.getPackageName(), str2) ? C1502h5.m21032a(context, i2, m21030c, str2) : C1502h5.m21031b(context, m21030c, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m20364b(Context context, String str) {
        return m20365a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
