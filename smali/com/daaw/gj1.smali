.class public abstract Lcom/daaw/gj1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gj1$b;
    }
.end annotation


# static fields
.field public static d:Lcom/daaw/gj1$b;


# instance fields
.field public a:Landroid/view/View;

.field public b:I

.field public c:Lcom/daaw/gj1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/gj1$a;

    invoke-direct {v0}, Lcom/daaw/gj1$a;-><init>()V

    sput-object v0, Lcom/daaw/gj1;->d:Lcom/daaw/gj1$b;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/gj1;->d:Lcom/daaw/gj1$b;

    iput-object v0, p0, Lcom/daaw/gj1;->c:Lcom/daaw/gj1$b;

    iput-object p1, p0, Lcom/daaw/gj1;->a:Landroid/view/View;

    iput p2, p0, Lcom/daaw/gj1;->b:I

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public b(Lcom/daaw/gj1$b;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lcom/daaw/gj1;->d:Lcom/daaw/gj1$b;

    :cond_0
    iput-object p1, p0, Lcom/daaw/gj1;->c:Lcom/daaw/gj1$b;

    return-void
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method
