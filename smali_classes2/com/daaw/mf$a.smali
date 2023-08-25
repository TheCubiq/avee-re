.class public final Lcom/daaw/mf$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/mf;->b(Lcom/daaw/pf;)Landroid/animation/Animator$AnimatorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pf;


# direct methods
.method public constructor <init>(Lcom/daaw/pf;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mf$a;->a:Lcom/daaw/pf;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/mf$a;->a:Lcom/daaw/pf;

    invoke-interface {p1}, Lcom/daaw/pf;->b()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/mf$a;->a:Lcom/daaw/pf;

    invoke-interface {p1}, Lcom/daaw/pf;->a()V

    return-void
.end method
