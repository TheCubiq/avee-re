.class public Lcom/daaw/dx0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Ljava/lang/Object;

.field public static e:Lcom/daaw/dx0;


# instance fields
.field public a:Z

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/dx0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/dx0;->a:Z

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dx0;->c:Ljava/util/List;

    return-void
.end method

.method public static b()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/daaw/dx0;->c()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static c()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    return-object v0
.end method

.method public static d()Landroid/app/Activity;
    .locals 1

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    return-object v0
.end method

.method public static e()Landroid/content/Context;
    .locals 3

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->D()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    const-string v0, "app context is null"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object v1
.end method

.method public static h()Lcom/daaw/dx0;
    .locals 3

    sget-object v0, Lcom/daaw/dx0;->e:Lcom/daaw/dx0;

    if-nez v0, :cond_1

    sget-object v1, Lcom/daaw/dx0;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/daaw/dx0;->e:Lcom/daaw/dx0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/dx0;

    invoke-direct {v0}, Lcom/daaw/dx0;-><init>()V

    sput-object v0, Lcom/daaw/dx0;->e:Lcom/daaw/dx0;

    invoke-virtual {v0}, Lcom/daaw/dx0;->f()V

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    iget-boolean v1, v0, Lcom/daaw/dx0;->a:Z

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/daaw/dx0;->a()Lcom/daaw/nc0;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v1, Lcom/daaw/dx0;->e:Lcom/daaw/dx0;

    new-instance v2, Lcom/daaw/az0;

    invoke-direct {v2}, Lcom/daaw/az0;-><init>()V

    invoke-virtual {v1, v0, v2}, Lcom/daaw/dx0;->g(Lcom/daaw/nc0;Lcom/daaw/az0;)V

    :cond_2
    :goto_0
    sget-object v0, Lcom/daaw/dx0;->e:Lcom/daaw/dx0;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/daaw/nc0;
    .locals 3

    iget-object v0, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/daaw/nc0;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/daaw/nc0;

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()V
    .locals 8

    invoke-static {}, Lcom/daaw/gr1;->c()V

    new-instance v0, Lcom/daaw/az0;

    invoke-direct {v0}, Lcom/daaw/az0;-><init>()V

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    new-instance v1, Lcom/daaw/nc0;

    invoke-direct {v1}, Lcom/daaw/nc0;-><init>()V

    iget-object v2, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v3, Lcom/daaw/c60;

    invoke-direct {v3}, Lcom/daaw/c60;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v3, Lcom/daaw/b5;

    invoke-direct {v3}, Lcom/daaw/b5;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v3, Lcom/daaw/v91;

    invoke-direct {v3}, Lcom/daaw/v91;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v3, Lcom/daaw/y91;

    invoke-direct {v3}, Lcom/daaw/y91;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v3, Lcom/daaw/wd1;

    invoke-direct {v3}, Lcom/daaw/wd1;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v3, Lcom/daaw/hj0;

    invoke-direct {v3}, Lcom/daaw/hj0;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/daaw/pv1;

    invoke-direct {v2}, Lcom/daaw/pv1;-><init>()V

    iget-object v3, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v4, Lcom/daaw/ww0;

    invoke-direct {v4}, Lcom/daaw/ww0;-><init>()V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/daaw/uf1;

    invoke-direct {v3}, Lcom/daaw/uf1;-><init>()V

    new-instance v4, Lcom/daaw/xw0;

    invoke-direct {v4, v3}, Lcom/daaw/xw0;-><init>(Lcom/daaw/uf1;)V

    iget-object v5, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Lcom/daaw/vm0;

    invoke-direct {v5}, Lcom/daaw/vm0;-><init>()V

    iget-object v6, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v7, Lcom/daaw/ui;

    invoke-direct {v7}, Lcom/daaw/ui;-><init>()V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v7, Lcom/daaw/ie1;

    invoke-direct {v7}, Lcom/daaw/ie1;-><init>()V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v7, Lcom/daaw/yx0;

    invoke-direct {v7}, Lcom/daaw/yx0;-><init>()V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v7, Lcom/daaw/cx0;

    invoke-direct {v7}, Lcom/daaw/cx0;-><init>()V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v7, Lcom/daaw/fl;

    invoke-direct {v7}, Lcom/daaw/fl;-><init>()V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1, v0}, Lcom/daaw/dx0;->g(Lcom/daaw/nc0;Lcom/daaw/az0;)V

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v6, Lcom/daaw/j7;

    invoke-direct {v6}, Lcom/daaw/j7;-><init>()V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v6, Lcom/daaw/o5;

    invoke-direct {v6}, Lcom/daaw/o5;-><init>()V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    invoke-static {}, Lcom/daaw/ix1;->a()Lcom/daaw/ix1;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v6, Lcom/daaw/qv1;

    invoke-direct {v6, v2, v4, v5}, Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v2, Lcom/daaw/w51;

    invoke-direct {v2}, Lcom/daaw/w51;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v2, Lcom/daaw/sa0;

    invoke-direct {v2}, Lcom/daaw/sa0;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v2, Lcom/daaw/ew0;

    invoke-direct {v2}, Lcom/daaw/ew0;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v2, Lcom/daaw/ol0;

    invoke-direct {v2, v0}, Lcom/daaw/ol0;-><init>(Lcom/daaw/az0;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v1, Lcom/daaw/rv1;

    invoke-direct {v1}, Lcom/daaw/rv1;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v1, Lcom/daaw/jv1;

    invoke-direct {v1}, Lcom/daaw/jv1;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    invoke-static {}, Lcom/daaw/el;->j()Lcom/daaw/el;

    invoke-static {}, Lcom/daaw/td1;->c()Lcom/daaw/td1;

    invoke-static {}, Lcom/daaw/s70;->a()Lcom/daaw/s70;

    invoke-static {}, Lcom/daaw/ko0;->q()Lcom/daaw/ko0;

    return-void
.end method

.method public final g(Lcom/daaw/nc0;Lcom/daaw/az0;)V
    .locals 4

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/vw1;

    invoke-direct {v1}, Lcom/daaw/vw1;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/daaw/fc0;

    invoke-direct {v2, p1}, Lcom/daaw/fc0;-><init>(Lcom/daaw/nc0;)V

    iget-object p1, p0, Lcom/daaw/dx0;->c:Ljava/util/List;

    invoke-virtual {v1, v2, p1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    iget-object p1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v2, Lcom/daaw/i1;

    invoke-direct {v2, v0, p2}, Lcom/daaw/i1;-><init>(Landroid/content/Context;Lcom/daaw/az0;)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v2, Lcom/daaw/r1;

    invoke-direct {v2, v0, p2}, Lcom/daaw/r1;-><init>(Landroid/content/Context;Lcom/daaw/az0;)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/dx0;->b:Ljava/util/List;

    new-instance v2, Lcom/daaw/my0;

    const v3, 0x7f100030

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p2}, Lcom/daaw/my0;-><init>(Ljava/lang/String;Lcom/daaw/vw1;Lcom/daaw/az0;)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/dx0;->a:Z

    return-void
.end method
