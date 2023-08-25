.class public final synthetic Lcom/daaw/as6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Lcom/daaw/tj1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/daaw/tj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/as6;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/as6;->q:Lcom/daaw/tj1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/as6;->p:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/as6;->q:Lcom/daaw/tj1;

    const-string v2, "GLAS"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Lcom/daaw/ku6;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ku6;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/tj1;->c(Ljava/lang/Object;)V

    return-void
.end method
