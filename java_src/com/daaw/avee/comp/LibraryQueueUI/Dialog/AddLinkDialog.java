package com.daaw.avee.comp.LibraryQueueUI.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class AddLinkDialog extends DialogFragment {
    public static WeakEvent2<ContextData, String> onSubmitAddByLink = new WeakEvent2<>();
    private int currentSample = 0;

    public static AddLinkDialog createAndShowDialog(ContextData contextData) {
        AddLinkDialog addLinkDialog = new AddLinkDialog();
        UtilsUI.showDialogSafe(addLinkDialog, "AddLinkDialog", contextData);
        return addLinkDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_add_link, null);
        builder.setView(inflate);
        final EditText editText = (EditText) inflate.findViewById(R.id.editTxtFolderName);
        editText.setText(R.string.dialog_add_link_default_value);
        ((TextView) inflate.findViewById(R.id.txtUnder)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Dialog.AddLinkDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AddLinkDialog.this.currentSample != 0) {
                    if (AddLinkDialog.this.currentSample != 1) {
                        if (AddLinkDialog.this.currentSample != 2) {
                            if (AddLinkDialog.this.currentSample != 3) {
                                if (AddLinkDialog.this.currentSample != 4) {
                                    if (AddLinkDialog.this.currentSample != 5) {
                                        if (AddLinkDialog.this.currentSample != 6) {
                                            if (AddLinkDialog.this.currentSample != 7) {
                                                if (AddLinkDialog.this.currentSample == 8) {
                                                    editText.setText("http://techslides.com/demos/sample-videos/small.flv");
                                                }
                                            } else {
                                                editText.setText("http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720_688.ismv");
                                            }
                                        } else {
                                            editText.setText("http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720.ism/Manifest");
                                        }
                                    } else {
                                        editText.setText("http://wams.edgesuite.net/media/MPTExpressionData02/BigBuckBunny_1080p24_IYUV_2ch.ism/manifest(format=mpd-time-csf)");
                                    }
                                } else {
                                    editText.setText("http://yt-dash-mse-test.commondatastorage.googleapis.com/media/oops-20120802-manifest.mpd");
                                }
                            } else {
                                editText.setText(R.string.dialog_add_link_sample_3);
                            }
                        } else {
                            editText.setText(R.string.dialog_add_link_sample_2);
                        }
                    } else {
                        editText.setText(R.string.dialog_add_link_sample_1);
                    }
                } else {
                    editText.setText(R.string.dialog_add_link_sample_0);
                }
                AddLinkDialog addLinkDialog = AddLinkDialog.this;
                addLinkDialog.currentSample = (addLinkDialog.currentSample + 1) % 9;
            }
        });
        builder.setTitle(R.string.dialog_add_link_title);
        builder.setPositiveButton(R.string.dialog_add, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Dialog.AddLinkDialog.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                AddLinkDialog.onSubmitAddByLink.invoke(new ContextData(editText), editText.getText().toString());
            }
        });
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Dialog.AddLinkDialog.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                UtilsUI.cancelDialogSafe(AddLinkDialog.this.getDialog());
            }
        });
        return builder.create();
    }
}
