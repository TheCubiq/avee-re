.class public Lcom/daaw/a4$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/a4;->j0()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/a4;


# direct methods
.method public constructor <init>(Lcom/daaw/a4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$d;->a:Lcom/daaw/a4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Rect;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4$d;->a:Lcom/daaw/a4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/daaw/a4;->h1(Lcom/daaw/px1;Landroid/graphics/Rect;)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    return-void
.end method
