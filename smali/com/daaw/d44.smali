.class public final synthetic Lcom/daaw/d44;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jx2;


# instance fields
.field public final synthetic a:Lcom/daaw/l44;

.field public final synthetic b:Lcom/daaw/jx2;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l44;Lcom/daaw/jx2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d44;->a:Lcom/daaw/l44;

    iput-object p2, p0, Lcom/daaw/d44;->b:Lcom/daaw/jx2;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/kx2;
    .locals 2

    iget-object v0, p0, Lcom/daaw/d44;->a:Lcom/daaw/l44;

    iget-object v1, p0, Lcom/daaw/d44;->b:Lcom/daaw/jx2;

    invoke-virtual {v0, v1}, Lcom/daaw/l44;->h0(Lcom/daaw/jx2;)Lcom/daaw/kx2;

    move-result-object v0

    return-object v0
.end method
