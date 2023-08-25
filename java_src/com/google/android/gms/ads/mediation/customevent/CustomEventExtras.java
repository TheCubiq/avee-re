package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;
@Deprecated
/* loaded from: classes.dex */
public final class CustomEventExtras {

    /* renamed from: a */
    public final HashMap f36442a = new HashMap();

    public Object getExtra(String str) {
        return this.f36442a.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.f36442a.put(str, obj);
    }
}
