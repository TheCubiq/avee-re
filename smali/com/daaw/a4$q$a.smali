.class public Lcom/daaw/a4$q$a;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/a4$q;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/a4$q;


# direct methods
.method public constructor <init>(Lcom/daaw/a4$q;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$q$a;->a:Lcom/daaw/a4$q;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/a4$q$a;->a:Lcom/daaw/a4$q;

    invoke-virtual {p1}, Lcom/daaw/a4$q;->d()V

    return-void
.end method
