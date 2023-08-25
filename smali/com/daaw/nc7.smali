.class public final Lcom/daaw/nc7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public static a(Lcom/daaw/d97;)Lcom/daaw/l87;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/daaw/pc7;

    invoke-direct {v0}, Lcom/daaw/pc7;-><init>()V

    invoke-static {v0}, Lcom/daaw/w97;->o(Lcom/daaw/t97;)V

    const-class v0, Lcom/daaw/l87;

    invoke-virtual {p0, v0}, Lcom/daaw/d97;->d(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/l87;

    return-object p0
.end method
