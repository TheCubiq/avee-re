.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$2;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayMultiItemAction$PlayMultiActionListener2;
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

    .line 83
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayMultiItemAction$PlayMultiActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onPlayMulti(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
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

    .line 86
    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    .line 87
    iget-object p1, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
