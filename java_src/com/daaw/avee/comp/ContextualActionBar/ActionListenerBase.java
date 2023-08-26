package com.daaw.avee.comp.ContextualActionBar;

import com.daaw.avee.ContextData;
/* loaded from: classes.dex */
public abstract class ActionListenerBase {
    private final ItemActionBase actionBase;

    public ActionListenerBase(ItemActionBase itemActionBase) {
        this.actionBase = itemActionBase;
    }

    public ItemActionBase getItemActionBase() {
        return this.actionBase;
    }

    public void execute(ContextData contextData, Object obj) {
        this.actionBase.executeBase(contextData, obj, this);
    }
}
