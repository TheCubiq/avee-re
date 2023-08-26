.class Lcom/daaw/avee/Design/PlaybackDesign$35;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
        "Lcom/daaw/avee/comp/playback/PlayingMediaInfo;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 427
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$35;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "Lcom/daaw/avee/comp/playback/PlayingMediaInfo;",
            ">;"
        }
    .end annotation

    .line 430
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    sget-object v1, Lcom/daaw/avee/Design/PlaybackDesign;->songDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sget-object v2, Lcom/daaw/avee/Design/PlaybackDesign;->playingMediaInfo:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 427
    invoke-virtual {p0}, Lcom/daaw/avee/Design/PlaybackDesign$35;->invoke()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    return-object v0
.end method
