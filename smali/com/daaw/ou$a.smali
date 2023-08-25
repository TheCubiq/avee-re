.class public Lcom/daaw/ou$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ou;->g(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ou;


# direct methods
.method public constructor <init>(Lcom/daaw/ou;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ou$a;->p:Lcom/daaw/ou;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ou$a;->p:Lcom/daaw/ou;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/ou;->a(Z)V

    iget-object v0, p0, Lcom/daaw/ou$a;->p:Lcom/daaw/ou;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
