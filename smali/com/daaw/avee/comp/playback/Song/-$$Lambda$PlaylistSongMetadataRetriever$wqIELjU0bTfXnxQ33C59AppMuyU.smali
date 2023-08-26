.class public final synthetic Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$wqIELjU0bTfXnxQ33C59AppMuyU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/Common/Action1;

.field private final synthetic f$1:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$wqIELjU0bTfXnxQ33C59AppMuyU;->f$0:Lcom/daaw/avee/Common/Action1;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$wqIELjU0bTfXnxQ33C59AppMuyU;->f$1:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$wqIELjU0bTfXnxQ33C59AppMuyU;->f$0:Lcom/daaw/avee/Common/Action1;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$wqIELjU0bTfXnxQ33C59AppMuyU;->f$1:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSongMetadataRetriever;->lambda$null$0(Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    return-void
.end method
