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
    public static tw1<i2, ImageView, Boolean, Boolean> p = new tw1<>();

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public static fe1 a(al alVar, Context context, tx0 tx0Var) {
        fe1 c = c(context, tx0Var);
        gr1.x(c, "SongDetailsDialog", alVar);
        return c;
    }

    public static String b(int i) {
        if (i > 0) {
            return "" + i;
        }
        return "";
    }

    public static fe1 c(Context context, tx0 tx0Var) {
        fe1 fe1Var = new fe1();
        ArrayList<String> arrayList = new ArrayList<>();
        tx0.c k = tx0Var.k(context);
        arrayList.add(b(k.l));
        arrayList.add(b(k.m));
        arrayList.add(k.e);
        arrayList.add(k.g);
        arrayList.add(k.f);
        arrayList.add(k.h);
        arrayList.add(b(k.n));
        arrayList.add(k.p);
        if (k.o > 0) {
            arrayList.add("" + (k.o / 1000) + "kbps");
        } else {
            arrayList.add("");
        }
        if (k.j <= 0 || k.k <= 0) {
            arrayList.add("");
        } else {
            arrayList.add("" + k.j + "x" + k.k);
        }
        String d = k.a.d();
        String e = k.a.e();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", k.b ? 1 : 0);
        bundle.putString("argSrc", tx0Var.g());
        bundle.putString("argSrcFile", k.a.b);
        bundle.putStringArrayList("arg2", arrayList);
        bundle.putString("arg3", d);
        bundle.putString("arg4", e);
        bundle.putString("arg5", k.a.a.toString());
        bundle.putString("arg6", k.a.b());
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
        p.a(new i2(parse, string3, string4), (ImageView) inflate.findViewById(R.id.imgArtwork), Boolean.FALSE, Boolean.TRUE);
        builder.setNegativeButton(R.string.dialog_close, new a());
        return builder.create();
    }
}
