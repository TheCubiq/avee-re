.class public Lcom/daaw/te$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/te;->r(Landroid/view/ViewGroup;Lcom/daaw/on1;Lcom/daaw/on1;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/te$k;

.field public final synthetic b:Lcom/daaw/te;

.field private mViewBounds:Lcom/daaw/te$k;


# direct methods
.method public constructor <init>(Lcom/daaw/te;Lcom/daaw/te$k;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/te$h;->b:Lcom/daaw/te;

    iput-object p2, p0, Lcom/daaw/te$h;->a:Lcom/daaw/te$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lcom/daaw/te$h;->mViewBounds:Lcom/daaw/te$k;

    return-void
.end method
