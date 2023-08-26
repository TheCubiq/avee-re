.class public final synthetic Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic f$0:[Ljava/lang/Object;

.field private final synthetic f$1:Landroid/os/Handler;

.field private final synthetic f$2:Lcom/daaw/avee/Common/Action1;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/avee/Common/Action1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;->f$0:[Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;->f$1:Landroid/os/Handler;

    iput-object p3, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;->f$2:Lcom/daaw/avee/Common/Action1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;->f$0:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;->f$1:Landroid/os/Handler;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;->f$2:Lcom/daaw/avee/Common/Action1;

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSongMetadataRetriever;->lambda$AcquireData$1([Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v0

    return-object v0
.end method
