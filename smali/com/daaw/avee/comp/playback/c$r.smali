.class public Lcom/daaw/avee/comp/playback/c$r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ow1$a;


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
        "Lcom/daaw/ow1$a<",
        "Lcom/daaw/avee/comp/playback/a;",
        "Lcom/daaw/avee/comp/playback/a$g;",
        "Lcom/daaw/avee/comp/playback/a;",
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
.method public a(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;
    .locals 1

    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->D()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->I(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    check-cast p2, Lcom/daaw/avee/comp/playback/a$g;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/playback/c$r;->a(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method
