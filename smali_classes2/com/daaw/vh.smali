.class public final Lcom/daaw/vh;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vh$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "-TT;>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/ys;",
            ">;"
        }
    .end annotation
.end field

.field public final d:I

.field public final e:I

.field public final f:Lcom/daaw/gi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gi<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILcom/daaw/gi;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "-TT;>;>;",
            "Ljava/util/Set<",
            "Lcom/daaw/ys;",
            ">;II",
            "Lcom/daaw/gi<",
            "TT;>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vh;->a:Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/vh;->b:Ljava/util/Set;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/vh;->c:Ljava/util/Set;

    iput p4, p0, Lcom/daaw/vh;->d:I

    iput p5, p0, Lcom/daaw/vh;->e:I

    iput-object p6, p0, Lcom/daaw/vh;->f:Lcom/daaw/gi;

    invoke-static {p7}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/vh;->g:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILcom/daaw/gi;Ljava/util/Set;Lcom/daaw/vh$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/daaw/vh;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILcom/daaw/gi;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Lcom/daaw/bi;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/vh;->q(Ljava/lang/Object;Lcom/daaw/bi;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lcom/daaw/bi;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/vh;->r(Ljava/lang/Object;Lcom/daaw/bi;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lcom/daaw/i01;)Lcom/daaw/vh$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/i01<",
            "TT;>;)",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/vh$b;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/daaw/i01;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/daaw/vh$b;-><init>(Lcom/daaw/i01;[Lcom/daaw/i01;Lcom/daaw/vh$a;)V

    return-object v0
.end method

.method public static varargs d(Lcom/daaw/i01;[Lcom/daaw/i01;)Lcom/daaw/vh$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/i01<",
            "TT;>;[",
            "Lcom/daaw/i01<",
            "-TT;>;)",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lcom/daaw/vh$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/daaw/vh$b;-><init>(Lcom/daaw/i01;[Lcom/daaw/i01;Lcom/daaw/vh$a;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Class;)Lcom/daaw/vh$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/vh$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/daaw/vh$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;Lcom/daaw/vh$a;)V

    return-object v0
.end method

.method public static varargs f(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/daaw/vh$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lcom/daaw/vh$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/daaw/vh$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;Lcom/daaw/vh$a;)V

    return-object v0
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/Class;)Lcom/daaw/vh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/daaw/vh<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/daaw/vh;->m(Ljava/lang/Class;)Lcom/daaw/vh$b;

    move-result-object p1

    new-instance v0, Lcom/daaw/th;

    invoke-direct {v0, p0}, Lcom/daaw/th;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/Class;)Lcom/daaw/vh$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lcom/daaw/vh;->e(Ljava/lang/Class;)Lcom/daaw/vh$b;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/vh$b;->a(Lcom/daaw/vh$b;)Lcom/daaw/vh$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/Object;Lcom/daaw/bi;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static synthetic r(Ljava/lang/Object;Lcom/daaw/bi;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static varargs s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcom/daaw/vh;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Lcom/daaw/vh<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    invoke-static {p1, p2}, Lcom/daaw/vh;->f(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/daaw/vh$b;

    move-result-object p1

    new-instance p2, Lcom/daaw/uh;

    invoke-direct {p2, p0}, Lcom/daaw/uh;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/daaw/ys;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vh;->c:Ljava/util/Set;

    return-object v0
.end method

.method public h()Lcom/daaw/gi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/gi<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vh;->f:Lcom/daaw/gi;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vh;->a:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "-TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vh;->b:Ljava/util/Set;

    return-object v0
.end method

.method public k()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vh;->g:Ljava/util/Set;

    return-object v0
.end method

.method public n()Z
    .locals 2

    iget v0, p0, Lcom/daaw/vh;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public o()Z
    .locals 2

    iget v0, p0, Lcom/daaw/vh;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p()Z
    .locals 1

    iget v0, p0, Lcom/daaw/vh;->e:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t(Lcom/daaw/gi;)Lcom/daaw/vh;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/gi<",
            "TT;>;)",
            "Lcom/daaw/vh<",
            "TT;>;"
        }
    .end annotation

    new-instance v8, Lcom/daaw/vh;

    iget-object v1, p0, Lcom/daaw/vh;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/vh;->b:Ljava/util/Set;

    iget-object v3, p0, Lcom/daaw/vh;->c:Ljava/util/Set;

    iget v4, p0, Lcom/daaw/vh;->d:I

    iget v5, p0, Lcom/daaw/vh;->e:I

    iget-object v7, p0, Lcom/daaw/vh;->g:Ljava/util/Set;

    move-object v0, v8

    move-object v6, p1

    invoke-direct/range {v0 .. v7}, Lcom/daaw/vh;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILcom/daaw/gi;Ljava/util/Set;)V

    return-object v8
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Component<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/vh;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/vh;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/vh;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/vh;->c:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
