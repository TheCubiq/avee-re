.class public Lcom/daaw/p30$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k81$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/p30;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/p30;


# direct methods
.method public constructor <init>(Lcom/daaw/p30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/p30$a;->a:Lcom/daaw/p30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/daaw/p30$a;->a:Lcom/daaw/p30;

    invoke-virtual {v1}, Lcom/daaw/p30;->z()V

    iget-object v1, p0, Lcom/daaw/p30$a;->a:Lcom/daaw/p30;

    iget-object v1, v1, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    sget-object v2, Landroidx/lifecycle/c$b;->ON_STOP:Landroidx/lifecycle/c$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    iget-object v1, p0, Lcom/daaw/p30$a;->a:Lcom/daaw/p30;

    iget-object v1, v1, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v1}, Lcom/daaw/t30;->x()Landroid/os/Parcelable;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "android:support:fragments"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-object v0
.end method
