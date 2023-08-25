.class public final Lcom/daaw/e13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/f13;


# instance fields
.field public final synthetic a:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lcom/daaw/g13;Landroid/app/Activity;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/e13;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/e13;->a:Landroid/app/Activity;

    invoke-interface {p1, v0}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityDestroyed(Landroid/app/Activity;)V

    return-void
.end method
