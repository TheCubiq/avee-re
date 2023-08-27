package com.daaw.avee.comp.LibraryQueueUI.ContextualActions;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ItemActionBase;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ItemActionsFolders {
    public static WeakEvent3<Context, String, String> onActionRemoveFolder = new WeakEvent3<>();
    public static WeakEvent2<Context, List<String>> onActionAddToFolders = new WeakEvent2<>();

    /* loaded from: classes.dex */
    public static class RemoveFolderAction extends ItemActionBase {
        public static ItemActionBase baseInstance = new RemoveFolderAction();

        public RemoveFolderAction() {
            super(4, false, true, R.drawable.ic_close, R.string.libItemAction_removeFolder);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            MultiList<String, String> multiList = new MultiList<>();
            for (int i = 0; i < list.size(); i++) {
                ((RemoveFolderActionListener) list2.get(i)).onRemoveFolder(contextData.getContext(), list.get(i), multiList);
            }
            Tuple2<String, String> tuple2 = multiList.size() > 0 ? multiList.get(multiList.size() - 1) : null;
            if (tuple2 != null) {
                ItemActionsFolders.onActionRemoveFolder.invoke(contextData.getContext(), tuple2.obj1, tuple2.obj2);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class RemoveFolderActionListener extends ActionListenerBase {
            protected abstract void onRemoveFolder(Context context, Object obj, MultiList<String, String> multiList);

            public RemoveFolderActionListener() {
                super(RemoveFolderAction.baseInstance);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class FileAddToFoldersAction extends ItemActionBase {
        public static ItemActionBase itemAction = new FileAddToFoldersAction();

        public FileAddToFoldersAction() {
            super(4, true, R.drawable.ic_add2, R.string.libItemAction_addToFolders);
        }

        @Override // com.daaw.avee.comp.ContextualActionBar.ItemActionBase
        public void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((Listener) list2.get(i)).onAddToFolders(contextData.getContext(), list.get(i), arrayList);
            }
            ItemActionsFolders.onActionAddToFolders.invoke(contextData.getContext(), arrayList);
        }

        /* loaded from: classes.dex */
        public static abstract class Listener extends ActionListenerBase {
            protected abstract void onAddToFolders(Context context, Object obj, List<String> list);

            public Listener() {
                super(FileAddToFoldersAction.itemAction);
            }
        }
    }
}
