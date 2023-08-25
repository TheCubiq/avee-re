.class public Lcom/daaw/io$h;
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
.field public final synthetic p:[Ljava/lang/String;

.field public final synthetic q:Lcom/daaw/io;


# direct methods
.method public constructor <init>(Lcom/daaw/io;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/io$h;->q:Lcom/daaw/io;

    iput-object p2, p0, Lcom/daaw/io$h;->p:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 10

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/io$h;->p:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v9, v2, v1

    sget-object v4, Lcom/daaw/ho;->F:Lcom/daaw/uw1;

    new-instance v5, Lcom/daaw/al;

    invoke-direct {v5, p1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    iget p1, v0, Lcom/daaw/ho;->z:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object p1, p0, Lcom/daaw/io$h;->q:Lcom/daaw/io;

    iget p1, p1, Lcom/daaw/io;->l:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v8, v0, Lcom/daaw/ho;->y:Lcom/daaw/vn;

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
