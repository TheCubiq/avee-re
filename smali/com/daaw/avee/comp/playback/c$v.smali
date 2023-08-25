.class public Lcom/daaw/avee/comp/playback/c$v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iw1$a;


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
        "Lcom/daaw/iw1$a<",
        "Ljava/lang/Boolean;",
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
.method public a(Ljava/lang/Boolean;)V
    .locals 1

    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->D()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->z0(Z)V

    goto :goto_0

    :cond_0
    const-string p1, "TIMEOUT_DISABLE_ACTION"

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/c;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/c$v;->a(Ljava/lang/Boolean;)V

    return-void
.end method
