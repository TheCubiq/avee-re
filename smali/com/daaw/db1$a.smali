.class public abstract Lcom/daaw/db1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/db1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/daaw/db1;
.end method

.method public abstract b(Lcom/daaw/bx;)Lcom/daaw/db1$a;
.end method

.method public abstract c(Lcom/daaw/xx;)Lcom/daaw/db1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/xx<",
            "*>;)",
            "Lcom/daaw/db1$a;"
        }
    .end annotation
.end method

.method public abstract d(Lcom/daaw/hn1;)Lcom/daaw/db1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hn1<",
            "*[B>;)",
            "Lcom/daaw/db1$a;"
        }
    .end annotation
.end method

.method public abstract e(Lcom/daaw/sn1;)Lcom/daaw/db1$a;
.end method

.method public abstract f(Ljava/lang/String;)Lcom/daaw/db1$a;
.end method
