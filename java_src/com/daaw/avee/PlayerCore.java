package com.daaw.avee;

import android.app.Activity;
import android.content.Context;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.Design.AdsDesign;
import com.daaw.avee.Design.AdsRewardedDesign;
import com.daaw.avee.Design.AppDesign;
import com.daaw.avee.Design.AppThemesDesign;
import com.daaw.avee.Design.AudioEffectsDesign;
import com.daaw.avee.Design.CompositeSearchDesign;
import com.daaw.avee.Design.ContextualActionModeDesign;
import com.daaw.avee.Design.GeneralDesign;
import com.daaw.avee.Design.HeadsetMonitorDesign;
import com.daaw.avee.Design.IAP2Design;
import com.daaw.avee.Design.LibraryQueueUIDesign;
import com.daaw.avee.Design.LogoDesign;
import com.daaw.avee.Design.MainUIDesign;
import com.daaw.avee.Design.PcmDesign;
import com.daaw.avee.Design.PlaybackControlsDesign;
import com.daaw.avee.Design.PlaybackDesign;
import com.daaw.avee.Design.PlayerControlsUIDesign;
import com.daaw.avee.Design.PlaylistsDesign;
import com.daaw.avee.Design.RingtoneDesign;
import com.daaw.avee.Design.Sec0Design;
import com.daaw.avee.Design.SleepTimerDesign;
import com.daaw.avee.Design.SortDesign;
import com.daaw.avee.Design.StationsDesign;
import com.daaw.avee.Design.VisualizerCustomizationDesign;
import com.daaw.avee.Design.VisualizerDesign;
import com.daaw.avee.Design.VisualizerExporterDesign;
import com.daaw.avee.Design.VisualizerSharingDesign;
import com.daaw.avee.Design.WidgetAndNotificationDesign;
import com.daaw.avee.comp.AlbumArt.AlbumArtFactory;
import com.daaw.avee.comp.AlbumArt.IAlbumArtCore;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.ContextualActionBar.ContextualActionBar;
import com.daaw.avee.comp.GlobalSearch.GlobalSearchCore;
import com.daaw.avee.comp.MediaControlsUI.MediaControlsUI;
import com.daaw.avee.comp.PlaybackQueue.QueueCore;
import com.daaw.avee.comp.SleepTimer.SleepTimer;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class PlayerCore {
    static PlayerCore instance = new PlayerCore();
    private IAlbumArtCore albumArtCore;
    private AppPreferences appPreferences;
    private ContextualActionBar contextualActionBar;
    private GlobalSearchCore globalSearchCore;
    private MediaControlsUI mediaControlsUI;
    private QueueCore playbackQueue;
    private SleepTimer sleepTimer;
    private List<Object> design = new ArrayList(30);
    protected List<Object> listenerRefHolder = new LinkedList();

    private PlayerCore() {
        instance = this;
        init();
    }

    public static PlayerCore s() {
        return instance;
    }

    private void init() {
        UtilsUI.AssertIsUiThread();
        this.appPreferences = AppPreferences.createOrGetInstance();
        this.design.clear();
        final IAP2Design iAP2Design = new IAP2Design();
        this.design.add(new GeneralDesign());
        this.design.add(new AppDesign());
        this.design.add(new Sec0Design());
        this.design.add(iAP2Design);
        this.design.add(new SleepTimerDesign());
        this.design.add(new LibraryQueueUIDesign());
        VisualizerDesign visualizerDesign = new VisualizerDesign();
        this.design.add(visualizerDesign);
        this.design.add(new PlaybackControlsDesign());
        StationsDesign stationsDesign = new StationsDesign();
        PlaybackDesign playbackDesign = new PlaybackDesign(stationsDesign);
        this.design.add(playbackDesign);
        MainUIDesign mainUIDesign = new MainUIDesign();
        this.design.add(mainUIDesign);
        this.design.add(new CompositeSearchDesign());
        this.design.add(new SortDesign());
        this.design.add(new PlaylistsDesign());
        this.design.add(new PlayerControlsUIDesign());
        this.design.add(new ContextualActionModeDesign());
        this.design.add(new AdsDesign());
        this.design.add(new AdsRewardedDesign());
        WeakEventR weakEventR = new WeakEventR();
        iAP2Design.getClass();
        weakEventR.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.-$$Lambda$TUCTVSkpBLpT5Bss9IrbaM4TVA8
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                return IAP2Design.this.isPremium();
            }
        }, this.listenerRefHolder);
        this.design.add(new PostExportAdManager(weakEventR));
        this.design.add(new AudioEffectsDesign());
        this.design.add(new AppThemesDesign());
        this.design.add(WidgetAndNotificationDesign.createInstance());
        this.design.add(new VisualizerExporterDesign(visualizerDesign, playbackDesign, mainUIDesign));
        this.design.add(new RingtoneDesign());
        this.design.add(new HeadsetMonitorDesign());
        this.design.add(stationsDesign);
        this.design.add(new PcmDesign());
        this.design.add(new LogoDesign());
        this.design.add(new VisualizerSharingDesign());
        this.design.add(new VisualizerCustomizationDesign());
        this.playbackQueue = QueueCore.createOrGetInstance();
        this.contextualActionBar = ContextualActionBar.createInstance();
        this.sleepTimer = SleepTimer.createOrGetInstance();
        this.albumArtCore = AlbumArtFactory.createInstance(getAppContext());
        this.globalSearchCore = GlobalSearchCore.createInstance();
        this.mediaControlsUI = MediaControlsUI.createOrGetInstance();
    }

    public Context getAppContext() {
        MainActivity mainActivity = MainActivity.getInstance();
        Context applicationContext = mainActivity != null ? mainActivity.getApplicationContext() : null;
        if (applicationContext != null) {
            return applicationContext;
        }
        MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
        if (mediaPlaybackService != null) {
            applicationContext = mediaPlaybackService.getApplicationContext();
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        tlog.w("app context is null");
        return null;
    }

    public Context getActivityContext() {
        MainActivity mainActivity = MainActivity.getInstance();
        if (mainActivity != null) {
            return mainActivity;
        }
        return null;
    }

    public Activity getActivityContextAsActivity() {
        MainActivity mainActivity = MainActivity.getInstance();
        if (mainActivity != null) {
            return mainActivity;
        }
        return null;
    }
}
