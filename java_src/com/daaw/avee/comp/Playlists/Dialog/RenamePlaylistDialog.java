package com.daaw.avee.comp.Playlists.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class RenamePlaylistDialog extends DialogFragment {
    private static final String arg1 = "arg1";
    private static final String arg2 = "arg2";
    public static WeakEvent3<Context, Long, String> onSubmitRenamePlaylist = new WeakEvent3<>();

    public static RenamePlaylistDialog createAndShowCreateRenamePlaylistDialog(ContextData contextData, Long l, String str) {
        RenamePlaylistDialog newInstanceRename = newInstanceRename(l.longValue(), str);
        UtilsUI.showDialogSafe(newInstanceRename, "RenamePlaylistDialog", contextData);
        return newInstanceRename;
    }

    private static RenamePlaylistDialog newInstanceRename(long j, String str) {
        RenamePlaylistDialog renamePlaylistDialog = new RenamePlaylistDialog();
        Bundle bundle = new Bundle();
        bundle.putLong(arg1, j);
        bundle.putString(arg2, str);
        renamePlaylistDialog.setArguments(bundle);
        return renamePlaylistDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        final long j = arguments.getLong(arg1);
        String string = arguments.getString(arg2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_rename_playlist, null);
        builder.setView(inflate);
        final EditText editText = (EditText) inflate.findViewById(R.id.editTxtPlaylistName);
        if (string == null) {
            editText.setText(R.string.dialog_add_playlist_default_value);
        } else {
            editText.setText(string);
        }
        builder.setTitle(R.string.dialog_rename_playlist_title);
        builder.setPositiveButton(R.string.dialog_rename, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.Playlists.Dialog.RenamePlaylistDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                RenamePlaylistDialog.onSubmitRenamePlaylist.invoke(editText.getContext(), Long.valueOf(j), editText.getText().toString());
            }
        });
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.Playlists.Dialog.RenamePlaylistDialog.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                UtilsUI.cancelDialogSafe(RenamePlaylistDialog.this.getDialog());
            }
        });
        return builder.create();
    }
}
