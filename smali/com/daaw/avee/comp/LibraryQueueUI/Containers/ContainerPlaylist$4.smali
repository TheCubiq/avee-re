.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$4;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemActionEnqueueNext$EnqueueNextActionListener2;
.source "ContainerPlaylist.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$4;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemActionEnqueueNext$EnqueueNextActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onEnqueue(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)V"
        }
    .end annotation

    .line 93
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ThisItemIdentifier;

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$4;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist$ThisItemIdentifier;->id:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;->access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
