.class public Lcom/daaw/avee/comp/playback/MediaPlaybackService$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;->u0(Lcom/daaw/avee/comp/playback/b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/avee/comp/playback/b$c;

.field public final synthetic q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/b$c;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$g;->q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$g;->p:Lcom/daaw/avee/comp/playback/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$g;->q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$g;->p:Lcom/daaw/avee/comp/playback/b$c;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->m(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/b$c;)V

    return-void
.end method
