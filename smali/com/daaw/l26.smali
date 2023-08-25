.class public final Lcom/daaw/l26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l26;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/l26;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/l26;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/h94;

    invoke-virtual {v1}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/daaw/f26;

    invoke-direct {v2, v0, v1}, Lcom/daaw/f26;-><init>(Lcom/daaw/g77;Landroid/content/Context;)V

    return-object v2
.end method
