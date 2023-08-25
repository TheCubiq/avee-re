.class public Landroidx/fragment/app/b$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/b;->x(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/l$e;Landroidx/fragment/app/l$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/a40;

.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Landroid/graphics/Rect;

.field public final synthetic s:Landroidx/fragment/app/b;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b;Lcom/daaw/a40;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/b$h;->s:Landroidx/fragment/app/b;

    iput-object p2, p0, Landroidx/fragment/app/b$h;->p:Lcom/daaw/a40;

    iput-object p3, p0, Landroidx/fragment/app/b$h;->q:Landroid/view/View;

    iput-object p4, p0, Landroidx/fragment/app/b$h;->r:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b$h;->p:Lcom/daaw/a40;

    iget-object v1, p0, Landroidx/fragment/app/b$h;->q:Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/b$h;->r:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/a40;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
