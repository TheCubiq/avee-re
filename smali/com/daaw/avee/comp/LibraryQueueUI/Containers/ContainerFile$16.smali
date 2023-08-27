.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;
.super Ljava/lang/Object;
.source "ContainerFile.java"

# interfaces
.implements Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compareTask(Landroid/os/AsyncTask;)Z
    .locals 3

    .line 251
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onCompareSearchTask:Lcom/daaw/avee/Common/Events/WeakEventR2;

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-static {v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public onItemDirFound(Landroid/os/AsyncTask;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
    .locals 0

    .line 277
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->compareTask(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 278
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    const-string p2, ""

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$600(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_1
    return-void
.end method

.method public onItemFileFound(Landroid/os/AsyncTask;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
    .locals 1

    .line 284
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->compareTask(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 285
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    const-string v0, ""

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$700(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 288
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->justAddData(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V

    return-void
.end method

.method public onSearchFinished(Landroid/os/AsyncTask;Z)V
    .locals 1

    .line 267
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->compareTask(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 268
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    const-string p2, ""

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$400(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 270
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$500(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;ZZ)V

    .line 271
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->RefreshContent()Z

    return-void
.end method

.method public onSearchStarted(Landroid/os/AsyncTask;)V
    .locals 2

    .line 256
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->compareTask(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 257
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    const-string v0, ""

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 258
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$300(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;ZZ)V

    .line 260
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 262
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$16;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->RefreshContent()Z

    return-void
.end method
