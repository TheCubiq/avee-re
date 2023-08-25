.class public final Lcom/daaw/o3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/daaw/k3$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/daaw/k3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/k3$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/k3;Lcom/daaw/k3$d;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/k3<",
            "TO;>;TO;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o3;->b:Lcom/daaw/k3;

    iput-object p2, p0, Lcom/daaw/o3;->c:Lcom/daaw/k3$d;

    iput-object p3, p0, Lcom/daaw/o3;->d:Ljava/lang/String;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const/4 p1, 0x2

    aput-object p3, v0, p1

    invoke-static {v0}, Lcom/daaw/ot0;->b([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lcom/daaw/o3;->a:I

    return-void
.end method

.method public static a(Lcom/daaw/k3;Lcom/daaw/k3$d;Ljava/lang/String;)Lcom/daaw/o3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O::",
            "Lcom/daaw/k3$d;",
            ">(",
            "Lcom/daaw/k3<",
            "TO;>;TO;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/o3<",
            "TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/o3;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/o3;-><init>(Lcom/daaw/k3;Lcom/daaw/k3$d;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o3;->b:Lcom/daaw/k3;

    invoke-virtual {v0}, Lcom/daaw/k3;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, p0, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lcom/daaw/o3;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lcom/daaw/o3;

    iget-object v2, p0, Lcom/daaw/o3;->b:Lcom/daaw/k3;

    iget-object v3, p1, Lcom/daaw/o3;->b:Lcom/daaw/k3;

    invoke-static {v2, v3}, Lcom/daaw/ot0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/daaw/o3;->c:Lcom/daaw/k3$d;

    iget-object v3, p1, Lcom/daaw/o3;->c:Lcom/daaw/k3$d;

    invoke-static {v2, v3}, Lcom/daaw/ot0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/daaw/o3;->d:Ljava/lang/String;

    iget-object p1, p1, Lcom/daaw/o3;->d:Ljava/lang/String;

    invoke-static {v2, p1}, Lcom/daaw/ot0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/daaw/o3;->a:I

    return v0
.end method
