.class Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction$1;
.super Ljava/lang/Object;
.source "ItemActionsStations2.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction;->executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
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
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction;

.field final synthetic val$contextData:Lcom/daaw/avee/ContextData;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction;Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction$1;->val$contextData:Lcom/daaw/avee/ContextData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 163
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction$1;->onResult(Ljava/util/List;Z)V

    return-void
.end method

.method public onResult(Ljava/util/List;Z)V
    .locals 3
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

    .line 167
    :cond_0
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onLibraryQueueUI_ActionSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction$1;->val$contextData:Lcom/daaw/avee/ContextData;

    invoke-virtual {v0}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$SendToItemAction$1;->val$contextData:Lcom/daaw/avee/ContextData;

    invoke-virtual {p2, v0, p1, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
