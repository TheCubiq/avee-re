.class public Lcom/daaw/fd1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rz;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/fd1$b;,
        Lcom/daaw/fd1$c;
    }
.end annotation


# instance fields
.field public final a:[Lcom/daaw/a41;

.field public final b:Lcom/daaw/rz;

.field public final c:Landroid/os/Handler;

.field public final d:Lcom/daaw/fd1$b;

.field public final e:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/daaw/qs1;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/daaw/pk1;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/daaw/xp0;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/daaw/rs1;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/daaw/n7;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lcom/daaw/o2;

.field public k:Lcom/google/android/exoplayer2/Format;

.field public l:Lcom/google/android/exoplayer2/Format;

.field public m:Landroid/view/Surface;

.field public n:Z

.field public o:I

.field public p:Landroid/view/SurfaceHolder;

.field public q:Landroid/view/TextureView;

.field public r:Lcom/daaw/fq;

.field public s:Lcom/daaw/fq;

.field public t:I

.field public u:Lcom/daaw/f7;

.field public v:F

.field public w:Lcom/daaw/bp0;

.field public x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/ln;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/e41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/yu;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/e41;",
            "Lcom/daaw/wm1;",
            "Lcom/daaw/hk0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;)V"
        }
    .end annotation

    new-instance v5, Lcom/daaw/o2$a;

    invoke-direct {v5}, Lcom/daaw/o2$a;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/fd1;-><init>(Lcom/daaw/e41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/yu;Lcom/daaw/o2$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/e41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/yu;Lcom/daaw/o2$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/e41;",
            "Lcom/daaw/wm1;",
            "Lcom/daaw/hk0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;",
            "Lcom/daaw/o2$a;",
            ")V"
        }
    .end annotation

    sget-object v6, Lcom/daaw/zf;->a:Lcom/daaw/zf;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/fd1;-><init>(Lcom/daaw/e41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/yu;Lcom/daaw/o2$a;Lcom/daaw/zf;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/e41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/yu;Lcom/daaw/o2$a;Lcom/daaw/zf;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/e41;",
            "Lcom/daaw/wm1;",
            "Lcom/daaw/hk0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;",
            "Lcom/daaw/o2$a;",
            "Lcom/daaw/zf;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v8, p4

    move-object/from16 v9, p6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lcom/daaw/fd1$b;

    const/4 v1, 0x0

    invoke-direct {v6, p0, v1}, Lcom/daaw/fd1$b;-><init>(Lcom/daaw/fd1;Lcom/daaw/fd1$a;)V

    iput-object v6, v0, Lcom/daaw/fd1;->d:Lcom/daaw/fd1$b;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v0, Lcom/daaw/fd1;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v0, Lcom/daaw/fd1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v0, Lcom/daaw/fd1;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v10, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v10}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v10, v0, Lcom/daaw/fd1;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v11, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v11}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v11, v0, Lcom/daaw/fd1;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    :goto_0
    new-instance v12, Landroid/os/Handler;

    invoke-direct {v12, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v12, v0, Lcom/daaw/fd1;->c:Landroid/os/Handler;

    move-object v1, p1

    move-object v2, v12

    move-object v3, v6

    move-object v4, v6

    move-object v5, v6

    move-object/from16 v7, p4

    invoke-interface/range {v1 .. v7}, Lcom/daaw/e41;->a(Landroid/os/Handler;Lcom/daaw/rs1;Lcom/daaw/n7;Lcom/daaw/pk1;Lcom/daaw/xp0;Lcom/daaw/yu;)[Lcom/daaw/a41;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/fd1;->a:[Lcom/daaw/a41;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lcom/daaw/fd1;->v:F

    const/4 v2, 0x0

    iput v2, v0, Lcom/daaw/fd1;->t:I

    sget-object v2, Lcom/daaw/f7;->e:Lcom/daaw/f7;

    iput-object v2, v0, Lcom/daaw/fd1;->u:Lcom/daaw/f7;

    const/4 v2, 0x1

    iput v2, v0, Lcom/daaw/fd1;->o:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    iput-object v2, v0, Lcom/daaw/fd1;->x:Ljava/util/List;

    move-object v2, p2

    move-object/from16 v3, p3

    invoke-virtual {p0, v1, p2, v3, v9}, Lcom/daaw/fd1;->F([Lcom/daaw/a41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/zf;)Lcom/daaw/rz;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    move-object/from16 v2, p5

    invoke-virtual {v2, v1, v9}, Lcom/daaw/o2$a;->a(Lcom/daaw/bx0;Lcom/daaw/zf;)Lcom/daaw/o2;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/fd1;->j:Lcom/daaw/o2;

    invoke-virtual {p0, v1}, Lcom/daaw/fd1;->b(Lcom/daaw/bx0$a;)V

    invoke-virtual {v10, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1}, Lcom/daaw/fd1;->D(Lcom/daaw/xp0;)V

    instance-of v2, v8, Lcom/google/android/exoplayer2/drm/c;

    if-eqz v2, :cond_1

    move-object v2, v8

    check-cast v2, Lcom/google/android/exoplayer2/drm/c;

    invoke-virtual {v2, v12, v1}, Lcom/google/android/exoplayer2/drm/c;->h(Landroid/os/Handler;Lcom/google/android/exoplayer2/drm/b;)V

    :cond_1
    return-void
.end method

.method public static synthetic A(Lcom/daaw/fd1;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/fd1;->t:I

    return p1
.end method

.method public static synthetic B(Lcom/daaw/fd1;Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;
    .locals 0

    iput-object p1, p0, Lcom/daaw/fd1;->l:Lcom/google/android/exoplayer2/Format;

    return-object p1
.end method

.method public static synthetic p(Lcom/daaw/fd1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/daaw/fd1;->x:Ljava/util/List;

    return-object p1
.end method

.method public static synthetic q(Lcom/daaw/fd1;Lcom/daaw/fq;)Lcom/daaw/fq;
    .locals 0

    iput-object p1, p0, Lcom/daaw/fd1;->r:Lcom/daaw/fq;

    return-object p1
.end method

.method public static synthetic r(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fd1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method public static synthetic s(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fd1;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method public static synthetic t(Lcom/daaw/fd1;Landroid/view/Surface;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fd1;->K(Landroid/view/Surface;Z)V

    return-void
.end method

.method public static synthetic u(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fd1;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method public static synthetic v(Lcom/daaw/fd1;Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;
    .locals 0

    iput-object p1, p0, Lcom/daaw/fd1;->k:Lcom/google/android/exoplayer2/Format;

    return-object p1
.end method

.method public static synthetic w(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fd1;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method public static synthetic x(Lcom/daaw/fd1;)Landroid/view/Surface;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fd1;->m:Landroid/view/Surface;

    return-object p0
.end method

.method public static synthetic y(Lcom/daaw/fd1;Lcom/daaw/fq;)Lcom/daaw/fq;
    .locals 0

    iput-object p1, p0, Lcom/daaw/fd1;->s:Lcom/daaw/fq;

    return-object p1
.end method

.method public static synthetic z(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fd1;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method


# virtual methods
.method public C(Lcom/daaw/x2;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->j:Lcom/daaw/o2;

    invoke-virtual {v0, p1}, Lcom/daaw/o2;->G(Lcom/daaw/x2;)V

    return-void
.end method

.method public D(Lcom/daaw/xp0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public E(Lcom/daaw/qs1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public F([Lcom/daaw/a41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/zf;)Lcom/daaw/rz;
    .locals 1

    new-instance v0, Lcom/daaw/tz;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/daaw/tz;-><init>([Lcom/daaw/a41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/zf;)V

    return-object v0
.end method

.method public G(Lcom/daaw/bp0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, v0}, Lcom/daaw/fd1;->l(Lcom/daaw/bp0;ZZ)V

    return-void
.end method

.method public final H()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/fd1;->q:Landroid/view/TextureView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/fd1;->d:Lcom/daaw/fd1$b;

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/fd1;->q:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :goto_0
    iput-object v1, p0, Lcom/daaw/fd1;->q:Landroid/view/TextureView;

    :cond_1
    iget-object v0, p0, Lcom/daaw/fd1;->p:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/daaw/fd1;->d:Lcom/daaw/fd1$b;

    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iput-object v1, p0, Lcom/daaw/fd1;->p:Landroid/view/SurfaceHolder;

    :cond_2
    return-void
.end method

.method public I(Lcom/daaw/fd1$c;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/fd1;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/fd1;->E(Lcom/daaw/qs1;)V

    :cond_0
    return-void
.end method

.method public J(Landroid/view/Surface;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fd1;->H()V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/fd1;->K(Landroid/view/Surface;Z)V

    return-void
.end method

.method public final K(Landroid/view/Surface;Z)V
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/fd1;->a:[Lcom/daaw/a41;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-interface {v4}, Lcom/daaw/a41;->i()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_0

    iget-object v5, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v5, v4}, Lcom/daaw/rz;->d(Lcom/daaw/fx0$b;)Lcom/daaw/fx0;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/daaw/fx0;->n(I)Lcom/daaw/fx0;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/daaw/fx0;->m(Ljava/lang/Object;)Lcom/daaw/fx0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/fx0;->l()Lcom/daaw/fx0;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/fd1;->m:Landroid/view/Surface;

    if-eqz v1, :cond_3

    if-eq v1, p1, :cond_3

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/fx0;

    invoke-virtual {v1}, Lcom/daaw/fx0;->a()Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/fd1;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/fd1;->m:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_3
    iput-object p1, p0, Lcom/daaw/fd1;->m:Landroid/view/Surface;

    iput-boolean p2, p0, Lcom/daaw/fd1;->n:Z

    return-void
.end method

.method public L(F)V
    .locals 6

    iput p1, p0, Lcom/daaw/fd1;->v:F

    iget-object v0, p0, Lcom/daaw/fd1;->a:[Lcom/daaw/a41;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Lcom/daaw/a41;->i()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v4, v3}, Lcom/daaw/rz;->d(Lcom/daaw/fx0$b;)Lcom/daaw/fx0;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lcom/daaw/fx0;->n(I)Lcom/daaw/fx0;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/daaw/fx0;->m(Ljava/lang/Object;)Lcom/daaw/fx0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/fx0;->l()Lcom/daaw/fx0;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->a()V

    invoke-virtual {p0}, Lcom/daaw/fd1;->H()V

    iget-object v0, p0, Lcom/daaw/fd1;->m:Landroid/view/Surface;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/daaw/fd1;->n:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/fd1;->m:Landroid/view/Surface;

    :cond_1
    iget-object v0, p0, Lcom/daaw/fd1;->w:Lcom/daaw/bp0;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/daaw/fd1;->j:Lcom/daaw/o2;

    invoke-interface {v0, v1}, Lcom/daaw/bp0;->i(Lcom/daaw/cp0;)V

    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/fd1;->x:Ljava/util/List;

    return-void
.end method

.method public b(Lcom/daaw/bx0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0, p1}, Lcom/daaw/bx0;->b(Lcom/daaw/bx0$a;)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->c()Z

    move-result v0

    return v0
.end method

.method public d(Lcom/daaw/fx0$b;)Lcom/daaw/fx0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0, p1}, Lcom/daaw/rz;->d(Lcom/daaw/fx0$b;)Lcom/daaw/fx0;

    move-result-object p1

    return-object p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->e()I

    move-result v0

    return v0
.end method

.method public f(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->j:Lcom/daaw/o2;

    invoke-virtual {v0}, Lcom/daaw/o2;->N()V

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0, p1, p2}, Lcom/daaw/bx0;->f(J)V

    return-void
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->g()I

    move-result v0

    return v0
.end method

.method public getDuration()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->getDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method public h(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0, p1}, Lcom/daaw/bx0;->h(Z)V

    return-void
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->k()I

    move-result v0

    return v0
.end method

.method public l(Lcom/daaw/bp0;ZZ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1;->w:Lcom/daaw/bp0;

    if-eq v0, p1, :cond_1

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/fd1;->j:Lcom/daaw/o2;

    invoke-interface {v0, v1}, Lcom/daaw/bp0;->i(Lcom/daaw/cp0;)V

    iget-object v0, p0, Lcom/daaw/fd1;->j:Lcom/daaw/o2;

    invoke-virtual {v0}, Lcom/daaw/o2;->O()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/fd1;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/fd1;->j:Lcom/daaw/o2;

    invoke-interface {p1, v0, v1}, Lcom/daaw/bp0;->c(Landroid/os/Handler;Lcom/daaw/cp0;)V

    iput-object p1, p0, Lcom/daaw/fd1;->w:Lcom/daaw/bp0;

    :cond_1
    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/rz;->l(Lcom/daaw/bp0;ZZ)V

    return-void
.end method

.method public m()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->m()I

    move-result v0

    return v0
.end method

.method public n()Lcom/daaw/nl1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->n()Lcom/daaw/nl1;

    move-result-object v0

    return-object v0
.end method

.method public o()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1;->b:Lcom/daaw/rz;

    invoke-interface {v0}, Lcom/daaw/bx0;->o()J

    move-result-wide v0

    return-wide v0
.end method
