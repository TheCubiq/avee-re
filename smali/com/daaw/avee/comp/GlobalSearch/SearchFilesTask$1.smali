.class Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$1;
.super Ljava/lang/Object;
.source "SearchFilesTask.java"

# interfaces
.implements Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isCancelled()Z
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public onItemDirFound(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
    .locals 0

    return-void
.end method

.method public onItemFileFound(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;

    invoke-static {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->access$000(Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->setIndex(I)V

    .line 35
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;

    invoke-static {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->access$008(Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;)I

    .line 37
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;->access$100(Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;[Ljava/lang/Object;)V

    return-void
.end method
