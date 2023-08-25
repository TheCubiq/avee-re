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

    /* renamed from: g */
    public Date f36117g;

    /* renamed from: h */
    public String f36118h;

    /* renamed from: k */
    public String f36121k;

    /* renamed from: l */
    public String f36122l;

    /* renamed from: n */
    public boolean f36124n;

    /* renamed from: o */
    public AdInfo f36125o;

    /* renamed from: p */
    public String f36126p;

    /* renamed from: a */
    public final HashSet f36111a = new HashSet();

    /* renamed from: b */
    public final Bundle f36112b = new Bundle();

    /* renamed from: c */
    public final HashMap f36113c = new HashMap();

    /* renamed from: d */
    public final HashSet f36114d = new HashSet();

    /* renamed from: e */
    public final Bundle f36115e = new Bundle();

    /* renamed from: f */
    public final HashSet f36116f = new HashSet();

    /* renamed from: i */
    public final List f36119i = new ArrayList();

    /* renamed from: j */
    public int f36120j = -1;

    /* renamed from: m */
    public int f36123m = -1;

    /* renamed from: q */
    public int f36127q = 60000;

    @Deprecated
    public final void zzA(Date date) {
        this.f36117g = date;
    }

    public final void zzB(String str) {
        this.f36118h = str;
    }

    @Deprecated
    public final void zzC(int i) {
        this.f36120j = i;
    }

    public final void zzD(int i) {
        this.f36127q = i;
    }

    @Deprecated
    public final void zzE(boolean z) {
        this.f36124n = z;
    }

    public final void zzF(List list) {
        this.f36119i.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                k04.zzj("neighboring content URL should not be null or empty");
            } else {
                this.f36119i.add(str);
            }
        }
    }

    public final void zzG(String str) {
        this.f36121k = str;
    }

    public final void zzH(String str) {
        this.f36122l = str;
    }

    @Deprecated
    public final void zzI(boolean z) {
        this.f36123m = z ? 1 : 0;
    }

    public final void zzq(String str) {
        this.f36116f.add(str);
    }

    public final void zzr(Class cls, Bundle bundle) {
        if (this.f36112b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f36112b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.f36112b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        ry0.m10830j(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzs(String str, String str2) {
        this.f36115e.putString(str, str2);
    }

    public final void zzt(String str) {
        this.f36111a.add(str);
    }

    public final void zzu(Class cls, Bundle bundle) {
        this.f36112b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void zzv(NetworkExtras networkExtras) {
        this.f36113c.put(networkExtras.getClass(), networkExtras);
    }

    public final void zzw(String str) {
        this.f36114d.add(str);
    }

    public final void zzx(String str) {
        this.f36114d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzy(AdInfo adInfo) {
        this.f36125o = adInfo;
    }

    public final void zzz(String str) {
        this.f36126p = str;
    }
}
