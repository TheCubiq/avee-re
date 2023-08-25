package com.daaw;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class u12 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static u12 m8638b(Activity activity, Intent intent, int i) {
        return new i12(intent, activity, i);
    }

    /* renamed from: c */
    public static u12 m8637c(pj0 pj0Var, Intent intent, int i) {
        return new t12(intent, pj0Var, 2);
    }

    /* renamed from: a */
    public abstract void mo8639a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo8639a();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }
}
