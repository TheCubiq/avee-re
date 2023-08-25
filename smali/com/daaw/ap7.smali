.class public final Lcom/daaw/ap7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/dq7;

.field public final b:Lcom/daaw/dq7;


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ap7;->a:Lcom/daaw/dq7;

    invoke-static {p2}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ap7;->b:Lcom/daaw/dq7;

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/ap7;->a:Lcom/daaw/dq7;

    invoke-virtual {v0}, Lcom/daaw/dq7;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public final b()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/ap7;->b:Lcom/daaw/dq7;

    invoke-virtual {v0}, Lcom/daaw/dq7;->c()[B

    move-result-object v0

    return-object v0
.end method
