.class public Lcom/daaw/io$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wn$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/io;->m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/lu;

.field public final synthetic b:Lcom/daaw/io;


# direct methods
.method public constructor <init>(Lcom/daaw/io;Lcom/daaw/lu;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/io$k;->b:Lcom/daaw/io;

    iput-object p2, p0, Lcom/daaw/io$k;->a:Lcom/daaw/lu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/io$k;->a:Lcom/daaw/lu;

    invoke-virtual {v0, p1}, Lcom/daaw/lu;->j(Landroid/view/View;)V

    return-void
.end method
