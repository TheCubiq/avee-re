.class public final Lcom/daaw/sj4;
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

    iput-object p1, p0, Lcom/daaw/sj4;->a:Lcom/daaw/gj4;

    iput-object p2, p0, Lcom/daaw/sj4;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sj4;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ml4;

    invoke-static {v0}, Lcom/daaw/gj4;->h(Lcom/daaw/ml4;)Lcom/daaw/ly4;

    move-result-object v0

    return-object v0
.end method
