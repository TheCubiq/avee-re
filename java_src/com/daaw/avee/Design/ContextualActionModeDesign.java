package com.daaw.avee.Design;

import android.app.Activity;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.ContextData;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ContextualActionBar;
import com.daaw.avee.comp.ContextualActionBar.ItemSelection;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ContextualActionModeDesign {
    private boolean selectingEnabled = false;
    private HashMap<IGeneralItemContainerIdentifier, ItemSelection<Object>> itemSelectionContainers = new HashMap<>();
    private List<Object> listenerRefHolder = new LinkedList();

    public ContextualActionModeDesign() {
        ContextualActionBar.onRequestContextData.subscribeWeak(new WeakEventR.Handler<ContextData>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public ContextData invoke() {
                return new ContextData(MainActivity.getInstance());
            }
        }, this.listenerRefHolder);
        ContextualActionBar.onSelectModeChanged.subscribeWeak(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                ContextualActionModeDesign.this.selectingEnabled = bool.booleanValue();
            }
        }, this.listenerRefHolder);
        ContextualActionBar.onItemSelectionChanged.subscribeWeak(new WeakEvent2.Handler<ItemSelection.One<Object>, Boolean>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(ItemSelection.One<Object> one, Boolean bool) {
                ItemSelection itemSelection = (ItemSelection) ContextualActionModeDesign.this.itemSelectionContainers.get(one.getContainerIdentifier());
                if (itemSelection == null) {
                    itemSelection = new ItemSelection(one.getContainerIdentifier());
                    ContextualActionModeDesign.this.itemSelectionContainers.put(one.getContainerIdentifier(), itemSelection);
                }
                if (bool.booleanValue()) {
                    itemSelection.addSelection(one);
                } else {
                    itemSelection.subtractSelection(one);
                }
            }
        }, this.listenerRefHolder);
        ContextualActionBar.onContainerItemsDeselected.subscribeWeak(new WeakEvent1.Handler<IGeneralItemContainerIdentifier>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.4
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
                ContextualActionModeDesign.this.itemSelectionContainers.remove(iGeneralItemContainerIdentifier);
            }
        }, this.listenerRefHolder);
        ContextualActionBar.onAllItemsDeselected.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                for (IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier : new ArrayList(ContextualActionModeDesign.this.itemSelectionContainers.keySet())) {
                    ContextualActionBar.onContainerItemsDeselected.invoke(iGeneralItemContainerIdentifier);
                }
                ContextualActionModeDesign.this.itemSelectionContainers.clear();
            }
        }, this.listenerRefHolder);
        MainActivity.onCreate.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                ContextualActionBar contextualActionBar = ContextualActionBar.getInstance();
                if (contextualActionBar != null) {
                    contextualActionBar.updateMenu();
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onDestroy.subscribeWeak(new WeakEvent1.Handler<ContextData>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ContextData contextData) {
                ContextualActionBar contextualActionBar = ContextualActionBar.getInstance();
                if (contextualActionBar != null) {
                    contextualActionBar.onActivityDestroyed();
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onItemSelected.subscribeWeak(new WeakEvent3.Handler<ActionListenerBase[], Boolean, ItemSelection.One<Object>>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(ActionListenerBase[] actionListenerBaseArr, Boolean bool, ItemSelection.One<Object> one) {
                ContextualActionBar contextualActionBar = ContextualActionBar.getInstance();
                if (contextualActionBar != null) {
                    contextualActionBar.onItemSelected(actionListenerBaseArr, bool, one);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestIsSelectingEnabled.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(ContextualActionModeDesign.this.selectingEnabled);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestContainsItemSelection.subscribeWeak(new WeakEventR1.Handler<ItemSelection.One, Boolean>() { // from class: com.daaw.avee.Design.ContextualActionModeDesign.10
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Boolean invoke(ItemSelection.One one) {
                return Boolean.valueOf(ContextualActionModeDesign.this.containsItemSelection(one));
            }
        }, this.listenerRefHolder);
    }

    boolean containsItemSelection(ItemSelection.One one) {
        ItemSelection<Object> itemSelection = this.itemSelectionContainers.get(one.getContainerIdentifier());
        return itemSelection != null && itemSelection.containsItem(one.getItemIdentifier());
    }
}
