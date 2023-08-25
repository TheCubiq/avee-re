.class public Lcom/daaw/xw0$k0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0;->f(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/tx0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/Boolean;

.field public final synthetic r:Ljava/lang/Boolean;

.field public final synthetic s:Z

.field public final synthetic t:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$k0;->t:Lcom/daaw/xw0;

    iput-object p2, p0, Lcom/daaw/xw0$k0;->p:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/xw0$k0;->q:Ljava/lang/Boolean;

    iput-object p4, p0, Lcom/daaw/xw0$k0;->r:Ljava/lang/Boolean;

    iput-boolean p5, p0, Lcom/daaw/xw0$k0;->s:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/xw0$k0;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    iget-object v1, p0, Lcom/daaw/xw0$k0;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_0
    invoke-static {}, Lcom/daaw/ko0;->q()Lcom/daaw/ko0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/xw0$k0;->q:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, Lcom/daaw/xw0$k0;->r:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ko0;->H(ZZ)V

    :cond_1
    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-boolean v1, p0, Lcom/daaw/xw0$k0;->s:Z

    if-nez v1, :cond_3

    iget v1, v0, Lcom/daaw/avee/MainActivity;->N:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/daaw/xw0$k0;->q:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iget-boolean v2, p0, Lcom/daaw/xw0$k0;->s:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/MainActivity;->K0(ZZ)V

    :cond_4
    return-void
.end method
