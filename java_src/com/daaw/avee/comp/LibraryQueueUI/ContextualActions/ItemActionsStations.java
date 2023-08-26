package com.daaw.avee.comp.LibraryQueueUI.ContextualActions;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ItemActionBase;
import com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ItemActionsStations {
    public static WeakEvent3<List<PlaylistSong>, Integer, IPlaylistSongContainerIdentifier> onOpenOnly = new WeakEvent3<>();

    /* loaded from: classes.dex */
    public static class PlaySingleItemAction extends ItemActionBase {
        public static ItemActionBase itemActionInstance = new PlaySingleItemAction();

        public PlaySingleItemAction() {
            super(1, false, true, R.drawable.ic_playlist4, R.string.libItemAction_play);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((Listener) list2.get(i)).onExecute(contextData.getContext(), list.get(i), arrayList);
            }
            ItemActionsStations.onOpenOnly.invoke(arrayList, 0, null);
        }

        /* loaded from: classes.dex */
        public static abstract class Listener extends ActionListenerBase {
            protected abstract void onExecute(Context context, Object obj, List<PlaylistSong> list);

            public Listener() {
                super(PlaySingleItemAction.itemActionInstance);
            }
        }
    }
}
