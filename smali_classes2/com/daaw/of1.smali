.class public abstract Lcom/daaw/of1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/of1$b;,
        Lcom/daaw/of1$c;,
        Lcom/daaw/of1$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lcom/daaw/of1$a;Lcom/daaw/of1$c;Lcom/daaw/of1$b;)Lcom/daaw/of1;
    .locals 1

    new-instance v0, Lcom/daaw/r9;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/r9;-><init>(Lcom/daaw/of1$a;Lcom/daaw/of1$c;Lcom/daaw/of1$b;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lcom/daaw/of1$a;
.end method

.method public abstract c()Lcom/daaw/of1$b;
.end method

.method public abstract d()Lcom/daaw/of1$c;
.end method
