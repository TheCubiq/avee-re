package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.qw1;
import com.daaw.yx0;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class n81 extends DialogFragment {

    /* renamed from: r */
    public static vw1<yx0.C3774p> f19639r = new vw1<>();

    /* renamed from: s */
    public static pw1 f19640s = new pw1();

    /* renamed from: t */
    public static qw1<yx0.C3774p> f19641t = new qw1<>();

    /* renamed from: p */
    public TextView f19642p;

    /* renamed from: q */
    public List<Object> f19643q = new LinkedList();

    /* renamed from: com.daaw.n81$a */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2265a implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC2265a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            n81.f19640s.m12990a();
        }
    }

    /* renamed from: com.daaw.n81$b */
    /* loaded from: classes.dex */
    public class C2266b implements qw1.InterfaceC2788a<yx0.C3774p> {
        public C2266b() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(yx0.C3774p c3774p) {
            n81.this.m15437e(c3774p);
        }
    }

    /* renamed from: b */
    public static n81 m15440b(C0645al c0645al) {
        n81 n81Var = new n81();
        gr1.m21311x(n81Var, "ScanPlaylistFilesDialog", c0645al);
        return n81Var;
    }

    /* renamed from: d */
    public static void m15438d(yx0.C3774p c3774p) {
        f19641t.m12018a(c3774p);
    }

    /* renamed from: c */
    public boolean m15439c() {
        return this.f19642p != null;
    }

    /* renamed from: e */
    public final void m15437e(yx0.C3774p c3774p) {
        if (m15439c()) {
            if (c3774p.f34231b) {
                this.f19642p.setText(c3774p.f34230a);
                return;
            }
            this.f19642p.setText("..");
            gr1.m21325j(this);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f19641t.m12017b(new C2266b(), this.f19643q);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_scan_playlists, null);
        builder.setView(inflate);
        this.f19642p = (TextView) inflate.findViewById(R.id.txtInfo);
        builder.setTitle(R.string.dialog_scan_playlists);
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface$OnClickListenerC2265a());
        yx0.C3774p m6692a = f19639r.m6692a(null);
        if (m6692a != null) {
            m15437e(m6692a);
        }
        return builder.create();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        f19641t.m12016c(this.f19643q);
        this.f19643q.clear();
        super.onDestroy();
    }
}
