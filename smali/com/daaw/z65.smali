.class public final synthetic Lcom/daaw/z65;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o84;


# instance fields
.field public final synthetic p:Lcom/daaw/k75;

.field public final synthetic q:Lcom/daaw/a74;

.field public final synthetic r:Lcom/daaw/d14;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/k75;Lcom/daaw/a74;Lcom/daaw/d14;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z65;->p:Lcom/daaw/k75;

    iput-object p2, p0, Lcom/daaw/z65;->q:Lcom/daaw/a74;

    iput-object p3, p0, Lcom/daaw/z65;->r:Lcom/daaw/d14;

    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/z65;->p:Lcom/daaw/k75;

    iget-object v1, p0, Lcom/daaw/z65;->q:Lcom/daaw/a74;

    iget-object v2, p0, Lcom/daaw/z65;->r:Lcom/daaw/d14;

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/k75;->f(Lcom/daaw/a74;Lcom/daaw/d14;Z)V

    return-void
.end method
