.class public final synthetic Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSong$Ffs6td9hDBCCAOAhDu21sOhsxss;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSong$Ffs6td9hDBCCAOAhDu21sOhsxss;->f$0:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-void
.end method


# virtual methods
.method public final onInvoke(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSong$Ffs6td9hDBCCAOAhDu21sOhsxss;->f$0:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->lambda$startAcquireData$0$PlaylistSong(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    return-void
.end method
