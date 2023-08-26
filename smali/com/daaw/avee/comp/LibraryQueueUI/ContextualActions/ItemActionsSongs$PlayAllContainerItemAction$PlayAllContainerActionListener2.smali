.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;
.super Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;
.source "ItemActionsSongs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PlayAllContainerActionListener2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 312
    invoke-static {}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction;->access$000()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)V

    return-void
.end method


# virtual methods
.method protected abstract onPlayAllContainer(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Lcom/daaw/avee/Common/MultiList;)Lcom/daaw/avee/Common/Tuple3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)",
            "Lcom/daaw/avee/Common/Tuple3<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method
