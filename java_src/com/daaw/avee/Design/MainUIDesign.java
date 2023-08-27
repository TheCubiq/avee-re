package com.daaw.avee.Design;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.ContextData;
import com.daaw.avee.EventsGlobal.EventsGlobalNotificationUI;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.AlbumArt.AlbumArtFactory;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.IAlbumArtCore;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.LibraryQueueUI.Fragment0;
import com.daaw.avee.comp.PlaybackQueue.QueueCore;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class MainUIDesign {
    List<Object> listenerRefHolder = new LinkedList();
    int overrideForceLockOrient = 0;

    public MainUIDesign() {
        MainActivity.onRequestAlbumArtLarge.subscribeWeak(new WeakEvent4.Handler<AlbumArtRequest, ImageLoadedListener, Integer, Integer>() { // from class: com.daaw.avee.Design.MainUIDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(AlbumArtRequest albumArtRequest, ImageLoadedListener imageLoadedListener, Integer num, Integer num2) {
                IAlbumArtCore albumArtFactory = AlbumArtFactory.getInstance();
                if (albumArtFactory != null) {
                    albumArtFactory.loadAlbumArtLarge(false, albumArtRequest.videoThumbDataSource, albumArtRequest.path0, albumArtRequest.path1, albumArtRequest.genStr, true, imageLoadedListener, num.intValue(), num2.intValue(), num.intValue(), num2.intValue(), 0, -1, true, null, null);
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onMainUIAction.subscribeWeak(new WeakEvent2.Handler<Integer, ContextData>() { // from class: com.daaw.avee.Design.MainUIDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, ContextData contextData) {
                if (num.intValue() == 2) {
                    MainUIDesign.this.setOverrideForceLockOrient(false);
                    MainUIDesign.this.toggleLockOrient();
                }
            }
        }, this.listenerRefHolder);
        AppPreferences.onIntPreferenceChanged.subscribeWeak(new WeakEvent3.Handler<Integer, Integer, Boolean>() { // from class: com.daaw.avee.Design.MainUIDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, Integer num2, Boolean bool) {
                if (num.intValue() == AppPreferences.PREF_Int_lockOrient) {
                    MainUIDesign.this.updateLockOrient(num2.intValue());
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onRequestLockOrientState.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.MainUIDesign.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                if (MainUIDesign.this.overrideForceLockOrient != 0) {
                    return Boolean.valueOf(MainUIDesign.this.overrideForceLockOrient != 0);
                }
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_lockOrient) != 0);
            }
        }, this.listenerRefHolder);
        MainActivity.onPreviewOpen.subscribeWeak(new WeakEvent2.Handler<List<PlaylistSong>, Integer>() { // from class: com.daaw.avee.Design.MainUIDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(List<PlaylistSong> list, Integer num) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.previewOpen(list, num.intValue(), null);
                }
            }
        }, this.listenerRefHolder);
        EventsGlobalNotificationUI.onExitAction.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.MainUIDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity != null) {
                    mainActivity.doExitFromService();
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onViewPagerPageSelected.subscribeWeak(new WeakEvent2.Handler<Integer, Activity>() { // from class: com.daaw.avee.Design.MainUIDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Activity activity) {
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_mainPageIndex, num.intValue());
            }
        }, this.listenerRefHolder);
        MainActivity.onViewPagerSwipeOutAtStart.subscribeWeak(new WeakEvent1.Handler<Context>() { // from class: com.daaw.avee.Design.MainUIDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Context context) {
                Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
                if (fragment0Instance != null) {
                    fragment0Instance.navigateForBackwardLibraryAddress();
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onViewPagerSwipeProgressUpdate.subscribeWeak(new WeakEvent2.Handler<Float, Context>() { // from class: com.daaw.avee.Design.MainUIDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Float f, Context context) {
                Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
                if (fragment0Instance != null) {
                    fragment0Instance.navigateForBackwardProgress(f.floatValue());
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onRequestTrackInfo.subscribeWeak(new WeakEventR.Handler<PlaylistSong.Data>() { // from class: com.daaw.avee.Design.MainUIDesign.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public PlaylistSong.Data invoke() {
                return PlaybackDesign.songDisplayData;
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleLockOrient() {
        int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_lockOrient);
        if (i == 0) {
            MainActivity mainActivity = MainActivity.getInstance();
            if (mainActivity != null) {
                i = getLockOrient(mainActivity);
            }
        } else {
            i = 0;
        }
        AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_lockOrient, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLockOrient(int i) {
        MainActivity mainActivity = MainActivity.getInstance();
        if (mainActivity != null) {
            mainActivity.updateLockOrientIndicator(i != 0, false);
            if (i != 0) {
                if (mainActivity.getRequestedOrientation() == -1) {
                    lockOrient(mainActivity, i);
                    return;
                }
                return;
            }
            mainActivity.setRequestedOrientation(-1);
        }
    }

    void lockOrient(MainActivity mainActivity, int i) {
        if (Build.VERSION.SDK_INT >= 18) {
            if (i == 0) {
                mainActivity.setRequestedOrientation(-1);
            } else if (i == 1 || i == 2 || i == 3 || i == 4) {
                mainActivity.setRequestedOrientation(14);
            } else {
                mainActivity.setRequestedOrientation(-1);
            }
        } else if (i == 0) {
            mainActivity.setRequestedOrientation(-1);
        } else if (i == 1) {
            mainActivity.setRequestedOrientation(1);
        } else if (i == 2) {
            mainActivity.setRequestedOrientation(0);
        } else if (i == 3) {
            mainActivity.setRequestedOrientation(9);
        } else if (i == 4) {
            mainActivity.setRequestedOrientation(8);
        } else {
            mainActivity.setRequestedOrientation(-1);
        }
    }

    int getLockOrient(MainActivity mainActivity) {
        int rotation = ((WindowManager) mainActivity.getSystemService("window")).getDefaultDisplay().getRotation();
        if (mainActivity.getResources().getConfiguration().orientation == 1) {
            if (rotation != 0) {
                if (rotation == 1 || rotation == 2) {
                    return 3;
                }
                return rotation != 3 ? 0 : 1;
            }
            return 1;
        } else if (mainActivity.getResources().getConfiguration().orientation == 2) {
            if (rotation == 0 || rotation == 1) {
                return 2;
            }
            return (rotation == 2 || rotation == 3) ? 4 : 0;
        } else {
            return 0;
        }
    }

    public void setOverrideForceLockOrient(boolean z) {
        if (z) {
            this.overrideForceLockOrient = 0;
            MainActivity mainActivity = MainActivity.getInstance();
            if (mainActivity != null) {
                this.overrideForceLockOrient = getLockOrient(mainActivity);
            }
            updateLockOrient(this.overrideForceLockOrient);
            return;
        }
        this.overrideForceLockOrient = 0;
        updateLockOrient(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_lockOrient));
    }
}
