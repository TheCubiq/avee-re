.class public Lcom/daaw/vm0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/vm0;->b:I

    iput v0, p0, Lcom/daaw/vm0;->c:I

    sget-object v0, Lcom/daaw/avee/MainActivity;->s0:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/vm0$b;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$b;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->r0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/vm0$c;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$c;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/j5;->g:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/vm0$d;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$d;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->u0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/vm0$e;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$e;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->z0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/vm0$f;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$f;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/uy;->a:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/vm0$g;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$g;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->p0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/vm0$h;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$h;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->B0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/vm0$i;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$i;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->C0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/vm0$j;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$j;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->G0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/vm0$a;

    invoke-direct {v1, p0}, Lcom/daaw/vm0$a;-><init>(Lcom/daaw/vm0;)V

    iget-object v2, p0, Lcom/daaw/vm0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/vm0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/vm0;->f()V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/vm0;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/vm0;->g(I)V

    return-void
.end method


# virtual methods
.method public c(Lcom/daaw/avee/MainActivity;)I
    .locals 5

    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/p3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v1, v4, :cond_3

    if-eqz v0, :cond_2

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    return v4

    :cond_1
    return v2

    :cond_2
    return v4

    :cond_3
    invoke-virtual {p1}, Lcom/daaw/p3;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    if-ne p1, v3, :cond_6

    if-eqz v0, :cond_5

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 p1, 0x4

    return p1

    :cond_5
    return v3

    :cond_6
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Lcom/daaw/avee/MainActivity;I)V
    .locals 2

    const/4 v0, -0x1

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    if-eq p2, v1, :cond_0

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    const/4 v1, 0x4

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p2, 0xe

    invoke-virtual {p1, p2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :goto_1
    return-void
.end method

.method public e(Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/vm0;->b:I

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/vm0;->c(Lcom/daaw/avee/MainActivity;)I

    move-result p1

    iput p1, p0, Lcom/daaw/vm0;->b:I

    :cond_0
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v0, Lcom/daaw/j5;->J:I

    invoke-virtual {p1, v0}, Lcom/daaw/j5;->k(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/vm0;->c:I

    iget p1, p0, Lcom/daaw/vm0;->b:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/daaw/vm0;->c:I

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/vm0;->g(I)V

    return-void
.end method

.method public final f()V
    .locals 3

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->J:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v1}, Lcom/daaw/vm0;->c(Lcom/daaw/avee/MainActivity;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v1

    sget v2, Lcom/daaw/j5;->J:I

    invoke-virtual {v1, v2, v0}, Lcom/daaw/j5;->c0(II)V

    return-void
.end method

.method public final g(I)V
    .locals 3

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2, v1}, Lcom/daaw/avee/MainActivity;->R0(ZZ)V

    const/4 v1, -0x1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v2

    if-ne v2, v1, :cond_2

    invoke-virtual {p0, v0, p1}, Lcom/daaw/vm0;->d(Lcom/daaw/avee/MainActivity;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :cond_2
    :goto_1
    return-void
.end method
