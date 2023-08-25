.class public Lcom/daaw/x60;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/x60$e;,
        Lcom/daaw/x60$b;,
        Lcom/daaw/x60$d;,
        Lcom/daaw/x60$c;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/x60$c;

.field public final b:Lcom/daaw/r60;

.field public final c:Landroid/os/Handler;

.field public d:Z

.field public e:Z

.field public f:Lcom/daaw/f60;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/f60<",
            "Lcom/daaw/r60;",
            "Lcom/daaw/r60;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lcom/daaw/x60$b;

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/x60$c;Lcom/daaw/r60;II)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/e70;->j(Landroid/content/Context;)Lcom/daaw/e70;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/e70;->k()Lcom/daaw/bc;

    move-result-object v0

    invoke-static {p1, p3, p4, p5, v0}, Lcom/daaw/x60;->c(Landroid/content/Context;Lcom/daaw/r60;IILcom/daaw/bc;)Lcom/daaw/f60;

    move-result-object p1

    const/4 p4, 0x0

    invoke-direct {p0, p2, p3, p4, p1}, Lcom/daaw/x60;-><init>(Lcom/daaw/x60$c;Lcom/daaw/r60;Landroid/os/Handler;Lcom/daaw/f60;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/x60$c;Lcom/daaw/r60;Landroid/os/Handler;Lcom/daaw/f60;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/x60$c;",
            "Lcom/daaw/r60;",
            "Landroid/os/Handler;",
            "Lcom/daaw/f60<",
            "Lcom/daaw/r60;",
            "Lcom/daaw/r60;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/x60;->d:Z

    iput-boolean v0, p0, Lcom/daaw/x60;->e:Z

    if-nez p3, :cond_0

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/daaw/x60$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/daaw/x60$d;-><init>(Lcom/daaw/x60;Lcom/daaw/x60$a;)V

    invoke-direct {p3, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :cond_0
    iput-object p1, p0, Lcom/daaw/x60;->a:Lcom/daaw/x60$c;

    iput-object p2, p0, Lcom/daaw/x60;->b:Lcom/daaw/r60;

    iput-object p3, p0, Lcom/daaw/x60;->c:Landroid/os/Handler;

    iput-object p4, p0, Lcom/daaw/x60;->f:Lcom/daaw/f60;

    return-void
.end method

.method public static c(Landroid/content/Context;Lcom/daaw/r60;IILcom/daaw/bc;)Lcom/daaw/f60;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/r60;",
            "II",
            "Lcom/daaw/bc;",
            ")",
            "Lcom/daaw/f60<",
            "Lcom/daaw/r60;",
            "Lcom/daaw/r60;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/z60;

    invoke-direct {v0, p4}, Lcom/daaw/z60;-><init>(Lcom/daaw/bc;)V

    new-instance p4, Lcom/daaw/y60;

    invoke-direct {p4}, Lcom/daaw/y60;-><init>()V

    invoke-static {}, Lcom/daaw/it0;->b()Lcom/daaw/zw;

    move-result-object v1

    invoke-static {p0}, Lcom/daaw/e70;->t(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object p0

    const-class v2, Lcom/daaw/r60;

    invoke-virtual {p0, p4, v2}, Lcom/daaw/r41;->A(Lcom/daaw/mq0;Ljava/lang/Class;)Lcom/daaw/r41$c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/daaw/r41$c;->c(Ljava/lang/Object;)Lcom/daaw/r41$c$a;

    move-result-object p0

    const-class p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/daaw/r41$c$a;->a(Ljava/lang/Class;)Lcom/daaw/g60;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/daaw/f60;->z(Lcom/daaw/zw;)Lcom/daaw/f60;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/daaw/f60;->i(Lcom/daaw/d51;)Lcom/daaw/f60;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/f60;->y(Z)Lcom/daaw/f60;

    move-result-object p0

    sget-object p1, Lcom/daaw/wt;->s:Lcom/daaw/wt;

    invoke-virtual {p0, p1}, Lcom/daaw/f60;->j(Lcom/daaw/wt;)Lcom/daaw/f60;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Lcom/daaw/f60;->v(II)Lcom/daaw/f60;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/x60;->h()V

    iget-object v0, p0, Lcom/daaw/x60;->g:Lcom/daaw/x60$b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/daaw/e70;->h(Lcom/daaw/pj1;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/x60;->g:Lcom/daaw/x60$b;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/x60;->h:Z

    return-void
.end method

.method public b()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/daaw/x60;->g:Lcom/daaw/x60$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/x60$b;->m()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final d()V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/x60;->d:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/x60;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/x60;->e:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/x60;->b:Lcom/daaw/r60;

    invoke-virtual {v2}, Lcom/daaw/r60;->h()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/daaw/x60;->b:Lcom/daaw/r60;

    invoke-virtual {v2}, Lcom/daaw/r60;->a()V

    new-instance v2, Lcom/daaw/x60$b;

    iget-object v3, p0, Lcom/daaw/x60;->c:Landroid/os/Handler;

    iget-object v4, p0, Lcom/daaw/x60;->b:Lcom/daaw/r60;

    invoke-virtual {v4}, Lcom/daaw/r60;->d()I

    move-result v4

    invoke-direct {v2, v3, v4, v0, v1}, Lcom/daaw/x60$b;-><init>(Landroid/os/Handler;IJ)V

    iget-object v0, p0, Lcom/daaw/x60;->f:Lcom/daaw/f60;

    new-instance v1, Lcom/daaw/x60$e;

    invoke-direct {v1}, Lcom/daaw/x60$e;-><init>()V

    invoke-virtual {v0, v1}, Lcom/daaw/f60;->x(Lcom/daaw/hi0;)Lcom/daaw/f60;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/f60;->r(Lcom/daaw/pj1;)Lcom/daaw/pj1;

    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lcom/daaw/x60$b;)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/x60;->h:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/x60;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/x60;->g:Lcom/daaw/x60$b;

    iput-object p1, p0, Lcom/daaw/x60;->g:Lcom/daaw/x60$b;

    iget-object v2, p0, Lcom/daaw/x60;->a:Lcom/daaw/x60$c;

    invoke-static {p1}, Lcom/daaw/x60$b;->l(Lcom/daaw/x60$b;)I

    move-result p1

    invoke-interface {v2, p1}, Lcom/daaw/x60$c;->a(I)V

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/daaw/x60;->c:Landroid/os/Handler;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/x60;->e:Z

    invoke-virtual {p0}, Lcom/daaw/x60;->d()V

    return-void
.end method

.method public f(Lcom/daaw/cn1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Transformation must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/x60;->f:Lcom/daaw/f60;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/daaw/cn1;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/daaw/f60;->A([Lcom/daaw/cn1;)Lcom/daaw/f60;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/x60;->f:Lcom/daaw/f60;

    return-void
.end method

.method public g()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/x60;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/x60;->d:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/x60;->h:Z

    invoke-virtual {p0}, Lcom/daaw/x60;->d()V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/x60;->d:Z

    return-void
.end method
