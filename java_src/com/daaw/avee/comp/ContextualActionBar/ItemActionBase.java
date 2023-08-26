package com.daaw.avee.comp.ContextualActionBar;

import android.view.View;
import com.daaw.avee.ContextData;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ItemActionBase {
    private final int actionId;
    private final boolean allowMultiple;
    private final boolean allowSingle;
    private final int iconResId;
    private final int nameStrResId;
    private final boolean stayPressedHint;

    /* loaded from: classes.dex */
    public interface OnClickListener {
        void onClick(View view, ContentItemViewHolder contentItemViewHolder);
    }

    public abstract void executeListBase(ContextData contextData, List<Object> list, List<ActionListenerBase> list2);

    public boolean getShouldShow() {
        return true;
    }

    public ItemActionBase(int i, boolean z, int i2, int i3) {
        this(i, z, true, i2, i3);
    }

    public ItemActionBase(int i, boolean z, boolean z2, int i2, int i3) {
        this(i, z, z2, i2, i3, false);
    }

    public ItemActionBase(int i, boolean z, boolean z2, int i2, int i3, boolean z3) {
        this.allowMultiple = z;
        this.allowSingle = z2;
        this.actionId = i;
        this.iconResId = i2;
        this.nameStrResId = i3;
        this.stayPressedHint = z3;
    }

    public void executeBase(ContextData contextData, Object obj, ActionListenerBase actionListenerBase) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(obj);
        arrayList2.add(actionListenerBase);
        executeListBase(contextData, arrayList, arrayList2);
    }

    public int getActionId() {
        return this.actionId;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public int getNameStrResId() {
        return this.nameStrResId;
    }

    public boolean isAllowMultiple() {
        return this.allowMultiple;
    }

    public boolean isAllowSingle() {
        return this.allowSingle;
    }

    public boolean isStayPressedHint() {
        return this.stayPressedHint;
    }
}
