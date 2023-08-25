package com.daaw;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class vx extends lj0 {
    public static qw1<vx> v = new qw1<>();
    public static qw1<vx> w = new qw1<>();
    public static qw1<vx> x = new qw1<>();
    public static String y = "EulaDialog";

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            vx.w.a(vx.this);
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            vx.v.a(vx.this);
            dialogInterface.dismiss();
        }
    }

    public static void i(al alVar, boolean z) {
        vx vxVar = new vx();
        Bundle bundle = new Bundle();
        bundle.putBoolean("keyShowCloseButton", false);
        bundle.putInt("licenseResId", R.raw.eula_english);
        bundle.putInt("titleResId", 0);
        bundle.putString("extraUrl", "");
        vxVar.setArguments(bundle);
        vxVar.setCancelable(false);
        gr1.l(alVar, vxVar, y);
    }

    @Override // com.daaw.lj0
    public void h(AlertDialog.Builder builder) {
        super.h(builder);
        builder.setNegativeButton(R.string.eula_decline, new a());
        builder.setPositiveButton(R.string.eula_agree, new b());
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        x.a(this);
    }
}
