.class public Lcom/daaw/pv1$d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$d0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, Lcom/daaw/avee/MainActivity;->N:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/MainActivity;->P0(I)V

    :cond_0
    return-void
.end method
