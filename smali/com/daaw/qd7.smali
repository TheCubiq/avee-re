.class public final Lcom/daaw/qd7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/a87;

.field public final b:Lcom/daaw/j87;


# direct methods
.method public constructor <init>(Lcom/daaw/a87;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qd7;->a:Lcom/daaw/a87;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/qd7;->b:Lcom/daaw/j87;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/j87;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qd7;->a:Lcom/daaw/a87;

    iput-object p1, p0, Lcom/daaw/qd7;->b:Lcom/daaw/j87;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/qd7;->a:Lcom/daaw/a87;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/daaw/a87;->b([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/qd7;->b:Lcom/daaw/j87;

    invoke-interface {v0, p1, p2}, Lcom/daaw/j87;->a([B[B)[B

    move-result-object p1

    return-object p1
.end method
