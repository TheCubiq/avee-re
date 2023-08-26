.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$9;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$EnqueueAllContainerItemAction$EnqueueAllContainerActionListener2;
.source "ContainerSongs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$9;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$EnqueueAllContainerItemAction$EnqueueAllContainerActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onEnqueue(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0
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

    .line 155
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$9;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->access$400(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    .line 156
    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method
