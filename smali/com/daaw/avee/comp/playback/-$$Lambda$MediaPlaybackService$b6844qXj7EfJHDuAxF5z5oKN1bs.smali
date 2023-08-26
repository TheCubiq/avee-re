.class public final synthetic Lcom/daaw/avee/comp/playback/-$$Lambda$MediaPlaybackService$b6844qXj7EfJHDuAxF5z5oKN1bs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/-$$Lambda$MediaPlaybackService$b6844qXj7EfJHDuAxF5z5oKN1bs;->f$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    return-void
.end method


# virtual methods
.method public final onInvoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/-$$Lambda$MediaPlaybackService$b6844qXj7EfJHDuAxF5z5oKN1bs;->f$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lambda$goActiveService$0$MediaPlaybackService()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method
