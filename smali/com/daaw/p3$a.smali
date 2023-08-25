.class public Lcom/daaw/p3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k81$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/p3;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/p3;


# direct methods
.method public constructor <init>(Lcom/daaw/p3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/p3$a;->a:Lcom/daaw/p3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/daaw/p3$a;->a:Lcom/daaw/p3;

    invoke-virtual {v1}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/z3;->H(Landroid/os/Bundle;)V

    return-object v0
.end method
