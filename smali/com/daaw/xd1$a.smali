.class public Lcom/daaw/xd1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xd1;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/xd1;


# direct methods
.method public constructor <init>(Lcom/daaw/xd1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xd1$a;->p:Lcom/daaw/xd1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/xd1$a;->p:Lcom/daaw/xd1;

    invoke-static {v0}, Lcom/daaw/xd1;->a(Lcom/daaw/xd1;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/daaw/xd1$a;->p:Lcom/daaw/xd1;

    const-wide/16 v3, 0x3e8

    div-long/2addr v0, v3

    long-to-int v1, v0

    invoke-static {v2, v1}, Lcom/daaw/xd1;->b(Lcom/daaw/xd1;I)I

    iget-object v0, p0, Lcom/daaw/xd1$a;->p:Lcom/daaw/xd1;

    invoke-virtual {v0}, Lcom/daaw/xd1;->i()V

    iget-object v0, p0, Lcom/daaw/xd1$a;->p:Lcom/daaw/xd1;

    invoke-static {v0}, Lcom/daaw/xd1;->d(Lcom/daaw/xd1;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xd1$a;->p:Lcom/daaw/xd1;

    invoke-static {v1}, Lcom/daaw/xd1;->c(Lcom/daaw/xd1;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1, v3, v4}, Landroid/widget/TextView;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
