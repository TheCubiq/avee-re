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
/* renamed from: com.daaw.dn */
/* loaded from: classes.dex */
public class DialogFragmentC1113dn extends DialogFragment {

    /* renamed from: p */
    public static sw1<String, long[], List<String>> f7483p = new sw1<>();

    /* renamed from: q */
    public static uw1<String, String, kx0, List<String>, Boolean> f7484q = new uw1<>();

    /* renamed from: com.daaw.dn$a */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC1114a implements DialogInterface.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ EditText f7485p;

        /* renamed from: q */
        public final /* synthetic */ Spinner f7486q;

        /* renamed from: r */
        public final /* synthetic */ long[] f7487r;

        /* renamed from: s */
        public final /* synthetic */ ArrayList f7488s;

        public DialogInterface$OnClickListenerC1114a(EditText editText, Spinner spinner, long[] jArr, ArrayList arrayList) {
            this.f7485p = editText;
            this.f7486q = spinner;
            this.f7487r = jArr;
            this.f7488s = arrayList;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f7485p.getText().toString();
            int selectedItemPosition = this.f7486q.getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                kx0[] kx0VarArr = kx0.f16800d;
                if (selectedItemPosition < kx0VarArr.length + 1) {
                    if (selectedItemPosition == 0) {
                        DialogFragmentC1113dn.f7483p.m9795a(obj, this.f7487r, this.f7488s);
                        return;
                    }
                    DialogFragmentC1113dn.f7484q.m7667a(null, obj, kx0VarArr[selectedItemPosition - 1], this.f7488s, Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: com.daaw.dn$b */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC1115b implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC1115b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            gr1.m21328g(DialogFragmentC1113dn.this.getDialog());
        }
    }

    /* renamed from: a */
    public static DialogFragmentC1113dn m24213a(C0645al c0645al, long[] jArr, List<String> list) {
        DialogFragmentC1113dn m24212b = m24212b(jArr, list);
        gr1.m21311x(m24212b, "CreatePlaylistDialog", c0645al);
        return m24212b;
    }

    /* renamed from: b */
    public static DialogFragmentC1113dn m24212b(long[] jArr, List<String> list) {
        DialogFragmentC1113dn dialogFragmentC1113dn = new DialogFragmentC1113dn();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", 0);
        bundle.putString("arg2", null);
        bundle.putStringArrayList("arg3", (ArrayList) list);
        bundle.putLongArray("arg4", jArr);
        dialogFragmentC1113dn.setArguments(bundle);
        return dialogFragmentC1113dn;
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
        String[] strArr = new String[kx0.f16800d.length + 1];
        strArr[0] = getResources().getString(R.string.playlist_system_name);
        int i2 = 0;
        while (true) {
            kx0[] kx0VarArr = kx0.f16800d;
            if (i2 >= kx0VarArr.length) {
                break;
            }
            int i3 = i2 + 1;
            strArr[i3] = kx0VarArr[i2].f16801a;
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
            builder.setPositiveButton(R.string.dialog_create, new DialogInterface$OnClickListenerC1114a(editText, spinner, longArray, stringArrayList));
        }
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface$OnClickListenerC1115b());
        return builder.create();
    }
}
