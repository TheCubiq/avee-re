package com.daaw.avee.comp.LibraryQueueUI.ContextualActions;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ItemActionBase;
import java.util.List;
/* loaded from: classes.dex */
public class ItemActionsPlaylist {
    public static WeakEvent4<Context, String, String, ContextData> onLibraryQueue2UI_ActionRemoveStandalonePlaylist = new WeakEvent4<>();
    public static WeakEvent4<Context, Long, String, ContextData> onLibraryQueueUI_ActionRenamePlaylist = new WeakEvent4<>();
    public static WeakEvent4<Context, Long, String, ContextData> onLibraryQueueUI_ActionDeletePlaylist = new WeakEvent4<>();

    /* loaded from: classes.dex */
    public static class RenamePlaylistAction extends ItemActionBase {
        private static ItemActionBase baseInstance = new RenamePlaylistAction();

        public RenamePlaylistAction() {
            super(4, false, true, R.drawable.ic_pencil, R.string.libItemAction_rename);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            MultiList<Long, String> multiList = new MultiList<>();
            for (int i = 0; i < list.size(); i++) {
                ((RenamePlaylistActionListener) list2.get(i)).onRenamePlaylist(contextData.getContext(), list.get(i), multiList);
            }
            Tuple2<Long, String> tuple2 = multiList.size() > 0 ? multiList.get(multiList.size() - 1) : null;
            if (tuple2 != null) {
                ItemActionsPlaylist.onLibraryQueueUI_ActionRenamePlaylist.invoke(contextData.getContext(), Long.valueOf(tuple2.obj1.longValue()), tuple2.obj2, contextData);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class RenamePlaylistActionListener extends ActionListenerBase {
            protected abstract void onRenamePlaylist(Context context, Object obj, MultiList<Long, String> multiList);

            public RenamePlaylistActionListener() {
                super(RenamePlaylistAction.baseInstance);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class DeletePlaylistAction extends ItemActionBase {
        private static ItemActionBase baseInstance = new DeletePlaylistAction();

        public DeletePlaylistAction() {
            super(4, false, true, R.drawable.ic_close, R.string.libItemAction_deletePlaylist);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            MultiList<Long, String> multiList = new MultiList<>();
            for (int i = 0; i < list.size(); i++) {
                ((DeletePlaylistActionListener) list2.get(i)).onDeletePlaylist(contextData.getContext(), list.get(i), multiList);
            }
            Tuple2<Long, String> tuple2 = multiList.size() > 0 ? multiList.get(multiList.size() - 1) : null;
            if (tuple2 != null) {
                ItemActionsPlaylist.onLibraryQueueUI_ActionDeletePlaylist.invoke(contextData.getContext(), Long.valueOf(tuple2.obj1.longValue()), tuple2.obj2, contextData);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class DeletePlaylistActionListener extends ActionListenerBase {
            protected abstract void onDeletePlaylist(Context context, Object obj, MultiList<Long, String> multiList);

            public DeletePlaylistActionListener() {
                super(DeletePlaylistAction.baseInstance);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class RemoveStandalonePlaylistAction extends ItemActionBase {
        private static ItemActionBase baseInstance = new RemoveStandalonePlaylistAction();

        public RemoveStandalonePlaylistAction() {
            super(4, true, true, R.drawable.ic_close, R.string.libItemAction_removeStandalonePlaylist);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            MultiList<String, String> multiList = new MultiList<>();
            for (int i = 0; i < list.size(); i++) {
                ((RemoveStandalonePlaylistActionListener) list2.get(i)).onRemoveStandalonePlaylist(contextData.getContext(), list.get(i), multiList);
            }
            Tuple2<String, String> tuple2 = multiList.size() > 0 ? multiList.get(multiList.size() - 1) : null;
            if (tuple2 != null) {
                ItemActionsPlaylist.onLibraryQueue2UI_ActionRemoveStandalonePlaylist.invoke(contextData.getContext(), tuple2.obj1, tuple2.obj2, contextData);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class RemoveStandalonePlaylistActionListener extends ActionListenerBase {
            protected abstract void onRemoveStandalonePlaylist(Context context, Object obj, MultiList<String, String> multiList);

            public RemoveStandalonePlaylistActionListener() {
                super(RemoveStandalonePlaylistAction.baseInstance);
            }
        }
    }
}
