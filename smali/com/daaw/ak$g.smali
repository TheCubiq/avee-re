.class public Lcom/daaw/ak$g;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ak;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ak;


# direct methods
.method public constructor <init>(Lcom/daaw/ak;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ak$g;->a:Lcom/daaw/ak;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/j5;->d()V

    iget-object p2, p0, Lcom/daaw/ak$g;->a:Lcom/daaw/ak;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/ak;->b0(Landroid/content/Context;Lcom/daaw/sd0;)Lcom/daaw/lo1;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p2, p1, v0}, Lcom/daaw/ak;->X(Lcom/daaw/ak;Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method
