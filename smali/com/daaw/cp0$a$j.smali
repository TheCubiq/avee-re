.class public final Lcom/daaw/cp0$a$j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/cp0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/cp0;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/cp0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    return-void
.end method
