.class public Lcom/daaw/n81$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n81;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/n81;


# direct methods
.method public constructor <init>(Lcom/daaw/n81;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n81$a;->p:Lcom/daaw/n81;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    sget-object p1, Lcom/daaw/n81;->s:Lcom/daaw/pw1;

    invoke-virtual {p1}, Lcom/daaw/pw1;->a()V

    return-void
.end method
