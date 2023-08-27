.class Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$1;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$Listener;
.source "ContainerShoutcast.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$1;->this$0:Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$Listener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onExecute(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/avee/Common/VAsyncTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;>;"
        }
    .end annotation

    .line 56
    check-cast p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$ThisItemIdentifier;

    .line 57
    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getShoutcastDirectory()Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    move-result-object p1

    iget-object v0, p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->getShoutcastBase()Ljava/lang/String;

    move-result-object v0

    iget-object p2, p2, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->getShoutcastId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->tuneInStation(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p1

    return-object p1
.end method
