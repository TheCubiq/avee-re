.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$5;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$SendToItemAction$SendToActionListener;
.source "ContainerGenres.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$5;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$SendToItemAction$SendToActionListener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onSendTo(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
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

    .line 100
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$ThisItemIdentifier;

    .line 101
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$5;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres$ThisItemIdentifier;->id:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerGenres;->access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
