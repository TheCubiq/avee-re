.class public final Lcom/daaw/wv6;
.super Lcom/daaw/sw6;
.source ""


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/sw6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/daaw/sw6;
    .locals 0

    iput-object p1, p0, Lcom/daaw/wv6;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final b(I)Lcom/daaw/sw6;
    .locals 0

    iput p1, p0, Lcom/daaw/wv6;->a:I

    const/4 p1, 0x1

    iput-byte p1, p0, Lcom/daaw/wv6;->c:B

    return-object p0
.end method

.method public final c()Lcom/daaw/tw6;
    .locals 4

    iget-byte v0, p0, Lcom/daaw/wv6;->c:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/daaw/yv6;

    iget v1, p0, Lcom/daaw/wv6;->a:I

    iget-object v2, p0, Lcom/daaw/wv6;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/yv6;-><init>(ILjava/lang/String;Lcom/daaw/xv6;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties: statusCode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
