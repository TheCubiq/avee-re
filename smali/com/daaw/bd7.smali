.class public final Lcom/daaw/bd7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/l87;


# static fields
.field public static final e:[B


# instance fields
.field public final a:Lcom/daaw/im7;

.field public final b:Lcom/daaw/cd7;

.field public final c:Lcom/daaw/yc7;

.field public final d:Lcom/daaw/xc7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/daaw/bd7;->e:[B

    return-void
.end method

.method public constructor <init>(Lcom/daaw/im7;Lcom/daaw/cd7;Lcom/daaw/xc7;Lcom/daaw/yc7;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bd7;->a:Lcom/daaw/im7;

    iput-object p2, p0, Lcom/daaw/bd7;->b:Lcom/daaw/cd7;

    iput-object p3, p0, Lcom/daaw/bd7;->d:Lcom/daaw/xc7;

    iput-object p4, p0, Lcom/daaw/bd7;->c:Lcom/daaw/yc7;

    return-void
.end method

.method public static b(Lcom/daaw/im7;)Lcom/daaw/bd7;
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/im7;->R()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yq7;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/im7;->M()Lcom/daaw/cm7;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/fd7;->b(Lcom/daaw/cm7;)Lcom/daaw/cd7;

    move-result-object v3

    invoke-static {v0}, Lcom/daaw/fd7;->c(Lcom/daaw/cm7;)Lcom/daaw/xc7;

    move-result-object v4

    invoke-static {v0}, Lcom/daaw/fd7;->a(Lcom/daaw/cm7;)Lcom/daaw/yc7;

    move-result-object v5

    new-instance v0, Lcom/daaw/bd7;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/bd7;-><init>(Lcom/daaw/im7;Lcom/daaw/cd7;Lcom/daaw/xc7;Lcom/daaw/yc7;[B)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePublicKey.public_key is empty."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 7

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-array p2, v0, [B

    :cond_0
    move-object v6, p2

    iget-object p2, p0, Lcom/daaw/bd7;->a:Lcom/daaw/im7;

    iget-object v3, p0, Lcom/daaw/bd7;->b:Lcom/daaw/cd7;

    iget-object v4, p0, Lcom/daaw/bd7;->d:Lcom/daaw/xc7;

    iget-object v5, p0, Lcom/daaw/bd7;->c:Lcom/daaw/yc7;

    invoke-virtual {p2}, Lcom/daaw/im7;->R()Lcom/daaw/yq7;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/yq7;->j()[B

    move-result-object p2

    invoke-interface {v3, p2}, Lcom/daaw/cd7;->a([B)Lcom/daaw/dd7;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/dd7;->a()[B

    move-result-object v1

    invoke-virtual {p2}, Lcom/daaw/dd7;->b()[B

    move-result-object v2

    invoke-static/range {v1 .. v6}, Lcom/daaw/zc7;->c([B[BLcom/daaw/cd7;Lcom/daaw/xc7;Lcom/daaw/yc7;[B)Lcom/daaw/zc7;

    move-result-object p2

    sget-object v1, Lcom/daaw/bd7;->e:[B

    invoke-virtual {p2, p1, v1}, Lcom/daaw/zc7;->b([B[B)[B

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [[B

    invoke-virtual {p2}, Lcom/daaw/zc7;->a()[B

    move-result-object p2

    aput-object p2, v1, v0

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {v1}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object p1

    return-object p1
.end method
