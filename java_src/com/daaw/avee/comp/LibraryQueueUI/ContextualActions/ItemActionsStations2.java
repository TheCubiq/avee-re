package com.daaw.avee.comp.LibraryQueueUI.ContextualActions;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ItemActionBase;
import com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.List;
/* loaded from: classes.dex */
public class ItemActionsStations2 {
    public static WeakEvent3<List<PlaylistSong>, Integer, IPlaylistSongContainerIdentifier> onOpenOnly = new WeakEvent3<>();

    /* loaded from: classes.dex */
    public static class PlaySingleItemAction extends ItemActionBase {
        public static ItemActionBase itemActionInstance = new PlaySingleItemAction();

        public PlaySingleItemAction() {
            super(1, false, true, R.drawable.ic_playlist4, R.string.libItemAction_play);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            for (int i = 0; i < list.size(); i++) {
                ((Listener) list2.get(i)).onExecute(contextData.getContext(), list.get(i)).Run(new VAsyncTask.ResultListener<List<PlaylistSong>>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2.PlaySingleItemAction.1
                    @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
                    public void onResult(List<PlaylistSong> list3, boolean z) {
                        if (z) {
                            return;
                        }
                        ItemActionsStations2.onOpenOnly.invoke(list3, 0, null);
                    }
                });
            }
        }

        /* loaded from: classes.dex */
        public static abstract class Listener extends ActionListenerBase {
            protected abstract VAsyncTask<List<PlaylistSong>> onExecute(Context context, Object obj);

            public Listener() {
                super(PlaySingleItemAction.itemActionInstance);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ItemActionEnqueue extends ItemActionBase {
        public static ItemActionBase itemAction2Enqueue = new ItemActionEnqueue();

        public ItemActionEnqueue() {
            super(3, true, R.drawable.ic_playlist4, R.string.libItemAction_enqueue);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            for (int i = 0; i < list.size(); i++) {
                ((EnqueueActionListener2) list2.get(i)).onEnqueue(contextData.getContext(), list.get(i)).Run(new VAsyncTask.ResultListener<List<PlaylistSong>>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2.ItemActionEnqueue.1
                    @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
                    public void onResult(List<PlaylistSong> list3, boolean z) {
                        if (z) {
                            return;
                        }
                        ItemActionsSongs.onEnqueue.invoke(list3, 3);
                    }
                });
            }
        }

        /* loaded from: classes.dex */
        public static abstract class EnqueueActionListener2 extends ActionListenerBase {
            protected abstract VAsyncTask<List<PlaylistSong>> onEnqueue(Context context, Object obj);

            public EnqueueActionListener2() {
                super(ItemActionEnqueue.itemAction2Enqueue);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ItemActionEnqueueNext extends ItemActionBase {
        public static ItemActionBase itemAction2EnqueueNext = new ItemActionEnqueueNext();

        public ItemActionEnqueueNext() {
            super(3, true, R.drawable.ic_playlist4, R.string.libItemAction_enqueueNext);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            for (int i = 0; i < list.size(); i++) {
                ((EnqueueNextActionListener2) list2.get(i)).onEnqueue(contextData.getContext(), list.get(i)).Run(new VAsyncTask.ResultListener<List<PlaylistSong>>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2.ItemActionEnqueueNext.1
                    @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
                    public void onResult(List<PlaylistSong> list3, boolean z) {
                        if (z) {
                            return;
                        }
                        ItemActionsSongs.onEnqueue.invoke(list3, 2);
                    }
                });
            }
        }

        /* loaded from: classes.dex */
        public static abstract class EnqueueNextActionListener2 extends ActionListenerBase {
            protected abstract VAsyncTask<List<PlaylistSong>> onEnqueue(Context context, Object obj);

            public EnqueueNextActionListener2() {
                super(ItemActionEnqueueNext.itemAction2EnqueueNext);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class SendToItemAction extends ItemActionBase {
        public static ItemActionBase itemActionSendTo = new SendToItemAction();

        public SendToItemAction() {
            super(4, true, R.drawable.ic_add2, R.string.libItemAction_sendTo);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(final ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            for (int i = 0; i < list.size(); i++) {
                ((SendToActionListener) list2.get(i)).onSendTo(contextData.getContext(), list.get(i)).Run(new VAsyncTask.ResultListener<List<PlaylistSong>>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2.SendToItemAction.1
                    @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
                    public void onResult(List<PlaylistSong> list3, boolean z) {
                        if (z) {
                            return;
                        }
                        ItemActionsSongs.onLibraryQueueUI_ActionSongSendToPlaylist.invoke(contextData.getContext(), list3, false, contextData);
                    }
                });
            }
        }

        /* loaded from: classes.dex */
        public static abstract class SendToActionListener extends ActionListenerBase {
            protected abstract VAsyncTask<List<PlaylistSong>> onSendTo(Context context, Object obj);

            public SendToActionListener() {
                super(SendToItemAction.itemActionSendTo);
            }
        }
    }
}
