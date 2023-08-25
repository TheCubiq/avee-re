package com.daaw;

import android.content.DialogInterface;
/* loaded from: classes.dex */
public final class yp3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ zp3 p;

    public yp3(zp3 zp3Var) {
        this.p = zp3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.p.c("Operation denied by user.");
    }
}
