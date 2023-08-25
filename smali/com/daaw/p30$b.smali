.class public Lcom/daaw/p30$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/eu0;


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

    iput-object p1, p0, Lcom/daaw/p30$b;->a:Lcom/daaw/p30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/p30$b;->a:Lcom/daaw/p30;

    iget-object p1, p1, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/t30;->a(Landroidx/fragment/app/Fragment;)V

    iget-object p1, p0, Lcom/daaw/p30$b;->a:Lcom/daaw/p30;

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->i()Lcom/daaw/k81;

    move-result-object p1

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Lcom/daaw/k81;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/p30$b;->a:Lcom/daaw/p30;

    iget-object v0, v0, Lcom/daaw/p30;->F:Lcom/daaw/t30;

    invoke-virtual {v0, p1}, Lcom/daaw/t30;->w(Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method
