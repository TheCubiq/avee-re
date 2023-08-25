.class public Lcom/daaw/z30$a;
.super Landroid/transition/Transition$EpicenterCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/z30;->v(Ljava/lang/Object;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/graphics/Rect;

.field public final synthetic b:Lcom/daaw/z30;


# direct methods
.method public constructor <init>(Lcom/daaw/z30;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z30$a;->b:Lcom/daaw/z30;

    iput-object p2, p0, Lcom/daaw/z30$a;->a:Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/transition/Transition$EpicenterCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetEpicenter(Landroid/transition/Transition;)Landroid/graphics/Rect;
    .locals 0

    iget-object p1, p0, Lcom/daaw/z30$a;->a:Landroid/graphics/Rect;

    return-object p1
.end method
