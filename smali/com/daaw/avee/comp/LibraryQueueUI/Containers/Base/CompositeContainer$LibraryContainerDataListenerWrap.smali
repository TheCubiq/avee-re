.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;
.super Ljava/lang/Object;
.source "CompositeContainer.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LibraryContainerDataListenerWrap"
.end annotation


# instance fields
.field index:I

.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;I)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    iput p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->index:I

    return-void
.end method


# virtual methods
.method public makeChildAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 289
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->index:I

    invoke-static {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->makePrefix(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->makeChildAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public onNavigateForward(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 284
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->index:I

    invoke-static {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->makePrefix(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->onNavigateForward(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRequestRootContainerItemsVisible()I
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->onRequestRootContainerItemsVisible()I

    move-result v0

    return v0
.end method

.method public onRequestShuffleMode()I
    .locals 1

    .line 294
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->onRequestShuffleMode()I

    move-result v0

    return v0
.end method

.method public subscribeWeakFollowCurrentValueChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 304
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->subscribeWeakFollowCurrentValueChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method

.method public subscribeWeakShowAlbumArtValueChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 309
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->subscribeWeakShowAlbumArtValueChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method

.method public subscribeWeakShuffleModeChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 299
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;->subscribeWeakShuffleModeChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method
