package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes.dex */
public class tx extends DialogFragment {
    public Dialog p;
    public DialogInterface.OnCancelListener q;
    public Dialog r;

    public static tx a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        tx txVar = new tx();
        Dialog dialog2 = (Dialog) ry0.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        txVar.p = dialog2;
        if (onCancelListener != null) {
            txVar.q = onCancelListener;
        }
        return txVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.q;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.p;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.r == null) {
                this.r = new AlertDialog.Builder((Context) ry0.j(getActivity())).create();
            }
            return this.r;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
