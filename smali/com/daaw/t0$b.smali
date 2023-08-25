.class public Lcom/daaw/t0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/t0;->i(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/app/Application;

.field public final synthetic q:Lcom/daaw/t0$d;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/daaw/t0$d;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/t0$b;->p:Landroid/app/Application;

    iput-object p2, p0, Lcom/daaw/t0$b;->q:Lcom/daaw/t0$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/t0$b;->p:Landroid/app/Application;

    iget-object v1, p0, Lcom/daaw/t0$b;->q:Lcom/daaw/t0$d;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
