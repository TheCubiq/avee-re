.class public abstract Lcom/daaw/lm$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lm$e$d;,
        Lcom/daaw/lm$e$c;,
        Lcom/daaw/lm$e$e;,
        Lcom/daaw/lm$e$a;,
        Lcom/daaw/lm$e$f;,
        Lcom/daaw/lm$e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/lm$e$b;
    .locals 2

    new-instance v0, Lcom/daaw/k8$b;

    invoke-direct {v0}, Lcom/daaw/k8$b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/k8$b;->c(Z)Lcom/daaw/lm$e$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/lm$e$a;
.end method

.method public abstract c()Lcom/daaw/lm$e$c;
.end method

.method public abstract d()Ljava/lang/Long;
.end method

.method public abstract e()Lcom/daaw/of0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()I
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public i()[B
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/lm$e;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/daaw/lm;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public abstract j()Lcom/daaw/lm$e$e;
.end method

.method public abstract k()J
.end method

.method public abstract l()Lcom/daaw/lm$e$f;
.end method

.method public abstract m()Z
.end method

.method public abstract n()Lcom/daaw/lm$e$b;
.end method

.method public o(Lcom/daaw/of0;)Lcom/daaw/lm$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d;",
            ">;)",
            "Lcom/daaw/lm$e;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/lm$e;->n()Lcom/daaw/lm$e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$b;->f(Lcom/daaw/of0;)Lcom/daaw/lm$e$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$b;->a()Lcom/daaw/lm$e;

    move-result-object p1

    return-object p1
.end method

.method public p(JZLjava/lang/String;)Lcom/daaw/lm$e;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/lm$e;->n()Lcom/daaw/lm$e$b;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$b;->e(Ljava/lang/Long;)Lcom/daaw/lm$e$b;

    invoke-virtual {v0, p3}, Lcom/daaw/lm$e$b;->c(Z)Lcom/daaw/lm$e$b;

    if-eqz p4, :cond_0

    invoke-static {}, Lcom/daaw/lm$e$f;->a()Lcom/daaw/lm$e$f$a;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/daaw/lm$e$f$a;->b(Ljava/lang/String;)Lcom/daaw/lm$e$f$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$f$a;->a()Lcom/daaw/lm$e$f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$b;->m(Lcom/daaw/lm$e$f;)Lcom/daaw/lm$e$b;

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/lm$e$b;->a()Lcom/daaw/lm$e;

    move-result-object p1

    return-object p1
.end method
