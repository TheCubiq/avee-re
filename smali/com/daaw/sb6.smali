.class public final Lcom/daaw/sb6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m36;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/m36;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lcom/daaw/yd6;

    invoke-direct {v0}, Lcom/daaw/yd6;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/sb6;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/daaw/sb6;->b:Lcom/daaw/m36;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Lcom/daaw/p46;
    .locals 3

    new-instance v0, Lcom/daaw/vc6;

    iget-object v1, p0, Lcom/daaw/sb6;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/sb6;->b:Lcom/daaw/m36;

    check-cast v2, Lcom/daaw/yd6;

    invoke-virtual {v2}, Lcom/daaw/yd6;->f()Lcom/daaw/mj6;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/vc6;-><init>(Landroid/content/Context;Lcom/daaw/p46;)V

    return-object v0
.end method
