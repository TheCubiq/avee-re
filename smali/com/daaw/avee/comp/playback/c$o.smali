.class public Lcom/daaw/avee/comp/playback/c$o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/mw1$a<",
        "Lcom/daaw/avee/comp/playback/b$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/c$o;->b()Lcom/daaw/avee/comp/playback/b$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/avee/comp/playback/b$b;
    .locals 1

    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->D()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->C()Lcom/daaw/avee/comp/playback/b$b;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
