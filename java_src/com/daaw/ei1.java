package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
/* loaded from: classes.dex */
public class ei1 extends ot {
    public Dialog G0;
    public DialogInterface.OnCancelListener H0;
    public Dialog I0;

    public static ei1 V1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ei1 ei1Var = new ei1();
        Dialog dialog2 = (Dialog) ry0.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        ei1Var.G0 = dialog2;
        if (onCancelListener != null) {
            ei1Var.H0 = onCancelListener;
        }
        return ei1Var;
    }

    @Override // com.daaw.ot
    public Dialog N1(Bundle bundle) {
        Dialog dialog = this.G0;
        if (dialog == null) {
            S1(false);
            if (this.I0 == null) {
                this.I0 = new AlertDialog.Builder((Context) ry0.j(u())).create();
            }
            return this.I0;
        }
        return dialog;
    }

    @Override // com.daaw.ot
    public void U1(FragmentManager fragmentManager, String str) {
        super.U1(fragmentManager, str);
    }

    @Override // com.daaw.ot, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.H0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
