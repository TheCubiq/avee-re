package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class v31 extends DialogFragment {

    /* renamed from: p */
    public static sw1<Context, Long, String> f29805p = new sw1<>();

    /* renamed from: com.daaw.v31$a */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC3280a implements DialogInterface.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ EditText f29806p;

        /* renamed from: q */
        public final /* synthetic */ long f29807q;

        public DialogInterface$OnClickListenerC3280a(EditText editText, long j) {
            this.f29806p = editText;
            this.f29807q = j;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            v31.f29805p.m9795a(this.f29806p.getContext(), Long.valueOf(this.f29807q), this.f29806p.getText().toString());
        }
    }

    /* renamed from: com.daaw.v31$b */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC3281b implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC3281b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            gr1.m21328g(v31.this.getDialog());
        }
    }

    /* renamed from: a */
    public static v31 m7519a(C0645al c0645al, Long l, String str) {
        v31 m7518b = m7518b(l.longValue(), str);
        gr1.m21311x(m7518b, "RenamePlaylistDialog", c0645al);
        return m7518b;
    }

    /* renamed from: b */
    public static v31 m7518b(long j, String str) {
        v31 v31Var = new v31();
        Bundle bundle = new Bundle();
        bundle.putLong("arg1", j);
        bundle.putString("arg2", str);
        v31Var.setArguments(bundle);
        return v31Var;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        long j = arguments.getLong("arg1");
        String string = arguments.getString("arg2");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_rename_playlist, null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(R.id.editTxtPlaylistName);
        if (string == null) {
            editText.setText(R.string.dialog_add_playlist_default_value);
        } else {
            editText.setText(string);
        }
        builder.setTitle(R.string.dialog_rename_playlist_title);
        builder.setPositiveButton(R.string.dialog_rename, new DialogInterface$OnClickListenerC3280a(editText, j));
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface$OnClickListenerC3281b());
        return builder.create();
    }
}
