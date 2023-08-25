package com.daaw;

import android.content.DialogInterface;
/* loaded from: classes.dex */
public final class dq3 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    public final /* synthetic */ eq3 f7626p;

    public dq3(eq3 eq3Var) {
        this.f7626p = eq3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7626p.m20488c("User canceled the download.");
    }
}
