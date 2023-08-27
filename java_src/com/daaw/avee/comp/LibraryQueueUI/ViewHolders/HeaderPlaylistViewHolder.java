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
public class HeaderPlaylistViewHolder extends BaseHeaderViewHolder {
    private TextView[] buttonTexts;
    private View[] imgBtns;

    public HeaderPlaylistViewHolder(Context context, ViewGroup viewGroup, IContainerData iContainerData) {
        super(UtilsUI.getInflaterFromContext(context).inflate(R.layout.header_playlists_item, viewGroup, false), iContainerData);
        this.imgBtns = new View[3];
        this.buttonTexts = new TextView[3];
        View view = this.itemView;
        this.imgBtns[0] = view.findViewById(R.id.group1);
        this.imgBtns[1] = view.findViewById(R.id.group2);
        this.imgBtns[2] = view.findViewById(R.id.group7);
        this.buttonTexts[0] = (TextView) view.findViewById(R.id.txt1);
        this.buttonTexts[1] = (TextView) view.findViewById(R.id.txt2);
        this.buttonTexts[2] = (TextView) view.findViewById(R.id.txt7);
        updateShowButtonTexts(this.buttonTexts, context);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseHeaderViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        super.onBind(iContainerData, i);
        this.imgBtns[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderPlaylistViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseHeaderViewHolder.onActionCreatePlaylist.invoke(null, null, new ContextData(view));
            }
        });
        this.imgBtns[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderPlaylistViewHolder.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseHeaderViewHolder.onLibraryQueue2UI_ActionScanStandalonePlaylist.invoke(new ContextData(view));
            }
        });
        this.imgBtns[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderPlaylistViewHolder.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view), Integer.valueOf((int) LibraryQueueFragmentBase.ACTION_SwitchView), view);
            }
        });
    }
}
