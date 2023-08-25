package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* renamed from: com.daaw.tx */
/* loaded from: classes.dex */
public class DialogFragmentC3141tx extends DialogFragment {

    /* renamed from: p */
    public Dialog f28182p;

    /* renamed from: q */
    public DialogInterface.OnCancelListener f28183q;

    /* renamed from: r */
    public Dialog f28184r;

    /* renamed from: a */
    public static DialogFragmentC3141tx m8752a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC3141tx dialogFragmentC3141tx = new DialogFragmentC3141tx();
        Dialog dialog2 = (Dialog) ry0.m10829k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC3141tx.f28182p = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC3141tx.f28183q = onCancelListener;
        }
        return dialogFragmentC3141tx;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f28183q;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f28182p;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f28184r == null) {
                this.f28184r = new AlertDialog.Builder((Context) ry0.m10830j(getActivity())).create();
            }
            return this.f28184r;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
