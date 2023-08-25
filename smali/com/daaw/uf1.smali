.class public Lcom/daaw/uf1;
.super Lcom/daaw/kt;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/kt;-><init>()V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->g0:Lcom/daaw/uw1;

    new-instance v1, Lcom/daaw/uf1$a;

    invoke-direct {v1, p0}, Lcom/daaw/uf1$a;-><init>(Lcom/daaw/uf1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/uw1;->b(Lcom/daaw/uw1$a;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/tx0;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/tx0;->p()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v1, Lcom/daaw/j5;->K:I

    invoke-virtual {p1, v1}, Lcom/daaw/j5;->k(I)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    invoke-static {}, Lcom/daaw/dx0;->c()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1001c9

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v3, 0x7f100299

    new-array v4, v1, [Ljava/lang/Object;

    aput-object v2, v4, v0

    invoke-virtual {p1, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {v0, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_0
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v0, Lcom/daaw/j5;->K:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/j5;->c0(II)V

    return v1

    :cond_1
    return v0
.end method
