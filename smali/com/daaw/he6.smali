.class public final synthetic Lcom/daaw/he6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/le6;

.field public final synthetic b:Lcom/daaw/rp4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/le6;Lcom/daaw/rp4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/he6;->a:Lcom/daaw/le6;

    iput-object p2, p0, Lcom/daaw/he6;->b:Lcom/daaw/rp4;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/he6;->a:Lcom/daaw/le6;

    iget-object v1, p0, Lcom/daaw/he6;->b:Lcom/daaw/rp4;

    check-cast p1, Lcom/daaw/ue6;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/le6;->b(Lcom/daaw/rp4;Lcom/daaw/ue6;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
