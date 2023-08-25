.class public abstract Lcom/daaw/ig0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ig0$a;,
        Lcom/daaw/ig0$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/ig0$a;
    .locals 1

    new-instance v0, Lcom/daaw/f9$b;

    invoke-direct {v0}, Lcom/daaw/f9$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/bm1;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Lcom/daaw/ig0$b;
.end method

.method public abstract f()Ljava/lang/String;
.end method
