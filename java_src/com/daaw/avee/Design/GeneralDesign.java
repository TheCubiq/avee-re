package com.daaw.avee.Design;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.daaw.avee.AppPermissions;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.MainActivity;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.comp.AlbumArt.AlbumArtCore;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.Legal.EulaDialog;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier;
import com.daaw.avee.comp.PlaybackQueue.QueueCore;
import com.daaw.avee.comp.playback.EventsPlaybackService;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class GeneralDesign {
    public static volatile boolean celebrationContentAvailable = false;
    public static boolean isFirstLaunch = false;
    public static boolean shouldLoadInitalSongMediaService = false;
    public static boolean shouldLoadInitalSongs = false;
    private List<Object> listenerRefHolder = new LinkedList();
    private Handler threadHandler = new Handler();
    private boolean gotOnContext = false;
    private final int newestEulaId = 201709;
    final Date snowDate = new Date(117, 11, 24);
    final Date snowEndDate = new Date(117, 11, 26);
    final Date newYearDate = new Date(118, 0, 1);
    final Date newYearEndDate = new Date(118, 0, 2);
    final Date newYearLateEndDate = new Date(118, 0, 4);

    public GeneralDesign() {
        SettingsActivity.onClearCacheAction.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.GeneralDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                Context activityContext = PlayerCore.s().getActivityContext();
                if (activityContext != null) {
                    EventsGlobalTextNotifier.onTextMsg.invoke(activityContext.getResources().getString(R.string.clearing_cache));
                    UtilsFileSys.deleteCache(activityContext);
                }
            }
        }, this.listenerRefHolder);
        SettingsActivity.onEulaAction.subscribeWeak(new WeakEvent1.Handler<ContextData>() { // from class: com.daaw.avee.Design.GeneralDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ContextData contextData) {
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_acceptedEula, 0);
                GeneralDesign.this.showEulaMaybe(contextData.getActivity());
            }
        }, this.listenerRefHolder);
        checkIfCelebration();
        EulaDialog.onAcceptEula.subscribeWeak(new WeakEvent1.Handler<EulaDialog>() { // from class: com.daaw.avee.Design.GeneralDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(EulaDialog eulaDialog) {
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_acceptedEula, 201709);
            }
        }, this.listenerRefHolder);
        EulaDialog.onRejectEula.subscribeWeak(new WeakEvent1.Handler<EulaDialog>() { // from class: com.daaw.avee.Design.GeneralDesign.4
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(EulaDialog eulaDialog) {
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_acceptedEula, 0);
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity != null) {
                    mainActivity.doExit();
                }
                Activity activity = eulaDialog.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onCreate.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.GeneralDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
            }
        }, this.listenerRefHolder);
        MainActivity.onStart.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.GeneralDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                GeneralDesign.this.showEulaMaybe(activity);
            }
        }, this.listenerRefHolder);
        MainActivity.onStop.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.GeneralDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                AppPreferences.createOrGetInstance().save(activity);
            }
        }, this.listenerRefHolder);
        MainActivity.onCreateEarly.subscribeWeak(new WeakEvent1.Handler<Context>() { // from class: com.daaw.avee.Design.GeneralDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Context context) {
                GeneralDesign.this.onContext(context);
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onCreateEarly.subscribeWeak(new WeakEvent1.Handler<Context>() { // from class: com.daaw.avee.Design.GeneralDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(final Context context) {
                GeneralDesign.this.threadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.GeneralDesign.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        GeneralDesign.this.onContext(context);
                    }
                });
            }
        }, this.listenerRefHolder);
        QueueCore.onRequestShouldReloadInitalSongs.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.GeneralDesign.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                if (!GeneralDesign.this.gotOnContext) {
                    GeneralDesign.this.onContext(PlayerCore.s().getAppContext());
                }
                boolean z = GeneralDesign.shouldLoadInitalSongs;
                GeneralDesign.shouldLoadInitalSongs = false;
                return Boolean.valueOf(z);
            }
        }, this.listenerRefHolder);
        QueueCore.onQueueStateChanged.subscribeWeak(new WeakEvent2.Handler<MultiList<PlaylistSong, IItemIdentifier>, IPlaylistSongContainerIdentifier>() { // from class: com.daaw.avee.Design.GeneralDesign.11
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(MultiList<PlaylistSong, IItemIdentifier> multiList, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
                if (GeneralDesign.shouldLoadInitalSongMediaService) {
                    Tuple2<PlaylistSong, IItemIdentifier> tuple2 = multiList.size() > 0 ? multiList.get(0) : null;
                    if (tuple2 != null && tuple2.obj1 != null) {
                        EventsPlaybackService.Receive.onPlayDataSource.invoke(tuple2.obj1.getConstrucPath(), false, 0L, null);
                    }
                    GeneralDesign.shouldLoadInitalSongMediaService = false;
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onRequestPermissionsResult.subscribeWeak(new WeakEvent2.Handler<Activity, Integer>() { // from class: com.daaw.avee.Design.GeneralDesign.12
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Activity activity, Integer num) {
                EventsPlaybackService.Receive.onRestartMediaPlayerCore.invoke();
                boolean z = GeneralDesign.isFirstLaunch;
                GeneralDesign.shouldLoadInitalSongs = z;
                GeneralDesign.shouldLoadInitalSongMediaService = z;
                if ((num.intValue() == AppPermissions.REQUEST_STORAGE || num.intValue() == AppPermissions.REQUEST_STORAGE_AND_AUDIO) && Build.VERSION.SDK_INT >= 23) {
                    GeneralDesign.restart(activity, 500);
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onCreateView.subscribeWeak(new WeakEvent3.Handler<View, View, View>() { // from class: com.daaw.avee.Design.GeneralDesign.13
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(View view, View view2, View view3) {
                Date date = new Date();
                if (date.after(GeneralDesign.this.snowDate) && date.before(GeneralDesign.this.snowEndDate)) {
                    if (view != null) {
                        view.setBackgroundResource(R.drawable.snowflakes_pattern);
                    }
                    if (view2 != null) {
                        view2.setBackgroundResource(R.drawable.snowflakes_pattern);
                    }
                } else if (date.after(GeneralDesign.this.newYearDate) && date.before(GeneralDesign.this.newYearEndDate)) {
                    if (view != null) {
                        view.setBackgroundResource(R.drawable.newyear201x_pattern);
                    }
                    if (view2 != null) {
                        view2.setBackgroundResource(R.drawable.newyear201x_pattern);
                    }
                }
                GeneralDesign.this.checkIfCelebration();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onCreateView.subscribeWeak(new WeakEvent2.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$GeneralDesign$mYJyJfrOcbYjtn3YCYZALljq2UE
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public final void invoke(Object obj, Object obj2) {
                GeneralDesign.this.lambda$new$0$GeneralDesign((Integer) obj, (View) obj2);
            }
        }, this.listenerRefHolder);
        AlbumArtCore.onRequestLocalFolder.subscribeWeak(new WeakEventR1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public final Object invoke(Object obj) {
                File GetVisualizerFolderFromIdentifier;
                GetVisualizerFolderFromIdentifier = AppPreferences.GetVisualizerFolderFromIdentifier(((Integer) obj).intValue());
                return GetVisualizerFolderFromIdentifier;
            }
        }, this.listenerRefHolder);
        MainActivity.onLaunchIntent.subscribeWeak(new WeakEventR2.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public final Object invoke(Object obj, Object obj2) {
                return GeneralDesign.lambda$new$2((ContextData) obj, (Intent) obj2);
            }
        }, this.listenerRefHolder);
    }

    public /* synthetic */ void lambda$new$0$GeneralDesign(Integer num, View view) {
        Date date = new Date();
        if (date.after(this.snowDate) && date.before(this.snowEndDate)) {
            if (view != null) {
                view.setBackgroundResource(R.drawable.snowflakes_pattern);
            }
        } else if (date.after(this.newYearDate) && date.before(this.newYearEndDate) && view != null) {
            view.setBackgroundResource(R.drawable.newyear201x_pattern);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$new$2(ContextData contextData, Intent intent) {
        String action;
        Uri data;
        String str;
        if (intent != null) {
            String action2 = intent.getAction();
            StringBuilder sb = new StringBuilder();
            sb.append("LaunchIntent: action: ");
            sb.append(action2);
            if (action2 != null) {
                str = ";" + intent.getData();
            } else {
                str = ";null";
            }
            sb.append(str);
            tlog.w(sb.toString());
        }
        PlaylistSong playlistSong = null;
        if (intent != null && (action = intent.getAction()) != null && action.equals("android.intent.action.VIEW") && (data = intent.getData()) != null) {
            if (VisualizerSharingDesign.DetectVizFileTypeByFileSignature(contextData.getContext().getContentResolver(), data)) {
                int AddNewVisualizerFromFile = VisualizerSharingDesign.AddNewVisualizerFromFile(contextData.getContext(), data);
                if (AddNewVisualizerFromFile > 0) {
                    VisualizerDesign.selectThemePreset(AddNewVisualizerFromFile);
                }
            } else {
                playlistSong = new PlaylistSong(-1L, data);
            }
        }
        if (playlistSong != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(playlistSong);
            MainActivity.onPreviewOpen.invoke(arrayList, 0);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIfCelebration() {
        Date date = new Date();
        if (date.after(this.snowDate) && date.before(this.newYearLateEndDate)) {
            celebrationContentAvailable = true;
        } else {
            celebrationContentAvailable = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onContext(Context context) {
        this.gotOnContext = true;
        if (context != null) {
            AppPreferences createOrGetInstance = AppPreferences.createOrGetInstance();
            createOrGetInstance.load(context);
            if (isFirstLaunch) {
                return;
            }
            isFirstLaunch = createOrGetInstance.getBool(AppPreferences.PREF_Bool_firstLaunch);
            tlog.d("isFirstLaunch: " + isFirstLaunch);
            createOrGetInstance.setBool(AppPreferences.PREF_Bool_firstLaunch, false);
            boolean z = isFirstLaunch;
            shouldLoadInitalSongs = z;
            shouldLoadInitalSongMediaService = z;
        }
    }

    public static void restart(Context context, int i) {
        if (i == 0) {
            i = 1;
        }
        ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + i, PendingIntent.getActivity(context, 0, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 268435456));
        System.exit(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEulaMaybe(Activity activity) {
        if (AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_acceptedEula) != 201709) {
            EulaDialog.createAndShow(new ContextData(activity), true);
        }
    }
}
