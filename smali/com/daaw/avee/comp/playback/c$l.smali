.class public Lcom/daaw/avee/comp/playback/c$l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->D()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->l0()V

    :cond_0
    return-void
.end method
