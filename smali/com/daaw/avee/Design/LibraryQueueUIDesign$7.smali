.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$7;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LibraryQueueUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/ContextData;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$7;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;Ljava/lang/String;)V
    .locals 2

    .line 184
    new-instance p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {p1, p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Ljava/lang/String;)V

    .line 185
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 186
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 190
    invoke-virtual {p1, p2, v1, v1, v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->open(Ljava/util/List;IILcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 181
    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$7;->invoke(Lcom/daaw/avee/ContextData;Ljava/lang/String;)V

    return-void
.end method
