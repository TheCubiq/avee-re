package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;
@Deprecated
/* loaded from: classes.dex */
public final class CustomEventExtras {
    public final HashMap a = new HashMap();

    public Object getExtra(String str) {
        return this.a.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.a.put(str, obj);
    }
}
