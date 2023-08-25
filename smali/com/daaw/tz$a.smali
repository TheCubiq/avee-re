.class public Lcom/daaw/tz$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/tz;-><init>([Lcom/daaw/a41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/zf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/tz;


# direct methods
.method public constructor <init>(Lcom/daaw/tz;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tz$a;->a:Lcom/daaw/tz;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tz$a;->a:Lcom/daaw/tz;

    invoke-virtual {v0, p1}, Lcom/daaw/tz;->r(Landroid/os/Message;)V

    return-void
.end method
