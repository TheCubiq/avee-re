.class public final Lcom/daaw/s51;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    const-string v0, "exception"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/p51$b;

    invoke-direct {v0, p0}, Lcom/daaw/p51$b;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method
