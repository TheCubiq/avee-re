package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
/* loaded from: classes.dex */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    public abstract void onBind(IContainerData iContainerData, int i);

    public BaseViewHolder(View view) {
        super(view);
    }
}
