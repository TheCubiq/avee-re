.class public Lcom/daaw/oz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/avee/comp/playback/e;
.implements Lcom/daaw/avee/comp/playback/b$d;
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/oz$d;,
        Lcom/daaw/oz$e;
    }
.end annotation


# instance fields
.field public A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public B:Lcom/daaw/avee/comp/playback/e$b;

.field public C:Lcom/daaw/h7;

.field public D:Lcom/daaw/g7;

.field public E:Lcom/daaw/mz;

.field public F:Landroid/os/Handler;

.field public G:Ljava/lang/String;

.field public H:Lcom/daaw/pz;

.field public I:Lcom/daaw/ne0;

.field public J:J

.field public final p:Ljava/lang/Object;

.field public q:Landroid/content/Context;

.field public r:[Lcom/daaw/oz$d;

.field public s:I

.field public t:I

.field public u:Lcom/daaw/wd0;

.field public v:F

.field public w:Z

.field public x:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field public y:J

.field public volatile z:Lcom/daaw/wz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/e$b;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/oz;->p:Ljava/lang/Object;

    const/4 p2, 0x2

    new-array p2, p2, [Lcom/daaw/oz$d;

    iput-object p2, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    const/4 p2, 0x0

    iput p2, p0, Lcom/daaw/oz;->s:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/oz;->t:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/oz;->v:F

    iput-boolean p2, p0, Lcom/daaw/oz;->w:Z

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/oz;->x:Ljava/lang/ref/WeakReference;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/oz;->y:J

    iput-object v1, p0, Lcom/daaw/oz;->z:Lcom/daaw/wz;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/oz;->A:Ljava/util/List;

    new-instance v0, Lcom/daaw/mz;

    invoke-direct {v0, p0}, Lcom/daaw/mz;-><init>(Lcom/daaw/avee/comp/playback/b$d;)V

    iput-object v0, p0, Lcom/daaw/oz;->E:Lcom/daaw/mz;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/oz;->F:Landroid/os/Handler;

    new-instance v0, Lcom/daaw/pz;

    invoke-direct {v0}, Lcom/daaw/pz;-><init>()V

    iput-object v0, p0, Lcom/daaw/oz;->H:Lcom/daaw/pz;

    new-instance v0, Lcom/daaw/oz$a;

    invoke-direct {v0, p0}, Lcom/daaw/oz$a;-><init>(Lcom/daaw/oz;)V

    iput-object v0, p0, Lcom/daaw/oz;->I:Lcom/daaw/ne0;

    iput-wide v2, p0, Lcom/daaw/oz;->J:J

    iput-object p1, p0, Lcom/daaw/oz;->q:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    const-string p3, "ExoPlayerDemo"

    invoke-static {p1, p3}, Lcom/daaw/sq1;->C(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/oz;->G:Ljava/lang/String;

    :goto_0
    iget-object p3, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    array-length v0, p3

    if-ge p2, v0, :cond_0

    new-instance v0, Lcom/daaw/oz$d;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/oz$d;-><init>(Lcom/daaw/oz;Landroid/content/Context;I)V

    aput-object v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/daaw/h7;

    new-instance p3, Lcom/daaw/oz$b;

    invoke-direct {p3, p0}, Lcom/daaw/oz$b;-><init>(Lcom/daaw/oz;)V

    invoke-direct {p2, p1, p3}, Lcom/daaw/h7;-><init>(Landroid/content/Context;Lcom/daaw/h7$c;)V

    iput-object p2, p0, Lcom/daaw/oz;->C:Lcom/daaw/h7;

    sget-object p1, Lcom/daaw/ty;->b:Lcom/daaw/pw1;

    new-instance p2, Lcom/daaw/oz$c;

    invoke-direct {p2, p0}, Lcom/daaw/oz$c;-><init>(Lcom/daaw/oz;)V

    iget-object p3, p0, Lcom/daaw/oz;->A:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic A(Lcom/daaw/oz;)Lcom/daaw/wz;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oz;->z:Lcom/daaw/wz;

    return-object p0
.end method

.method public static synthetic B(Lcom/daaw/oz;)Lcom/daaw/ne0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oz;->I:Lcom/daaw/ne0;

    return-object p0
.end method

.method public static synthetic C(Lcom/daaw/oz;)Lcom/daaw/fd1;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/daaw/oz;)Lcom/daaw/pz;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oz;->H:Lcom/daaw/pz;

    return-object p0
.end method

.method public static synthetic E(Lcom/daaw/oz;)Lcom/daaw/mz;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oz;->E:Lcom/daaw/mz;

    return-object p0
.end method

.method public static synthetic F(Lcom/daaw/oz;)Lcom/daaw/g7;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oz;->D:Lcom/daaw/g7;

    return-object p0
.end method

.method public static synthetic G(Lcom/daaw/oz;Lcom/daaw/g7;)Lcom/daaw/g7;
    .locals 0

    iput-object p1, p0, Lcom/daaw/oz;->D:Lcom/daaw/g7;

    return-object p1
.end method

.method public static synthetic H(Lcom/daaw/oz;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/oz;->P()V

    return-void
.end method

.method public static synthetic I(Lcom/daaw/oz;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oz;->G:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    return-object p0
.end method


# virtual methods
.method public J()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/oz;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/oz;->z:Lcom/daaw/wz;

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/oz;->y:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1f40

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    invoke-virtual {v1}, Lcom/daaw/wz;->e()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/oz;->z:Lcom/daaw/wz;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public K()V
    .locals 2

    iget v0, p0, Lcom/daaw/oz;->s:I

    iget v1, p0, Lcom/daaw/oz;->t:I

    iput v1, p0, Lcom/daaw/oz;->s:I

    iput v0, p0, Lcom/daaw/oz;->t:I

    return-void
.end method

.method public L(I)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "trying to destroy currentPlayer"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/daaw/oz;->s:I

    iget v0, p0, Lcom/daaw/oz;->t:I

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    aget-object p1, p1, v0

    invoke-static {p1}, Lcom/daaw/oz$d;->i(Lcom/daaw/oz$d;)V

    :goto_0
    return-void
.end method

.method public M()Lcom/daaw/oz$d;
    .locals 2

    iget-object v0, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    iget v1, p0, Lcom/daaw/oz;->t:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final N()Lcom/daaw/fd1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/oz$d;->j(Lcom/daaw/oz$d;)Lcom/daaw/fd1;

    move-result-object v0

    return-object v0
.end method

.method public O()Lcom/daaw/oz$d;
    .locals 2

    iget-object v0, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    iget v1, p0, Lcom/daaw/oz;->s:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final P()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    const-wide/16 v4, 0x0

    invoke-static {v3}, Lcom/daaw/oz$d;->j(Lcom/daaw/oz$d;)Lcom/daaw/fd1;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-static {v3}, Lcom/daaw/oz$d;->j(Lcom/daaw/oz$d;)Lcom/daaw/fd1;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/fd1;->o()J

    move-result-wide v4

    :cond_0
    iget-object v6, v3, Lcom/daaw/oz$d;->s:Lcom/daaw/wd0;

    invoke-static {v3}, Lcom/daaw/oz$d;->i(Lcom/daaw/oz$d;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v3, v6, v7, v4, v5}, Lcom/daaw/oz$d;->y(Lcom/daaw/wd0;FJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public Q(ZF)V
    .locals 3

    iput p2, p0, Lcom/daaw/oz;->v:F

    iput-boolean p1, p0, Lcom/daaw/oz;->w:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_3

    aget-object v1, p1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/daaw/oz$d;->I(F)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_3

    aget-object v2, p1, v0

    if-eqz v2, :cond_2

    invoke-virtual {v2, p2}, Lcom/daaw/oz$d;->I(F)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/oz;->E:Lcom/daaw/mz;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/b;->j()V

    iput-object v1, p0, Lcom/daaw/oz;->E:Lcom/daaw/mz;

    :cond_0
    invoke-virtual {p0, v1}, Lcom/daaw/oz;->m(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-static {v3}, Lcom/daaw/oz$d;->i(Lcom/daaw/oz$d;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/oz$d;->w()V

    iget-object v0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public c(Lcom/daaw/avee/comp/playback/b$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->c(Lcom/daaw/avee/comp/playback/b$b;)V

    return-void
.end method

.method public d(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->d(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;

    move-result-object p1

    return-object p1
.end method

.method public e(Z)V
    .locals 1

    iget v0, p0, Lcom/daaw/oz;->v:F

    invoke-virtual {p0, p1, v0}, Lcom/daaw/oz;->Q(ZF)V

    iget-object v0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->f(Z)V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/oz;->w:Z

    return v0
.end method

.method public g(J)V
    .locals 2

    iput-wide p1, p0, Lcom/daaw/oz;->J:J

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/daaw/oz$d;->D(F)V

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    long-to-int p2, p1

    int-to-long p1, p2

    invoke-virtual {v0, p1, p2}, Lcom/daaw/oz$d;->C(J)V

    return-void
.end method

.method public h()Lcom/daaw/hx0;
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Lcom/daaw/hx0;

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/oz$d;->q()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/hx0;-><init>(JZ)V

    return-object v0
.end method

.method public i(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-wide v0, p2, Lcom/daaw/avee/comp/playback/a$g;->g:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-gez p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/oz;->k()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    :cond_1
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/playback/a;->f(J)V

    return-object p1
.end method

.method public j(ZZFJ)V
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/oz;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/oz;->K()V

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/daaw/oz;->s:I

    iget v0, p0, Lcom/daaw/oz;->t:I

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/oz;->M()Lcom/daaw/oz$d;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/oz$d;->i(Lcom/daaw/oz$d;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/oz;->u:Lcom/daaw/wd0;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lcom/daaw/wd0;->a()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/oz;->u:Lcom/daaw/wd0;

    invoke-interface {p1}, Lcom/daaw/wd0;->a()Landroid/net/Uri;

    move-result-object p1

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/oz;->u:Lcom/daaw/wd0;

    invoke-virtual {p1, v0, p3, p4, p5}, Lcom/daaw/oz$d;->y(Lcom/daaw/wd0;FJ)V

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/daaw/oz;->start()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/oz$d;->w()V

    :goto_1
    return-void

    :cond_4
    :goto_2
    const-string p1, "nextDataSource is null"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lcom/daaw/oz;->start()V

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/oz;->b()V

    :goto_3
    return-void
.end method

.method public k()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fd1;->o()J

    move-result-wide v0

    return-wide v0
.end method

.method public l()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/oz$d;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public m(Landroid/view/SurfaceHolder;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/oz;->x:Ljava/lang/ref/WeakReference;

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-virtual {p0, p1}, Lcom/daaw/oz;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/oz;->x:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceHolder;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/oz;->x:Ljava/lang/ref/WeakReference;

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/oz;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V

    :goto_0
    return-void
.end method

.method public n(Lcom/daaw/avee/comp/playback/b$c;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz;->E:Lcom/daaw/mz;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/b;->m(Lcom/daaw/avee/comp/playback/b$c;)V

    :cond_0
    return-void
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public p()Lcom/daaw/avee/comp/playback/b$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz;->E:Lcom/daaw/mz;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/b;->d()Lcom/daaw/avee/comp/playback/b$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public q(Lcom/daaw/avee/comp/playback/e$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    return-void
.end method

.method public r(Lcom/daaw/wd0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oz;->u:Lcom/daaw/wd0;

    return-void
.end method

.method public s()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fd1;->k()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fd1;->k()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public start()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/oz$d;->j(Lcom/daaw/oz$d;)Lcom/daaw/fd1;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v1}, Lcom/daaw/avee/comp/playback/e$b;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/daaw/oz$d;->z()V

    iget-object v0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->n()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/oz;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/oz$d;->K()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public stop()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/fd1;->h(Z)V

    iget-object v0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/oz;->M()Lcom/daaw/oz$d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/oz$d;->H(Landroid/view/Surface;)Z

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/oz$d;->H(Landroid/view/Surface;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/oz;->M()Lcom/daaw/oz$d;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/oz$d;->H(Landroid/view/Surface;)Z

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/oz$d;->H(Landroid/view/Surface;)Z

    :goto_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    iget p1, p0, Lcom/daaw/oz;->s:I

    iget v0, p0, Lcom/daaw/oz;->t:I

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/oz;->M()Lcom/daaw/oz$d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/oz$d;->H(Landroid/view/Surface;)Z

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/oz$d;->H(Landroid/view/Surface;)Z

    return-void
.end method

.method public t(FI)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p2, :cond_0

    iget p2, p0, Lcom/daaw/oz;->s:I

    goto :goto_0

    :cond_0
    iget p2, p0, Lcom/daaw/oz;->t:I

    iget v1, p0, Lcom/daaw/oz;->s:I

    if-ne v1, p2, :cond_1

    return v0

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    aget-object v2, v1, p2

    if-eqz v2, :cond_3

    aget-object p2, v1, p2

    invoke-virtual {p2, p1}, Lcom/daaw/oz$d;->E(F)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_1
    return v0
.end method

.method public u(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/oz$d;->G(I)V

    return-void
.end method

.method public v()V
    .locals 2

    iget v0, p0, Lcom/daaw/oz;->s:I

    iget v1, p0, Lcom/daaw/oz;->t:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/oz;->L(I)V

    return-void
.end method

.method public w(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz;->B:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->e(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public x(F)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/oz;->r:[Lcom/daaw/oz$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3, p1}, Lcom/daaw/oz$d;->J(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public y()Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fd1;->k()I

    move-result v0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/oz;->N()Lcom/daaw/fd1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fd1;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
