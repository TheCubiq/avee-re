.class public abstract Lcom/daaw/kw0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/kw0$a;
    }
.end annotation


# static fields
.field public static a:Lcom/daaw/kw0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/daaw/kw0;->a()Lcom/daaw/kw0$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/kw0$a;->a()Lcom/daaw/kw0;

    move-result-object v0

    sput-object v0, Lcom/daaw/kw0;->a:Lcom/daaw/kw0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/kw0$a;
    .locals 4

    new-instance v0, Lcom/daaw/m9$b;

    invoke-direct {v0}, Lcom/daaw/m9$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/m9$b;->h(J)Lcom/daaw/kw0$a;

    move-result-object v0

    sget-object v3, Lcom/daaw/jw0$a;->p:Lcom/daaw/jw0$a;

    invoke-virtual {v0, v3}, Lcom/daaw/kw0$a;->g(Lcom/daaw/jw0$a;)Lcom/daaw/kw0$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/kw0$a;->c(J)Lcom/daaw/kw0$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Lcom/daaw/jw0$a;
.end method

.method public abstract h()J
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kw0;->g()Lcom/daaw/jw0$a;

    move-result-object v0

    sget-object v1, Lcom/daaw/jw0$a;->t:Lcom/daaw/jw0$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kw0;->g()Lcom/daaw/jw0$a;

    move-result-object v0

    sget-object v1, Lcom/daaw/jw0$a;->q:Lcom/daaw/jw0$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/kw0;->g()Lcom/daaw/jw0$a;

    move-result-object v0

    sget-object v1, Lcom/daaw/jw0$a;->p:Lcom/daaw/jw0$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kw0;->g()Lcom/daaw/jw0$a;

    move-result-object v0

    sget-object v1, Lcom/daaw/jw0$a;->s:Lcom/daaw/jw0$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kw0;->g()Lcom/daaw/jw0$a;

    move-result-object v0

    sget-object v1, Lcom/daaw/jw0$a;->r:Lcom/daaw/jw0$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kw0;->g()Lcom/daaw/jw0$a;

    move-result-object v0

    sget-object v1, Lcom/daaw/jw0$a;->p:Lcom/daaw/jw0$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract n()Lcom/daaw/kw0$a;
.end method

.method public o(Ljava/lang/String;JJ)Lcom/daaw/kw0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/kw0;->n()Lcom/daaw/kw0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/kw0$a;->b(Ljava/lang/String;)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/daaw/kw0$a;->c(J)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, Lcom/daaw/kw0$a;->h(J)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/kw0$a;->a()Lcom/daaw/kw0;

    move-result-object p1

    return-object p1
.end method

.method public p()Lcom/daaw/kw0;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kw0;->n()Lcom/daaw/kw0$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/kw0$a;->b(Ljava/lang/String;)Lcom/daaw/kw0$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/kw0$a;->a()Lcom/daaw/kw0;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)Lcom/daaw/kw0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/kw0;->n()Lcom/daaw/kw0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/kw0$a;->e(Ljava/lang/String;)Lcom/daaw/kw0$a;

    move-result-object p1

    sget-object v0, Lcom/daaw/jw0$a;->t:Lcom/daaw/jw0$a;

    invoke-virtual {p1, v0}, Lcom/daaw/kw0$a;->g(Lcom/daaw/jw0$a;)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/kw0$a;->a()Lcom/daaw/kw0;

    move-result-object p1

    return-object p1
.end method

.method public r()Lcom/daaw/kw0;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/kw0;->n()Lcom/daaw/kw0$a;

    move-result-object v0

    sget-object v1, Lcom/daaw/jw0$a;->q:Lcom/daaw/jw0$a;

    invoke-virtual {v0, v1}, Lcom/daaw/kw0$a;->g(Lcom/daaw/jw0$a;)Lcom/daaw/kw0$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/kw0$a;->a()Lcom/daaw/kw0;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lcom/daaw/kw0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/kw0;->n()Lcom/daaw/kw0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/kw0$a;->d(Ljava/lang/String;)Lcom/daaw/kw0$a;

    move-result-object p1

    sget-object v0, Lcom/daaw/jw0$a;->s:Lcom/daaw/jw0$a;

    invoke-virtual {p1, v0}, Lcom/daaw/kw0$a;->g(Lcom/daaw/jw0$a;)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/daaw/kw0$a;->b(Ljava/lang/String;)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/kw0$a;->f(Ljava/lang/String;)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1, p6, p7}, Lcom/daaw/kw0$a;->c(J)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lcom/daaw/kw0$a;->h(J)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/kw0$a;->a()Lcom/daaw/kw0;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Lcom/daaw/kw0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/kw0;->n()Lcom/daaw/kw0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/kw0$a;->d(Ljava/lang/String;)Lcom/daaw/kw0$a;

    move-result-object p1

    sget-object v0, Lcom/daaw/jw0$a;->r:Lcom/daaw/jw0$a;

    invoke-virtual {p1, v0}, Lcom/daaw/kw0$a;->g(Lcom/daaw/jw0$a;)Lcom/daaw/kw0$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/kw0$a;->a()Lcom/daaw/kw0;

    move-result-object p1

    return-object p1
.end method
