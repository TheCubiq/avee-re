package com.daaw;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public class bd4 {

    /* renamed from: a */
    public final int f4725a;

    /* renamed from: b */
    public final int f4726b;

    /* renamed from: c */
    public final int f4727c;

    /* renamed from: d */
    public final int f4728d;

    /* renamed from: e */
    public int f4729e;

    /* renamed from: f */
    public int f4730f;

    /* renamed from: g */
    public boolean f4731g;

    /* renamed from: h */
    public final y17 f4732h;

    /* renamed from: i */
    public final y17 f4733i;

    /* renamed from: j */
    public final int f4734j;

    /* renamed from: k */
    public final int f4735k;

    /* renamed from: l */
    public final y17 f4736l;

    /* renamed from: m */
    public y17 f4737m;

    /* renamed from: n */
    public int f4738n;

    /* renamed from: o */
    public final HashMap f4739o;

    /* renamed from: p */
    public final HashSet f4740p;

    @Deprecated
    public bd4() {
        this.f4725a = Integer.MAX_VALUE;
        this.f4726b = Integer.MAX_VALUE;
        this.f4727c = Integer.MAX_VALUE;
        this.f4728d = Integer.MAX_VALUE;
        this.f4729e = Integer.MAX_VALUE;
        this.f4730f = Integer.MAX_VALUE;
        this.f4731g = true;
        this.f4732h = y17.m4260u();
        this.f4733i = y17.m4260u();
        this.f4734j = Integer.MAX_VALUE;
        this.f4735k = Integer.MAX_VALUE;
        this.f4736l = y17.m4260u();
        this.f4737m = y17.m4260u();
        this.f4738n = 0;
        this.f4739o = new HashMap();
        this.f4740p = new HashSet();
    }

    public bd4(de4 de4Var) {
        this.f4725a = Integer.MAX_VALUE;
        this.f4726b = Integer.MAX_VALUE;
        this.f4727c = Integer.MAX_VALUE;
        this.f4728d = Integer.MAX_VALUE;
        this.f4729e = de4Var.f7004i;
        this.f4730f = de4Var.f7005j;
        this.f4731g = de4Var.f7006k;
        this.f4732h = de4Var.f7007l;
        this.f4733i = de4Var.f7009n;
        this.f4734j = Integer.MAX_VALUE;
        this.f4735k = Integer.MAX_VALUE;
        this.f4736l = de4Var.f7013r;
        this.f4737m = de4Var.f7014s;
        this.f4738n = de4Var.f7015t;
        this.f4740p = new HashSet(de4Var.f7021z);
        this.f4739o = new HashMap(de4Var.f7020y);
    }

    /* renamed from: d */
    public final bd4 m26207d(Context context) {
        CaptioningManager captioningManager;
        if ((it5.f13991a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f4738n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f4737m = y17.m4259v(it5.m19382n(locale));
            }
        }
        return this;
    }

    /* renamed from: e */
    public bd4 mo23876e(int i, int i2, boolean z) {
        this.f4729e = i;
        this.f4730f = i2;
        this.f4731g = true;
        return this;
    }
}
