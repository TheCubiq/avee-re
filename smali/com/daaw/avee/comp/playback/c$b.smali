.class public Lcom/daaw/avee/comp/playback/c$b;
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
        "Landroid/view/SurfaceHolder;",
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
.method public a(Landroid/view/SurfaceHolder;)V
    .locals 1

    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->D()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->C0(Landroid/view/SurfaceHolder;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/view/SurfaceHolder;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/c$b;->a(Landroid/view/SurfaceHolder;)V

    return-void
.end method
