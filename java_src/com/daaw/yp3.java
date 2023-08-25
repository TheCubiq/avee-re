package com.daaw;

import android.content.DialogInterface;
/* loaded from: classes.dex */
public final class yp3 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    public final /* synthetic */ zp3 f33925p;

    public yp3(zp3 zp3Var) {
        this.f33925p = zp3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f33925p.m20488c("Operation denied by user.");
    }
}
