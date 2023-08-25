.class public abstract Lcom/daaw/lm$e$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lm$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/daaw/lm$e;
.end method

.method public abstract b(Lcom/daaw/lm$e$a;)Lcom/daaw/lm$e$b;
.end method

.method public abstract c(Z)Lcom/daaw/lm$e$b;
.end method

.method public abstract d(Lcom/daaw/lm$e$c;)Lcom/daaw/lm$e$b;
.end method

.method public abstract e(Ljava/lang/Long;)Lcom/daaw/lm$e$b;
.end method

.method public abstract f(Lcom/daaw/of0;)Lcom/daaw/lm$e$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d;",
            ">;)",
            "Lcom/daaw/lm$e$b;"
        }
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;)Lcom/daaw/lm$e$b;
.end method

.method public abstract h(I)Lcom/daaw/lm$e$b;
.end method

.method public abstract i(Ljava/lang/String;)Lcom/daaw/lm$e$b;
.end method

.method public j([B)Lcom/daaw/lm$e$b;
    .locals 2

    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lcom/daaw/lm;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p0, v0}, Lcom/daaw/lm$e$b;->i(Ljava/lang/String;)Lcom/daaw/lm$e$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract k(Lcom/daaw/lm$e$e;)Lcom/daaw/lm$e$b;
.end method

.method public abstract l(J)Lcom/daaw/lm$e$b;
.end method

.method public abstract m(Lcom/daaw/lm$e$f;)Lcom/daaw/lm$e$b;
.end method
