package com.daaw;

import android.content.DialogInterface;
/* loaded from: classes.dex */
public final class dq3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ eq3 p;

    public dq3(eq3 eq3Var) {
        this.p = eq3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.p.c("User canceled the download.");
    }
}
