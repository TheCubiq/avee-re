.class public final Lcom/daaw/i78;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/content/ComponentName;

.field public final synthetic q:Lcom/daaw/u78;


# direct methods
.method public constructor <init>(Lcom/daaw/u78;Landroid/content/ComponentName;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i78;->q:Lcom/daaw/u78;

    iput-object p2, p0, Lcom/daaw/i78;->p:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/i78;->q:Lcom/daaw/u78;

    iget-object v0, v0, Lcom/daaw/u78;->c:Lcom/daaw/x78;

    iget-object v1, p0, Lcom/daaw/i78;->p:Landroid/content/ComponentName;

    invoke-static {v0, v1}, Lcom/daaw/x78;->M(Lcom/daaw/x78;Landroid/content/ComponentName;)V

    return-void
.end method
