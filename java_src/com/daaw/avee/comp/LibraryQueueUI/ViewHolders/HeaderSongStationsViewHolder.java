package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class HeaderSongStationsViewHolder extends BaseHeaderViewHolder {
    private int btnColor0;
    private ImageView[] buttonIcons;
    private TextView[] buttonTexts;
    private View[] buttons;
    private List<Object> listenerRefHolder;

    public HeaderSongStationsViewHolder(Context context, ViewGroup viewGroup, IContainerData iContainerData) {
        super(UtilsUI.getInflaterFromContext(context).inflate(R.layout.header_songs_stations_item, viewGroup, false), iContainerData, false);
        this.buttonIcons = new ImageView[5];
        this.buttonTexts = new TextView[5];
        this.buttons = new View[5];
        this.listenerRefHolder = new LinkedList();
        View view = this.itemView;
        this.btnColor0 = UtilsUI.getAttrColor(view, (int) R.attr.containerFG);
        TextView[] textViewArr = this.buttonTexts;
        textViewArr[0] = null;
        textViewArr[1] = null;
        textViewArr[2] = (TextView) view.findViewById(R.id.txt5);
        this.buttonTexts[3] = (TextView) view.findViewById(R.id.txt6);
        this.buttonTexts[4] = (TextView) view.findViewById(R.id.txt7);
        this.buttonIcons[3] = (ImageView) view.findViewById(R.id.btn6);
        updateShowButtonTexts(this.buttonTexts, context);
        View[] viewArr = this.buttons;
        viewArr[0] = null;
        viewArr[1] = null;
        viewArr[2] = view.findViewById(R.id.group5);
        this.buttons[3] = view.findViewById(R.id.group6);
        this.buttons[4] = view.findViewById(R.id.group7);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseHeaderViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsViewHolder, com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder
    public void onBind(IContainerData iContainerData, int i) {
        super.onBind(iContainerData, i);
        this.listenerRefHolder.clear();
        IContainerData.ILibraryContainerDataListener libraryContainerDataListener = iContainerData.getLibraryContainerDataListener();
        if (libraryContainerDataListener != null) {
            libraryContainerDataListener.subscribeWeakShowAlbumArtValueChanged(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderSongStationsViewHolder.1
                @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
                public void invoke(Boolean bool) {
                    HeaderSongStationsViewHolder.this.onShowAlbumArtInsteadChanged(bool.booleanValue());
                }
            }, this.listenerRefHolder);
        }
        this.buttons[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderSongStationsViewHolder.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseHeaderViewHolder.onActionChooseSortStations.invoke(new ContextData(view), view);
            }
        });
        this.buttons[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderSongStationsViewHolder.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view), 115, view);
            }
        });
        this.buttons[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.ViewHolders.HeaderSongStationsViewHolder.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseHeaderViewHolder.onAction.invoke(new ContextData(view), Integer.valueOf((int) LibraryQueueFragmentBase.ACTION_SwitchView), view);
            }
        });
        onShowAlbumArtInsteadChanged(iContainerData.getShowAlbumArtValue());
    }

    public void onShowAlbumArtInsteadChanged(boolean z) {
        if (z) {
            ImageView[] imageViewArr = this.buttonIcons;
            imageViewArr[3].setColorFilter(UtilsUI.getAttrColor(imageViewArr[3], (int) R.attr.containerHighLight));
            return;
        }
        this.buttonIcons[3].setColorFilter(this.btnColor0);
    }
}
