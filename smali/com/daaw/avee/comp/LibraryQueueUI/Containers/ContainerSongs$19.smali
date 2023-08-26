.class final Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;
.super Ljava/lang/Object;
.source "ContainerSongs.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action1<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

.field final synthetic val$item:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field final synthetic val$playnowlist:Z

.field final synthetic val$queueItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;


# direct methods
.method constructor <init>(ZLcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V
    .locals 0

    .line 328
    iput-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$playnowlist:Z

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$queueItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iput-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$item:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 3

    .line 332
    iget-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$playnowlist:Z

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 336
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    if-eqz p1, :cond_0

    .line 344
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$queueItemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 345
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setActivated(Z)V

    goto :goto_0

    .line 347
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setActivated(Z)V

    goto :goto_0

    .line 358
    :cond_1
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$item:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {p1, v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->compare(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 359
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setActivated(Z)V

    goto :goto_0

    .line 361
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setActivated(Z)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)V
    .locals 0

    .line 328
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method
