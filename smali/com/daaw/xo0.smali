.class public final synthetic Lcom/daaw/xo0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w40;


# instance fields
.field public final synthetic a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xo0;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xo0;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->c(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method
