.class public Lcom/daaw/xn1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wn1;


# static fields
.field public static volatile e:Lcom/daaw/yn1;


# instance fields
.field public final a:Lcom/daaw/cg;

.field public final b:Lcom/daaw/cg;

.field public final c:Lcom/daaw/q81;

.field public final d:Lcom/daaw/eq1;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/daaw/cg;Lcom/daaw/cg;Lcom/daaw/q81;Lcom/daaw/eq1;Lcom/daaw/by1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xn1;->a:Lcom/daaw/cg;

    iput-object p2, p0, Lcom/daaw/xn1;->b:Lcom/daaw/cg;

    iput-object p3, p0, Lcom/daaw/xn1;->c:Lcom/daaw/q81;

    iput-object p4, p0, Lcom/daaw/xn1;->d:Lcom/daaw/eq1;

    invoke-virtual {p5}, Lcom/daaw/by1;->c()V

    return-void
.end method

.method public static c()Lcom/daaw/xn1;
    .locals 2

    sget-object v0, Lcom/daaw/xn1;->e:Lcom/daaw/yn1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/yn1;->n()Lcom/daaw/xn1;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lcom/daaw/lt;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lt;",
            ")",
            "Ljava/util/Set<",
            "Lcom/daaw/bx;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lcom/daaw/vw;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/vw;

    invoke-interface {p0}, Lcom/daaw/vw;->b()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, Lcom/daaw/bx;->b(Ljava/lang/String;)Lcom/daaw/bx;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/daaw/xn1;->e:Lcom/daaw/yn1;

    if-nez v0, :cond_1

    const-class v0, Lcom/daaw/xn1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/xn1;->e:Lcom/daaw/yn1;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/daaw/uo;->q()Lcom/daaw/yn1$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/daaw/yn1$a;->b(Landroid/content/Context;)Lcom/daaw/yn1$a;

    move-result-object p0

    invoke-interface {p0}, Lcom/daaw/yn1$a;->a()Lcom/daaw/yn1;

    move-result-object p0

    sput-object p0, Lcom/daaw/xn1;->e:Lcom/daaw/yn1;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/db1;Lcom/daaw/ao1;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/xn1;->c:Lcom/daaw/q81;

    invoke-virtual {p1}, Lcom/daaw/db1;->f()Lcom/daaw/sn1;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/db1;->c()Lcom/daaw/xx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/xx;->c()Lcom/daaw/cz0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/sn1;->f(Lcom/daaw/cz0;)Lcom/daaw/sn1;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/daaw/xn1;->b(Lcom/daaw/db1;)Lcom/daaw/by;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Lcom/daaw/q81;->a(Lcom/daaw/sn1;Lcom/daaw/by;Lcom/daaw/ao1;)V

    return-void
.end method

.method public final b(Lcom/daaw/db1;)Lcom/daaw/by;
    .locals 4

    invoke-static {}, Lcom/daaw/by;->a()Lcom/daaw/by$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xn1;->a:Lcom/daaw/cg;

    invoke-interface {v1}, Lcom/daaw/cg;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/by$a;->i(J)Lcom/daaw/by$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xn1;->b:Lcom/daaw/cg;

    invoke-interface {v1}, Lcom/daaw/cg;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/by$a;->k(J)Lcom/daaw/by$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/db1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/by$a;->j(Ljava/lang/String;)Lcom/daaw/by$a;

    move-result-object v0

    new-instance v1, Lcom/daaw/ww;

    invoke-virtual {p1}, Lcom/daaw/db1;->b()Lcom/daaw/bx;

    move-result-object v2

    invoke-virtual {p1}, Lcom/daaw/db1;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/daaw/ww;-><init>(Lcom/daaw/bx;[B)V

    invoke-virtual {v0, v1}, Lcom/daaw/by$a;->h(Lcom/daaw/ww;)Lcom/daaw/by$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/db1;->c()Lcom/daaw/xx;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/xx;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/by$a;->g(Ljava/lang/Integer;)Lcom/daaw/by$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/by$a;->d()Lcom/daaw/by;

    move-result-object p1

    return-object p1
.end method

.method public e()Lcom/daaw/eq1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn1;->d:Lcom/daaw/eq1;

    return-object v0
.end method

.method public g(Lcom/daaw/lt;)Lcom/daaw/tn1;
    .locals 4

    new-instance v0, Lcom/daaw/un1;

    invoke-static {p1}, Lcom/daaw/xn1;->d(Lcom/daaw/lt;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Lcom/daaw/sn1;->a()Lcom/daaw/sn1$a;

    move-result-object v2

    invoke-interface {p1}, Lcom/daaw/lt;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/sn1$a;->b(Ljava/lang/String;)Lcom/daaw/sn1$a;

    move-result-object v2

    invoke-interface {p1}, Lcom/daaw/lt;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/daaw/sn1$a;->c([B)Lcom/daaw/sn1$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/sn1$a;->a()Lcom/daaw/sn1;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lcom/daaw/un1;-><init>(Ljava/util/Set;Lcom/daaw/sn1;Lcom/daaw/wn1;)V

    return-object v0
.end method
