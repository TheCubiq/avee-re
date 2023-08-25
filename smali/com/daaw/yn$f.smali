.class public Lcom/daaw/yn$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yn;-><init>(Landroid/view/View;Lcom/daaw/wn$c;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/view/ViewGroup;

.field public final synthetic q:Lcom/daaw/yn;


# direct methods
.method public constructor <init>(Lcom/daaw/yn;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yn$f;->q:Lcom/daaw/yn;

    iput-object p2, p0, Lcom/daaw/yn$f;->p:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/yn$f;->p:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    invoke-virtual {p1, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
