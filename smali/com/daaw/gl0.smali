.class public abstract Lcom/daaw/gl0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gl0$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/gl0$a;
    .locals 1

    new-instance v0, Lcom/daaw/i9$b;

    invoke-direct {v0}, Lcom/daaw/i9$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/uf;
.end method

.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/cl0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Ljava/lang/Integer;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Lcom/daaw/h01;
.end method

.method public abstract g()J
.end method

.method public abstract h()J
.end method
