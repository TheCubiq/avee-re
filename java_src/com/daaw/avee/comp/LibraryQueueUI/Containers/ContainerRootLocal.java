package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.VTaskResult;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.IceCast.ContainerIcecast;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.CompositeAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CompositeContainer;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.Shoutcast.ContainerShoutcastGenresPri;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class ContainerRootLocal extends CursorContainerBase {
    private static final String AddressIcecast = "7";
    public static final String AddressMore = "6";
    private static final String AddressShoutcast = "8";
    private static final int iconResId_Icecast = 2131230988;
    private static final int iconResId_Shoutcast = 2131230988;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    public ContainerRootLocal(Context context, int i, WeakReference<IContainerData.ILibraryContainerDataListener> weakReference) {
        super(context, "/", "Library", R.drawable.ic_library_2, i, weakReference);
        init(context);
    }

    static Cursor makeCursor(IContainerData.ILibraryContainerDataListener iLibraryContainerDataListener) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "", "", ""});
        matrixCursor.addRow(new String[]{"-1", "2131755181", "", "2131230969"});
        matrixCursor.addRow(new String[]{"0", "2131755191", "", "2131230974"});
        matrixCursor.addRow(new String[]{"1", "2131755177", "", "2131230901"});
        matrixCursor.addRow(new String[]{"2", "2131755179", "", "2131230902"});
        matrixCursor.addRow(new String[]{"3", "2131755184", "", "2131230957"});
        matrixCursor.addRow(new String[]{"4", "2131755188", "", "2131230969"});
        matrixCursor.addRow(new String[]{"5", "2131755182", "", "2131230932"});
        if (iLibraryContainerDataListener != null && iLibraryContainerDataListener.onRequestRootContainerItemsVisible() == 0) {
            matrixCursor.addRow(new String[]{AddressMore, "2131755187", "", "2131230926"});
        } else {
            matrixCursor.addRow(new String[]{AddressIcecast, "2131755175", "dir.xiph.org", "2131230988"});
            matrixCursor.addRow(new String[]{AddressShoutcast, "2131755358", "www.shoutcast.com", "2131230988"});
        }
        return matrixCursor;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 3, 16), this);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public String getItemPositionToItemAddress(int i) {
        return getItem(i).getString(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r13.equals("2") != false) goto L14;
     */
    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewAdapter createChildAdapter(Context context, String str) {
        String str2;
        int i;
        int findRowAndMove = findRowAndMove("_id", str);
        char c = 3;
        if (findRowAndMove >= 0) {
            String string = context.getString(getItem(findRowAndMove).getInt(1));
            i = getItem(findRowAndMove).getInt(3);
            str2 = string;
        } else {
            str2 = "";
            i = 0;
        }
        int hashCode = str.hashCode();
        if (hashCode == 55) {
            if (str.equals(AddressIcecast)) {
                c = 7;
            }
            c = 65535;
        } else if (hashCode == 56) {
            if (str.equals(AddressShoutcast)) {
                c = '\b';
            }
            c = 65535;
        } else if (hashCode != 1444) {
            switch (hashCode) {
                case 48:
                    if (str.equals("0")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 49:
                    if (str.equals("1")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 50:
                    break;
                case 51:
                    if (str.equals("3")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 52:
                    if (str.equals("4")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 53:
                    if (str.equals("5")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } else {
            if (str.equals("-1")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                ContainerAllSongs containerAllSongs = new ContainerAllSongs(context, makeChildAddress(str), str2, i, this.pageIndex);
                containerAllSongs.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return containerAllSongs.createOrGetAdapter(context, 0);
            case 1:
                ContainerRecently containerRecently = new ContainerRecently(context, makeChildAddress(str), str2, i, this.pageIndex);
                containerRecently.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return containerRecently.createOrGetAdapter(context, 0);
            case 2:
                ContainerAlbums containerAlbums = new ContainerAlbums(context, makeChildAddress(str), str2, i, this.pageIndex);
                containerAlbums.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return containerAlbums.createOrGetAdapter(context);
            case 3:
                ContainerArtists containerArtists = new ContainerArtists(context, makeChildAddress(str), str2, i, this.pageIndex);
                containerArtists.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return containerArtists.createOrGetAdapter(context);
            case 4:
                ContainerGenres containerGenres = new ContainerGenres(context, makeChildAddress(str), str2, i, this.pageIndex);
                containerGenres.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return containerGenres.createOrGetAdapter(context);
            case 5:
                final ContainerPlaylist containerPlaylist = new ContainerPlaylist(context, makeChildAddress(str), this.pageIndex);
                final ContainerPlaylistFiles containerPlaylistFiles = new ContainerPlaylistFiles(context, makeChildAddress(str), this.pageIndex);
                CompositeContainer compositeContainer = new CompositeContainer(new IContainerData[]{containerPlaylist, containerPlaylistFiles}, new VTaskResult(context.getResources().getString(R.string.libContainer_Playlists)), R.drawable.ic_playlist4, new CompositeContainer.AdapterFactory() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerRootLocal.1
                    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CompositeContainer.AdapterFactory
                    public ViewAdapter createOrGetAdapter(Context context2, int i2, IContainerData iContainerData) {
                        CompositeAdapterData.SectionDesc[] sectionDescArr = {new CompositeAdapterData.SectionDesc(12), new CompositeAdapterData.SectionDesc(12)};
                        ContainerPlaylist containerPlaylist2 = containerPlaylist;
                        ContainerPlaylistFiles containerPlaylistFiles2 = containerPlaylistFiles;
                        return new ViewAdapter(new HeaderFooterAdapterData(new CompositeAdapterData(sectionDescArr, new ViewAdapter.IAdapterDataProvider[]{containerPlaylist2, containerPlaylistFiles2}, new IContainerData[]{containerPlaylist2, containerPlaylistFiles2}), iContainerData, 6, 1), iContainerData);
                    }
                });
                compositeContainer.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return compositeContainer.createOrGetAdapter(context);
            case 6:
                ContainerFolders containerFolders = new ContainerFolders(context, makeChildAddress(str), str2, i, this.pageIndex);
                containerFolders.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return containerFolders.createOrGetAdapter(context);
            case 7:
                ContainerIcecast containerIcecast = new ContainerIcecast(context, makeChildAddress(str), context.getString(R.string.icecast_name), R.drawable.ic_stream0, this.pageIndex);
                containerIcecast.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return containerIcecast.createOrGetAdapter(context);
            case '\b':
                ContainerShoutcastGenresPri CreatePrimaryGenres = ContainerShoutcastGenresPri.CreatePrimaryGenres(context, makeChildAddress(str), new VTaskResult(context.getString(R.string.shoutcast_name)), R.drawable.ic_stream0, this.pageIndex);
                CreatePrimaryGenres.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
                return CreatePrimaryGenres.createOrGetAdapter(context);
            default:
                return null;
        }
    }

    public void getView(Cursor cursor, int i, ContentItemViewHolder contentItemViewHolder) {
        contentItemViewHolder.setToDefault(this, getSelectionContainerIdentifier());
        contentItemViewHolder.setImgResource(cursor.getInt(3));
        contentItemViewHolder.setImgColorFilter(this.colorImgArt);
        contentItemViewHolder.txtNum.setVisibility(8);
        contentItemViewHolder.txtItemLine1.setText(cursor.getInt(1));
        contentItemViewHolder.txtItemLine1.setTextColor(this.color);
        contentItemViewHolder.setTxtItemLine2Visibility(8);
        contentItemViewHolder.txtItemDuration.setText("");
        if (cursor.getString(0).equals(AddressMore)) {
            contentItemViewHolder.setImgResource(cursor.getInt(3));
            contentItemViewHolder.setImgColorFilter(this.colorLight);
            contentItemViewHolder.txtItemLine1.setTextColor(this.colorLight);
        } else if (cursor.getString(0).equals(AddressIcecast) || cursor.getString(0).equals(AddressShoutcast)) {
            contentItemViewHolder.setTxtItemLine2Visibility(0);
            contentItemViewHolder.setTxtItemLine2Text(cursor.getString(2));
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase
    public Tuple2<Cursor, String> createOrGetCursor(Context context) {
        return new Tuple2<>(makeCursor(this.libraryContainerDataListenerWeak.get()), null);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Cursor item = getItem(i);
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        getView(item, i, contentItemViewHolder);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean getSectionOpened() {
        return onRequestSectionOpenedState.invoke(ContainerRootLocal.class, false).booleanValue();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setSectionOpenedState(boolean z) {
        onSetSectionOpened.invoke(Boolean.valueOf(z), ContainerRootLocal.class);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean RefreshContent() {
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return true;
        }
        setDataAndNotifyDataSetChanged(createOrGetCursor(appContext).obj1, null);
        return true;
    }
}
