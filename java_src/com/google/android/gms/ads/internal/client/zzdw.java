package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.daaw.k04;
import com.daaw.ry0;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class zzdw {
    public Date g;
    public String h;
    public String k;
    public String l;
    public boolean n;
    public AdInfo o;
    public String p;
    public final HashSet a = new HashSet();
    public final Bundle b = new Bundle();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final Bundle e = new Bundle();
    public final HashSet f = new HashSet();
    public final List i = new ArrayList();
    public int j = -1;
    public int m = -1;
    public int q = 60000;

    @Deprecated
    public final void zzA(Date date) {
        this.g = date;
    }

    public final void zzB(String str) {
        this.h = str;
    }

    @Deprecated
    public final void zzC(int i) {
        this.j = i;
    }

    public final void zzD(int i) {
        this.q = i;
    }

    @Deprecated
    public final void zzE(boolean z) {
        this.n = z;
    }

    public final void zzF(List list) {
        this.i.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                k04.zzj("neighboring content URL should not be null or empty");
            } else {
                this.i.add(str);
            }
        }
    }

    public final void zzG(String str) {
        this.k = str;
    }

    public final void zzH(String str) {
        this.l = str;
    }

    @Deprecated
    public final void zzI(boolean z) {
        this.m = z ? 1 : 0;
    }

    public final void zzq(String str) {
        this.f.add(str);
    }

    public final void zzr(Class cls, Bundle bundle) {
        if (this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        ry0.j(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzs(String str, String str2) {
        this.e.putString(str, str2);
    }

    public final void zzt(String str) {
        this.a.add(str);
    }

    public final void zzu(Class cls, Bundle bundle) {
        this.b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void zzv(NetworkExtras networkExtras) {
        this.c.put(networkExtras.getClass(), networkExtras);
    }

    public final void zzw(String str) {
        this.d.add(str);
    }

    public final void zzx(String str) {
        this.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzy(AdInfo adInfo) {
        this.o = adInfo;
    }

    public final void zzz(String str) {
        this.p = str;
    }
}
