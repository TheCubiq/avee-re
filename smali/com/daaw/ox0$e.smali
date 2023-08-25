.class public Lcom/daaw/ox0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tx0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ox0;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:[I

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lcom/daaw/ox0;


# direct methods
.method public constructor <init>(Lcom/daaw/ox0;[ILjava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ox0$e;->c:Lcom/daaw/ox0;

    iput-object p2, p0, Lcom/daaw/ox0$e;->a:[I

    iput-object p3, p0, Lcom/daaw/ox0$e;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/tx0$b;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/ox0$e;->a:[I

    const/4 p2, 0x0

    aget p3, p1, p2

    add-int/lit8 p3, p3, 0x1

    aput p3, p1, p2

    aget p1, p1, p2

    iget-object p2, p0, Lcom/daaw/ox0$e;->b:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lt p1, p2, :cond_0

    iget-object p1, p0, Lcom/daaw/ox0$e;->c:Lcom/daaw/ox0;

    iget-object p2, p1, Lcom/daaw/ox0;->u:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Lcom/daaw/ox0;->b(Lcom/daaw/ox0;Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method
