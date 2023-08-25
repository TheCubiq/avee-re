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
    public static sw1<Context, Long, String> p = new sw1<>();

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ EditText p;
        public final /* synthetic */ long q;

        public a(EditText editText, long j) {
            this.p = editText;
            this.q = j;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            v31.p.a(this.p.getContext(), Long.valueOf(this.q), this.p.getText().toString());
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            gr1.g(v31.this.getDialog());
        }
    }

    public static v31 a(al alVar, Long l, String str) {
        v31 b2 = b(l.longValue(), str);
        gr1.x(b2, "RenamePlaylistDialog", alVar);
        return b2;
    }

    public static v31 b(long j, String str) {
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
        builder.setPositiveButton(R.string.dialog_rename, new a(editText, j));
        builder.setNegativeButton(R.string.dialog_cancel, new b());
        return builder.create();
    }
}
