.class public final Lcom/daaw/pd7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ed7;


# instance fields
.field public final a:Lcom/daaw/dq7;

.field public final b:Lcom/daaw/dq7;


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/pd7;->a:Lcom/daaw/dq7;

    invoke-static {p2}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/pd7;->b:Lcom/daaw/dq7;

    return-void
.end method

.method public static a([B)Lcom/daaw/pd7;
    .locals 2

    new-instance v0, Lcom/daaw/pd7;

    invoke-static {p0}, Lcom/daaw/yp7;->c([B)[B

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/daaw/pd7;-><init>([B[B)V

    return-object v0
.end method
