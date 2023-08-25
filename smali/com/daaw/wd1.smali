.class public Lcom/daaw/wd1;
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


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    sget-object v0, Lcom/daaw/avee/MainActivity;->r0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/wd1$a;

    invoke-direct {v1, p0}, Lcom/daaw/wd1$a;-><init>(Lcom/daaw/wd1;)V

    iget-object v2, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->t0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/wd1$b;

    invoke-direct {v1, p0}, Lcom/daaw/wd1$b;-><init>(Lcom/daaw/wd1;)V

    iget-object v2, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/td1;->f:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/wd1$c;

    invoke-direct {v1, p0}, Lcom/daaw/wd1$c;-><init>(Lcom/daaw/wd1;)V

    iget-object v2, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/td1;->g:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/wd1$d;

    invoke-direct {v1, p0}, Lcom/daaw/wd1$d;-><init>(Lcom/daaw/wd1;)V

    iget-object v2, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/xd1;->x:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/wd1$e;

    invoke-direct {v1, p0}, Lcom/daaw/wd1$e;-><init>(Lcom/daaw/wd1;)V

    iget-object v2, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/xd1;->y:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/wd1$f;

    invoke-direct {v1, p0}, Lcom/daaw/wd1$f;-><init>(Lcom/daaw/wd1;)V

    iget-object v2, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/xd1;->z:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/wd1$g;

    invoke-direct {v1, p0}, Lcom/daaw/wd1$g;-><init>(Lcom/daaw/wd1;)V

    iget-object v2, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/xd1;->A:Lcom/daaw/vw1;

    sget-object v1, Lcom/daaw/vd1;->a:Lcom/daaw/vd1;

    iget-object v2, p0, Lcom/daaw/wd1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a()Lcom/daaw/lo1;
    .locals 1

    invoke-static {}, Lcom/daaw/wd1;->b()Lcom/daaw/lo1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Lcom/daaw/lo1;
    .locals 3

    invoke-static {}, Lcom/daaw/td1;->c()Lcom/daaw/td1;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/lo1;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v1, Lcom/daaw/lo1;

    invoke-virtual {v0}, Lcom/daaw/td1;->g()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/td1;->e()Lcom/daaw/ud1;

    move-result-object v0

    iget-boolean v0, v0, Lcom/daaw/ud1;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
