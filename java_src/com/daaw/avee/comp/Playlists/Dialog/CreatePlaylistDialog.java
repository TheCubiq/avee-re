package com.daaw.avee.comp.Playlists.Dialog;

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
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.Playlists.Files.PlaylistFilesType;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class CreatePlaylistDialog extends DialogFragment {
    private static final String arg1 = "arg1";
    private static final String arg2 = "arg2";
    private static final String arg3 = "arg3";
    private static final String arg4 = "arg4";
    public static WeakEvent3<String, long[], List<String>> onSubmitCreatePlaylist = new WeakEvent3<>();
    public static WeakEvent5<String, String, PlaylistFilesType, List<String>, Boolean> onSubmitCreateStandalonePlaylist = new WeakEvent5<>();

    public static CreatePlaylistDialog createAndShowCreatePlaylistDialog(ContextData contextData, long[] jArr, List<String> list) {
        CreatePlaylistDialog newInstance = newInstance(jArr, list);
        UtilsUI.showDialogSafe(newInstance, "CreatePlaylistDialog", contextData);
        return newInstance;
    }

    private static CreatePlaylistDialog newInstance(long[] jArr, List<String> list) {
        CreatePlaylistDialog createPlaylistDialog = new CreatePlaylistDialog();
        Bundle bundle = new Bundle();
        bundle.putInt(arg1, 0);
        bundle.putString(arg2, null);
        bundle.putStringArrayList(arg3, (ArrayList) list);
        bundle.putLongArray(arg4, jArr);
        createPlaylistDialog.setArguments(bundle);
        return createPlaylistDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i = arguments.getInt(arg1);
        String string = arguments.getString(arg2);
        final ArrayList<String> stringArrayList = arguments.getStringArrayList(arg3);
        final long[] longArray = arguments.getLongArray(arg4);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_create_playlist, null);
        builder.setView(inflate);
        final EditText editText = (EditText) inflate.findViewById(R.id.editTxtPlaylistName);
        if (string == null) {
            editText.setText(R.string.dialog_add_playlist_default_value);
        } else {
            editText.setText(string);
        }
        final Spinner spinner = (Spinner) inflate.findViewById(R.id.spinnerType);
        String[] strArr = new String[PlaylistFilesType.playlistFilesTypes.length + 1];
        strArr[0] = getResources().getString(R.string.playlist_system_name);
        int i2 = 0;
        while (i2 < PlaylistFilesType.playlistFilesTypes.length) {
            int i3 = i2 + 1;
            strArr[i3] = PlaylistFilesType.playlistFilesTypes[i2].name;
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
            builder.setPositiveButton(R.string.dialog_create, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.Playlists.Dialog.CreatePlaylistDialog.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i4) {
                    String obj = editText.getText().toString();
                    int selectedItemPosition = spinner.getSelectedItemPosition();
                    if (selectedItemPosition < 0 || selectedItemPosition >= PlaylistFilesType.playlistFilesTypes.length + 1) {
                        return;
                    }
                    if (selectedItemPosition == 0) {
                        CreatePlaylistDialog.onSubmitCreatePlaylist.invoke(obj, longArray, stringArrayList);
                        return;
                    }
                    CreatePlaylistDialog.onSubmitCreateStandalonePlaylist.invoke(null, obj, PlaylistFilesType.playlistFilesTypes[selectedItemPosition - 1], stringArrayList, true);
                }
            });
        }
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.Playlists.Dialog.CreatePlaylistDialog.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                UtilsUI.cancelDialogSafe(CreatePlaylistDialog.this.getDialog());
            }
        });
        return builder.create();
    }
}
