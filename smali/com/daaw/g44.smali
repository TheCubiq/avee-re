.class public final synthetic Lcom/daaw/g44;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jx2;


# instance fields
.field public final synthetic a:Lcom/daaw/jx2;

.field public final synthetic b:[B


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/jx2;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g44;->a:Lcom/daaw/jx2;

    iput-object p2, p0, Lcom/daaw/g44;->b:[B

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/kx2;
    .locals 4

    iget-object v0, p0, Lcom/daaw/g44;->a:Lcom/daaw/jx2;

    iget-object v1, p0, Lcom/daaw/g44;->b:[B

    sget v2, Lcom/daaw/l44;->L:I

    invoke-interface {v0}, Lcom/daaw/jx2;->zza()Lcom/daaw/kx2;

    move-result-object v0

    new-instance v2, Lcom/daaw/ix2;

    invoke-direct {v2, v1}, Lcom/daaw/ix2;-><init>([B)V

    new-instance v3, Lcom/daaw/m44;

    array-length v1, v1

    invoke-direct {v3, v2, v1, v0}, Lcom/daaw/m44;-><init>(Lcom/daaw/kx2;ILcom/daaw/kx2;)V

    return-object v3
.end method
