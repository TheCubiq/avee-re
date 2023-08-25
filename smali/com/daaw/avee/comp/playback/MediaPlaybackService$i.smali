.class public Lcom/daaw/avee/comp/playback/MediaPlaybackService$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$i;->p:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$i;->p:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->d0()J

    move-result-wide v0

    sget-object v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->s0:Lcom/daaw/qw1;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$i;->p:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    const-wide/16 v1, 0x64

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->g(Lcom/daaw/avee/comp/playback/MediaPlaybackService;J)V

    return-void
.end method
