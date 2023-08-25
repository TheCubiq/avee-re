.class public final Lcom/daaw/zv6;
.super Lcom/daaw/vw6;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/vw6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/daaw/vw6;
    .locals 0

    iput-object p1, p0, Lcom/daaw/zv6;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/daaw/vw6;
    .locals 0

    iput-object p1, p0, Lcom/daaw/zv6;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c()Lcom/daaw/ww6;
    .locals 4

    new-instance v0, Lcom/daaw/bw6;

    iget-object v1, p0, Lcom/daaw/zv6;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/zv6;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/bw6;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/aw6;)V

    return-object v0
.end method
