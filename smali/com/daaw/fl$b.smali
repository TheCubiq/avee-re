.class public Lcom/daaw/fl$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/fl;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/fl;


# direct methods
.method public constructor <init>(Lcom/daaw/fl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fl$b;->a:Lcom/daaw/fl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fl$b;->b()Lcom/daaw/al;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/al;
    .locals 2

    new-instance v0, Lcom/daaw/al;

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/al;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method
