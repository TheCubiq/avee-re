.class public abstract Lcom/daaw/en;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/daaw/cg;Lcom/daaw/cg;Ljava/lang/String;)Lcom/daaw/en;
    .locals 1

    new-instance v0, Lcom/daaw/a9;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/a9;-><init>(Landroid/content/Context;Lcom/daaw/cg;Lcom/daaw/cg;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/content/Context;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Lcom/daaw/cg;
.end method

.method public abstract e()Lcom/daaw/cg;
.end method
