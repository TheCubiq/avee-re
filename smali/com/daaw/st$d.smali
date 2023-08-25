.class public Lcom/daaw/st$d;
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

    iput-object p1, p0, Lcom/daaw/st$d;->p:Lcom/daaw/st;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    new-instance p1, Ljava/io/File;

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/j5;->l()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/st$d;->p:Lcom/daaw/st;

    invoke-static {v0, p1}, Lcom/daaw/st;->a(Lcom/daaw/st;Ljava/io/File;)V

    return-void
.end method
