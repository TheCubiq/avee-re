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
    public static vw1<yx0.p> r = new vw1<>();
    public static pw1 s = new pw1();
    public static qw1<yx0.p> t = new qw1<>();
    public TextView p;
    public List<Object> q = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            n81.s.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements qw1.a<yx0.p> {
        public b() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(yx0.p pVar) {
            n81.this.e(pVar);
        }
    }

    public static n81 b(al alVar) {
        n81 n81Var = new n81();
        gr1.x(n81Var, "ScanPlaylistFilesDialog", alVar);
        return n81Var;
    }

    public static void d(yx0.p pVar) {
        t.a(pVar);
    }

    public boolean c() {
        return this.p != null;
    }

    public final void e(yx0.p pVar) {
        if (c()) {
            if (pVar.b) {
                this.p.setText(pVar.a);
                return;
            }
            this.p.setText("..");
            gr1.j(this);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t.b(new b(), this.q);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_scan_playlists, null);
        builder.setView(inflate);
        this.p = (TextView) inflate.findViewById(R.id.txtInfo);
        builder.setTitle(R.string.dialog_scan_playlists);
        builder.setNegativeButton(R.string.dialog_cancel, new a());
        yx0.p a2 = r.a(null);
        if (a2 != null) {
            e(a2);
        }
        return builder.create();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        t.c(this.q);
        this.q.clear();
        super.onDestroy();
    }
}
