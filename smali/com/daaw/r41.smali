.class public Lcom/daaw/r41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qj0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/r41$e;,
        Lcom/daaw/r41$d;,
        Lcom/daaw/r41$c;,
        Lcom/daaw/r41$b;
    }
.end annotation


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/mj0;

.field public final r:Lcom/daaw/u41;

.field public final s:Lcom/daaw/v41;

.field public final t:Lcom/daaw/e70;

.field public final u:Lcom/daaw/r41$d;

.field public v:Lcom/daaw/r41$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/mj0;Lcom/daaw/u41;)V
    .locals 6

    new-instance v4, Lcom/daaw/v41;

    invoke-direct {v4}, Lcom/daaw/v41;-><init>()V

    new-instance v5, Lcom/daaw/ij;

    invoke-direct {v5}, Lcom/daaw/ij;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/r41;-><init>(Landroid/content/Context;Lcom/daaw/mj0;Lcom/daaw/u41;Lcom/daaw/v41;Lcom/daaw/ij;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/mj0;Lcom/daaw/u41;Lcom/daaw/v41;Lcom/daaw/ij;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/r41;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/r41;->q:Lcom/daaw/mj0;

    iput-object p3, p0, Lcom/daaw/r41;->r:Lcom/daaw/u41;

    iput-object p4, p0, Lcom/daaw/r41;->s:Lcom/daaw/v41;

    invoke-static {p1}, Lcom/daaw/e70;->j(Landroid/content/Context;)Lcom/daaw/e70;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/r41;->t:Lcom/daaw/e70;

    new-instance p3, Lcom/daaw/r41$d;

    invoke-direct {p3, p0}, Lcom/daaw/r41$d;-><init>(Lcom/daaw/r41;)V

    iput-object p3, p0, Lcom/daaw/r41;->u:Lcom/daaw/r41$d;

    new-instance p3, Lcom/daaw/r41$e;

    invoke-direct {p3, p4}, Lcom/daaw/r41$e;-><init>(Lcom/daaw/v41;)V

    invoke-virtual {p5, p1, p3}, Lcom/daaw/ij;->a(Landroid/content/Context;Lcom/daaw/hj$a;)Lcom/daaw/hj;

    move-result-object p1

    invoke-static {}, Lcom/daaw/tq1;->i()Z

    move-result p3

    if-eqz p3, :cond_0

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-direct {p3, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p4, Lcom/daaw/r41$a;

    invoke-direct {p4, p0, p2}, Lcom/daaw/r41$a;-><init>(Lcom/daaw/r41;Lcom/daaw/mj0;)V

    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2, p0}, Lcom/daaw/mj0;->a(Lcom/daaw/qj0;)V

    :goto_0
    invoke-interface {p2, p1}, Lcom/daaw/mj0;->a(Lcom/daaw/qj0;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 0

    invoke-static {p0}, Lcom/daaw/r41;->s(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/r41;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r41;->p:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic l(Lcom/daaw/r41;)Lcom/daaw/e70;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r41;->t:Lcom/daaw/e70;

    return-object p0
.end method

.method public static synthetic m(Lcom/daaw/r41;)Lcom/daaw/v41;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r41;->s:Lcom/daaw/v41;

    return-object p0
.end method

.method public static synthetic n(Lcom/daaw/r41;)Lcom/daaw/mj0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r41;->q:Lcom/daaw/mj0;

    return-object p0
.end method

.method public static synthetic o(Lcom/daaw/r41;)Lcom/daaw/r41$d;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r41;->u:Lcom/daaw/r41$d;

    return-object p0
.end method

.method public static synthetic p(Lcom/daaw/r41;)Lcom/daaw/r41$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r41;->v:Lcom/daaw/r41$b;

    return-object p0
.end method

.method public static s(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public A(Lcom/daaw/mq0;Ljava/lang/Class;)Lcom/daaw/r41$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/mq0<",
            "TA;TT;>;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/daaw/r41$c<",
            "TA;TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/r41$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/r41$c;-><init>(Lcom/daaw/r41;Lcom/daaw/mq0;Ljava/lang/Class;)V

    return-object v0
.end method

.method public a()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/r41;->z()V

    return-void
.end method

.method public h()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/r41;->y()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/r41;->s:Lcom/daaw/v41;

    invoke-virtual {v0}, Lcom/daaw/v41;->a()V

    return-void
.end method

.method public q()Lcom/daaw/uu;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/uu<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lcom/daaw/r41;->v(Ljava/lang/Class;)Lcom/daaw/uu;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/r41;->p:Landroid/content/Context;

    invoke-static {v1}, Lcom/daaw/q5;->a(Landroid/content/Context;)Lcom/daaw/hi0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/su;->O(Lcom/daaw/hi0;)Lcom/daaw/su;

    move-result-object v0

    check-cast v0, Lcom/daaw/uu;

    return-object v0
.end method

.method public r()Lcom/daaw/uu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/uu<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/net/Uri;

    invoke-virtual {p0, v0}, Lcom/daaw/r41;->v(Ljava/lang/Class;)Lcom/daaw/uu;

    move-result-object v0

    return-object v0
.end method

.method public t(Landroid/net/Uri;)Lcom/daaw/uu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lcom/daaw/uu<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/r41;->r()Lcom/daaw/uu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/su;->L(Ljava/lang/Object;)Lcom/daaw/su;

    move-result-object p1

    check-cast p1, Lcom/daaw/uu;

    return-object p1
.end method

.method public u(Ljava/lang/Integer;)Lcom/daaw/uu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/daaw/uu<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/r41;->q()Lcom/daaw/uu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/su;->L(Ljava/lang/Object;)Lcom/daaw/su;

    move-result-object p1

    check-cast p1, Lcom/daaw/uu;

    return-object p1
.end method

.method public final v(Ljava/lang/Class;)Lcom/daaw/uu;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/daaw/uu<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/r41;->p:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/daaw/e70;->e(Ljava/lang/Class;Landroid/content/Context;)Lcom/daaw/mq0;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/r41;->p:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/daaw/e70;->b(Ljava/lang/Class;Landroid/content/Context;)Lcom/daaw/mq0;

    move-result-object v4

    if-eqz p1, :cond_1

    if-nez v3, :cond_1

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must provide a Model of a type for"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " which there is a registered ModelLoader, if you are using a custom model, you must first call"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " Glide#register with a ModelLoaderFactory for your custom model class"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/r41;->u:Lcom/daaw/r41$d;

    new-instance v10, Lcom/daaw/uu;

    iget-object v5, p0, Lcom/daaw/r41;->p:Landroid/content/Context;

    iget-object v6, p0, Lcom/daaw/r41;->t:Lcom/daaw/e70;

    iget-object v7, p0, Lcom/daaw/r41;->s:Lcom/daaw/v41;

    iget-object v8, p0, Lcom/daaw/r41;->q:Lcom/daaw/mj0;

    move-object v1, v10

    move-object v2, p1

    move-object v9, v0

    invoke-direct/range {v1 .. v9}, Lcom/daaw/uu;-><init>(Ljava/lang/Class;Lcom/daaw/mq0;Lcom/daaw/mq0;Landroid/content/Context;Lcom/daaw/e70;Lcom/daaw/v41;Lcom/daaw/mj0;Lcom/daaw/r41$d;)V

    invoke-virtual {v0, v10}, Lcom/daaw/r41$d;->a(Lcom/daaw/f60;)Lcom/daaw/f60;

    move-result-object p1

    check-cast p1, Lcom/daaw/uu;

    return-object p1
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/r41;->t:Lcom/daaw/e70;

    invoke-virtual {v0}, Lcom/daaw/e70;->i()V

    return-void
.end method

.method public x(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/r41;->t:Lcom/daaw/e70;

    invoke-virtual {v0, p1}, Lcom/daaw/e70;->s(I)V

    return-void
.end method

.method public y()V
    .locals 1

    invoke-static {}, Lcom/daaw/tq1;->b()V

    iget-object v0, p0, Lcom/daaw/r41;->s:Lcom/daaw/v41;

    invoke-virtual {v0}, Lcom/daaw/v41;->b()V

    return-void
.end method

.method public z()V
    .locals 1

    invoke-static {}, Lcom/daaw/tq1;->b()V

    iget-object v0, p0, Lcom/daaw/r41;->s:Lcom/daaw/v41;

    invoke-virtual {v0}, Lcom/daaw/v41;->e()V

    return-void
.end method
