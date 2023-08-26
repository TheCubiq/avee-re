package com.daaw.avee.comp.Playlists.Dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsMusic;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylistFiles;
import com.daaw.avee.comp.Playlists.Dialog.PlaylistPickerDialog;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class PlaylistPickerDialog extends DialogFragment {
    private static final String arg1 = "arg1";
    private static final String arg2 = "arg2";
    private static final String arg3 = "arg3";
    LinearLayout content;
    LinearLayout contentLoading;
    public static WeakEvent5<Context, Long, long[], List<String>, Boolean> onLibraryQueueUI_SubmitSongSendToPlaylist = new WeakEvent5<>();
    public static WeakEvent5<String, String, List<PlaylistSong>, Boolean, Boolean> onLibraryQueueUI_SubmitSongSendToStandalonePlaylist = new WeakEvent5<>();
    public static WeakEventR<MultiList<String, String>> onRequestStandalonePlaylists = new WeakEventR<>();
    public static WeakEvent3<long[], List<String>, ContextData> onActionCreatePlaylist = new WeakEvent3<>();
    boolean songDataSourceLoadingIsCanceled = false;
    boolean songDataSourceForPlaylistIsLoaded = false;
    Action3<long[], ArrayList<String>, ArrayList<PlaylistSong>> songDataSourceForPlaylistResultCb = null;
    ArrayList<PlaylistSong> songs = new ArrayList<>(0);
    long[] songDataSourceNativePL = new long[0];
    ArrayList<String> songDataSourcePL = new ArrayList<>(0);

    public static PlaylistPickerDialog createAndShowPlaylistPickerDialog(ContextData contextData, List<PlaylistSong> list, Boolean bool) {
        PlaylistPickerDialog newInstance = newInstance(list, bool.booleanValue());
        UtilsUI.showDialogSafe(newInstance, "PlaylistPickerDialog", contextData);
        return newInstance;
    }

    private static PlaylistPickerDialog newInstance(List<PlaylistSong> list, boolean z) {
        PlaylistPickerDialog playlistPickerDialog = new PlaylistPickerDialog();
        ArrayList<String> arrayList = new ArrayList<>(list.size());
        for (PlaylistSong playlistSong : list) {
            arrayList.add(playlistSong.getConstrucPath());
        }
        Bundle bundle = new Bundle();
        bundle.putInt(arg1, z ? 1 : 0);
        bundle.putStringArrayList(arg2, arrayList);
        playlistPickerDialog.setArguments(bundle);
        return playlistPickerDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Handler handler = new Handler(Looper.getMainLooper());
        Bundle arguments = getArguments();
        boolean z = arguments.getInt(arg1) != 0;
        final ArrayList<String> stringArrayList = arguments.getStringArrayList(arg2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_send_to_playlist_title);
        View inflate = View.inflate(getActivity(), R.layout.dialog_choose_playlist, null);
        builder.setView(inflate);
        this.contentLoading = (LinearLayout) inflate.findViewById(R.id.contentLoading);
        this.content = (LinearLayout) inflate.findViewById(R.id.content);
        TabHost tabHost = (TabHost) inflate.findViewById(R.id.tabHost);
        tabHost.setup();
        TabHost.TabSpec newTabSpec = tabHost.newTabSpec("Tab One");
        newTabSpec.setContent(R.id.tab1);
        newTabSpec.setIndicator(getResources().getString(R.string.section_playlist_system));
        tabHost.addTab(newTabSpec);
        TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("Tab Two");
        newTabSpec2.setContent(R.id.tab2);
        newTabSpec2.setIndicator(getResources().getString(R.string.section_playlist_standalone));
        tabHost.addTab(newTabSpec2);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkBoxOverwrite);
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.checkBoxRelative);
        checkBox2.setChecked(true);
        if (z) {
            checkBox.setVisibility(0);
            checkBox.setChecked(true);
        } else {
            checkBox.setVisibility(8);
        }
        ListView listView = (ListView) inflate.findViewById(R.id.listViewPlaylist1);
        listView.setTextFilterEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.bgreco_list_item);
        listView.setAdapter((ListAdapter) arrayAdapter);
        ListView listView2 = (ListView) inflate.findViewById(R.id.listViewPlaylist2);
        listView2.setTextFilterEnabled(true);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(getActivity(), R.layout.bgreco_list_item);
        listView2.setAdapter((ListAdapter) arrayAdapter2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        UtilsMusic.getPlayLists(getActivity(), arrayList, arrayList2);
        updateAdapter(arrayAdapter, arrayList2);
        MultiList<String, String> invoke = onRequestStandalonePlaylists.invoke(new MultiList<>());
        ArrayList arrayList3 = new ArrayList(invoke.size());
        Iterator<Tuple2<String, String>> it = invoke.iterator();
        while (it.hasNext()) {
            arrayList3.add(ContainerPlaylistFiles.getPlaylistNameDesign(it.next().obj2));
        }
        updateAdapter(arrayAdapter2, arrayList3);
        listView.setOnItemClickListener(new AnonymousClass1(z, checkBox, arrayList));
        listView2.setOnItemClickListener(new AnonymousClass2(z, checkBox, checkBox2, invoke));
        builder.setPositiveButton(R.string.dialog_send_to_playlist_add_to_new, new AnonymousClass3());
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.Playlists.Dialog.PlaylistPickerDialog.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                PlaylistPickerDialog.this.songDataSourceLoadingIsCanceled = true;
            }
        });
        this.songs = new ArrayList<>(stringArrayList.size());
        this.songDataSourcePL = new ArrayList<>(this.songs.size());
        final int[] iArr = {0};
        Iterator<String> it2 = stringArrayList.iterator();
        while (it2.hasNext()) {
            PlaylistSong playlistSong = new PlaylistSong(it2.next());
            this.songs.add(playlistSong);
            this.songDataSourcePL.add(playlistSong.getDataSourceForPlaylist());
            playlistSong.getData(handler, new PlaylistSong.OnDataReadyListener() { // from class: com.daaw.avee.comp.Playlists.Dialog.PlaylistPickerDialog.5
                @Override // com.daaw.avee.comp.playback.Song.PlaylistSong.OnDataReadyListener
                public void onDataReady(PlaylistSong.Data data, Object obj, Object obj2) {
                    int[] iArr2 = iArr;
                    iArr2[0] = iArr2[0] + 1;
                    if (iArr2[0] >= stringArrayList.size()) {
                        PlaylistPickerDialog playlistPickerDialog = PlaylistPickerDialog.this;
                        playlistPickerDialog.onSongDataLoaded(playlistPickerDialog.songs);
                    }
                }
            }, null, null);
        }
        return builder.create();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.daaw.avee.comp.Playlists.Dialog.PlaylistPickerDialog$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        final /* synthetic */ CheckBox val$checkBoxOverwrite;
        final /* synthetic */ List val$playlistNativeIds;
        final /* synthetic */ boolean val$showOptions;

        AnonymousClass1(boolean z, CheckBox checkBox, List list) {
            this.val$showOptions = z;
            this.val$checkBoxOverwrite = checkBox;
            this.val$playlistNativeIds = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final boolean z = this.val$showOptions && this.val$checkBoxOverwrite.isChecked();
            if (i < 0 || i >= this.val$playlistNativeIds.size()) {
                return;
            }
            final long longValue = ((Long) this.val$playlistNativeIds.get(i)).longValue();
            final Activity activity = PlaylistPickerDialog.this.getActivity();
            PlaylistPickerDialog.this.getSongDataSourceForPlaylist(new Action3() { // from class: com.daaw.avee.comp.Playlists.Dialog.-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo
                @Override // com.daaw.avee.Common.Action3
                public final void onInvoke(Object obj, Object obj2, Object obj3) {
                    PlaylistPickerDialog.AnonymousClass1.this.lambda$onItemClick$0$PlaylistPickerDialog$1(activity, longValue, z, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }

        public /* synthetic */ void lambda$onItemClick$0$PlaylistPickerDialog$1(Activity activity, long j, boolean z, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            UtilsUI.dismissSafe(PlaylistPickerDialog.this);
            PlaylistPickerDialog.onLibraryQueueUI_SubmitSongSendToPlaylist.invoke(activity, Long.valueOf(j), jArr, arrayList, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.daaw.avee.comp.Playlists.Dialog.PlaylistPickerDialog$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements AdapterView.OnItemClickListener {
        final /* synthetic */ CheckBox val$checkBoxOverwrite;
        final /* synthetic */ CheckBox val$checkBoxRelative;
        final /* synthetic */ MultiList val$playlistIdhashAndPath;
        final /* synthetic */ boolean val$showOptions;

        AnonymousClass2(boolean z, CheckBox checkBox, CheckBox checkBox2, MultiList multiList) {
            this.val$showOptions = z;
            this.val$checkBoxOverwrite = checkBox;
            this.val$checkBoxRelative = checkBox2;
            this.val$playlistIdhashAndPath = multiList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final boolean z = this.val$showOptions && this.val$checkBoxOverwrite.isChecked();
            final boolean isChecked = this.val$checkBoxRelative.isChecked();
            if (i < 0 || i >= this.val$playlistIdhashAndPath.size()) {
                return;
            }
            final Tuple2 tuple2 = this.val$playlistIdhashAndPath.get(i);
            PlaylistPickerDialog.this.getSongDataSourceForPlaylist(new Action3() { // from class: com.daaw.avee.comp.Playlists.Dialog.-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo
                @Override // com.daaw.avee.Common.Action3
                public final void onInvoke(Object obj, Object obj2, Object obj3) {
                    PlaylistPickerDialog.AnonymousClass2.this.lambda$onItemClick$0$PlaylistPickerDialog$2(tuple2, z, isChecked, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void lambda$onItemClick$0$PlaylistPickerDialog$2(Tuple2 tuple2, boolean z, boolean z2, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            UtilsUI.dismissSafe(PlaylistPickerDialog.this);
            PlaylistPickerDialog.onLibraryQueueUI_SubmitSongSendToStandalonePlaylist.invoke(tuple2.obj1, tuple2.obj2, arrayList2, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* renamed from: com.daaw.avee.comp.Playlists.Dialog.PlaylistPickerDialog$3  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass3 implements DialogInterface.OnClickListener {
        AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (!PlaylistPickerDialog.this.songDataSourceForPlaylistIsLoaded) {
                PlaylistPickerDialog.this.songDataSourceLoadingIsCanceled = true;
                return;
            }
            final Activity activity = PlaylistPickerDialog.this.getActivity();
            PlaylistPickerDialog.this.getSongDataSourceForPlaylist(new Action3() { // from class: com.daaw.avee.comp.Playlists.Dialog.-$$Lambda$PlaylistPickerDialog$3$M1D7EZWfqN2O-QHKghj4xY_hl6Y
                @Override // com.daaw.avee.Common.Action3
                public final void onInvoke(Object obj, Object obj2, Object obj3) {
                    ArrayList arrayList = (ArrayList) obj3;
                    PlaylistPickerDialog.onActionCreatePlaylist.invoke((long[]) obj, (ArrayList) obj2, new ContextData(activity));
                }
            });
        }
    }

    private void updateAdapter(ArrayAdapter<String> arrayAdapter, String[] strArr) {
        if (strArr.length < 1) {
            strArr = new String[]{getResources().getString(R.string.playlist_empty_placeholder)};
        }
        arrayAdapter.clear();
        arrayAdapter.addAll(strArr);
        arrayAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r0 < 1) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateAdapter(ArrayAdapter<String> arrayAdapter, Collection<String> collection) {
        ArrayList arrayList;
        if (collection != null) {
            int size = collection.size();
            arrayList = collection;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R.string.playlist_empty_placeholder));
        arrayList = arrayList2;
        arrayAdapter.clear();
        arrayAdapter.addAll(arrayList);
        arrayAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSongDataSourceForPlaylist(Action3<long[], ArrayList<String>, ArrayList<PlaylistSong>> action3) {
        if (!this.songDataSourceForPlaylistIsLoaded) {
            this.contentLoading.setVisibility(0);
            this.content.setVisibility(8);
            this.songDataSourceForPlaylistResultCb = action3;
            return;
        }
        action3.onInvoke(this.songDataSourceNativePL, this.songDataSourcePL, this.songs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSongDataLoaded(ArrayList<PlaylistSong> arrayList) {
        Action3<long[], ArrayList<String>, ArrayList<PlaylistSong>> action3;
        this.songDataSourceNativePL = new long[arrayList.size()];
        Iterator<PlaylistSong> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.songDataSourceNativePL[i] = it.next().getDataSourceForNativePlaylist();
            i++;
        }
        this.contentLoading.setVisibility(8);
        this.content.setVisibility(0);
        this.songDataSourceForPlaylistIsLoaded = true;
        if (this.songDataSourceLoadingIsCanceled || (action3 = this.songDataSourceForPlaylistResultCb) == null) {
            return;
        }
        action3.onInvoke(this.songDataSourceNativePL, this.songDataSourcePL, arrayList);
    }
}
