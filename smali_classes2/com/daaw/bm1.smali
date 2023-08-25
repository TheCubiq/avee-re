.class public abstract Lcom/daaw/bm1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/bm1$a;,
        Lcom/daaw/bm1$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/bm1$a;
    .locals 3

    new-instance v0, Lcom/daaw/v9$b;

    invoke-direct {v0}, Lcom/daaw/v9$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/v9$b;->d(J)Lcom/daaw/bm1$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/bm1$b;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()J
.end method
