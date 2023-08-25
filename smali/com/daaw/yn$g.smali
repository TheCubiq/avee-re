.class public Lcom/daaw/yn$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yn;->Q([Lcom/daaw/l0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:[Lcom/daaw/l0;

.field public final synthetic q:Lcom/daaw/yn;


# direct methods
.method public constructor <init>(Lcom/daaw/yn;[Lcom/daaw/l0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yn$g;->q:Lcom/daaw/yn;

    iput-object p2, p0, Lcom/daaw/yn$g;->p:[Lcom/daaw/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/yn$g;->q:Lcom/daaw/yn;

    iget-object v1, p0, Lcom/daaw/yn$g;->p:[Lcom/daaw/l0;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/yn;->O(Landroid/view/View;[Lcom/daaw/l0;)V

    const/4 p1, 0x1

    return p1
.end method
