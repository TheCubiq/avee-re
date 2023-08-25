.class public Lcom/daaw/st$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/st;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/st;


# direct methods
.method public constructor <init>(Lcom/daaw/st;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/st$f;->p:Lcom/daaw/st;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/st$f;->p:Lcom/daaw/st;

    invoke-static {p1}, Lcom/daaw/st;->b(Lcom/daaw/st;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/st$f;->p:Lcom/daaw/st;

    invoke-static {p1}, Lcom/daaw/st;->b(Lcom/daaw/st;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/st$f;->p:Lcom/daaw/st;

    invoke-static {v0, p1}, Lcom/daaw/st;->c(Lcom/daaw/st;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
