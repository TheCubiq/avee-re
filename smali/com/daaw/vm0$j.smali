.class public Lcom/daaw/vm0$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/vm0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Ljava/lang/Float;",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/vm0;


# direct methods
.method public constructor <init>(Lcom/daaw/vm0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vm0$j;->a:Lcom/daaw/vm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Float;Landroid/content/Context;)V
    .locals 0

    invoke-static {}, Lcom/daaw/avee/MainActivity;->o0()Lcom/daaw/m30;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p2, p1}, Lcom/daaw/m30;->r(F)V

    :cond_0
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Float;

    check-cast p2, Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/vm0$j;->a(Ljava/lang/Float;Landroid/content/Context;)V

    return-void
.end method
