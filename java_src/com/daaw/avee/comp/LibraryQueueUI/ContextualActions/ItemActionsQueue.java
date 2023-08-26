package com.daaw.avee.comp.LibraryQueueUI.ContextualActions;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ItemActionBase;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ItemActionsQueue {
    public static WeakEventR1<Integer, Boolean> onRequestShowTipState = new WeakEventR1<>();
    public static WeakEvent1<ContextData> onActionShowReorderTip = new WeakEvent1<>();
    public static WeakEvent1<List<IItemIdentifier>> onRemoveQueueItems = new WeakEvent1<>();
    public static WeakEvent1<IItemIdentifier> onSetCurrentQueueItem = new WeakEvent1<>();

    /* loaded from: classes.dex */
    public static class PlayQueueItemAction extends ItemActionBase {
        public static ItemActionBase itemActionBasePlayQueue = new PlayQueueItemAction();

        public PlayQueueItemAction() {
            super(1, false, R.drawable.ic_playlist4, R.string.libItemAction_playQueue);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            ItemActionsQueue.onSetCurrentQueueItem.invoke(((PlayQueueItemActionListener2) list2.get(size)).onPlay(contextData.getContext(), list.get(size)));
        }

        /* loaded from: classes.dex */
        public static abstract class PlayQueueItemActionListener2 extends ActionListenerBase {
            protected abstract IItemIdentifier onPlay(Context context, Object obj);

            public PlayQueueItemActionListener2() {
                super(PlayQueueItemAction.itemActionBasePlayQueue);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class RemoveQueueItemAction extends ItemActionBase {
        public static ItemActionBase itemActionBaseRemoveQueue = new RemoveQueueItemAction();

        public RemoveQueueItemAction() {
            super(5, true, R.drawable.ic_playlist4, R.string.libItemAction_removeQueueItem);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((RemoveQueueItemActionListener2) list2.get(i)).onRemove(contextData.getContext(), list.get(i), arrayList, arrayList2);
            }
            ItemActionsQueue.onRemoveQueueItems.invoke(arrayList2);
        }

        /* loaded from: classes.dex */
        public static abstract class RemoveQueueItemActionListener2 extends ActionListenerBase {
            protected abstract void onRemove(Context context, Object obj, List<Integer> list, List<IItemIdentifier> list2);

            public RemoveQueueItemActionListener2() {
                super(RemoveQueueItemAction.itemActionBaseRemoveQueue);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class TipReorderItemAction extends ItemActionBase {
        private static ItemActionBase baseInstance = new TipReorderItemAction();

        public TipReorderItemAction() {
            super(5, true, R.drawable.ic_info2, R.string.libItemAction_tipReorder);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            ItemActionsQueue.onActionShowReorderTip.invoke(contextData);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public boolean getShouldShow() {
            return ItemActionsQueue.onRequestShowTipState.invoke(Integer.valueOf(AppPreferences.PREF_Bool_tipShow_reorder), false).booleanValue();
        }

        /* loaded from: classes.dex */
        public static abstract class TipReorderItemActionListener2 extends ActionListenerBase {
            public TipReorderItemActionListener2() {
                super(TipReorderItemAction.baseInstance);
            }
        }
    }
}
