.class public abstract Lcom/daaw/lm;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lm$b;,
        Lcom/daaw/lm$a;,
        Lcom/daaw/lm$e;,
        Lcom/daaw/lm$c;,
        Lcom/daaw/lm$d;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/daaw/lm;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/nio/charset/Charset;
    .locals 1

    sget-object v0, Lcom/daaw/lm;->a:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static b()Lcom/daaw/lm$b;
    .locals 1

    new-instance v0, Lcom/daaw/e8$b;

    invoke-direct {v0}, Lcom/daaw/e8$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Lcom/daaw/lm$d;
.end method

.method public abstract h()I
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()Lcom/daaw/lm$e;
.end method

.method public abstract k()Lcom/daaw/lm$b;
.end method

.method public l(Lcom/daaw/of0;)Lcom/daaw/lm;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d;",
            ">;)",
            "Lcom/daaw/lm;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/lm;->j()Lcom/daaw/lm$e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/lm;->k()Lcom/daaw/lm$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/lm;->j()Lcom/daaw/lm$e;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/lm$e;->o(Lcom/daaw/of0;)Lcom/daaw/lm$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/lm$b;->i(Lcom/daaw/lm$e;)Lcom/daaw/lm$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$b;->a()Lcom/daaw/lm;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Reports without sessions cannot have events added to them."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Lcom/daaw/lm$d;)Lcom/daaw/lm;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/lm;->k()Lcom/daaw/lm$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/lm$b;->i(Lcom/daaw/lm$e;)Lcom/daaw/lm$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/lm$b;->f(Lcom/daaw/lm$d;)Lcom/daaw/lm$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$b;->a()Lcom/daaw/lm;

    move-result-object p1

    return-object p1
.end method

.method public n(JZLjava/lang/String;)Lcom/daaw/lm;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/lm;->k()Lcom/daaw/lm$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/lm;->j()Lcom/daaw/lm$e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/lm;->j()Lcom/daaw/lm$e;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/daaw/lm$e;->p(JZLjava/lang/String;)Lcom/daaw/lm$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/lm$b;->i(Lcom/daaw/lm$e;)Lcom/daaw/lm$b;

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/lm$b;->a()Lcom/daaw/lm;

    move-result-object p1

    return-object p1
.end method
