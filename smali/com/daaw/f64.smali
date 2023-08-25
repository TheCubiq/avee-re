.class public final synthetic Lcom/daaw/f64;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m36;


# instance fields
.field public final synthetic a:Lcom/daaw/m36;

.field public final synthetic b:[B


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/m36;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/f64;->a:Lcom/daaw/m36;

    iput-object p2, p0, Lcom/daaw/f64;->b:[B

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/p46;
    .locals 4

    iget-object v0, p0, Lcom/daaw/f64;->a:Lcom/daaw/m36;

    iget-object v1, p0, Lcom/daaw/f64;->b:[B

    sget v2, Lcom/daaw/n64;->K:I

    invoke-interface {v0}, Lcom/daaw/m36;->zza()Lcom/daaw/p46;

    move-result-object v0

    new-instance v2, Lcom/daaw/yy5;

    invoke-direct {v2, v1}, Lcom/daaw/yy5;-><init>([B)V

    new-instance v3, Lcom/daaw/y54;

    array-length v1, v1

    invoke-direct {v3, v2, v1, v0}, Lcom/daaw/y54;-><init>(Lcom/daaw/p46;ILcom/daaw/p46;)V

    return-object v3
.end method
