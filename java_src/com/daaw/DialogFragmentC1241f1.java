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
/* renamed from: com.daaw.f1 */
/* loaded from: classes.dex */
public class DialogFragmentC1241f1 extends DialogFragment {

    /* renamed from: q */
    public static rw1<C0645al, String> f8988q = new rw1<>();

    /* renamed from: p */
    public int f8989p = 0;

    /* renamed from: com.daaw.f1$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1242a implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ EditText f8990p;

        public View$OnClickListenerC1242a(EditText editText) {
            this.f8990p = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText;
            String str;
            EditText editText2;
            int i;
            if (DialogFragmentC1241f1.this.f8989p == 0) {
                editText2 = this.f8990p;
                i = R.string.dialog_add_link_sample_0;
            } else if (DialogFragmentC1241f1.this.f8989p == 1) {
                editText2 = this.f8990p;
                i = R.string.dialog_add_link_sample_1;
            } else if (DialogFragmentC1241f1.this.f8989p == 2) {
                editText2 = this.f8990p;
                i = R.string.dialog_add_link_sample_2;
            } else if (DialogFragmentC1241f1.this.f8989p != 3) {
                if (DialogFragmentC1241f1.this.f8989p == 4) {
                    editText = this.f8990p;
                    str = "http://yt-dash-mse-test.commondatastorage.googleapis.com/media/oops-20120802-manifest.mpd";
                } else if (DialogFragmentC1241f1.this.f8989p == 5) {
                    editText = this.f8990p;
                    str = "http://wams.edgesuite.net/media/MPTExpressionData02/BigBuckBunny_1080p24_IYUV_2ch.ism/manifest(format=mpd-time-csf)";
                } else if (DialogFragmentC1241f1.this.f8989p == 6) {
                    editText = this.f8990p;
                    str = "http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720.ism/Manifest";
                } else if (DialogFragmentC1241f1.this.f8989p != 7) {
                    if (DialogFragmentC1241f1.this.f8989p == 8) {
                        editText = this.f8990p;
                        str = "http://techslides.com/demos/sample-videos/small.flv";
                    }
                    DialogFragmentC1241f1 dialogFragmentC1241f1 = DialogFragmentC1241f1.this;
                    dialogFragmentC1241f1.f8989p = (dialogFragmentC1241f1.f8989p + 1) % 9;
                } else {
                    editText = this.f8990p;
                    str = "http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720_688.ismv";
                }
                editText.setText(str);
                DialogFragmentC1241f1 dialogFragmentC1241f12 = DialogFragmentC1241f1.this;
                dialogFragmentC1241f12.f8989p = (dialogFragmentC1241f12.f8989p + 1) % 9;
            } else {
                editText2 = this.f8990p;
                i = R.string.dialog_add_link_sample_3;
            }
            editText2.setText(i);
            DialogFragmentC1241f1 dialogFragmentC1241f122 = DialogFragmentC1241f1.this;
            dialogFragmentC1241f122.f8989p = (dialogFragmentC1241f122.f8989p + 1) % 9;
        }
    }

    /* renamed from: com.daaw.f1$b */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC1243b implements DialogInterface.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ EditText f8992p;

        public DialogInterface$OnClickListenerC1243b(EditText editText) {
            this.f8992p = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC1241f1.f8988q.m10862a(new C0645al(this.f8992p), this.f8992p.getText().toString());
        }
    }

    /* renamed from: com.daaw.f1$c */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC1244c implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC1244c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            gr1.m21328g(DialogFragmentC1241f1.this.getDialog());
        }
    }

    /* renamed from: c */
    public static DialogFragmentC1241f1 m22971c(C0645al c0645al) {
        DialogFragmentC1241f1 dialogFragmentC1241f1 = new DialogFragmentC1241f1();
        gr1.m21311x(dialogFragmentC1241f1, "AddLinkDialog", c0645al);
        return dialogFragmentC1241f1;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_add_link, null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(R.id.editTxtFolderName);
        editText.setText(R.string.dialog_add_link_default_value);
        ((TextView) inflate.findViewById(R.id.txtUnder)).setOnClickListener(new View$OnClickListenerC1242a(editText));
        builder.setTitle(R.string.dialog_add_link_title);
        builder.setPositiveButton(R.string.dialog_add, new DialogInterface$OnClickListenerC1243b(editText));
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface$OnClickListenerC1244c());
        return builder.create();
    }
}
