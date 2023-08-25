.class public final Lcom/daaw/lj4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/gj4;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/gj4;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lj4;->a:Lcom/daaw/gj4;

    iput-object p2, p0, Lcom/daaw/lj4;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/zi4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lj4;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/dj4;

    invoke-virtual {v0}, Lcom/daaw/dj4;->a()Lcom/daaw/cj4;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lj4;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/dj4;

    invoke-virtual {v0}, Lcom/daaw/dj4;->a()Lcom/daaw/cj4;

    move-result-object v0

    return-object v0
.end method
