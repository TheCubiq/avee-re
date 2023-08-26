.class final Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$20;
.super Ljava/lang/Object;
.source "ContainerSongs.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 0

    .line 380
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$20;->val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataReady(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 384
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 386
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 388
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$20;->val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v1, v1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->dataId:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$20;->val$holder:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget-object v1, v1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->dataId:Ljava/lang/Object;

    invoke-virtual {v1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 389
    sget-object p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->onPlaylistSongDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p3, p2, p1, v0}, Lcom/daaw/avee/Common/Events/WeakDelegate3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
