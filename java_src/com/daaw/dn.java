package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dn extends DialogFragment {
    public static sw1<String, long[], List<String>> p = new sw1<>();
    public static uw1<String, String, kx0, List<String>, Boolean> q = new uw1<>();

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ EditText p;
        public final /* synthetic */ Spinner q;
        public final /* synthetic */ long[] r;
        public final /* synthetic */ ArrayList s;

        public a(EditText editText, Spinner spinner, long[] jArr, ArrayList arrayList) {
            this.p = editText;
            this.q = spinner;
            this.r = jArr;
            this.s = arrayList;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.p.getText().toString();
            int selectedItemPosition = this.q.getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                kx0[] kx0VarArr = kx0.d;
                if (selectedItemPosition < kx0VarArr.length + 1) {
                    if (selectedItemPosition == 0) {
                        dn.p.a(obj, this.r, this.s);
                        return;
                    }
                    dn.q.a(null, obj, kx0VarArr[selectedItemPosition - 1], this.s, Boolean.TRUE);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            gr1.g(dn.this.getDialog());
        }
    }

    public static dn a(al alVar, long[] jArr, List<String> list) {
        dn b2 = b(jArr, list);
        gr1.x(b2, "CreatePlaylistDialog", alVar);
        return b2;
    }

    public static dn b(long[] jArr, List<String> list) {
        dn dnVar = new dn();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", 0);
        bundle.putString("arg2", null);
        bundle.putStringArrayList("arg3", (ArrayList) list);
        bundle.putLongArray("arg4", jArr);
        dnVar.setArguments(bundle);
        return dnVar;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i = arguments.getInt("arg1");
        String string = arguments.getString("arg2");
        ArrayList<String> stringArrayList = arguments.getStringArrayList("arg3");
        long[] longArray = arguments.getLongArray("arg4");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_create_playlist, null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(R.id.editTxtPlaylistName);
        if (string == null) {
            editText.setText(R.string.dialog_add_playlist_default_value);
        } else {
            editText.setText(string);
        }
        Spinner spinner = (Spinner) inflate.findViewById(R.id.spinnerType);
        String[] strArr = new String[kx0.d.length + 1];
        strArr[0] = getResources().getString(R.string.playlist_system_name);
        int i2 = 0;
        while (true) {
            kx0[] kx0VarArr = kx0.d;
            if (i2 >= kx0VarArr.length) {
                break;
            }
            int i3 = i2 + 1;
            strArr[i3] = kx0VarArr[i2].a;
            i2 = i3;
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), 17367048, strArr));
        TextView textView = (TextView) inflate.findViewById(R.id.txtInfo);
        if (longArray == null && stringArrayList == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            int length = longArray != null ? longArray.length : stringArrayList.size();
            textView.setText(getResources().getQuantityString(R.plurals.x_items_about_to_added, length, Integer.valueOf(length)));
        }
        if (i == 0) {
            builder.setTitle(R.string.dialog_add_playlist_title);
            builder.setPositiveButton(R.string.dialog_create, new a(editText, spinner, longArray, stringArrayList));
        }
        builder.setNegativeButton(R.string.dialog_cancel, new b());
        return builder.create();
    }
}
