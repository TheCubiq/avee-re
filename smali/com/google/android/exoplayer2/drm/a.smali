.class public Lcom/google/android/exoplayer2/drm/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/exoplayer2/drm/d;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/drm/a$a;,
        Lcom/google/android/exoplayer2/drm/a$b;,
        Lcom/google/android/exoplayer2/drm/a$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/daaw/nz;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/exoplayer2/drm/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/exoplayer2/drm/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/drm/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/exoplayer2/drm/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/drm/a$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:[B

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final g:I

.field public final h:Lcom/google/android/exoplayer2/drm/g;

.field public final i:Ljava/util/UUID;

.field public final j:Lcom/google/android/exoplayer2/drm/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/drm/a<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field public k:I

.field public l:I

.field public m:Landroid/os/HandlerThread;

.field public n:Lcom/google/android/exoplayer2/drm/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/drm/a<",
            "TT;>.a;"
        }
    .end annotation
.end field

.field public o:Lcom/daaw/nz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public p:Lcom/google/android/exoplayer2/drm/d$a;

.field public q:[B

.field public r:[B


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lcom/google/android/exoplayer2/drm/f;Lcom/google/android/exoplayer2/drm/a$c;[BLjava/lang/String;I[BLjava/util/HashMap;Lcom/google/android/exoplayer2/drm/g;Landroid/os/Looper;Lcom/google/android/exoplayer2/drm/b$a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lcom/google/android/exoplayer2/drm/f<",
            "TT;>;",
            "Lcom/google/android/exoplayer2/drm/a$c<",
            "TT;>;[B",
            "Ljava/lang/String;",
            "I[B",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/exoplayer2/drm/g;",
            "Landroid/os/Looper;",
            "Lcom/google/android/exoplayer2/drm/b$a;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->i:Ljava/util/UUID;

    iput-object p3, p0, Lcom/google/android/exoplayer2/drm/a;->b:Lcom/google/android/exoplayer2/drm/a$c;

    iput-object p2, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    iput p6, p0, Lcom/google/android/exoplayer2/drm/a;->e:I

    iput-object p7, p0, Lcom/google/android/exoplayer2/drm/a;->r:[B

    iput-object p8, p0, Lcom/google/android/exoplayer2/drm/a;->f:Ljava/util/HashMap;

    iput-object p9, p0, Lcom/google/android/exoplayer2/drm/a;->h:Lcom/google/android/exoplayer2/drm/g;

    iput p12, p0, Lcom/google/android/exoplayer2/drm/a;->g:I

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    new-instance p1, Lcom/google/android/exoplayer2/drm/a$b;

    invoke-direct {p1, p0, p10}, Lcom/google/android/exoplayer2/drm/a$b;-><init>(Lcom/google/android/exoplayer2/drm/a;Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->j:Lcom/google/android/exoplayer2/drm/a$b;

    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "DrmRequestHandler"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->m:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    new-instance p1, Lcom/google/android/exoplayer2/drm/a$a;

    iget-object p2, p0, Lcom/google/android/exoplayer2/drm/a;->m:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Lcom/google/android/exoplayer2/drm/a$a;-><init>(Lcom/google/android/exoplayer2/drm/a;Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->n:Lcom/google/android/exoplayer2/drm/a$a;

    if-nez p7, :cond_0

    iput-object p4, p0, Lcom/google/android/exoplayer2/drm/a;->c:[B

    iput-object p5, p0, Lcom/google/android/exoplayer2/drm/a;->d:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->c:[B

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->d:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public static synthetic d(Lcom/google/android/exoplayer2/drm/a;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lcom/google/android/exoplayer2/drm/a;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lcom/google/android/exoplayer2/drm/a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/exoplayer2/drm/a;->g:I

    return p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->q:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    invoke-interface {v1, v0}, Lcom/google/android/exoplayer2/drm/f;->a([B)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final b()Lcom/daaw/nz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->o:Lcom/daaw/nz;

    return-object v0
.end method

.method public final c()Lcom/google/android/exoplayer2/drm/d$a;
    .locals 2

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->p:Lcom/google/android/exoplayer2/drm/d$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public g()V
    .locals 2

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->l:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/exoplayer2/drm/a;->l:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/drm/a;->u(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/drm/a;->h(Z)V

    :cond_1
    return-void
.end method

.method public final getState()I
    .locals 1

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    return v0
.end method

.method public final h(Z)V
    .locals 7

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_3

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->y()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->r:[B

    if-nez v0, :cond_2

    :goto_0
    invoke-virtual {p0, v2, p1}, Lcom/google/android/exoplayer2/drm/a;->v(IZ)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->y()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->r:[B

    if-nez v0, :cond_4

    :goto_1
    invoke-virtual {p0, v1, p1}, Lcom/google/android/exoplayer2/drm/a;->v(IZ)V

    goto :goto_2

    :cond_4
    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_5

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->y()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->i()J

    move-result-wide v3

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->e:I

    if-nez v0, :cond_6

    const-wide/16 v5, 0x3c

    cmp-long v0, v3, v5

    if-gtz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Offline license has expired or will expire soon. Remaining seconds: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_6
    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    if-gtz p1, :cond_8

    new-instance p1, Lcom/daaw/ji0;

    invoke-direct {p1}, Lcom/daaw/ji0;-><init>()V

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->m(Ljava/lang/Exception;)V

    :cond_7
    :goto_2
    return-void

    :cond_8
    iput v1, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    const/4 p1, 0x0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method public final i()J
    .locals 5

    sget-object v0, Lcom/daaw/dd;->e:Ljava/util/UUID;

    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->i:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    invoke-static {p0}, Lcom/daaw/hx1;->b(Lcom/google/android/exoplayer2/drm/d;)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public j([B)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->c:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public k([B)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->q:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final l()Z
    .locals 2

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final m(Ljava/lang/Exception;)V
    .locals 1

    new-instance v0, Lcom/google/android/exoplayer2/drm/d$a;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/drm/d$a;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->p:Lcom/google/android/exoplayer2/drm/d$a;

    const/4 p1, 0x0

    throw p1
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->l()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Ljava/lang/Exception;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->o(Ljava/lang/Exception;)V

    return-void

    :cond_1
    :try_start_0
    check-cast p1, [B

    sget-object v0, Lcom/daaw/dd;->d:Ljava/util/UUID;

    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->i:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/daaw/sf;->b([B)[B

    move-result-object p1

    :cond_2
    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->q:[B

    invoke-interface {v0, v1, p1}, Lcom/google/android/exoplayer2/drm/f;->h([B[B)[B

    move-result-object p1

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->e:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->r:[B

    if-eqz v0, :cond_4

    :cond_3
    if-eqz p1, :cond_4

    array-length v0, p1

    if-eqz v0, :cond_4

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->r:[B

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    throw v2

    :cond_5
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->r:[B

    invoke-interface {v0, v1, p1}, Lcom/google/android/exoplayer2/drm/f;->h([B[B)[B

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->o(Ljava/lang/Exception;)V

    return-void
.end method

.method public final o(Ljava/lang/Exception;)V
    .locals 1

    instance-of v0, p1, Landroid/media/NotProvisionedException;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->b:Lcom/google/android/exoplayer2/drm/a$c;

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/drm/a$c;->b(Lcom/google/android/exoplayer2/drm/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->m(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final p()V
    .locals 2

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    new-instance v0, Lcom/daaw/ji0;

    invoke-direct {v0}, Lcom/daaw/ji0;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/drm/a;->m(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public q(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->l()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->p()V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->h(Z)V

    goto :goto_0

    :cond_3
    iput v1, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    iget-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->b:Lcom/google/android/exoplayer2/drm/a$c;

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/drm/a$c;->b(Lcom/google/android/exoplayer2/drm/a;)V

    :goto_0
    return-void
.end method

.method public r()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/drm/a;->u(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/drm/a;->h(Z)V

    :cond_0
    return-void
.end method

.method public s(Ljava/lang/Exception;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->m(Ljava/lang/Exception;)V

    return-void
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->l()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Ljava/lang/Exception;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->b:Lcom/google/android/exoplayer2/drm/a$c;

    check-cast p1, Ljava/lang/Exception;

    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/drm/a$c;->c(Ljava/lang/Exception;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    check-cast p1, [B

    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/drm/f;->i([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->b:Lcom/google/android/exoplayer2/drm/a$c;

    invoke-interface {p1}, Lcom/google/android/exoplayer2/drm/a$c;->e()V

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->b:Lcom/google/android/exoplayer2/drm/a$c;

    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/drm/a$c;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method public final u(Z)Z
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/drm/a;->l()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/drm/f;->e()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->q:[B

    iget-object v2, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    invoke-interface {v2, v0}, Lcom/google/android/exoplayer2/drm/f;->b([B)Lcom/daaw/nz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->o:Lcom/daaw/nz;

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/exoplayer2/drm/a;->k:I
    :try_end_0
    .catch Landroid/media/NotProvisionedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->m(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/exoplayer2/drm/a;->b:Lcom/google/android/exoplayer2/drm/a$c;

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/drm/a$c;->b(Lcom/google/android/exoplayer2/drm/a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/drm/a;->m(Ljava/lang/Exception;)V

    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final v(IZ)V
    .locals 7

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->r:[B

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->q:[B

    :goto_0
    move-object v2, v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    iget-object v3, p0, Lcom/google/android/exoplayer2/drm/a;->c:[B

    iget-object v4, p0, Lcom/google/android/exoplayer2/drm/a;->d:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/exoplayer2/drm/a;->f:Ljava/util/HashMap;

    move v5, p1

    invoke-interface/range {v1 .. v6}, Lcom/google/android/exoplayer2/drm/f;->d([B[BLjava/lang/String;ILjava/util/HashMap;)Lcom/google/android/exoplayer2/drm/f$b;

    move-result-object p1

    sget-object v0, Lcom/daaw/dd;->d:Ljava/util/UUID;

    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->i:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/exoplayer2/drm/f$a;

    invoke-interface {p1}, Lcom/google/android/exoplayer2/drm/f$b;->b()[B

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/sf;->a([B)[B

    move-result-object v1

    invoke-interface {p1}, Lcom/google/android/exoplayer2/drm/f$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/exoplayer2/drm/f$a;-><init>([BLjava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->n:Lcom/google/android/exoplayer2/drm/a$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/exoplayer2/drm/a$a;->c(ILjava/lang/Object;Z)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a;->o(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method public w()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/drm/f;->c()Lcom/google/android/exoplayer2/drm/f$c;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->n:Lcom/google/android/exoplayer2/drm/a$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Lcom/google/android/exoplayer2/drm/a$a;->c(ILjava/lang/Object;Z)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public x()Z
    .locals 4

    iget v0, p0, Lcom/google/android/exoplayer2/drm/a;->l:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/exoplayer2/drm/a;->l:I

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iput v2, p0, Lcom/google/android/exoplayer2/drm/a;->k:I

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->j:Lcom/google/android/exoplayer2/drm/a$b;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->n:Lcom/google/android/exoplayer2/drm/a$a;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/google/android/exoplayer2/drm/a;->n:Lcom/google/android/exoplayer2/drm/a$a;

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->m:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    iput-object v2, p0, Lcom/google/android/exoplayer2/drm/a;->m:Landroid/os/HandlerThread;

    iput-object v2, p0, Lcom/google/android/exoplayer2/drm/a;->o:Lcom/daaw/nz;

    iput-object v2, p0, Lcom/google/android/exoplayer2/drm/a;->p:Lcom/google/android/exoplayer2/drm/d$a;

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->q:[B

    if-eqz v0, :cond_0

    iget-object v3, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    invoke-interface {v3, v0}, Lcom/google/android/exoplayer2/drm/f;->g([B)V

    iput-object v2, p0, Lcom/google/android/exoplayer2/drm/a;->q:[B

    :cond_0
    return v1

    :cond_1
    return v2
.end method

.method public final y()Z
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a;->a:Lcom/google/android/exoplayer2/drm/f;

    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a;->q:[B

    iget-object v2, p0, Lcom/google/android/exoplayer2/drm/a;->r:[B

    invoke-interface {v0, v1, v2}, Lcom/google/android/exoplayer2/drm/f;->f([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/drm/a;->m(Ljava/lang/Exception;)V

    const/4 v0, 0x0

    return v0
.end method
