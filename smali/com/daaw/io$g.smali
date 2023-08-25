.class public Lcom/daaw/io$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/io;->m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/app/Activity;

.field public final synthetic q:Lcom/daaw/io;


# direct methods
.method public constructor <init>(Lcom/daaw/io;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/io$g;->q:Lcom/daaw/io;

    iput-object p2, p0, Lcom/daaw/io$g;->p:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/daaw/ho;->E:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    iget-object v2, p0, Lcom/daaw/io$g;->p:Landroid/app/Activity;

    invoke-direct {v1, v2}, Lcom/daaw/al;-><init>(Landroid/app/Activity;)V

    iget v2, p1, Lcom/daaw/ho;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object p1, p1, Lcom/daaw/ho;->y:Lcom/daaw/vn;

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
