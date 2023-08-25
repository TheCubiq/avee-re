.class public Lcom/daaw/ol0;
.super Lcom/daaw/kt;
.source ""


# instance fields
.field public b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/tx0;

.field public volatile d:Z

.field public volatile e:Z

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Lcom/daaw/az0;)V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/kt;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/ol0;->b:Ljava/lang/ref/WeakReference;

    iput-object v1, p0, Lcom/daaw/ol0;->c:Lcom/daaw/tx0;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ol0;->d:Z

    iput-boolean v0, p0, Lcom/daaw/ol0;->e:Z

    iput-boolean v0, p0, Lcom/daaw/ol0;->f:Z

    iput-boolean v0, p0, Lcom/daaw/ol0;->g:Z

    sget-object v0, Lcom/daaw/o30;->w:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/ol0$a;

    invoke-direct {v1, p0}, Lcom/daaw/ol0$a;-><init>(Lcom/daaw/ol0;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ty;->b:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/ol0$b;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ol0$b;-><init>(Lcom/daaw/ol0;Lcom/daaw/az0;)V

    iget-object p1, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ty;->a:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/ol0$c;

    invoke-direct {v0, p0}, Lcom/daaw/ol0$c;-><init>(Lcom/daaw/ol0;)V

    iget-object v1, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->h0:Lcom/daaw/tw1;

    new-instance v0, Lcom/daaw/ol0$d;

    invoke-direct {v0, p0}, Lcom/daaw/ol0$d;-><init>(Lcom/daaw/ol0;)V

    iget-object v1, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/qv1;->Q:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/ol0$e;

    invoke-direct {v0, p0}, Lcom/daaw/ol0$e;-><init>(Lcom/daaw/ol0;)V

    iget-object v1, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/ol0;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ol0;->b:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/ol0;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ol0;->b:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method public static synthetic c(Lcom/daaw/ol0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ol0;->f:Z

    return p0
.end method

.method public static synthetic d(Lcom/daaw/ol0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ol0;->f:Z

    return p1
.end method

.method public static synthetic e(Lcom/daaw/ol0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ol0;->g:Z

    return p0
.end method

.method public static synthetic f(Lcom/daaw/ol0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ol0;->g:Z

    return p1
.end method

.method public static synthetic g(Lcom/daaw/ol0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ol0;->d:Z

    return p0
.end method

.method public static synthetic h(Lcom/daaw/ol0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ol0;->d:Z

    return p1
.end method

.method public static synthetic i(Lcom/daaw/ol0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ol0;->e:Z

    return p0
.end method

.method public static synthetic j(Lcom/daaw/ol0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ol0;->e:Z

    return p1
.end method
