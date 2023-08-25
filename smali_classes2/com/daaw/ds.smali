.class public Lcom/daaw/ds;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lq1;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/p70;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lcom/daaw/p70;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/daaw/ij0;",
            ">;",
            "Lcom/daaw/p70;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/ds;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ds;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/ds;->b:Lcom/daaw/p70;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/bi;)Lcom/daaw/lq1;
    .locals 0

    invoke-static {p0}, Lcom/daaw/ds;->d(Lcom/daaw/bi;)Lcom/daaw/lq1;

    move-result-object p0

    return-object p0
.end method

.method public static c()Lcom/daaw/vh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/vh<",
            "Lcom/daaw/lq1;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/daaw/lq1;

    invoke-static {v0}, Lcom/daaw/vh;->e(Ljava/lang/Class;)Lcom/daaw/vh$b;

    move-result-object v0

    const-class v1, Lcom/daaw/ij0;

    invoke-static {v1}, Lcom/daaw/ys;->l(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v0

    sget-object v1, Lcom/daaw/cs;->a:Lcom/daaw/cs;

    invoke-virtual {v0, v1}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lcom/daaw/bi;)Lcom/daaw/lq1;
    .locals 2

    new-instance v0, Lcom/daaw/ds;

    const-class v1, Lcom/daaw/ij0;

    invoke-interface {p0, v1}, Lcom/daaw/bi;->f(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-static {}, Lcom/daaw/p70;->a()Lcom/daaw/p70;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/daaw/ds;-><init>(Ljava/util/Set;Lcom/daaw/p70;)V

    return-object v0
.end method

.method public static e(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/daaw/ij0;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ij0;

    invoke-virtual {v1}, Lcom/daaw/ij0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/daaw/ij0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ds;->b:Lcom/daaw/p70;

    invoke-virtual {v0}, Lcom/daaw/p70;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ds;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/ds;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ds;->b:Lcom/daaw/p70;

    invoke-virtual {v1}, Lcom/daaw/p70;->b()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/ds;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
