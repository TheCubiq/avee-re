.class public Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ViewHolderFactory;
.super Ljava/lang/Object;
.source "ViewHolderFactory.java"


# static fields
.field public static final VIEW_HOLDER_albums:I = 0x7

.field public static final VIEW_HOLDER_artists:I = 0x8

.field public static final VIEW_HOLDER_folders:I = 0x5

.field public static final VIEW_HOLDER_footer1:I = 0x1

.field public static final VIEW_HOLDER_footer1_network:I = 0xf

.field public static final VIEW_HOLDER_footer_library:I = 0x10

.field public static final VIEW_HOLDER_footer_queue:I = 0xd

.field public static final VIEW_HOLDER_genres:I = 0x9

.field public static final VIEW_HOLDER_libContent:I = 0x0

.field public static final VIEW_HOLDER_plain:I = 0x2

.field public static final VIEW_HOLDER_plain_gone:I = 0x3

.field public static final VIEW_HOLDER_playLists:I = 0x6

.field public static final VIEW_HOLDER_queue:I = 0x4

.field public static final VIEW_HOLDER_section:I = 0xc

.field public static final VIEW_HOLDER_songFilesItem:I = 0xb

.field public static final VIEW_HOLDER_songStationsItem:I = 0xe

.field public static final VIEW_HOLDER_songsItem:I = 0xa


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static newInstance(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;
    .locals 0

    packed-switch p2, :pswitch_data_0

    .line 73
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "viewType: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljunit/framework/Assert;->fail(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    .line 71
    :pswitch_0
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;

    const/4 p3, 0x2

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;I)V

    return-object p2

    .line 69
    :pswitch_1
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;I)V

    return-object p2

    .line 63
    :pswitch_2
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongStationsViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 67
    :pswitch_3
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/FooterQueueViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    .line 65
    :pswitch_4
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    .line 61
    :pswitch_5
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 59
    :pswitch_6
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 57
    :pswitch_7
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderGenresViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderGenresViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    .line 55
    :pswitch_8
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderArtistsViewHolder;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderArtistsViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 53
    :pswitch_9
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderAlbumsViewHolder;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderAlbumsViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 51
    :pswitch_a
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlaylistViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 49
    :pswitch_b
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderFoldersViewHolder;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderFoldersViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 47
    :pswitch_c
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderQueueViewHolder;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderQueueViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 45
    :pswitch_d
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlainGoneViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlainGoneViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    .line 43
    :pswitch_e
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlainViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderPlainViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    .line 41
    :pswitch_f
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/Footer1ViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;I)V

    return-object p2

    .line 39
    :pswitch_10
    new-instance p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;-><init>(Landroid/view/ViewGroup;)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
