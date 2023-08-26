.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$4;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/Common/MultiList<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$4;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/Common/MultiList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation

    .line 151
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 153
    invoke-virtual {v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getQueue()Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    return-object v0

    .line 155
    :cond_0
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 147
    invoke-virtual {p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$4;->invoke()Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    return-object v0
.end method
