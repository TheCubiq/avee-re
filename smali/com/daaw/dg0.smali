.class public abstract Lcom/daaw/dg0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/daaw/dg0;
    .locals 1

    new-instance v0, Lcom/daaw/dg0$a;

    invoke-direct {v0}, Lcom/daaw/dg0$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lcom/daaw/cg0;
.end method

.method public final b(Ljava/lang/String;)Lcom/daaw/cg0;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/dg0;->a(Ljava/lang/String;)Lcom/daaw/cg0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/daaw/cg0;->a(Ljava/lang/String;)Lcom/daaw/cg0;

    move-result-object v0

    :cond_0
    return-object v0
.end method
