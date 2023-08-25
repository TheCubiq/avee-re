.class public final Lcom/daaw/y03;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/f13;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/daaw/g13;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/y03;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/daaw/y03;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y03;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/daaw/y03;->b:Landroid/os/Bundle;

    invoke-interface {p1, v0, v1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method
