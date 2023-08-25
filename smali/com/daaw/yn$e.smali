.class public Lcom/daaw/yn$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yn;-><init>(Landroid/view/View;Lcom/daaw/wn$c;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wn$c;

.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Lcom/daaw/yn;


# direct methods
.method public constructor <init>(Lcom/daaw/yn;Lcom/daaw/wn$c;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yn$e;->r:Lcom/daaw/yn;

    iput-object p2, p0, Lcom/daaw/yn$e;->p:Lcom/daaw/wn$c;

    iput-object p3, p0, Lcom/daaw/yn$e;->q:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, Lcom/daaw/yn$e;->p:Lcom/daaw/wn$c;

    iget-object v0, p0, Lcom/daaw/yn$e;->q:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/wn$c;->a(Landroid/view/View;)V

    const/4 p1, 0x1

    return p1
.end method
