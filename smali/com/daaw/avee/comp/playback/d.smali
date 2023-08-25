.class public Lcom/daaw/avee/comp/playback/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/d$b;
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/avee/comp/playback/e;

.field public b:Lcom/daaw/avee/comp/playback/e$b;

.field public c:I

.field public d:I

.field public e:J

.field public f:F

.field public g:F

.field public h:J

.field public i:J

.field public j:Lcom/daaw/avee/comp/playback/d$b;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/e;Lcom/daaw/avee/comp/playback/e$b;J)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->d:I

    const-wide/16 v0, 0x50

    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    const/high16 v2, 0x3e800000    # 0.25f

    iput v2, p0, Lcom/daaw/avee/comp/playback/d;->f:F

    const-wide/16 v3, 0xa

    add-long/2addr v0, v3

    long-to-float v0, v0

    const v1, 0x3a83126f    # 0.001f

    mul-float v0, v0, v1

    div-float/2addr v0, v2

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->g:F

    const-wide/16 v0, 0x12c

    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/d;->h:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/d;->i:J

    new-instance v0, Lcom/daaw/avee/comp/playback/d$b;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/d$b;-><init>(Lcom/daaw/avee/comp/playback/d;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/d;->b:Lcom/daaw/avee/comp/playback/e$b;

    invoke-virtual {p0, p3, p4}, Lcom/daaw/avee/comp/playback/d;->A(J)V

    new-instance p2, Lcom/daaw/avee/comp/playback/d$a;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/playback/d$a;-><init>(Lcom/daaw/avee/comp/playback/d;)V

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/playback/e;->q(Lcom/daaw/avee/comp/playback/e$b;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/avee/comp/playback/d;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/d;->i:J

    return-wide v0
.end method

.method public static synthetic b(Lcom/daaw/avee/comp/playback/d;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    return-wide v0
.end method

.method public static synthetic c(Lcom/daaw/avee/comp/playback/d;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->p()V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/avee/comp/playback/d;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->u()V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/d$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/avee/comp/playback/d;)I
    .locals 0

    iget p0, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    return p0
.end method

.method public static synthetic g(Lcom/daaw/avee/comp/playback/d;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    return p1
.end method

.method public static synthetic h(Lcom/daaw/avee/comp/playback/d;)F
    .locals 0

    iget p0, p0, Lcom/daaw/avee/comp/playback/d;->g:F

    return p0
.end method

.method public static synthetic i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;
    .locals 0

    iget-object p0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    return-object p0
.end method

.method public static synthetic j(Lcom/daaw/avee/comp/playback/d;)I
    .locals 0

    iget p0, p0, Lcom/daaw/avee/comp/playback/d;->d:I

    return p0
.end method

.method public static synthetic k(Lcom/daaw/avee/comp/playback/d;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/avee/comp/playback/d;->d:I

    return p1
.end method

.method public static synthetic l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/avee/comp/playback/d;->b:Lcom/daaw/avee/comp/playback/e$b;

    return-object p0
.end method

.method public static synthetic m(Lcom/daaw/avee/comp/playback/d;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/d;->h:J

    return-wide v0
.end method

.method public static synthetic n(Lcom/daaw/avee/comp/playback/d;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->B()V

    return-void
.end method

.method public static synthetic o(Lcom/daaw/avee/comp/playback/d;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->C()V

    return-void
.end method


# virtual methods
.method public A(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/avee/comp/playback/d;->i:J

    return-void
.end method

.method public final B()V
    .locals 4

    const/4 v0, 0x5

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e;->start()V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final C()V
    .locals 4

    const/4 v0, 0x3

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e;->start()V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public D()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->C()V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->r()V

    return-void
.end method

.method public final E(Lcom/daaw/wd0;ZZFJ)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->h:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->d:I

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e;->r(Lcom/daaw/wd0;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    move v2, p2

    move v3, p3

    move v4, p4

    move-wide v5, p5

    invoke-interface/range {v1 .. v6}, Lcom/daaw/avee/comp/playback/e;->j(ZZFJ)V

    return-void
.end method

.method public F()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e;->stop()V

    return-void
.end method

.method public final G()V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public H()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->G()V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->r()V

    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e;->v()V

    return-void
.end method

.method public q()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x6

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->d:I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public r()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x4

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->d:I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public s()Lcom/daaw/avee/comp/playback/e;
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    return-object v0
.end method

.method public final t()V
    .locals 4

    const/4 v0, 0x5

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final u()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e;->start()V

    return-void
.end method

.method public final v()V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/avee/comp/playback/d;->c:I

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->e:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public w()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->v()V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->r()V

    return-void
.end method

.method public x(Lcom/daaw/wd0;ZJ)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/d;->i:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/d;->h:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move-wide v5, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/d;->E(Lcom/daaw/wd0;ZZFJ)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->t()V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->q()V

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move-wide v5, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/d;->E(Lcom/daaw/wd0;ZZFJ)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/d;->p()V

    :goto_0
    return-void
.end method

.method public y(Lcom/daaw/wd0;ZJJ)V
    .locals 12

    move-object v7, p0

    move-wide/from16 v8, p5

    iget-object v0, v7, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v10, 0x5

    invoke-virtual {v0, v10}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, v7, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, v7, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v11, 0x7

    invoke-virtual {v0, v11}, Landroid/os/Handler;->removeMessages(I)V

    invoke-static {}, Lcom/daaw/br1;->F()J

    move-result-wide v0

    sub-long v0, v8, v0

    const-wide/16 v2, 0x0

    cmp-long v4, v8, v2

    if-lez v4, :cond_3

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_2

    :cond_0
    iget-wide v0, v7, Lcom/daaw/avee/comp/playback/d;->i:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    iget-wide v4, v7, Lcom/daaw/avee/comp/playback/d;->h:J

    cmp-long v6, v0, v4

    if-lez v6, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v5, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/d;->E(Lcom/daaw/wd0;ZZFJ)V

    if-eqz p2, :cond_4

    iget-object v0, v7, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v10}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    goto :goto_1

    :cond_1
    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p0

    move-object v1, p1

    move-wide v5, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/d;->E(Lcom/daaw/wd0;ZZFJ)V

    if-eqz p2, :cond_4

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p0

    move-object v1, p1

    move-wide v5, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/d;->E(Lcom/daaw/wd0;ZZFJ)V

    if-eqz p2, :cond_4

    :goto_0
    iget-object v0, v7, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v0, v11}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    :goto_1
    iget-object v1, v7, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    invoke-virtual {v1, v0, v8, v9}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual/range {p0 .. p4}, Lcom/daaw/avee/comp/playback/d;->x(Lcom/daaw/wd0;ZJ)V

    :cond_4
    :goto_3
    return-void
.end method

.method public z()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->j:Lcom/daaw/avee/comp/playback/d$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e;->a()V

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/d;->a:Lcom/daaw/avee/comp/playback/e;

    return-void
.end method
