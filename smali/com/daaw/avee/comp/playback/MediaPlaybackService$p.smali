.class public Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;
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
    name = "p"
.end annotation


# instance fields
.field public final p:J

.field public final q:Z

.field public r:Lcom/daaw/tx0;

.field public final synthetic s:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;JZLcom/daaw/tx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->s:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->p:J

    iput-boolean p4, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->q:Z

    iput-object p5, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->r:Lcom/daaw/tx0;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->s:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->n(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->p0:Lcom/daaw/uw1;

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->s:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->o(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->s:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->p(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-wide v4, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->p:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->q:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-object v6, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$p;->r:Lcom/daaw/tx0;

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
