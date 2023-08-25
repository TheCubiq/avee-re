.class public final Lcom/daaw/o78;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/u78;


# direct methods
.method public constructor <init>(Lcom/daaw/u78;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o78;->p:Lcom/daaw/u78;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/o78;->p:Lcom/daaw/u78;

    iget-object v0, v0, Lcom/daaw/u78;->c:Lcom/daaw/x78;

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->d()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/o78;->p:Lcom/daaw/u78;

    iget-object v3, v3, Lcom/daaw/u78;->c:Lcom/daaw/x78;

    iget-object v3, v3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->a()Lcom/daaw/b52;

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/daaw/x78;->M(Lcom/daaw/x78;Landroid/content/ComponentName;)V

    return-void
.end method
