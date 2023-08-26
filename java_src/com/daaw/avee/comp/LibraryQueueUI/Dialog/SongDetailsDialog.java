package com.daaw.avee.comp.LibraryQueueUI.Dialog;

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
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class SongDetailsDialog extends DialogFragment {
    private static final String arg1 = "arg1";
    private static final String arg2 = "arg2";
    private static final String arg3 = "arg3";
    private static final String arg4 = "arg4";
    private static final String arg5 = "arg5";
    private static final String arg6 = "arg6";
    private static final String argSrc = "argSrc";
    private static final String argSrcFile = "argSrcFile";
    public static WeakEvent4<AlbumArtRequest, ImageView, Boolean, Boolean> onRequestAlbumArt = new WeakEvent4<>();

    public static SongDetailsDialog createAndShowDialog(ContextData contextData, Context context, PlaylistSong playlistSong) {
        SongDetailsDialog newInstance = newInstance(context, playlistSong);
        UtilsUI.showDialogSafe(newInstance, "SongDetailsDialog", contextData);
        return newInstance;
    }

    private static SongDetailsDialog newInstance(Context context, PlaylistSong playlistSong) {
        SongDetailsDialog songDetailsDialog = new SongDetailsDialog();
        ArrayList<String> arrayList = new ArrayList<>();
        PlaylistSong.DataDetails dataDetailsBlocking = playlistSong.getDataDetailsBlocking(context);
        arrayList.add(emptyStrIfZero(dataDetailsBlocking.trackNum));
        arrayList.add(emptyStrIfZero(dataDetailsBlocking.cdNum));
        arrayList.add(dataDetailsBlocking.trackName);
        arrayList.add(dataDetailsBlocking.artistName);
        arrayList.add(dataDetailsBlocking.albumName);
        arrayList.add(dataDetailsBlocking.albumArtist);
        arrayList.add(emptyStrIfZero(dataDetailsBlocking.year));
        arrayList.add(dataDetailsBlocking.composer);
        if (dataDetailsBlocking.bitRate > 0) {
            arrayList.add("" + (dataDetailsBlocking.bitRate / 1000) + "kbps");
        } else {
            arrayList.add("");
        }
        if (dataDetailsBlocking.width > 0 && dataDetailsBlocking.height > 0) {
            arrayList.add("" + dataDetailsBlocking.width + "x" + dataDetailsBlocking.height);
        } else {
            arrayList.add("");
        }
        String albumArtPath0Str = dataDetailsBlocking.data.getAlbumArtPath0Str();
        String albumArtPath1Str = dataDetailsBlocking.data.getAlbumArtPath1Str();
        Bundle bundle = new Bundle();
        bundle.putInt(arg1, dataDetailsBlocking.isStream ? 1 : 0);
        bundle.putString(argSrc, playlistSong.getConstrucPath());
        bundle.putString(argSrcFile, dataDetailsBlocking.data.filePath);
        bundle.putStringArrayList(arg2, arrayList);
        bundle.putString(arg3, albumArtPath0Str);
        bundle.putString(arg4, albumArtPath1Str);
        bundle.putString(arg5, dataDetailsBlocking.data.dataSource.toString());
        bundle.putString(arg6, dataDetailsBlocking.data.getAlbumArtGenerateStr());
        songDetailsDialog.setArguments(bundle);
        return songDetailsDialog;
    }

    private static String emptyStrIfZero(int i) {
        if (i > 0) {
            return "" + i;
        }
        return "";
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getInt(arg1);
        String string = arguments.getString(argSrc);
        String string2 = arguments.getString(argSrcFile);
        ArrayList<String> stringArrayList = arguments.getStringArrayList(arg2);
        String string3 = arguments.getString(arg3);
        String string4 = arguments.getString(arg4);
        Uri parse = Uri.parse(arguments.getString(arg5));
        String string5 = arguments.getString(arg6);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_song_details, null);
        builder.setView(inflate);
        TextView[] textViewArr = new TextView[2];
        textViewArr[0] = (TextView) inflate.findViewById(R.id.txt0);
        textViewArr[0].setText(string);
        if (string2 != null && string2.length() > 0) {
            inflate.findViewById(R.id.row01).setVisibility(0);
            textViewArr[1] = (TextView) inflate.findViewById(R.id.txt01);
            textViewArr[1].setText(string2);
        } else {
            inflate.findViewById(R.id.row01).setVisibility(8);
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
        onRequestAlbumArt.invoke(new AlbumArtRequest(parse, string3, string4, string5), (ImageView) inflate.findViewById(R.id.imgArtwork), false, true);
        builder.setNegativeButton(R.string.dialog_close, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Dialog.SongDetailsDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        return builder.create();
    }
}
