package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.tx0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class fe1 extends DialogFragment {

    /* renamed from: p */
    public static tw1<C1652i2, ImageView, Boolean, Boolean> f9487p = new tw1<>();

    /* renamed from: com.daaw.fe1$a */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC1274a implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC1274a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: a */
    public static fe1 m22753a(C0645al c0645al, Context context, tx0 tx0Var) {
        fe1 m22751c = m22751c(context, tx0Var);
        gr1.m21311x(m22751c, "SongDetailsDialog", c0645al);
        return m22751c;
    }

    /* renamed from: b */
    public static String m22752b(int i) {
        if (i > 0) {
            return "" + i;
        }
        return "";
    }

    /* renamed from: c */
    public static fe1 m22751c(Context context, tx0 tx0Var) {
        fe1 fe1Var = new fe1();
        ArrayList<String> arrayList = new ArrayList<>();
        tx0.C3144c m8741k = tx0Var.m8741k(context);
        arrayList.add(m22752b(m8741k.f28231l));
        arrayList.add(m22752b(m8741k.f28232m));
        arrayList.add(m8741k.f28224e);
        arrayList.add(m8741k.f28226g);
        arrayList.add(m8741k.f28225f);
        arrayList.add(m8741k.f28227h);
        arrayList.add(m22752b(m8741k.f28233n));
        arrayList.add(m8741k.f28235p);
        if (m8741k.f28234o > 0) {
            arrayList.add("" + (m8741k.f28234o / 1000) + "kbps");
        } else {
            arrayList.add("");
        }
        if (m8741k.f28229j <= 0 || m8741k.f28230k <= 0) {
            arrayList.add("");
        } else {
            arrayList.add("" + m8741k.f28229j + "x" + m8741k.f28230k);
        }
        String m8729d = m8741k.f28220a.m8729d();
        String m8728e = m8741k.f28220a.m8728e();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", m8741k.f28221b ? 1 : 0);
        bundle.putString("argSrc", tx0Var.m8745g());
        bundle.putString("argSrcFile", m8741k.f28220a.f28204b);
        bundle.putStringArrayList("arg2", arrayList);
        bundle.putString("arg3", m8729d);
        bundle.putString("arg4", m8728e);
        bundle.putString("arg5", m8741k.f28220a.f28203a.toString());
        bundle.putString("arg6", m8741k.f28220a.m8731b());
        fe1Var.setArguments(bundle);
        return fe1Var;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getInt("arg1");
        String string = arguments.getString("argSrc");
        String string2 = arguments.getString("argSrcFile");
        ArrayList<String> stringArrayList = arguments.getStringArrayList("arg2");
        String string3 = arguments.getString("arg3");
        arguments.getString("arg4");
        Uri parse = Uri.parse(arguments.getString("arg5"));
        String string4 = arguments.getString("arg6");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_song_details, null);
        builder.setView(inflate);
        TextView[] textViewArr = new TextView[2];
        textViewArr[0] = (TextView) inflate.findViewById(R.id.txt0);
        textViewArr[0].setText(string);
        if (string2 == null || string2.length() <= 0) {
            inflate.findViewById(R.id.row01).setVisibility(8);
        } else {
            inflate.findViewById(R.id.row01).setVisibility(0);
            textViewArr[1] = (TextView) inflate.findViewById(R.id.txt01);
            textViewArr[1].setText(string2);
        }
        TableRow[] tableRowArr = {(TableRow) inflate.findViewById(R.id.row1), (TableRow) inflate.findViewById(R.id.row2), (TableRow) inflate.findViewById(R.id.row3), (TableRow) inflate.findViewById(R.id.row4), (TableRow) inflate.findViewById(R.id.row5), (TableRow) inflate.findViewById(R.id.row6), (TableRow) inflate.findViewById(R.id.row7), (TableRow) inflate.findViewById(R.id.row8), (TableRow) inflate.findViewById(R.id.row9), (TableRow) inflate.findViewById(R.id.row10)};
        TextView[] textViewArr2 = {(TextView) inflate.findViewById(R.id.txt1), (TextView) inflate.findViewById(R.id.txt2), (TextView) inflate.findViewById(R.id.txt3), (TextView) inflate.findViewById(R.id.txt4), (TextView) inflate.findViewById(R.id.txt5), (TextView) inflate.findViewById(R.id.txt6), (TextView) inflate.findViewById(R.id.txt7), (TextView) inflate.findViewById(R.id.txt8), (TextView) inflate.findViewById(R.id.txt9), (TextView) inflate.findViewById(R.id.txt10)};
        if (stringArrayList != null) {
            for (int i = 0; i < stringArrayList.size(); i++) {
                if (stringArrayList.get(i) == null || stringArrayList.get(i).isEmpty()) {
                    tableRowArr[i].setVisibility(8);
                } else {
                    tableRowArr[i].setVisibility(0);
                    textViewArr2[i].setText(stringArrayList.get(i));
                }
            }
        }
        f9487p.m8756a(new C1652i2(parse, string3, string4), (ImageView) inflate.findViewById(R.id.imgArtwork), Boolean.FALSE, Boolean.TRUE);
        builder.setNegativeButton(R.string.dialog_close, new DialogInterface$OnClickListenerC1274a());
        return builder.create();
    }
}
