package com.daaw.avee.Design;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.ContextData;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.MainActivity;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.GlobalSearch.SearchTaskManager;
import com.daaw.avee.comp.LibraryQueueUI.Fragment0;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import com.daaw.avee.comp.Playlists.Dialog.CreatePlaylistDialog;
import com.daaw.avee.comp.Playlists.Dialog.PlaylistPickerDialog;
import com.daaw.avee.comp.Playlists.Dialog.RenamePlaylistDialog;
import com.daaw.avee.comp.Playlists.Dialog.ScanPlaylistFilesDialog;
import com.daaw.avee.comp.Playlists.Files.PlaylistFilesType;
import com.daaw.avee.comp.Playlists.Files.PlaylistFilesUtils;
import com.daaw.avee.comp.Playlists.Platform.PlaylistPlatformUtils;
import com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class PlaylistsDesign {
    private SearchTaskManager taskManager = new SearchTaskManager();
    private PlaylistScanningStatus playlistScanningStatus = new PlaylistScanningStatus();
    private ScanResultReceiver resultReceiver = new ScanResultReceiver();
    private List<Object> listenerRefHolder = new ArrayList();

    /* loaded from: classes.dex */
    public static class PlaylistScanningStatus {
        public boolean active;
        public String text;
    }

    public PlaylistsDesign() {
        ScanPlaylistFilesDialog.onRequestPlaylistScanStatus.subscribeWeak(new WeakEventR.Handler<PlaylistScanningStatus>() { // from class: com.daaw.avee.Design.PlaylistsDesign.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public PlaylistScanningStatus invoke() {
                return PlaylistsDesign.this.playlistScanningStatus;
            }
        }, this.listenerRefHolder);
        ScanPlaylistFilesDialog.onStopPlaylistScan.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlaylistsDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                PlaylistsDesign.this.taskManager.clearTaskIfMatch(0);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onLibraryQueue2UI_ActionScanStandalonePlaylist.subscribeWeak(new WeakEvent1.Handler<ContextData>() { // from class: com.daaw.avee.Design.PlaylistsDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ContextData contextData) {
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext == null) {
                    return;
                }
                PlaylistsDesign.this.resultReceiver.contextData = contextData;
                ScanPlaylistFilesTask createScanPlaylistFilesTask = ScanPlaylistFilesTask.createScanPlaylistFilesTask(appContext, new File("/storage/"), new SearchFilter(), new WeakReference(PlaylistsDesign.this.resultReceiver));
                PlaylistsDesign.this.taskManager.setTask(createScanPlaylistFilesTask, 0);
                createScanPlaylistFilesTask.start();
                if (contextData.getActivity() != null) {
                    ScanPlaylistFilesDialog.createAndShowScanPlaylistFilesDialog(contextData);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onLibraryQueue2UI_ActionRemoveStandalonePlaylist.subscribeWeak(new WeakEvent4.Handler<Context, String, String, ContextData>() { // from class: com.daaw.avee.Design.PlaylistsDesign.4
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(Context context, String str, String str2, ContextData contextData) {
                PlaylistsDesign.this.onLibraryQueue2UI_SubmitRemoveStandalonePlaylist(context, str, str2);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onActionCreatePlaylist.subscribeWeak(new WeakEvent3.Handler<long[], List<String>, ContextData>() { // from class: com.daaw.avee.Design.PlaylistsDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(long[] jArr, List<String> list, ContextData contextData) {
                CreatePlaylistDialog.createAndShowCreatePlaylistDialog(contextData, jArr, list);
            }
        }, this.listenerRefHolder);
        PlaylistPickerDialog.onActionCreatePlaylist.subscribeWeak(new WeakEvent3.Handler<long[], List<String>, ContextData>() { // from class: com.daaw.avee.Design.PlaylistsDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(long[] jArr, List<String> list, ContextData contextData) {
                CreatePlaylistDialog.createAndShowCreatePlaylistDialog(contextData, jArr, list);
            }
        }, this.listenerRefHolder);
        CreatePlaylistDialog.onSubmitCreatePlaylist.subscribeWeak(new WeakEvent3.Handler<String, long[], List<String>>() { // from class: com.daaw.avee.Design.PlaylistsDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(String str, long[] jArr, List<String> list) {
                int createPlaylist;
                if (str == null || str.length() <= 0) {
                    return;
                }
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext != null && (createPlaylist = PlaylistPlatformUtils.createPlaylist(appContext, str, jArr)) > 0) {
                    EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, createPlaylist, Integer.valueOf(createPlaylist)));
                }
                PlaylistsDesign.this.updateLibraryItems();
            }
        }, this.listenerRefHolder);
        CreatePlaylistDialog.onSubmitCreateStandalonePlaylist.subscribeWeak(new WeakEvent5.Handler<String, String, PlaylistFilesType, List<String>, Boolean>() { // from class: com.daaw.avee.Design.PlaylistsDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(String str, String str2, PlaylistFilesType playlistFilesType, List<String> list, Boolean bool) {
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext == null) {
                    return;
                }
                if (str == null || str.length() <= 0) {
                    str = AppPreferences.preferencesGetStringSafe(AppPreferences.createOrGetInstance().getPreferences(appContext), "pref_playlistDefaultPath", "\\Playlists\\");
                }
                if (str2 == null || str2.length() <= 0) {
                    return;
                }
                StatusMsg statusMsg = new StatusMsg();
                String makePlaylistPath = PlaylistFilesUtils.makePlaylistPath(str, str2, playlistFilesType);
                int createPlaylist = PlaylistFilesUtils.s().createPlaylist(statusMsg, makePlaylistPath, playlistFilesType, list, bool.booleanValue());
                if (createPlaylist > 0) {
                    EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, createPlaylist, Integer.valueOf(createPlaylist)));
                } else if (statusMsg.hasCriticalError()) {
                    EventsGlobalTextNotifier.onTextMsg.invoke(statusMsg.getFullMessage());
                }
                AppPreferences.createOrGetInstance().prefAddStandalonePlaylistGenerateHash(appContext, makePlaylistPath, true);
                PlaylistsDesign.this.updateLibraryItems();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onLibraryQueueUI_ActionSongSendToPlaylist.subscribeWeak(new WeakEvent4.Handler<Context, List<PlaylistSong>, Boolean, ContextData>() { // from class: com.daaw.avee.Design.PlaylistsDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(Context context, List<PlaylistSong> list, Boolean bool, ContextData contextData) {
                PlaylistPickerDialog.createAndShowPlaylistPickerDialog(contextData, list, bool);
            }
        }, this.listenerRefHolder);
        PlaylistPickerDialog.onLibraryQueueUI_SubmitSongSendToPlaylist.subscribeWeak(new WeakEvent5.Handler<Context, Long, long[], List<String>, Boolean>() { // from class: com.daaw.avee.Design.PlaylistsDesign.10
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(Context context, Long l, long[] jArr, List<String> list, Boolean bool) {
                int addToPlaylist = PlaylistPlatformUtils.addToPlaylist(context, l.longValue(), jArr, bool.booleanValue());
                PlaylistsDesign.this.updateLibraryItems();
                if (bool.booleanValue()) {
                    EventsGlobalTextNotifier.onTextMsg.invoke(context.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, addToPlaylist, Integer.valueOf(addToPlaylist)));
                } else {
                    EventsGlobalTextNotifier.onTextMsg.invoke(context.getResources().getQuantityString(R.plurals.x_items_added_to_playlist, addToPlaylist, Integer.valueOf(addToPlaylist)));
                }
            }
        }, this.listenerRefHolder);
        PlaylistPickerDialog.onLibraryQueueUI_SubmitSongSendToStandalonePlaylist.subscribeWeak(new WeakEvent5.Handler<String, String, List<PlaylistSong>, Boolean, Boolean>() { // from class: com.daaw.avee.Design.PlaylistsDesign.11
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(String str, String str2, List<PlaylistSong> list, Boolean bool, Boolean bool2) {
                StatusMsg statusMsg = new StatusMsg();
                int addToPlaylistFile = PlaylistFilesUtils.s().addToPlaylistFile(statusMsg, str2, list, bool.booleanValue(), bool2.booleanValue());
                PlaylistsDesign.this.updateLibraryItems();
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext != null) {
                    if (addToPlaylistFile > 0) {
                        if (bool.booleanValue()) {
                            EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, addToPlaylistFile, Integer.valueOf(addToPlaylistFile)));
                        } else {
                            EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getResources().getQuantityString(R.plurals.x_items_added_to_playlist, addToPlaylistFile, Integer.valueOf(addToPlaylistFile)));
                        }
                    } else if (statusMsg.hasCriticalError()) {
                        EventsGlobalTextNotifier.onTextMsg.invoke(statusMsg.getFullMessage());
                    }
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onLibraryQueueUI_ActionRenamePlaylist.subscribeWeak(new WeakEvent4.Handler<Context, Long, String, ContextData>() { // from class: com.daaw.avee.Design.PlaylistsDesign.12
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(Context context, Long l, String str, ContextData contextData) {
                if (contextData.getFragmentManager() != null) {
                    RenamePlaylistDialog.createAndShowCreateRenamePlaylistDialog(contextData, l, str);
                }
            }
        }, this.listenerRefHolder);
        RenamePlaylistDialog.onSubmitRenamePlaylist.subscribeWeak(new WeakEvent3.Handler<Context, Long, String>() { // from class: com.daaw.avee.Design.PlaylistsDesign.13
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Context context, Long l, String str) {
                PlaylistPlatformUtils.renamePlaylist(context, l.longValue(), str);
                PlaylistsDesign.this.updateLibraryItems();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onLibraryQueueUI_ActionDeletePlaylist.subscribeWeak(new WeakEvent4.Handler<Context, Long, String, ContextData>() { // from class: com.daaw.avee.Design.PlaylistsDesign.14
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(Context context, Long l, String str, ContextData contextData) {
                PlaylistsDesign.this.onLibraryQueueUI_SubmitDeletePlaylist(context, l);
            }
        }, this.listenerRefHolder);
        PlaylistPickerDialog.onRequestStandalonePlaylists.subscribeWeak(new WeakEventR.Handler<MultiList<String, String>>() { // from class: com.daaw.avee.Design.PlaylistsDesign.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public MultiList<String, String> invoke() {
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext == null) {
                    return null;
                }
                return AppPreferences.createOrGetInstance().prefGetStandalonePlaylists(appContext);
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onScanCompleteResults(ContextData contextData, List<String> list) {
        Activity activity = contextData.getActivity();
        if (activity == null) {
            return;
        }
        MultiList<String, String> prefGetStandalonePlaylists = AppPreferences.createOrGetInstance().prefGetStandalonePlaylists(activity);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!prefGetStandalonePlaylists.contains2(str)) {
                arrayList.add(str);
            }
        }
        ScanCompleteDialogClickListener scanCompleteDialogClickListener = new ScanCompleteDialogClickListener(arrayList);
        int size = arrayList.size();
        String quantityString = activity.getResources().getQuantityString(R.plurals.x_items_found_playlist_scan, size, Integer.valueOf(size));
        if (activity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(R.string.dialog_playlist_scan_completed);
        builder.setMessage(quantityString);
        builder.setPositiveButton(R.string.dialog_ok, scanCompleteDialogClickListener);
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLibraryItems() {
        Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
        if (fragment0Instance != null) {
            fragment0Instance.updateLibraryItems();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLibraryQueue2UI_SubmitScanStandalonePlaylist(List<String> list) {
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return;
        }
        AppPreferences.createOrGetInstance().prefAddStandalonePlaylistGenerateHash(appContext, list, true);
        updateLibraryItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLibraryQueue2UI_SubmitRemoveStandalonePlaylist(Context context, String str, String str2) {
        AppPreferences.createOrGetInstance().prefRemoveStandalonePlaylist(str, str2, context);
        updateLibraryItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLibraryQueueUI_SubmitDeletePlaylist(Context context, Long l) {
        if (PlaylistPlatformUtils.deletePlaylist(context, l.longValue()) > 0) {
            EventsGlobalTextNotifier.onTextMsg.invoke(context.getResources().getString(R.string.playlist_deleted));
        }
        updateLibraryItems();
    }

    /* loaded from: classes.dex */
    public static class SearchFilter implements ScanPlaylistFilesTask.FilterComparable<File> {
        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.FilterComparable
        public void preProcessItem(File file) {
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.FilterComparable
        public String preProcessQuery(String str) {
            return str.toLowerCase();
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.FilterComparable
        public boolean compare(String str, File file) {
            return PlaylistFilesType.isPlaylistFileExtension(UtilsFileSys.extractFilenameExt(file));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ScanCompleteDialogClickListener implements DialogInterface.OnClickListener {
        List<String> resultItems;

        public ScanCompleteDialogClickListener(List<String> list) {
            this.resultItems = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i != -1) {
                return;
            }
            PlaylistsDesign.this.onLibraryQueue2UI_SubmitScanStandalonePlaylist(this.resultItems);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ScanResultReceiver implements ScanPlaylistFilesTask.IResultReceiver {
        ContextData contextData = null;

        ScanResultReceiver() {
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.IResultReceiver
        public void onStarted(AsyncTask asyncTask) {
            if (PlaylistsDesign.this.taskManager.compareTask(asyncTask, 0)) {
                PlaylistsDesign.this.playlistScanningStatus.active = true;
                PlaylistsDesign.this.playlistScanningStatus.text = "Starting";
                ScanPlaylistFilesDialog.updatePlaylistScanStatus(PlaylistsDesign.this.playlistScanningStatus);
            }
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.IResultReceiver
        public void onFinished(AsyncTask asyncTask, boolean z, List<String> list) {
            ContextData contextData;
            if (PlaylistsDesign.this.taskManager.compareTask(asyncTask, 0)) {
                PlaylistsDesign.this.playlistScanningStatus.active = false;
                PlaylistsDesign.this.playlistScanningStatus.text = "Finished";
                ScanPlaylistFilesDialog.updatePlaylistScanStatus(PlaylistsDesign.this.playlistScanningStatus);
                if (!z || list == null || (contextData = this.contextData) == null) {
                    return;
                }
                PlaylistsDesign.this.onScanCompleteResults(contextData, list);
            }
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.IResultReceiver
        public void onItem(AsyncTask asyncTask, String str) {
            PlaylistsDesign.this.taskManager.compareTask(asyncTask, 0);
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.IResultReceiver
        public void onStatusUpdate(AsyncTask asyncTask, String str) {
            if (PlaylistsDesign.this.taskManager.compareTask(asyncTask, 0)) {
                PlaylistsDesign.this.playlistScanningStatus.active = true;
                PlaylistsDesign.this.playlistScanningStatus.text = str;
                ScanPlaylistFilesDialog.updatePlaylistScanStatus(PlaylistsDesign.this.playlistScanningStatus);
            }
        }
    }
}
