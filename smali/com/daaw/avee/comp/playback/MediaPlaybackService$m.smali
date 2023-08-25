.class public Lcom/daaw/avee/comp/playback/MediaPlaybackService$m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;->z0(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Z

.field public final synthetic q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$m;->q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iput-boolean p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$m;->p:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$m;->q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iget-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$m;->p:Z

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->v(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Z)V

    return-void
.end method
