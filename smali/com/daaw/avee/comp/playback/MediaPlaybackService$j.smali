.class public Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/avee/comp/playback/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->q(Lcom/daaw/avee/comp/playback/MediaPlaybackService;ZLjava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->A0:Lcom/daaw/pw1;

    invoke-virtual {v0}, Lcom/daaw/pw1;->a()V

    return-void
.end method

.method public c(Lcom/daaw/avee/comp/playback/b$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->s(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/b$b;)Lcom/daaw/avee/comp/playback/b$b;

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->y0:Lcom/daaw/qw1;

    invoke-virtual {v0, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->w0:Lcom/daaw/ww1;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/b$c;

    return-object p1
.end method

.method public e(Ljava/lang/String;)Z
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->x0:Lcom/daaw/ww1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public f(Z)V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->k0:Lcom/daaw/qw1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public g(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->T(Z)V

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->g0()Z

    move-result v0

    return v0
.end method

.method public i(IIF)V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->t0:Lcom/daaw/sw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public j(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->r(Lcom/daaw/avee/comp/playback/MediaPlaybackService;ZI)V

    return-void
.end method

.method public k(Lcom/daaw/pz;)V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->B0:Lcom/daaw/qw1;

    invoke-virtual {v0, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public l()I
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->v0:Lcom/daaw/vw1;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public m(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->S(J)V

    return-void
.end method

.method public n()Landroid/view/SurfaceHolder;
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->u0:Lcom/daaw/vw1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceHolder;

    return-object v0
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$j;->a:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->U()V

    return-void
.end method
