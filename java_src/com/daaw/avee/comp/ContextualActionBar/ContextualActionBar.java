package com.daaw.avee.comp.ContextualActionBar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.ActionMode;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ItemSelection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class ContextualActionBar {
    private ActionMode actionMode;
    public static WeakEventR<ContextData> onRequestContextData = new WeakEventR<>();
    public static WeakEvent1<Boolean> onSelectModeChanged = new WeakEvent1<>();
    public static WeakEvent2<ItemSelection.One<Object>, Boolean> onItemSelectionChanged = new WeakEvent2<>();
    public static WeakEvent1<IGeneralItemContainerIdentifier> onContainerItemsDeselected = new WeakEvent1<>();
    public static WeakEvent onAllItemsDeselected = new WeakEvent();
    private static final Object createInstanceLock = new Object();
    private static volatile WeakReference<ContextualActionBar> instanceWeak = new WeakReference<>(null);
    private HashMap<ItemActionBase, Integer> availableActions = new HashMap<>();
    private HashMap<ItemSelection.One<Object>, ItemEntry> selectedItems = new HashMap<>();
    private boolean actionModeShouldbeRecreated = false;

    public static ContextualActionBar createInstance() {
        ContextualActionBar contextualActionBar;
        ContextualActionBar contextualActionBar2 = instanceWeak.get();
        if (contextualActionBar2 != null) {
            return contextualActionBar2;
        }
        synchronized (createInstanceLock) {
            contextualActionBar = instanceWeak.get();
            if (contextualActionBar == null) {
                contextualActionBar = new ContextualActionBar();
                instanceWeak = new WeakReference<>(contextualActionBar);
            }
        }
        return contextualActionBar;
    }

    public static ContextualActionBar getInstance() {
        return instanceWeak.get();
    }

    public void onItemSelected(ActionListenerBase[] actionListenerBaseArr, Boolean bool, ItemSelection.One<Object> one) {
        Object itemIdentifier = one.getItemIdentifier();
        if (bool.booleanValue()) {
            ItemEntry itemEntry = new ItemEntry();
            itemEntry.itemActions = actionListenerBaseArr;
            itemEntry.itemActionObj = itemIdentifier;
            selectItem(one, itemEntry);
            return;
        }
        deselectItem(one);
    }

    void selectItem(ItemSelection.One<Object> one, ItemEntry itemEntry) {
        onItemSelectionChanged.invoke(one, true);
        this.selectedItems.put(one, itemEntry);
        HashMap hashMap = new HashMap();
        for (ActionListenerBase actionListenerBase : itemEntry.itemActions) {
            ItemActionBase itemActionBase = actionListenerBase.getItemActionBase();
            if (((Integer) hashMap.get(itemActionBase)) != null) {
                Assert.fail("There can only be unique ItemActionBase actions per item");
            } else {
                hashMap.put(itemActionBase, 1);
                Integer num = this.availableActions.get(itemActionBase);
                if (num == null) {
                    num = 0;
                }
                this.availableActions.put(itemActionBase, Integer.valueOf(num.intValue() + 1));
            }
        }
        updateMenu();
    }

    void deselectItem(ItemSelection.One<Object> one) {
        Integer num;
        onItemSelectionChanged.invoke(one, false);
        ItemEntry remove = this.selectedItems.remove(one);
        if (remove != null) {
            for (ActionListenerBase actionListenerBase : remove.itemActions) {
                ItemActionBase itemActionBase = actionListenerBase.getItemActionBase();
                if (this.availableActions.get(itemActionBase) != null) {
                    Integer valueOf = Integer.valueOf(num.intValue() - 1);
                    if (valueOf.intValue() > 0) {
                        this.availableActions.put(itemActionBase, valueOf);
                    } else {
                        this.availableActions.remove(itemActionBase);
                    }
                }
            }
        }
        updateMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deselectAllItems() {
        onAllItemsDeselected.invoke();
        this.availableActions.clear();
        this.selectedItems.clear();
    }

    public void onActivityDestroyed() {
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            this.actionModeShouldbeRecreated = true;
            actionMode.finish();
            this.actionMode = null;
        }
    }

    public void updateMenu() {
        MainActivity mainActivity = MainActivity.getInstance();
        if (mainActivity == null) {
            this.actionModeShouldbeRecreated = true;
            ActionMode actionMode = this.actionMode;
            if (actionMode != null) {
                actionMode.finish();
                return;
            }
            return;
        }
        if (this.selectedItems.size() > 0) {
            if (this.actionMode == null) {
                this.actionMode = mainActivity.startSupportActionMode(new ActionModeCallback());
                onSelectModeChanged.invoke(true);
            }
        } else {
            ActionMode actionMode2 = this.actionMode;
            if (actionMode2 != null) {
                actionMode2.finish();
            }
        }
        ActionMode actionMode3 = this.actionMode;
        if (actionMode3 != null) {
            actionMode3.setTitle(this.selectedItems.size() + " selected");
        }
    }

    boolean executeAction(ContextData contextData, ItemActionBase itemActionBase) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<ItemEntry> it = this.selectedItems.values().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            ItemEntry next = it.next();
            ActionListenerBase[] actionListenerBaseArr = next.itemActions;
            int length = actionListenerBaseArr.length;
            while (true) {
                if (i < length) {
                    ActionListenerBase actionListenerBase = actionListenerBaseArr[i];
                    if (actionListenerBase.getItemActionBase().equals(itemActionBase)) {
                        arrayList2.add(next.itemActionObj);
                        arrayList.add(actionListenerBase);
                        break;
                    }
                    i++;
                }
            }
        }
        if (arrayList.size() > 0) {
            itemActionBase.executeListBase(contextData, arrayList2, arrayList);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ItemEntry {
        Object itemActionObj;
        ActionListenerBase[] itemActions;

        ItemEntry() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ActionModeCallback implements ActionMode.Callback {
        List<ItemActionBase> actionsToShow;

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        private ActionModeCallback() {
            this.actionsToShow = new ArrayList();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            ContextualActionBar.this.actionModeShouldbeRecreated = false;
            actionMode.getMenuInflater().inflate(R.menu.contextual_menu, menu);
            menu.findItem(R.id.action_overflow).getSubMenu();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (menuItem.getItemId() == R.id.action_overflow) {
                SubMenu subMenu = menuItem.getSubMenu();
                subMenu.clear();
                int size = ContextualActionBar.this.selectedItems.size();
                this.actionsToShow.clear();
                if (size > 0) {
                    for (Map.Entry entry : ContextualActionBar.this.availableActions.entrySet()) {
                        tlog.w("" + ((ItemActionBase) entry.getKey()).toString() + " count: " + entry.getValue());
                        if (((Integer) entry.getValue()).intValue() == size && ((ItemActionBase) entry.getKey()).getShouldShow() && ((size == 1 && ((ItemActionBase) entry.getKey()).isAllowSingle()) || (size > 1 && ((ItemActionBase) entry.getKey()).isAllowMultiple()))) {
                            this.actionsToShow.add(entry.getKey());
                        }
                    }
                }
                for (int i = 0; i < this.actionsToShow.size(); i++) {
                    subMenu.add(0, i + 10, this.actionsToShow.get(i).getActionId(), this.actionsToShow.get(i).getNameStrResId());
                }
                return true;
            }
            int itemId = menuItem.getItemId() - 10;
            if (itemId >= 0 && itemId < ContextualActionBar.this.availableActions.size()) {
                ContextData invoke = ContextualActionBar.onRequestContextData.invoke(null);
                if (invoke != null) {
                    if (ContextualActionBar.this.executeAction(invoke, this.actionsToShow.get(itemId))) {
                        actionMode.finish();
                        return true;
                    }
                } else {
                    tlog.w("onRequestContextData returned null");
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            ContextualActionBar.this.actionMode = null;
            if (!ContextualActionBar.this.actionModeShouldbeRecreated) {
                ContextualActionBar.this.deselectAllItems();
            }
            ContextualActionBar.onSelectModeChanged.invoke(false);
        }
    }
}
