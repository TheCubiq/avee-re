.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2;
.super Ljava/lang/Object;
.source "ItemActionsStations2.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction;,
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueueNext;,
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueue;,
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;
    }
.end annotation


# static fields
.field public static onOpenOnly:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2;->onOpenOnly:Lcom/daaw/avee/Common/Events/WeakEvent3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
