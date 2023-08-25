.class public Lcom/daaw/vr0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/avee/comp/playback/e;
.implements Lcom/daaw/avee/comp/playback/b$d;
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;
.implements Landroid/media/MediaPlayer$OnInfoListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vr0$b;
    }
.end annotation


# instance fields
.field public A:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field public B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public C:[Lcom/daaw/vr0$b;

.field public final p:Ljava/lang/Object;

.field public q:Landroid/content/Context;

.field public r:Lcom/daaw/avee/comp/playback/e$b;

.field public s:I

.field public t:I

.field public u:Landroid/net/Uri;

.field public v:F

.field public w:Z

.field public x:J

.field public y:Lcom/daaw/zr0;

.field public z:Lcom/daaw/ur0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/e$b;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/vr0;->p:Ljava/lang/Object;

    const/4 p2, 0x0

    iput p2, p0, Lcom/daaw/vr0;->s:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/vr0;->t:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vr0;->u:Landroid/net/Uri;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/daaw/vr0;->v:F

    iput-boolean p2, p0, Lcom/daaw/vr0;->w:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/daaw/vr0;->x:J

    iput-object v0, p0, Lcom/daaw/vr0;->y:Lcom/daaw/zr0;

    new-instance v1, Lcom/daaw/ur0;

    invoke-direct {v1, p0}, Lcom/daaw/ur0;-><init>(Lcom/daaw/avee/comp/playback/b$d;)V

    iput-object v1, p0, Lcom/daaw/vr0;->z:Lcom/daaw/ur0;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/vr0;->A:Ljava/lang/ref/WeakReference;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/vr0;->B:Ljava/util/List;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/vr0$b;

    iput-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iput-object p1, p0, Lcom/daaw/vr0;->q:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    :goto_0
    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    array-length p3, p1

    if-ge p2, p3, :cond_0

    new-instance p3, Lcom/daaw/vr0$b;

    invoke-direct {p3, p0}, Lcom/daaw/vr0$b;-><init>(Lcom/daaw/vr0;)V

    aput-object p3, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/daaw/ty;->b:Lcom/daaw/pw1;

    new-instance p2, Lcom/daaw/vr0$a;

    invoke-direct {p2, p0}, Lcom/daaw/vr0$a;-><init>(Lcom/daaw/vr0;)V

    iget-object p3, p0, Lcom/daaw/vr0;->B:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic A(Lcom/daaw/vr0;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/vr0;->K(Z)V

    return-void
.end method

.method public static z(I)I
    .locals 2

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x2

    if-ne p0, v1, :cond_1

    return v1

    :cond_1
    return v0
.end method


# virtual methods
.method public B()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/vr0;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/vr0;->y:Lcom/daaw/zr0;

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/vr0;->x:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1f40

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    invoke-virtual {v1}, Lcom/daaw/zr0;->c()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/vr0;->y:Lcom/daaw/zr0;

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

.method public C(I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object v1, v0, p1

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/vr0$b;

    invoke-direct {v1, p0}, Lcom/daaw/vr0$b;-><init>(Lcom/daaw/vr0;)V

    aput-object v1, v0, p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    if-nez v0, :cond_1

    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iget-object v1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v1, p0, Lcom/daaw/vr0;->q:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setWakeMode(Landroid/content/Context;I)V

    iget-object v1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object v1, v1, p1

    iput-object v0, v1, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    :cond_1
    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/vr0;->I(II)V

    iget-object v1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p1, v1, p1

    iput-boolean v0, p1, Lcom/daaw/vr0$b;->q:Z

    return-void
.end method

.method public D()V
    .locals 2

    iget v0, p0, Lcom/daaw/vr0;->s:I

    iget v1, p0, Lcom/daaw/vr0;->t:I

    iput v1, p0, Lcom/daaw/vr0;->s:I

    iput v0, p0, Lcom/daaw/vr0;->t:I

    return-void
.end method

.method public E(I)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "trying to destroy currentPlayer"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/daaw/vr0;->s:I

    iget v0, p0, Lcom/daaw/vr0;->t:I

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->G(I)V

    :goto_0
    return-void
.end method

.method public F(ILandroid/net/Uri;FJ)V
    .locals 4

    invoke-virtual {p0, p1}, Lcom/daaw/vr0;->C(I)V

    const/4 v0, -0x1

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object v2, v2, p1

    iget-object v2, v2, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    iget-object v3, p0, Lcom/daaw/vr0;->q:Landroid/content/Context;

    invoke-virtual {v2, v3, p2}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {p0, p1, v1}, Lcom/daaw/vr0;->I(II)V

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p2, p2, p1

    iget-object p2, p2, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    const/4 v2, 0x3

    invoke-virtual {p2, v2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p2, p2, p1

    iget-object v2, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v2}, Lcom/daaw/avee/comp/playback/e$b;->l()I

    move-result v2

    invoke-virtual {p2, v2}, Lcom/daaw/vr0$b;->k(I)V

    iget-object p2, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {p2}, Lcom/daaw/avee/comp/playback/e$b;->n()Landroid/view/SurfaceHolder;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/daaw/vr0;->m(Landroid/view/SurfaceHolder;)V

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v2, p0, Lcom/daaw/vr0;->s:I

    aget-object p2, p2, v2

    invoke-virtual {p2, p3}, Lcom/daaw/vr0$b;->g(F)V

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v2, p0, Lcom/daaw/vr0;->s:I

    aget-object p2, p2, v2

    invoke-virtual {p2, p3}, Lcom/daaw/vr0$b;->i(F)V

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p2, p2, p1

    invoke-virtual {p2, p4, p5}, Lcom/daaw/vr0$b;->e(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    iget-object p3, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const-string p4, "Invalid media source"

    invoke-interface {p3, v1, p4}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/daaw/vr0;->I(II)V

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p1, p2, p1

    goto :goto_0

    :catch_1
    move-exception p2

    iget-object p3, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const-string p4, "Failed open media source"

    invoke-interface {p3, v1, p4}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/daaw/vr0;->I(II)V

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p1, p2, p1

    :goto_0
    iget-object p1, p1, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {p0, p1}, Lcom/daaw/vr0;->onCompletion(Landroid/media/MediaPlayer;)V

    :goto_1
    return-void
.end method

.method public G(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/vr0;->H(IZ)V

    return-void
.end method

.method public H(IZ)V
    .locals 1

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    array-length v0, p2

    if-lt p1, v0, :cond_0

    return-void

    :cond_0
    aget-object p2, p2, p1

    invoke-virtual {p2}, Lcom/daaw/vr0$b;->f()V

    const/4 p2, -0x2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/vr0;->I(II)V

    iget-object p2, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p1, p2, p1

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/daaw/vr0$b;->q:Z

    return-void
.end method

.method public I(II)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object v0, v0, p1

    invoke-virtual {v0, p2}, Lcom/daaw/vr0$b;->j(I)V

    iget-object p2, p0, Lcom/daaw/vr0;->z:Lcom/daaw/ur0;

    if-eqz p2, :cond_0

    iget v0, p0, Lcom/daaw/vr0;->s:I

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p1, v0, p1

    iget-object p1, p1, Lcom/daaw/vr0$b;->w:Lcom/daaw/vr0$b$a;

    iget p1, p1, Lcom/daaw/vr0$b$a;->c:I

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/playback/b;->h(I)V

    iget-object p1, p0, Lcom/daaw/vr0;->z:Lcom/daaw/ur0;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/b;->i()V

    :cond_0
    return-void
.end method

.method public J(ZF)V
    .locals 3

    iput-boolean p1, p0, Lcom/daaw/vr0;->w:Z

    iput p2, p0, Lcom/daaw/vr0;->v:F

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    array-length v0, p1

    :goto_0
    if-ge p2, v0, :cond_3

    aget-object v1, p1, p2

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/daaw/vr0$b;->m(F)V

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    array-length v0, p1

    :goto_1
    if-ge p2, v0, :cond_3

    aget-object v1, p1, p2

    if-eqz v1, :cond_2

    iget v2, p0, Lcom/daaw/vr0;->v:F

    invoke-virtual {v1, v2}, Lcom/daaw/vr0$b;->m(F)V

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final K(Z)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v0, p0, Lcom/daaw/vr0;->s:I

    aget-object p1, p1, v0

    iput-boolean v1, p1, Lcom/daaw/vr0$b;->q:Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v2, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_1

    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v0, p0, Lcom/daaw/vr0;->s:I

    aget-object v2, p1, v0

    iput-boolean v1, v2, Lcom/daaw/vr0$b;->q:Z

    const/4 v1, -0x1

    :try_start_0
    aget-object p1, p1, v0

    iget-object p1, p1, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget p1, p0, Lcom/daaw/vr0;->s:I

    invoke-virtual {p0, p1, v1}, Lcom/daaw/vr0;->I(II)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    iget v0, p0, Lcom/daaw/vr0;->s:I

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lcom/daaw/vr0;->I(II)V

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    :cond_3
    return-void
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->z:Lcom/daaw/ur0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/b;->j()V

    iput-object v1, p0, Lcom/daaw/vr0;->z:Lcom/daaw/ur0;

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0;->A:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/vr0;->A:Ljava/lang/ref/WeakReference;

    :cond_1
    iget v0, p0, Lcom/daaw/vr0;->s:I

    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->G(I)V

    iget v0, p0, Lcom/daaw/vr0;->t:I

    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->G(I)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v2, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    iget v0, p0, Lcom/daaw/vr0;->s:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/vr0;->I(II)V

    iget-object v0, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public c(Lcom/daaw/avee/comp/playback/b$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->c(Lcom/daaw/avee/comp/playback/b$b;)V

    return-void
.end method

.method public d(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->d(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;

    move-result-object p1

    return-object p1
.end method

.method public e(Z)V
    .locals 1

    iget v0, p0, Lcom/daaw/vr0;->v:F

    invoke-virtual {p0, p1, v0}, Lcom/daaw/vr0;->J(ZF)V

    iget-object v0, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->f(Z)V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/vr0;->w:Z

    return v0
.end method

.method public g(J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/daaw/vr0$b;->g(F)V

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    long-to-int p2, p1

    invoke-virtual {v0, p2}, Landroid/media/MediaPlayer;->seekTo(I)V

    return-void
.end method

.method public h()Lcom/daaw/hx0;
    .locals 5

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Lcom/daaw/hx0;

    iget-object v1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v2, p0, Lcom/daaw/vr0;->s:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    int-to-long v1, v1

    iget-object v3, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v4, p0, Lcom/daaw/vr0;->s:I

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lcom/daaw/vr0$b;->a()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/hx0;-><init>(JZ)V

    return-object v0
.end method

.method public i(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v2, p0, Lcom/daaw/vr0;->s:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/daaw/vr0$b;->w:Lcom/daaw/vr0$b$a;

    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/a$g;->f:Z

    if-nez v2, :cond_2

    iget v2, v1, Lcom/daaw/vr0$b$a;->a:I

    const/4 v3, 0x3

    if-ge v2, v3, :cond_1

    return-object v0

    :cond_1
    iget-boolean v0, v1, Lcom/daaw/vr0$b$a;->b:Z

    if-nez v0, :cond_2

    return-object p1

    :cond_2
    iget v7, v1, Lcom/daaw/vr0$b$a;->c:I

    iget-object v0, p0, Lcom/daaw/vr0;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/vr0;->y:Lcom/daaw/zr0;

    if-nez v1, :cond_3

    new-instance v1, Lcom/daaw/zr0;

    invoke-direct {v1}, Lcom/daaw/zr0;-><init>()V

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/vr0;->x:J

    iget-wide v2, p2, Lcom/daaw/avee/comp/playback/a$g;->g:J

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    cmp-long v9, v2, v4

    if-gez v9, :cond_6

    const-wide/16 v3, 0x0

    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/a$g;->e:Z

    if-nez v2, :cond_5

    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/a$g;->f:Z

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v8, 0x0

    :cond_5
    :goto_0
    move-object v2, v1

    move-object v5, p2

    move-object v6, p1

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/zr0;->a(JLcom/daaw/avee/comp/playback/a$h;Lcom/daaw/avee/comp/playback/a;IZ)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    goto :goto_1

    :cond_6
    const-string v2, "overridePositionUs not supported on Native"

    invoke-static {v2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/a$g;->e:Z

    if-nez v2, :cond_5

    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/a$g;->f:Z

    if-eqz v2, :cond_7

    goto :goto_0

    :cond_7
    const/4 v8, 0x0

    goto :goto_0

    :goto_1
    iput-object v1, p0, Lcom/daaw/vr0;->y:Lcom/daaw/zr0;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public j(ZZFJ)V
    .locals 7

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v0, p0, Lcom/daaw/vr0;->s:I

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lcom/daaw/vr0$b;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/vr0;->D()V

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/daaw/vr0;->s:I

    iget v0, p0, Lcom/daaw/vr0;->t:I

    if-eq p1, v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->G(I)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/vr0;->u:Landroid/net/Uri;

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    iget v2, p0, Lcom/daaw/vr0;->s:I

    iget-object v3, p0, Lcom/daaw/vr0;->u:Landroid/net/Uri;

    move-object v1, p0

    move v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/vr0;->F(ILandroid/net/Uri;FJ)V

    if-eqz p2, :cond_3

    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->K(Z)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/vr0;->b()V

    :goto_1
    return-void

    :cond_4
    :goto_2
    const-string p1, "nextDataSource is null"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    if-eqz p2, :cond_5

    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->K(Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/vr0;->b()V

    :goto_3
    return-void
.end method

.method public k()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public l()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public m(Landroid/view/SurfaceHolder;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/vr0;->A:Ljava/lang/ref/WeakReference;

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-virtual {p0, p1}, Lcom/daaw/vr0;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/vr0;->A:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceHolder;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/vr0;->A:Ljava/lang/ref/WeakReference;

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V

    :goto_0
    return-void
.end method

.method public n(Lcom/daaw/avee/comp/playback/b$c;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vr0;->z:Lcom/daaw/ur0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/b;->m(Lcom/daaw/avee/comp/playback/b$c;)V

    :cond_0
    return-void
.end method

.method public o()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/vr0;->y:Lcom/daaw/zr0;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/zr0;->d()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v0, 0x1

    invoke-interface {p1, v0, p2}, Lcom/daaw/avee/comp/playback/e$b;->j(ZI)V

    :cond_0
    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v2, v0, v1

    iget-object v2, v2, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    if-ne v2, p1, :cond_1

    aget-object p1, v0, v1

    invoke-virtual {p1}, Lcom/daaw/vr0$b;->b()I

    move-result p1

    if-gez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/playback/e$b;->g(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/e$b;->o()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v2, v0, v1

    iget-object v2, v2, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    const/4 v3, -0x1

    if-ne v2, p1, :cond_0

    :goto_0
    invoke-virtual {p0, v1, v3}, Lcom/daaw/vr0;->I(II)V

    goto :goto_1

    :cond_0
    iget v1, p0, Lcom/daaw/vr0;->t:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/daaw/q6;->j()V

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ","

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const/4 p3, 0x0

    invoke-interface {p2, p3, p1}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return p3
.end method

.method public onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onSeekComplete(Landroid/media/MediaPlayer;)V
    .locals 0

    return-void
.end method

.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 1

    int-to-float p1, p2

    const/high16 v0, 0x3f800000    # 1.0f

    mul-float p1, p1, v0

    int-to-float v0, p3

    div-float/2addr p1, v0

    iget-object v0, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p2, p3, p1}, Lcom/daaw/avee/comp/playback/e$b;->i(IIF)V

    return-void
.end method

.method public p()Lcom/daaw/avee/comp/playback/b$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vr0;->z:Lcom/daaw/ur0;

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

    iput-object p1, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    return-void
.end method

.method public r(Lcom/daaw/wd0;)V
    .locals 0

    invoke-interface {p1}, Lcom/daaw/wd0;->a()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/vr0;->u:Landroid/net/Uri;

    return-void
.end method

.method public s()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->c()Z

    move-result v0

    return v0
.end method

.method public start()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->K(Z)V

    return-void
.end method

.method public stop()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v2, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    iget v0, p0, Lcom/daaw/vr0;->s:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/vr0;->I(II)V

    iget-object v0, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v2, p0, Lcom/daaw/vr0;->t:I

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, Lcom/daaw/vr0$b;->l(Landroid/view/Surface;)V

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/vr0$b;->l(Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->t:I

    aget-object p1, p1, v1

    invoke-virtual {p1, v0}, Lcom/daaw/vr0$b;->l(Landroid/view/Surface;)V

    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object p1, p1, v1

    invoke-virtual {p1, v0}, Lcom/daaw/vr0$b;->l(Landroid/view/Surface;)V

    :goto_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    iget p1, p0, Lcom/daaw/vr0;->s:I

    iget v0, p0, Lcom/daaw/vr0;->t:I

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object p1, p1, v0

    invoke-virtual {p1, v1}, Lcom/daaw/vr0$b;->l(Landroid/view/Surface;)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v0, p0, Lcom/daaw/vr0;->s:I

    aget-object p1, p1, v0

    invoke-virtual {p1, v1}, Lcom/daaw/vr0$b;->l(Landroid/view/Surface;)V

    return-void
.end method

.method public t(FI)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p2, :cond_0

    iget p2, p0, Lcom/daaw/vr0;->s:I

    goto :goto_0

    :cond_0
    iget p2, p0, Lcom/daaw/vr0;->t:I

    iget v1, p0, Lcom/daaw/vr0;->s:I

    if-ne v1, p2, :cond_1

    return v0

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    aget-object v2, v1, p2

    if-eqz v2, :cond_3

    aget-object p2, v1, p2

    invoke-virtual {p2, p1}, Lcom/daaw/vr0$b;->h(F)Z

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
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lcom/daaw/vr0$b;->k(I)V

    return-void
.end method

.method public v()V
    .locals 2

    iget v0, p0, Lcom/daaw/vr0;->s:I

    iget v1, p0, Lcom/daaw/vr0;->t:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/vr0;->E(I)V

    return-void
.end method

.method public w(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->e(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public x(F)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3, p1}, Lcom/daaw/vr0$b;->n(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public y()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0;->C:[Lcom/daaw/vr0$b;

    iget v1, p0, Lcom/daaw/vr0;->s:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/vr0$b;->d()Z

    move-result v0

    return v0
.end method
