.class public abstract Lcom/daaw/js6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/is6;
    .locals 2

    new-instance v0, Lcom/daaw/ls6;

    invoke-direct {v0}, Lcom/daaw/ls6;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/ls6;->c(Z)Lcom/daaw/is6;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/is6;->b(Z)Lcom/daaw/is6;

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method

.method public abstract d()Z
.end method
