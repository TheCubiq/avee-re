.class public final Lcom/daaw/hj4;
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

    iput-object p1, p0, Lcom/daaw/hj4;->a:Lcom/daaw/gj4;

    iput-object p2, p0, Lcom/daaw/hj4;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/hj4;->a:Lcom/daaw/gj4;

    iget-object v1, p0, Lcom/daaw/hj4;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/k08;

    invoke-virtual {v1}, Lcom/daaw/k08;->b()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/gj4;->d(Ljava/util/Set;)Lcom/daaw/as4;

    move-result-object v0

    return-object v0
.end method
