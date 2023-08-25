.class public Lcom/daaw/st$a;
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

    iput-object p1, p0, Lcom/daaw/st$a;->p:Lcom/daaw/st;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {p1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/st$a;->p:Lcom/daaw/st;

    invoke-static {v0, p1}, Lcom/daaw/st;->a(Lcom/daaw/st;Ljava/io/File;)V

    return-void
.end method
