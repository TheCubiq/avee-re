.class public abstract Lcom/daaw/uf;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/uf$a;,
        Lcom/daaw/uf$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/uf$a;
    .locals 1

    new-instance v0, Lcom/daaw/d8$b;

    invoke-direct {v0}, Lcom/daaw/d8$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/z2;
.end method

.method public abstract c()Lcom/daaw/uf$b;
.end method
