package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class f1 extends DialogFragment {
    public static rw1<al, String> q = new rw1<>();
    public int p = 0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ EditText p;

        public a(EditText editText) {
            this.p = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText;
            String str;
            EditText editText2;
            int i;
            if (f1.this.p == 0) {
                editText2 = this.p;
                i = R.string.dialog_add_link_sample_0;
            } else if (f1.this.p == 1) {
                editText2 = this.p;
                i = R.string.dialog_add_link_sample_1;
            } else if (f1.this.p == 2) {
                editText2 = this.p;
                i = R.string.dialog_add_link_sample_2;
            } else if (f1.this.p != 3) {
                if (f1.this.p == 4) {
                    editText = this.p;
                    str = "http://yt-dash-mse-test.commondatastorage.googleapis.com/media/oops-20120802-manifest.mpd";
                } else if (f1.this.p == 5) {
                    editText = this.p;
                    str = "http://wams.edgesuite.net/media/MPTExpressionData02/BigBuckBunny_1080p24_IYUV_2ch.ism/manifest(format=mpd-time-csf)";
                } else if (f1.this.p == 6) {
                    editText = this.p;
                    str = "http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720.ism/Manifest";
                } else if (f1.this.p != 7) {
                    if (f1.this.p == 8) {
                        editText = this.p;
                        str = "http://techslides.com/demos/sample-videos/small.flv";
                    }
                    f1 f1Var = f1.this;
                    f1Var.p = (f1Var.p + 1) % 9;
                } else {
                    editText = this.p;
                    str = "http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720_688.ismv";
                }
                editText.setText(str);
                f1 f1Var2 = f1.this;
                f1Var2.p = (f1Var2.p + 1) % 9;
            } else {
                editText2 = this.p;
                i = R.string.dialog_add_link_sample_3;
            }
            editText2.setText(i);
            f1 f1Var22 = f1.this;
            f1Var22.p = (f1Var22.p + 1) % 9;
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ EditText p;

        public b(EditText editText) {
            this.p = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            f1.q.a(new al(this.p), this.p.getText().toString());
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            gr1.g(f1.this.getDialog());
        }
    }

    public static f1 c(al alVar) {
        f1 f1Var = new f1();
        gr1.x(f1Var, "AddLinkDialog", alVar);
        return f1Var;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_add_link, null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(R.id.editTxtFolderName);
        editText.setText(R.string.dialog_add_link_default_value);
        ((TextView) inflate.findViewById(R.id.txtUnder)).setOnClickListener(new a(editText));
        builder.setTitle(R.string.dialog_add_link_title);
        builder.setPositiveButton(R.string.dialog_add, new b(editText));
        builder.setNegativeButton(R.string.dialog_cancel, new c());
        return builder.create();
    }
}
