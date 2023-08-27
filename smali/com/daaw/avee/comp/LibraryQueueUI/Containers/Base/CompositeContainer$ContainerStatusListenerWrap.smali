.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;
.super Ljava/lang/Object;
.source "CompositeContainer.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ContainerStatusListenerWrap"
.end annotation


# instance fields
.field info:Ljava/lang/String;

.field itemCount:I

.field loadingActive:Z

.field searchingActive:Z

.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

.field totalTime:I


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 251
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->itemCount:I

    .line 252
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->totalTime:I

    .line 253
    iput-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->searchingActive:Z

    .line 254
    iput-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->loadingActive:Z

    const-string p1, ""

    .line 255
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->info:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onItemCountChanged(IIZZ)V
    .locals 0

    .line 259
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->itemCount:I

    .line 260
    iput p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->totalTime:I

    .line 261
    iput-boolean p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->searchingActive:Z

    .line 262
    iput-boolean p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->loadingActive:Z

    .line 264
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)V

    return-void
.end method

.method public onUpdateStatusInfo(Ljava/lang/String;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->info:Ljava/lang/String;

    .line 271
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)V

    return-void
.end method
