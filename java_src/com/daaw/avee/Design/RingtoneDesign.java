package com.daaw.avee.Design;

import com.daaw.avee.AppPermissions;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.ContextData;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import com.daaw.avee.comp.Ringtone.RingtoneUtils;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class RingtoneDesign {
    private List<Object> listenerRefHolder = new ArrayList(1);

    public RingtoneDesign() {
        LibraryQueueFragmentBase.onSetAsRingtone.subscribeWeak(new WeakEvent2.Handler<ContextData, Collection<PlaylistSong>>() { // from class: com.daaw.avee.Design.RingtoneDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(ContextData contextData, Collection<PlaylistSong> collection) {
                PlaylistSong next;
                if (!AppPermissions.is_WRITE_SETTINGS_PermissionGranted(contextData.getContext(), contextData.getActivity())) {
                    EventsGlobalTextNotifier.onTextMsg.invoke(contextData.getContext().getResources().getString(R.string.ringtone_failed_set_no_permission));
                } else if (collection.size() <= 0) {
                } else {
                    Iterator<PlaylistSong> it = collection.iterator();
                    if (!it.hasNext() || (next = it.next()) == null) {
                        return;
                    }
                    PlaylistSong.DataDetails dataDetailsBlocking = next.getDataDetailsBlocking(contextData.getContext());
                    if (dataDetailsBlocking.data.filePath.length() <= 0) {
                        EventsGlobalTextNotifier.onTextMsg.invoke(contextData.getContext().getResources().getString(R.string.ringtone_failed_set_not_useable));
                    } else {
                        RingtoneUtils.setRingtone(contextData.getContext(), dataDetailsBlocking.data.filePath, dataDetailsBlocking.artistName, dataDetailsBlocking.trackName, dataDetailsBlocking.mimeType);
                    }
                }
            }
        }, this.listenerRefHolder);
    }
}
