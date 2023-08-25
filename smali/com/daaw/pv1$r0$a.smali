.class public Lcom/daaw/pv1$r0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1$r0;->b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/pv1$r0;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1$r0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$r0$a;->p:Lcom/daaw/pv1$r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/daaw/avee/MainActivity;->q0()Lcom/daaw/o30;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/pv1$r0$a;->p:Lcom/daaw/pv1$r0;

    iget-object v1, v1, Lcom/daaw/pv1$r0;->a:Lcom/daaw/pv1;

    invoke-static {v1}, Lcom/daaw/pv1;->z(Lcom/daaw/pv1;)F

    move-result v2

    invoke-static {v1, v2}, Lcom/daaw/pv1;->B(Lcom/daaw/pv1;F)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/o30;->l(F)V

    :cond_0
    return-void
.end method
