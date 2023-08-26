package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
/* loaded from: classes.dex */
public class HeaderFoldersViewHolder extends BaseHeaderViewHolder {
    private TextView[] buttonTexts;
    private View[] buttons;

    public HeaderFoldersViewHolder(Context context, ViewGroup viewGroup, IContainerData iContainerData) {
        super(UtilsUI.getInflaterFromContext(context).inflate(R.layout.header_folder_item, viewGroup, false), iContainerData);
        this.buttonTexts = new TextView[2];
        this.buttons = new View[2];
        View view = this.itemView;
        this.buttons[0] = view.findViewById(R.id.group1);
        this.buttons[1] = view.findViewById(R.id.group7);
        this.buttonTexts[0] = (TextView) view.findViewById(R.id.txt1);
        this.buttonTexts[1] = (TextView) view.findViewById(R.id.txt7);
        updateShowButtonTexts(this.buttonTexts, context);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseHeaderViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        super.onBind(iContainerData, i);
        this.buttons[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderFoldersViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view), 120, view);
            }
        });
        this.buttons[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderFoldersViewHolder.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view), Integer.valueOf((int) LibraryQueueFragmentBase.ACTION_SwitchView), view);
            }
        });
    }
}
