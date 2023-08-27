package com.daaw.avee.comp.Playlists.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.Design.PlaylistsDesign;
import com.daaw.avee.R;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ScanPlaylistFilesDialog extends DialogFragment {
    private static final String arg1 = "arg1";
    private List<Object> listenerRefHolder = new LinkedList();
    private TextView txtInfo;
    public static WeakEventR<PlaylistsDesign.PlaylistScanningStatus> onRequestPlaylistScanStatus = new WeakEventR<>();
    public static WeakEvent onStopPlaylistScan = new WeakEvent();
    private static WeakEvent1<PlaylistsDesign.PlaylistScanningStatus> internalOnPlaylistScanStatusUpdated = new WeakEvent1<>();

    public static void updatePlaylistScanStatus(PlaylistsDesign.PlaylistScanningStatus playlistScanningStatus) {
        internalOnPlaylistScanStatusUpdated.invoke(playlistScanningStatus);
    }

    public static ScanPlaylistFilesDialog createAndShowScanPlaylistFilesDialog(ContextData contextData) {
        ScanPlaylistFilesDialog scanPlaylistFilesDialog = new ScanPlaylistFilesDialog();
        UtilsUI.showDialogSafe(scanPlaylistFilesDialog, "ScanPlaylistFilesDialog", contextData);
        return scanPlaylistFilesDialog;
    }

    private static ScanPlaylistFilesDialog newInstance(int i) {
        ScanPlaylistFilesDialog scanPlaylistFilesDialog = new ScanPlaylistFilesDialog();
        Bundle bundle = new Bundle();
        bundle.putInt(arg1, i);
        scanPlaylistFilesDialog.setArguments(bundle);
        return scanPlaylistFilesDialog;
    }

    boolean isViewCreated() {
        return this.txtInfo != null;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_scan_playlists, null);
        builder.setView(inflate);
        this.txtInfo = (TextView) inflate.findViewById(R.id.txtInfo);
        builder.setTitle(R.string.dialog_scan_playlists);
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.Playlists.Dialog.ScanPlaylistFilesDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ScanPlaylistFilesDialog.onStopPlaylistScan.invoke();
            }
        });
        PlaylistsDesign.PlaylistScanningStatus invoke = onRequestPlaylistScanStatus.invoke(null);
        if (invoke != null) {
            updateScanStatus(invoke);
        }
        return builder.create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        internalOnPlaylistScanStatusUpdated.subscribeWeak(new WeakEvent1.Handler<PlaylistsDesign.PlaylistScanningStatus>() { // from class: com.daaw.avee.comp.Playlists.Dialog.ScanPlaylistFilesDialog.2
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(PlaylistsDesign.PlaylistScanningStatus playlistScanningStatus) {
                ScanPlaylistFilesDialog.this.updateScanStatus(playlistScanningStatus);
            }
        }, this.listenerRefHolder);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        internalOnPlaylistScanStatusUpdated.unSubscribeWeak(this.listenerRefHolder);
        this.listenerRefHolder.clear();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateScanStatus(PlaylistsDesign.PlaylistScanningStatus playlistScanningStatus) {
        if (isViewCreated()) {
            if (playlistScanningStatus.active) {
                this.txtInfo.setText(playlistScanningStatus.text);
                return;
            }
            this.txtInfo.setText("..");
            UtilsUI.dismissSafe(this);
        }
    }
}
