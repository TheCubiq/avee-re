.class public final Lcom/daaw/dd7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public final b:[B


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dd7;->a:[B

    iput-object p2, p0, Lcom/daaw/dd7;->b:[B

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/dd7;->b:[B

    return-object v0
.end method

.method public final b()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/dd7;->a:[B

    return-object v0
.end method
