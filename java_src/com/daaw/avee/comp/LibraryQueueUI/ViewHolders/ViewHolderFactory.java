package com.daaw.avee.comp.LibraryQueueUI.ViewHolders;

import android.content.Context;
import android.view.ViewGroup;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class ViewHolderFactory {
    public static final int VIEW_HOLDER_albums = 7;
    public static final int VIEW_HOLDER_artists = 8;
    public static final int VIEW_HOLDER_folders = 5;
    public static final int VIEW_HOLDER_footer1 = 1;
    public static final int VIEW_HOLDER_footer1_network = 15;
    public static final int VIEW_HOLDER_footer_library = 16;
    public static final int VIEW_HOLDER_footer_queue = 13;
    public static final int VIEW_HOLDER_genres = 9;
    public static final int VIEW_HOLDER_libContent = 0;
    public static final int VIEW_HOLDER_plain = 2;
    public static final int VIEW_HOLDER_plain_gone = 3;
    public static final int VIEW_HOLDER_playLists = 6;
    public static final int VIEW_HOLDER_queue = 4;
    public static final int VIEW_HOLDER_section = 12;
    public static final int VIEW_HOLDER_songFilesItem = 11;
    public static final int VIEW_HOLDER_songStationsItem = 14;
    public static final int VIEW_HOLDER_songsItem = 10;

    public static BaseViewHolder newInstance(Context context, ViewGroup viewGroup, int i, IContainerData iContainerData) {
        switch (i) {
            case 0:
                return new ContentItemViewHolder(viewGroup);
            case 1:
                return new Footer1ViewHolder(context, viewGroup, 0);
            case 2:
                return new HeaderPlainViewHolder(context, viewGroup);
            case 3:
                return new HeaderPlainGoneViewHolder(context, viewGroup);
            case 4:
                return new HeaderQueueViewHolder(context, viewGroup, iContainerData);
            case 5:
                return new HeaderFoldersViewHolder(context, viewGroup, iContainerData);
            case 6:
                return new HeaderPlaylistViewHolder(context, viewGroup, iContainerData);
            case 7:
                return new HeaderAlbumsViewHolder(context, viewGroup, iContainerData);
            case 8:
                return new HeaderArtistsViewHolder(context, viewGroup, iContainerData);
            case 9:
                return new HeaderGenresViewHolder(context, viewGroup);
            case 10:
                return new HeaderSongsViewHolder(context, viewGroup, iContainerData);
            case 11:
                return new HeaderSongFilesViewHolder(context, viewGroup, iContainerData);
            case 12:
                return new SectionViewHolder(context, viewGroup);
            case 13:
                return new FooterQueueViewHolder(context, viewGroup);
            case 14:
                return new HeaderSongStationsViewHolder(context, viewGroup, iContainerData);
            case 15:
                return new Footer1ViewHolder(context, viewGroup, 1);
            case 16:
                return new Footer1ViewHolder(context, viewGroup, 2);
            default:
                Assert.fail("viewType: " + i);
                return null;
        }
    }
}
