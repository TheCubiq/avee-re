.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$2;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayMultiItemAction$PlayMultiActionListener2;
.source "ContainerAlbums.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayMultiItemAction$PlayMultiActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onPlayMulti(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
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

    .line 80
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ThisItemIdentifier;

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ThisItemIdentifier;->id:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
