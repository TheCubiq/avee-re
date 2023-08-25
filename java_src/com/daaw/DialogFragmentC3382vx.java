package com.daaw;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.daaw.avee.R;
/* renamed from: com.daaw.vx */
/* loaded from: classes.dex */
public class DialogFragmentC3382vx extends lj0 {

    /* renamed from: v */
    public static qw1<DialogFragmentC3382vx> f30686v = new qw1<>();

    /* renamed from: w */
    public static qw1<DialogFragmentC3382vx> f30687w = new qw1<>();

    /* renamed from: x */
    public static qw1<DialogFragmentC3382vx> f30688x = new qw1<>();

    /* renamed from: y */
    public static String f30689y = "EulaDialog";

    /* renamed from: com.daaw.vx$a */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC3383a implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC3383a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC3382vx.f30687w.m12018a(DialogFragmentC3382vx.this);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.daaw.vx$b */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC3384b implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC3384b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC3382vx.f30686v.m12018a(DialogFragmentC3382vx.this);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: i */
    public static void m6681i(C0645al c0645al, boolean z) {
        DialogFragmentC3382vx dialogFragmentC3382vx = new DialogFragmentC3382vx();
        Bundle bundle = new Bundle();
        bundle.putBoolean("keyShowCloseButton", false);
        bundle.putInt("licenseResId", R.raw.eula_english);
        bundle.putInt("titleResId", 0);
        bundle.putString("extraUrl", "");
        dialogFragmentC3382vx.setArguments(bundle);
        dialogFragmentC3382vx.setCancelable(false);
        gr1.m21323l(c0645al, dialogFragmentC3382vx, f30689y);
    }

    @Override // com.daaw.lj0
    /* renamed from: h */
    public void mo6682h(AlertDialog.Builder builder) {
        super.mo6682h(builder);
        builder.setNegativeButton(R.string.eula_decline, new DialogInterface$OnClickListenerC3383a());
        builder.setPositiveButton(R.string.eula_agree, new DialogInterface$OnClickListenerC3384b());
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f30688x.m12018a(this);
    }
}
