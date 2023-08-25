.class public abstract Lcom/daaw/db1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/db1$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/db1$a;
    .locals 1

    new-instance v0, Lcom/daaw/p9$b;

    invoke-direct {v0}, Lcom/daaw/p9$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/bx;
.end method

.method public abstract c()Lcom/daaw/xx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/xx<",
            "*>;"
        }
    .end annotation
.end method

.method public d()[B
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/db1;->e()Lcom/daaw/hn1;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/db1;->c()Lcom/daaw/xx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/xx;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/hn1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public abstract e()Lcom/daaw/hn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/hn1<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract f()Lcom/daaw/sn1;
.end method

.method public abstract g()Ljava/lang/String;
.end method
