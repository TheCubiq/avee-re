.class public abstract Lcom/daaw/y52;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/m42;


# direct methods
.method public constructor <init>(Lcom/daaw/m42;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/daaw/ik5;)Z
.end method

.method public abstract b(Lcom/daaw/ik5;J)Z
.end method

.method public final c(Lcom/daaw/ik5;J)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/y52;->a(Lcom/daaw/ik5;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/y52;->b(Lcom/daaw/ik5;J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
