.class Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$1;
.super Ljava/lang/Object;
.source "ItemActionsStations2.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;->executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
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
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 50
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$1;->onResult(Ljava/util/List;Z)V

    return-void
.end method

.method public onResult(Ljava/util/List;Z)V
    .locals 2
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

    .line 62
    :cond_0
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2;->onOpenOnly:Lcom/daaw/avee/Common/Events/WeakEvent3;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
