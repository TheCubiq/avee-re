.class public Lcom/daaw/avee/comp/playback/MediaPlaybackService$o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;->r0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$o;->q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iput p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$o;->p:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$o;->q:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iget v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$o;->p:I

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->w(Lcom/daaw/avee/comp/playback/MediaPlaybackService;I)V

    return-void
.end method
