package com.daaw.avee.Design;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
/* loaded from: classes.dex */
public class StationsDesign extends DesignBase {
    public StationsDesign() {
        MediaPlaybackService.onPlayStateChanged.subscribeWeak(new WeakEvent5.Handler<Boolean, Boolean, Integer, String, PlaylistSong>() { // from class: com.daaw.avee.Design.StationsDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(Boolean bool, Boolean bool2, Integer num, String str, PlaylistSong playlistSong) {
            }
        }, this.listenerRefHolder);
    }

    public boolean onPlayStateChanged(Boolean bool, Boolean bool2, Integer num, String str, PlaylistSong playlistSong) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return trySwitchPlaybackEngine(playlistSong);
    }

    public boolean trySwitchPlaybackEngine(PlaylistSong playlistSong) {
        if (playlistSong == null || !playlistSong.isStream() || AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_playbackEngine) == 1) {
            return false;
        }
        Context activityContext = PlayerCore.s().getActivityContext();
        if (activityContext != null) {
            EventsGlobalTextNotifier.onTextMsg.invoke(activityContext.getResources().getString(R.string.switched_to_x, activityContext.getResources().getString(R.string.musicSys_short_exo)));
        }
        AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_playbackEngine, 1);
        return true;
    }
}
