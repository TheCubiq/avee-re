.class Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueueNext$1;
.super Ljava/lang/Object;
.source "ItemActionsStations2.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueueNext;->executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueueNext;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueueNext;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueueNext$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueueNext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 128
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$ItemActionEnqueueNext$1;->onResult(Ljava/util/List;Z)V

    return-void
.end method

.method public onResult(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    return-void

    .line 132
    :cond_0
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onEnqueue:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
